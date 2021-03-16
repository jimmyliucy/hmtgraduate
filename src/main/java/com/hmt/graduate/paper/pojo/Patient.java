package com.hmt.graduate.paper.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author HuangMengTian
 * @date 2021-03-16 14:24:59
 */
public class Patient implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * email
     */
    private String email;

    /**
     * 民族
     */
    private String patNation;

    /**
     * 职业
     */
    private String patJob;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 常住地址
     */
    private String adress;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 过敏史
     */
    private String allergy;

    /**
     * 家族遗传病史
     */
    private String familyDisease;

    /**
     * 症状
     */
    private String symptom;

    /**
     * 开始发病时间
     */
    private Date illnessTime;

    /**
     * 受教育年限
     */
    private String degree;

    /**
     * 手机号
     */
    private String phoneNo;

    /**
     * 住院号
     */
    private String hispitalNo;

    /**
     * 初步诊断
     */
    private String primaryDiagnosis;

    /**
     * 既往病史
     */
    private String historyDisease;

    /**
     * 既往麻醉
     */
    private String historyAnesthesia;

    /**
     * 是否结婚1是2否
     */
    private String marriage;

    /**
     * 备注
     */
    private String remark1;

    /**
     * 备注
     */
    private String remark2;

    /**
     * 备注
     */
    private String remark3;

    /**
     * 备注
     */
    private String remark4;

    /**
     * 备注
     */
    private String remark5;

    /**
     * 序列化
     */
    private static final long serialVersionUID = 1705875071371200648L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPatNation() {
        return patNation;
    }

    public void setPatNation(String patNation) {
        this.patNation = patNation == null ? null : patNation.trim();
    }

    public String getPatJob() {
        return patJob;
    }

    public void setPatJob(String patJob) {
        this.patJob = patJob == null ? null : patJob.trim();
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

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }

    public String getRemark4() {
        return remark4;
    }

    public void setRemark4(String remark4) {
        this.remark4 = remark4 == null ? null : remark4.trim();
    }

    public String getRemark5() {
        return remark5;
    }

    public void setRemark5(String remark5) {
        this.remark5 = remark5 == null ? null : remark5.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", idCard=").append(idCard);
        sb.append(", email=").append(email);
        sb.append(", patNation=").append(patNation);
        sb.append(", patJob=").append(patJob);
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", adress=").append(adress);
        sb.append(", createDate=").append(createDate);
        sb.append(", allergy=").append(allergy);
        sb.append(", familyDisease=").append(familyDisease);
        sb.append(", symptom=").append(symptom);
        sb.append(", illnessTime=").append(illnessTime);
        sb.append(", degree=").append(degree);
        sb.append(", phoneNo=").append(phoneNo);
        sb.append(", hispitalNo=").append(hispitalNo);
        sb.append(", primaryDiagnosis=").append(primaryDiagnosis);
        sb.append(", historyDisease=").append(historyDisease);
        sb.append(", historyAnesthesia=").append(historyAnesthesia);
        sb.append(", marriage=").append(marriage);
        sb.append(", remark1=").append(remark1);
        sb.append(", remark2=").append(remark2);
        sb.append(", remark3=").append(remark3);
        sb.append(", remark4=").append(remark4);
        sb.append(", remark5=").append(remark5);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Patient other = (Patient) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIdCard() == null ? other.getIdCard() == null : this.getIdCard().equals(other.getIdCard()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPatNation() == null ? other.getPatNation() == null : this.getPatNation().equals(other.getPatNation()))
            && (this.getPatJob() == null ? other.getPatJob() == null : this.getPatJob().equals(other.getPatJob()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getAdress() == null ? other.getAdress() == null : this.getAdress().equals(other.getAdress()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getAllergy() == null ? other.getAllergy() == null : this.getAllergy().equals(other.getAllergy()))
            && (this.getFamilyDisease() == null ? other.getFamilyDisease() == null : this.getFamilyDisease().equals(other.getFamilyDisease()))
            && (this.getSymptom() == null ? other.getSymptom() == null : this.getSymptom().equals(other.getSymptom()))
            && (this.getIllnessTime() == null ? other.getIllnessTime() == null : this.getIllnessTime().equals(other.getIllnessTime()))
            && (this.getDegree() == null ? other.getDegree() == null : this.getDegree().equals(other.getDegree()))
            && (this.getPhoneNo() == null ? other.getPhoneNo() == null : this.getPhoneNo().equals(other.getPhoneNo()))
            && (this.getHispitalNo() == null ? other.getHispitalNo() == null : this.getHispitalNo().equals(other.getHispitalNo()))
            && (this.getPrimaryDiagnosis() == null ? other.getPrimaryDiagnosis() == null : this.getPrimaryDiagnosis().equals(other.getPrimaryDiagnosis()))
            && (this.getHistoryDisease() == null ? other.getHistoryDisease() == null : this.getHistoryDisease().equals(other.getHistoryDisease()))
            && (this.getHistoryAnesthesia() == null ? other.getHistoryAnesthesia() == null : this.getHistoryAnesthesia().equals(other.getHistoryAnesthesia()))
            && (this.getMarriage() == null ? other.getMarriage() == null : this.getMarriage().equals(other.getMarriage()))
            && (this.getRemark1() == null ? other.getRemark1() == null : this.getRemark1().equals(other.getRemark1()))
            && (this.getRemark2() == null ? other.getRemark2() == null : this.getRemark2().equals(other.getRemark2()))
            && (this.getRemark3() == null ? other.getRemark3() == null : this.getRemark3().equals(other.getRemark3()))
            && (this.getRemark4() == null ? other.getRemark4() == null : this.getRemark4().equals(other.getRemark4()))
            && (this.getRemark5() == null ? other.getRemark5() == null : this.getRemark5().equals(other.getRemark5()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIdCard() == null) ? 0 : getIdCard().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPatNation() == null) ? 0 : getPatNation().hashCode());
        result = prime * result + ((getPatJob() == null) ? 0 : getPatJob().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAdress() == null) ? 0 : getAdress().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getAllergy() == null) ? 0 : getAllergy().hashCode());
        result = prime * result + ((getFamilyDisease() == null) ? 0 : getFamilyDisease().hashCode());
        result = prime * result + ((getSymptom() == null) ? 0 : getSymptom().hashCode());
        result = prime * result + ((getIllnessTime() == null) ? 0 : getIllnessTime().hashCode());
        result = prime * result + ((getDegree() == null) ? 0 : getDegree().hashCode());
        result = prime * result + ((getPhoneNo() == null) ? 0 : getPhoneNo().hashCode());
        result = prime * result + ((getHispitalNo() == null) ? 0 : getHispitalNo().hashCode());
        result = prime * result + ((getPrimaryDiagnosis() == null) ? 0 : getPrimaryDiagnosis().hashCode());
        result = prime * result + ((getHistoryDisease() == null) ? 0 : getHistoryDisease().hashCode());
        result = prime * result + ((getHistoryAnesthesia() == null) ? 0 : getHistoryAnesthesia().hashCode());
        result = prime * result + ((getMarriage() == null) ? 0 : getMarriage().hashCode());
        result = prime * result + ((getRemark1() == null) ? 0 : getRemark1().hashCode());
        result = prime * result + ((getRemark2() == null) ? 0 : getRemark2().hashCode());
        result = prime * result + ((getRemark3() == null) ? 0 : getRemark3().hashCode());
        result = prime * result + ((getRemark4() == null) ? 0 : getRemark4().hashCode());
        result = prime * result + ((getRemark5() == null) ? 0 : getRemark5().hashCode());
        return result;
    }
}