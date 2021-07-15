package com.company.selcommittee.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.cuba.core.entity.EmbeddableEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@MetaClass(name = "selcommittee_DocumentCard")
@Embeddable
public class DocumentCard extends EmbeddableEntity {
    private static final long serialVersionUID = -7793422180853237102L;

    @NotNull
    @Column(name = "PASSPORT", nullable = false, unique = true)
    private Integer passport;

    @NotNull
    @Column(name = "PERSONAL_INSURANCE_POLICY_NUMBER", nullable = false)
    private Integer personalInsurancePolicyNum;

    @NotNull
    @Column(name = "INDIVIDUAL_TAXPAYER_NUM", nullable = false)
    private Integer individualTaxpayerNum;

    public Integer getIndividualTaxpayerNum() {
        return individualTaxpayerNum;
    }

    public void setIndividualTaxpayerNum(Integer individualTaxpayerNum) {
        this.individualTaxpayerNum = individualTaxpayerNum;
    }

    public Integer getPersonalInsurancePolicyNum() {
        return personalInsurancePolicyNum;
    }

    public void setPersonalInsurancePolicyNum(Integer personalInsurancePolicyNum) {
        this.personalInsurancePolicyNum = personalInsurancePolicyNum;
    }

    public Integer getPassport() {
        return passport;
    }

    public void setPassport(Integer passport) {
        this.passport = passport;
    }
}