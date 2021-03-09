package com.hmt.graduate.paper.pojo;

import java.io.Serializable;
import java.util.Date;

public class MmseScore implements Serializable {

    private Integer id;

    private Integer patientId;

    private Integer status;

    private Integer questionThr;

    private Integer questionTwo;

    private Integer questionOne;

    private Date crateTime;

    private Integer questionFour;

    private Integer questionFive;

    private Integer questionSix;

    private Integer questionSev;

    private Integer questionEig;

    private Integer questionNine;

    private Integer questionTen;

    private Integer questionTone;

    private Integer questionTtwo;

    private Integer questionTthr;

    private Integer questionTfour;

    private Integer questionTfive;

    private Integer questionTsix;

    private Integer questionTsev;

    private Integer questionTeig;

    private Integer questionTnin;

    private Integer questionWt;

    private Integer questionWone;

    private Integer coordinate;

    private Integer score;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getQuestionThr() {
        return questionThr;
    }

    public void setQuestionThr(Integer questionThr) {
        this.questionThr = questionThr;
    }

    public Integer getQuestionTwo() {
        return questionTwo;
    }

    public void setQuestionTwo(Integer questionTwo) {
        this.questionTwo = questionTwo;
    }

    public Integer getQuestionOne() {
        return questionOne;
    }

