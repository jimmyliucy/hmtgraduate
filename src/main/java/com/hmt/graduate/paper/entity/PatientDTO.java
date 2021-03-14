package com.hmt.graduate.paper.entity;

import java.io.Serializable;
import java.util.Date;

public class PatientDTO implements Serializable {

    private String id;

    private String idCard;

    private String name;

    private Integer age;

    private Integer sex;

    private String adress;

    private String createDate;

    private String allergy;

    private String familyDisease;

    private String symptom;

    private String illnessTime;

    private String degree;

    private String phoneNo;

    private String hispitalNo;

    private String primaryDiagnosis;

    private String historyDisease;

    private String historyAnesthesia;

    private String marriage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getFamilyDisease() {
        return familyDisease;
    }

    public void setFamilyDisease(String familyDisease) {
        this.familyDisease = familyDisease;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getIllnessTime() {
        return illnessTime;
    }

    public void setIllnessTime(String illnessTime) {
        this.illnessTime = illnessTime;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getHispitalNo() {
        return hispitalNo;
    }

    public void setHispitalNo(String hispitalNo) {
        this.hispitalNo = hispitalNo;
    }

    public String getPrimaryDiagnosis() {
        return primaryDiagnosis;
    }

    public void setPrimaryDiagnosis(String primaryDiagnosis) {
        this.primaryDiagnosis = primaryDiagnosis;
    }

    public String getHistoryDisease() {
        return historyDisease;
    }

    public void setHistoryDisease(String historyDisease) {
        this.historyDisease = historyDisease;
    }

    public String getHistoryAnesthesia() {
        return historyAnesthesia;
    }

    public void setHistoryAnesthesia(String historyAnesthesia) {
        this.historyAnesthesia = historyAnesthesia;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }
}
