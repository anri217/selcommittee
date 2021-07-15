package com.company.selcommittee.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Priority implements EnumClass<String> {

    HIGH("HIGH"),
    MIDDLE("MIDDLE"),
    LOW("LOW");

    private String id;

    Priority(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Priority fromId(String id) {
        for (Priority at : Priority.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}