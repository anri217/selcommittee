package com.company.selcommittee.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.EmbeddedParameters;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name = "SELCOMMITTEE_STUDENT")
@Entity(name = "selcommittee_Student")
@NamePattern("%s|name")
public class Student extends StandardEntity {
    private static final long serialVersionUID = 390929994105813252L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @Column(name = "SURNAME", nullable = false)
    private String surname;

    @Column(name = "PATRONYMIC")
    private String patronymic;

    @NotNull
    @Column(name = "SEX", nullable = false)
    private String sex;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_OF_BIRTH", nullable = false)
    private Date dateOfBirth;

    @NotNull
    @Column(name = "CIPHER", nullable = false)
    private String cipher;

    @NotNull
    @Column(name = "CITIZENSHIP", nullable = false)
    private String citizenship;

    @NotNull
    @Column(name = "IS_HOSTEL_NEED", nullable = false)
    private Boolean isHostelNeed = false;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CONTACTS_ID")
    private Contacts contacts;

    @OneToMany(mappedBy = "student")
    @Composition
    private List<DirOfStudyWithPriority> directionsOfStudyWithPriority;

    @Embedded
    @EmbeddedParameters(nullAllowed = false)
    @AttributeOverrides({
            @AttributeOverride(name = "passport", column = @Column(name = "DOCUMENT_CARD_PASSPORT")),
            @AttributeOverride(name = "personalInsurancePolicyNum", column = @Column(name = "DOCUMENT_CARD_PIPN")),
            @AttributeOverride(name = "individualTaxpayerNum", column = @Column(name = "DOCUMENT_CARD_INDIVIDUAL_TAXPAYER_NUM"))
    })
    private DocumentCard documentCard;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "student")
    @Composition
    private List<ExamResults> examResults = new ArrayList<>();

    @MetaProperty(related = "examResults")
    public Integer getSumOfPoints() {
        return examResults.stream()
                .map(ExamResults::getPointsCount)
                .reduce(0, Integer::sum);
    }

    public List<DirOfStudyWithPriority> getDirectionsOfStudyWithPriority() {
        return directionsOfStudyWithPriority;
    }

    public void setDirectionsOfStudyWithPriority(List<DirOfStudyWithPriority> directionsOfStudyWithPriority) {
        this.directionsOfStudyWithPriority = directionsOfStudyWithPriority;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    public List<ExamResults> getExamResults() {
        return examResults;
    }

    public void setExamResults(List<ExamResults> examResults) {
        this.examResults = examResults;
    }

    public DocumentCard getDocumentCard() {
        return documentCard;
    }

    public void setDocumentCard(DocumentCard documentCard) {
        this.documentCard = documentCard;
    }

    public Boolean getIsHostelNeed() {
        return isHostelNeed;
    }

    public void setIsHostelNeed(Boolean isHostelNeed) {
        this.isHostelNeed = isHostelNeed;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getCipher() {
        return cipher;
    }

    public void setCipher(String cipher) {
        this.cipher = cipher;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Sex getSex() {
        return sex == null ? null : Sex.fromId(sex);
    }

    public void setSex(Sex sex) {
        this.sex = sex == null ? null : sex.getId();
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