    public void setQuestionOne(Integer questionOne) {
        this.questionOne = questionOne;
    }

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }

    public Integer getQuestionFour() {
        return questionFour;
    }

    public void setQuestionFour(Integer questionFour) {
        this.questionFour = questionFour;
    }

    public Integer getQuestionFive() {
        return questionFive;
    }

    public void setQuestionFive(Integer questionFive) {
        this.questionFive = questionFive;
    }

    public Integer getQuestionSix() {
        return questionSix;
    }

    public void setQuestionSix(Integer questionSix) {
        this.questionSix = questionSix;
    }

    public Integer getQuestionSev() {
        return questionSev;
    }

    public void setQuestionSev(Integer questionSev) {
        this.questionSev = questionSev;
    }

    public Integer getQuestionEig() {
        return questionEig;
    }

    public void setQuestionEig(Integer questionEig) {
        this.questionEig = questionEig;
    }

    public Integer getQuestionNine() {
        return questionNine;
    }

    public void setQuestionNine(Integer questionNine) {
        this.questionNine = questionNine;
    }

    public Integer getQuestionTen() {
        return questionTen;
    }

    public void setQuestionTen(Integer questionTen) {
        this.questionTen = questionTen;
    }

    public Integer getQuestionTone() {
        return questionTone;
    }

    public void setQuestionTone(Integer questionTone) {
        this.questionTone = questionTone;
    }

    public Integer getQuestionTtwo() {
        return questionTtwo;
    }

    public void setQuestionTtwo(Integer questionTtwo) {
        this.questionTtwo = questionTtwo;
    }

    public Integer getQuestionTthr() {
        return questionTthr;
    }

    public void setQuestionTthr(Integer questionTthr) {
        this.questionTthr = questionTthr;
    }

    public Integer getQuestionTfour() {
        return questionTfour;
    }

    public void setQuestionTfour(Integer questionTfour) {
        this.questionTfour = questionTfour;
    }

    public Integer getQuestionTfive() {
        return questionTfive;
    }

    public void setQuestionTfive(Integer questionTfive) {
        this.questionTfive = questionTfive;
    }

    public Integer getQuestionTsix() {
        return questionTsix;
    }

    public void setQuestionTsix(Integer questionTsix) {
        this.questionTsix = questionTsix;
    }

    public Integer getQuestionTsev() {
        return questionTsev;
    }

    public void setQuestionTsev(Integer questionTsev) {
        this.questionTsev = questionTsev;
    }

    public Integer getQuestionTeig() {
        return questionTeig;
    }

    public void setQuestionTeig(Integer questionTeig) {
        this.questionTeig = questionTeig;
    }

    public Integer getQuestionTnin() {
        return questionTnin;
    }

    public void setQuestionTnin(Integer questionTnin) {
        this.questionTnin = questionTnin;
    }

    public Integer getQuestionWt() {
        return questionWt;
    }

    public void setQuestionWt(Integer questionWt) {
        this.questionWt = questionWt;
    }

    public Integer getQuestionWone() {
        return questionWone;
    }

    public void setQuestionWone(Integer questionWone) {
        this.questionWone = questionWone;
    }

    public Integer getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Integer coordinate) {
        this.coordinate = coordinate;
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
        MmseScore other = (MmseScore) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPatientId() == null ? other.getPatientId() == null : this.getPatientId().equals(other.getPatientId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getQuestionThr() == null ? other.getQuestionThr() == null : this.getQuestionThr().equals(other.getQuestionThr()))
            && (this.getQuestionTwo() == null ? other.getQuestionTwo() == null : this.getQuestionTwo().equals(other.getQuestionTwo()))
            && (this.getQuestionOne() == null ? other.getQuestionOne() == null : this.getQuestionOne().equals(other.getQuestionOne()))
            && (this.getCrateTime() == null ? other.getCrateTime() == null : this.getCrateTime().equals(other.getCrateTime()))
            && (this.getQuestionFour() == null ? other.getQuestionFour() == null : this.getQuestionFour().equals(other.getQuestionFour()))
            && (this.getQuestionFive() == null ? other.getQuestionFive() == null : this.getQuestionFive().equals(other.getQuestionFive()))
            && (this.getQuestionSix() == null ? other.getQuestionSix() == null : this.getQuestionSix().equals(other.getQuestionSix()))
            && (this.getQuestionSev() == null ? other.getQuestionSev() == null : this.getQuestionSev().equals(other.getQuestionSev()))
            && (this.getQuestionEig() == null ? other.getQuestionEig() == null : this.getQuestionEig().equals(other.getQuestionEig()))
            && (this.getQuestionNine() == null ? other.getQuestionNine() == null : this.getQuestionNine().equals(other.getQuestionNine()))
            && (this.getQuestionTen() == null ? other.getQuestionTen() == null : this.getQuestionTen().equals(other.getQuestionTen()))
            && (this.getQuestionTone() == null ? other.getQuestionTone() == null : this.getQuestionTone().equals(other.getQuestionTone()))
            && (this.getQuestionTtwo() == null ? other.getQuestionTtwo() == null : this.getQuestionTtwo().equals(other.getQuestionTtwo()))
            && (this.getQuestionTthr() == null ? other.getQuestionTthr() == null : this.getQuestionTthr().equals(other.getQuestionTthr()))
            && (this.getQuestionTfour() == null ? other.getQuestionTfour() == null : this.getQuestionTfour().equals(other.getQuestionTfour()))
            && (this.getQuestionTfive() == null ? other.getQuestionTfive() == null : this.getQuestionTfive().equals(other.getQuestionTfive()))
            && (this.getQuestionTsix() == null ? other.getQuestionTsix() == null : this.getQuestionTsix().equals(other.getQuestionTsix()))
            && (this.getQuestionTsev() == null ? other.getQuestionTsev() == null : this.getQuestionTsev().equals(other.getQuestionTsev()))
            && (this.getQuestionTeig() == null ? other.getQuestionTeig() == null : this.getQuestionTeig().equals(other.getQuestionTeig()))
            && (this.getQuestionTnin() == null ? other.getQuestionTnin() == null : this.getQuestionTnin().equals(other.getQuestionTnin()))
            && (this.getQuestionWt() == null ? other.getQuestionWt() == null : this.getQuestionWt().equals(other.getQuestionWt()))
            && (this.getQuestionWone() == null ? other.getQuestionWone() == null : this.getQuestionWone().equals(other.getQuestionWone()))
            && (this.getCoordinate() == null ? other.getCoordinate() == null : this.getCoordinate().equals(other.getCoordinate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPatientId() == null) ? 0 : getPatientId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getQuestionThr() == null) ? 0 : getQuestionThr().hashCode());
        result = prime * result + ((getQuestionTwo() == null) ? 0 : getQuestionTwo().hashCode());
        result = prime * result + ((getQuestionOne() == null) ? 0 : getQuestionOne().hashCode());
        result = prime * result + ((getCrateTime() == null) ? 0 : getCrateTime().hashCode());
        result = prime * result + ((getQuestionFour() == null) ? 0 : getQuestionFour().hashCode());
        result = prime * result + ((getQuestionFive() == null) ? 0 : getQuestionFive().hashCode());
        result = prime * result + ((getQuestionSix() == null) ? 0 : getQuestionSix().hashCode());
        result = prime * result + ((getQuestionSev() == null) ? 0 : getQuestionSev().hashCode());
        result = prime * result + ((getQuestionEig() == null) ? 0 : getQuestionEig().hashCode());
        result = prime * result + ((getQuestionNine() == null) ? 0 : getQuestionNine().hashCode());
        result = prime * result + ((getQuestionTen() == null) ? 0 : getQuestionTen().hashCode());
        result = prime * result + ((getQuestionTone() == null) ? 0 : getQuestionTone().hashCode());
        result = prime * result + ((getQuestionTtwo() == null) ? 0 : getQuestionTtwo().hashCode());
        result = prime * result + ((getQuestionTthr() == null) ? 0 : getQuestionTthr().hashCode());
        result = prime * result + ((getQuestionTfour() == null) ? 0 : getQuestionTfour().hashCode());
        result = prime * result + ((getQuestionTfive() == null) ? 0 : getQuestionTfive().hashCode());
        result = prime * result + ((getQuestionTsix() == null) ? 0 : getQuestionTsix().hashCode());
        result = prime * result + ((getQuestionTsev() == null) ? 0 : getQuestionTsev().hashCode());
        result = prime * result + ((getQuestionTeig() == null) ? 0 : getQuestionTeig().hashCode());
        result = prime * result + ((getQuestionTnin() == null) ? 0 : getQuestionTnin().hashCode());
        result = prime * result + ((getQuestionWt() == null) ? 0 : getQuestionWt().hashCode());
        result = prime * result + ((getQuestionWone() == null) ? 0 : getQuestionWone().hashCode());
        result = prime * result + ((getCoordinate() == null) ? 0 : getCoordinate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", patientId=").append(patientId);
        sb.append(", status=").append(status);
        sb.append(", questionThr=").append(questionThr);
        sb.append(", questionTwo=").append(questionTwo);
        sb.append(", questionOne=").append(questionOne);
        sb.append(", crateTime=").append(crateTime);
        sb.append(", questionFour=").append(questionFour);
        sb.append(", questionFive=").append(questionFive);
        sb.append(", questionSix=").append(questionSix);
        sb.append(", questionSev=").append(questionSev);
        sb.append(", questionEig=").append(questionEig);
        sb.append(", questionNine=").append(questionNine);
        sb.append(", questionTen=").append(questionTen);
        sb.append(", questionTone=").append(questionTone);
        sb.append(", questionTtwo=").append(questionTtwo);
        sb.append(", questionTthr=").append(questionTthr);
        sb.append(", questionTfour=").append(questionTfour);
        sb.append(", questionTfive=").append(questionTfive);
        sb.append(", questionTsix=").append(questionTsix);
        sb.append(", questionTsev=").append(questionTsev);
        sb.append(", questionTeig=").append(questionTeig);
        sb.append(", questionTnin=").append(questionTnin);
        sb.append(", questionWt=").append(questionWt);
        sb.append(", questionWone=").append(questionWone);
        sb.append(", coordinate=").append(coordinate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}