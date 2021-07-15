package com.company.selcommittee.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "SELCOMMITTEE_DIR_OF_STUDY_WITH_PRIORITY")
@Entity(name = "selcommittee_DirOfStudyWithPriority")
@NamePattern("%s|directionOfStudy")
public class DirOfStudyWithPriority extends StandardEntity {
    private static final long serialVersionUID = -5183458087535679912L;

    @JoinColumn(name = "DIRECTION_OF_STUDY_ID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private DirectionOfStudy directionOfStudy;

    @NotNull
    @Column(name = "PRIORITY", nullable = false)
    private String priority;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STUDENT_ID")
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setDirectionOfStudy(DirectionOfStudy directionOfStudy) {
        this.directionOfStudy = directionOfStudy;
    }

    public DirectionOfStudy getDirectionOfStudy() {
        return directionOfStudy;
    }

    public Priority getPriority() {
        return priority == null ? null : Priority.fromId(priority);
    }

    public void setPriority(Priority priority) {
        this.priority = priority == null ? null : priority.getId();
    }

}