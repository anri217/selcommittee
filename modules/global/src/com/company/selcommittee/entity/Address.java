package com.company.selcommittee.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.EmbeddableEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@MetaClass(name = "selcommittee_Address")
@Embeddable
@NamePattern("%s %s|region,locality")
public class Address extends EmbeddableEntity {
    private static final long serialVersionUID = -673841107208156588L;

    @NotNull
    @Column(name = "COUNTRY", nullable = false)
    private String country;

    @NotNull
    @Column(name = "REGION", nullable = false)
    private String region;

    @NotNull
    @Column(name = "LOCALITY", nullable = false)
    private String locality;

    @NotNull
    @Column(name = "STREET", nullable = false)
    private String street;

    @NotNull
    @Column(name = "HOUSE", nullable = false)
    private Integer house;

    @NotNull
    @Column(name = "BUILDING", nullable = false, length = 3)
    private String building;

    @NotNull
    @Column(name = "FLAT", nullable = false)
    private Integer flat;

    @NotNull
    @Column(name = "ZIP_CODE", nullable = false)
    private Integer zipCode;

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getFlat() {
        return flat;
    }

    public void setFlat(Integer flat) {
        this.flat = flat;
    }

    public Integer getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}