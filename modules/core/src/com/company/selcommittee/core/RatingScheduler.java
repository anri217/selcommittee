package com.company.selcommittee.core;

import com.company.selcommittee.entity.DirOfStudyWithPriority;
import com.company.selcommittee.entity.DirectionOfStudy;
import com.company.selcommittee.entity.Rating;
import com.company.selcommittee.entity.Student;
import com.haulmont.cuba.core.global.CommitContext;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.TimeSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.*;
import java.util.stream.Collectors;

@Service(RatingSchedulerService.NAME)
public class RatingScheduler implements RatingSchedulerService {
    private static final Logger log = LoggerFactory.getLogger(RatingScheduler.class);

    @Inject
    private DataManager dataManager;

    @Inject
    private TimeSource timeSource;

    private Map<DirectionOfStudy, Rating> cachedRatings = new HashMap<>();

    public void schedule() {
        log.info("Start schedule ratings at {}", timeSource.now());
        try {
            List<Student> students = dataManager.load(Student.class)
                    .view("student-view")
                    .list();

            Map<Student, List<DirOfStudyWithPriority>> studentListMap = students.stream()
                    .map(Student::getDirectionsOfStudyWithPriority)
                    .flatMap(Collection::stream)
                    .collect(Collectors.groupingBy(DirOfStudyWithPriority::getStudent));

            CommitContext commitContext = new CommitContext();

            for (Map.Entry<Student, List<DirOfStudyWithPriority>> entry : studentListMap.entrySet()) {
                Student student = entry.getKey();
                for (DirOfStudyWithPriority dirOfStudyWithPriority : entry.getValue()) {
                    Rating rating = findOrCreate(dirOfStudyWithPriority.getDirectionOfStudy());
                    if (!containsStudent(rating, student)) {
                        rating.getStudents().add(student);
                    }
                    commitContext.addInstanceToCommit(rating);
                }
            }

            dataManager.commit(commitContext);
        } catch (Exception e) {
            log.error("Something went wrong during schedule ratings: {}", e.getMessage());
        }
        log.info("End of schedule ratings at {}", timeSource.now());
    }

    public Rating findOrCreate(DirectionOfStudy directionOfStudy) {
        if (cachedRatings.containsKey(directionOfStudy)) {
            return cachedRatings.get(directionOfStudy);
        }

        Optional<Rating> rating = dataManager.load(Rating.class)
                .query("select e from selcommittee_Rating e where e.directionOfStudy = :direction")
                .parameter("direction", directionOfStudy)
                .view("rating-view")
                .optional();
        if (!rating.isPresent()) {
            Rating created = dataManager.create(Rating.class);
            created.setDirectionOfStudy(directionOfStudy);
            cachedRatings.put(directionOfStudy, created);
            return created;
        } else {
            Rating existed = rating.get();
            cachedRatings.put(existed.getDirectionOfStudy(), existed);
            return existed;
        }
    }

    public boolean containsStudent(Rating rating, Student student) {
        return rating.getStudents().contains(student);
    }
}