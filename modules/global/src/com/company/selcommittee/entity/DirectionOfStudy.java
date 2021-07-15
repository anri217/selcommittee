package com.company.selcommittee.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "SELCOMMITTEE_DIRECTION_OF_STUDY")
@Entity(name = "selcommittee_DirectionOfStudy")
@NamePattern("%s|name")
public class DirectionOfStudy extends StandardEntity {
    private static final long serialVersionUID = -9143686096570811771L;

    @NotNull
    @Column(name = "CIPHER", nullable = false)
    private String cipher;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @Column(name = "NUM_OF_BUDGET_PLACES", nullable = false)
    private Integer numOfBudgetPlaces;

    @NotNull
    @Column(name = "PASSING_POINTS", nullable = false)
    private Integer passingPoints;

    public Integer getPassingPoints() {
        return passingPoints;
    }

    public void setPassingPoints(Integer passingPoints) {
        this.passingPoints = passingPoints;
    }

    public Integer getNumOfBudgetPlaces() {
        return numOfBudgetPlaces;
    }

    public void setNumOfBudgetPlaces(Integer numOfBudgetPlaces) {
        this.numOfBudgetPlaces = numOfBudgetPlaces;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCipher() {
        return cipher;
    }

    public void setCipher(String cipher) {
        this.cipher = cipher;
    }
}