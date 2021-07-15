package com.company.selcommittee.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "SELCOMMITTEE_ADMISSIONS_CAMPAIGN")
@Entity(name = "selcommittee_AdmissionsCampaign")
public class AdmissionsCampaign extends StandardEntity {
    private static final long serialVersionUID = -5111808942814170247L;

    @NotNull
    @Column(name = "YEAR_", nullable = false)
    private Integer year;

    @JoinTable(name = "SELCOMMITTEE_ADMISSIONS_CAMPAIGN_DIRECTION_OF_STUDY_LINK",
            joinColumns = @JoinColumn(name = "ADMISSIONS_CAMPAIGN_ID"),
            inverseJoinColumns = @JoinColumn(name = "DIRECTION_OF_STUDY_ID"))
    @ManyToMany
    private List<DirectionOfStudy> directionsOfStudy;

    @JoinTable(name = "SELCOMMITTEE_ADMISSIONS_CAMPAIGN_STUDENT_LINK",
            joinColumns = @JoinColumn(name = "ADMISSIONS_CAMPAIGN_ID"),
            inverseJoinColumns = @JoinColumn(name = "STUDENT_ID"))
    @ManyToMany
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<DirectionOfStudy> getDirectionsOfStudy() {
        return directionsOfStudy;
    }

    public void setDirectionsOfStudy(List<DirectionOfStudy> directionsOfStudy) {
        this.directionsOfStudy = directionsOfStudy;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}