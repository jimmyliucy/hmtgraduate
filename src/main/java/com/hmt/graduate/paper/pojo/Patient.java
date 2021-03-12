package com.hmt.graduate.paper.pojo;

import java.io.Serializable;
import java.util.Date;

public class Patient implements Serializable {
    private Integer id;
    private String idCard;
    private String name;
    private Integer age;

    private Integer sex;

    private String adress;

    private Date createDate;

    private String allergy;
    private String familyDisease;

    private String symptom;

    private Date illnessTime;

    private String degree;

    private String phoneNo;

    private String hispitalNo;

    private String primaryDiagnosis;

    private String historyDisease;

    private String historyAnesthesia;

    private String marriage;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        this.name = name == null ? null : name.trim();
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
        this.adress = adress == null ? null : adress.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getAllergy() {
        return allergy;
    }


    public void setAllergy(String allergy) {
        this.allergy = allergy == null ? null : allergy.trim();
    }

    public String getFamilyDisease() {
        return familyDisease;
    }

    public void setFamilyDisease(String familyDisease) {
        this.familyDisease = familyDisease == null ? null : familyDisease.trim();
    }

    public String getSymptom() {
        return symptom;
    }


    public void setSymptom(String symptom) {
        this.symptom = symptom == null ? null : symptom.trim();
    }


    public Date getIllnessTime() {
        return illnessTime;
    }


    public void setIllnessTime(Date illnessTime) {
        this.illnessTime = illnessTime;
    }


    public String getDegree() {
        return degree;
    }


    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }


    public String getPhoneNo() {
        return phoneNo;
    }


    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo == null ? null : phoneNo.trim();
    }


    public String getHispitalNo() {
        return hispitalNo;
    }


    public void setHispitalNo(String hispitalNo) {
        this.hispitalNo = hispitalNo == null ? null : hispitalNo.trim();
    }


    public String getPrimaryDiagnosis() {
        return primaryDiagnosis;
    }


    public void setPrimaryDiagnosis(String primaryDiagnosis) {
        this.primaryDiagnosis = primaryDiagnosis == null ? null : primaryDiagnosis.trim();
    }


    public String getHistoryDisease() {
        return historyDisease;
    }


    public void setHistoryDisease(String historyDisease) {
        this.historyDisease = historyDisease == null ? null : historyDisease.trim();
    }


    public String getHistoryAnesthesia() {
        return historyAnesthesia;
    }


    public void setHistoryAnesthesia(String historyAnesthesia) {
        this.historyAnesthesia = historyAnesthesia == null ? null : historyAnesthesia.trim();
    }


    public String getMarriage() {
        return marriage;
    }


    public void setMarriage(String marriage) {
        this.marriage = marriage == null ? null : marriage.trim();
    }

}