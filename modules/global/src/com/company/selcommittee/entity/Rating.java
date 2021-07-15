package com.company.selcommittee.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Table(name = "SELCOMMITTEE_RATING")
@Entity(name = "selcommittee_Rating")
public class Rating extends StandardEntity {
    private static final long serialVersionUID = -749729977951522439L;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DIRECTION_OF_STUDY_ID")
    private DirectionOfStudy directionOfStudy;

    @JoinTable(name = "SELCOMMITTEE_RATING_STUDENT_LINK",
            joinColumns = @JoinColumn(name = "RATING_ID"),
            inverseJoinColumns = @JoinColumn(name = "STUDENT_ID"))
    @ManyToMany
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public DirectionOfStudy getDirectionOfStudy() {
        return directionOfStudy;
    }

    public void setDirectionOfStudy(DirectionOfStudy directionOfStudy) {
        this.directionOfStudy = directionOfStudy;
    }
}