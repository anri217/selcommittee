package com.company.selcommittee.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "SELCOMMITTEE_DISCIPLINE")
@Entity(name = "selcommittee_Discipline")
@NamePattern("%s|name")
public class Discipline extends StandardEntity {
    private static final long serialVersionUID = 9038850350921009118L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}