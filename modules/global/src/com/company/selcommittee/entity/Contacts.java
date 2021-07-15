package com.company.selcommittee.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.EmbeddedParameters;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "SELCOMMITTEE_CONTACTS")
@Entity(name = "selcommittee_Contacts")
public class Contacts extends StandardEntity {
    private static final long serialVersionUID = 6269271181403758903L;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "contacts")
    private Student student;

    @NotNull
    @Column(name = "MAIN_CELL_PHONE", nullable = false)
    private Integer mainCellPhone;

    @Column(name = "ADDITIONAL_CELL_PHONE")
    private Integer additionalCellPhone;

    @AttributeOverrides({
            @AttributeOverride(name = "country", column = @Column(name = "PERMANENT_REGISTRATION_ADDRESS_COUNTRY")),
            @AttributeOverride(name = "region", column = @Column(name = "PERMANENT_REGISTRATION_ADDRESS_REGION")),
            @AttributeOverride(name = "locality", column = @Column(name = "PERMANENT_REGISTRATION_ADDRESS_LOCALITY")),
            @AttributeOverride(name = "street", column = @Column(name = "PERMANENT_REGISTRATION_ADDRESS_STREET")),
            @AttributeOverride(name = "house", column = @Column(name = "PERMANENT_REGISTRATION_ADDRESS_HOUSE")),
            @AttributeOverride(name = "building", column = @Column(name = "PERMANENT_REGISTRATION_ADDRESS_BUILDING")),
            @AttributeOverride(name = "flat", column = @Column(name = "PERMANENT_REGISTRATION_ADDRESS_FLAT")),
            @AttributeOverride(name = "zipCode", column = @Column(name = "PERMANENT_REGISTRATION_ADDRESS_ZIP_CODE"))
    })
    private @Embedded
    @NotNull @EmbeddedParameters(nullAllowed = false) Address permanentRegistrationAddress;

    @AttributeOverrides({@AttributeOverride(name = "country", column = @Column(name = "LIVING_ADDRESS_COUNTRY")), @AttributeOverride(name = "region", column = @Column(name = "LIVING_ADDRESS_REGION")), @AttributeOverride(name = "locality", column = @Column(name = "LIVING_ADDRESS_LOCALITY")), @AttributeOverride(name = "street", column = @Column(name = "LIVING_ADDRESS_STREET")), @AttributeOverride(name = "house", column = @Column(name = "LIVING_ADDRESS_HOUSE")), @AttributeOverride(name = "building", column = @Column(name = "LIVING_ADDRESS_BUILDING")), @AttributeOverride(name = "flat", column = @Column(name = "LIVING_ADDRESS_FLAT")), @AttributeOverride(name = "zipCode", column = @Column(name = "LIVING_ADDRESS_ZIP_CODE"))
    })
    private @Embedded
    @NotNull @EmbeddedParameters(nullAllowed = false) Address livingAddress;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setLivingAddress(Address livingAddress) {
        this.livingAddress = livingAddress;
    }

    public Address getLivingAddress() {
        return livingAddress;
    }

    public void setPermanentRegistrationAddress(Address permanentRegistrationAddress) {
        this.permanentRegistrationAddress = permanentRegistrationAddress;
    }

    public Address getPermanentRegistrationAddress() {
        return permanentRegistrationAddress;
    }

    public Integer getAdditionalCellPhone() {
        return additionalCellPhone;
    }

    public void setAdditionalCellPhone(Integer additionalCellPhone) {
        this.additionalCellPhone = additionalCellPhone;
    }

    public Integer getMainCellPhone() {
        return mainCellPhone;
    }

    public void setMainCellPhone(Integer mainCellPhone) {
        this.mainCellPhone = mainCellPhone;
    }

    @MetaProperty(related = "permanentRegistrationAddress")
    public String getPermanentRegistrationString(){
        return permanentRegistrationAddress.getCountry() + ", " +
                permanentRegistrationAddress.getRegion() + ", " + permanentRegistrationAddress.getLocality() +
                ", " + permanentRegistrationAddress.getStreet() + ", " + permanentRegistrationAddress.getHouse() +
                ", " + permanentRegistrationAddress.getBuilding() + ", " + permanentRegistrationAddress.getFlat() +
                ", " + permanentRegistrationAddress.getZipCode();
    }

    @MetaProperty(related = "livingAddress")
    public String getLivingAddressRegistrationString() {
        return livingAddress.getCountry() + ", " +
                livingAddress.getRegion() + ", " + livingAddress.getLocality() +
                ", " + livingAddress.getStreet() + ", " + livingAddress.getHouse() +
                ", " + livingAddress.getBuilding() + ", " + livingAddress.getFlat() +
                ", " + livingAddress.getZipCode();
    }
}