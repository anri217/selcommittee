package com.company.selcommittee.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "SELCOMMITTEE_EXAM_RESULTS")
@Entity(name = "selcommittee_ExamResults")
@NamePattern("%s %s|discipline,pointsCount")
public class ExamResults extends StandardEntity {
    private static final long serialVersionUID = 1438672080233239083L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DISCIPLINE_ID")
    private Discipline discipline;

    @NotNull
    @Column(name = "POINTS_COUNT", nullable = false)
    private Integer pointsCount;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "STUDENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getPointsCount() {
        return pointsCount;
    }

    public void setPointsCount(Integer pointsCount) {
        this.pointsCount = pointsCount;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
}