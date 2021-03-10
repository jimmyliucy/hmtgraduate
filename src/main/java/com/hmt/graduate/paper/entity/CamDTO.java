package com.hmt.graduate.paper.entity;

import com.hmt.graduate.paper.pojo.Cam;

import java.io.Serializable;
import java.util.Date;

public class CamDTO implements Serializable {
    private static final long serialVersionUID = 4L;

    private Integer id;

    private Integer acute;

    private Integer attention;

    private Integer thinking;

    private Integer sence;

    private Integer directional;

    private Integer camPatientId;

    private Integer status;

    private Date createTime;

    private Integer memoryLoss;

    private Integer perceptionDisorders;

    private Integer psychoSportExcitement;

    private Integer mentalSportSlow;

    private Integer wave;

    private Integer sleepWakeCycle;

    private Integer score;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getAcute() {
        return acute;
    }


    public void setAcute(Integer acute) {
        this.acute = acute;
    }


    public Integer getAttention() {
        return attention;
    }


    public void setAttention(Integer attention) {
        this.attention = attention;
    }


    public Integer getThinking() {
        return thinking;
    }


    public void setThinking(Integer thinking) {
        this.thinking = thinking;
    }


    public Integer getSence() {
        return sence;
    }


    public void setSence(Integer sence) {
        this.sence = sence;
    }


    public Integer getDirectional() {
        return directional;
    }


    public void setDirectional(Integer directional) {
        this.directional = directional;
    }

    public void setCamPatientId(Integer camPatientId) {
        this.camPatientId = camPatientId;
    }

    public Integer getCamPatientId() {
        return camPatientId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getStatus() {
        return status;
    }


    public void setStatus(Integer status) {
        this.status = status;
    }


    public Date getCreateTime() {
        return createTime;
    }


    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Integer getMemoryLoss() {
        return memoryLoss;
    }


    public void setMemoryLoss(Integer memoryLoss) {
        this.memoryLoss = memoryLoss;
    }


    public Integer getPerceptionDisorders() {
        return perceptionDisorders;
    }


    public void setPerceptionDisorders(Integer perceptionDisorders) {
        this.perceptionDisorders = perceptionDisorders;
    }


    public Integer getPsychoSportExcitement() {
        return psychoSportExcitement;
    }


    public void setPsychoSportExcitement(Integer psychoSportExcitement) {
        this.psychoSportExcitement = psychoSportExcitement;
    }


    public Integer getMentalSportSlow() {
        return mentalSportSlow;
    }


    public void setMentalSportSlow(Integer mentalSportSlow) {
        this.mentalSportSlow = mentalSportSlow;
    }


    public Integer getWave() {
        return wave;
    }


    public void setWave(Integer wave) {
        this.wave = wave;
    }


    public Integer getSleepWakeCycle() {
        return sleepWakeCycle;
    }


    public void setSleepWakeCycle(Integer sleepWakeCycle) {
        this.sleepWakeCycle = sleepWakeCycle;
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
        Cam other = (Cam) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getAcute() == null ? other.getAcute() == null : this.getAcute().equals(other.getAcute()))
                && (this.getAttention() == null ? other.getAttention() == null : this.getAttention().equals(other.getAttention()))
                && (this.getThinking() == null ? other.getThinking() == null : this.getThinking().equals(other.getThinking()))
                && (this.getSence() == null ? other.getSence() == null : this.getSence().equals(other.getSence()))
                && (this.getDirectional() == null ? other.getDirectional() == null : this.getDirectional().equals(other.getDirectional()))
                && (this.getCamPatientId() == null ? other.getPatientId() == null : this.getCamPatientId().equals(other.getPatientId()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getMemoryLoss() == null ? other.getMemoryLoss() == null : this.getMemoryLoss().equals(other.getMemoryLoss()))
                && (this.getPerceptionDisorders() == null ? other.getPerceptionDisorders() == null : this.getPerceptionDisorders().equals(other.getPerceptionDisorders()))
                && (this.getPsychoSportExcitement() == null ? other.getPsychoSportExcitement() == null : this.getPsychoSportExcitement().equals(other.getPsychoSportExcitement()))
                && (this.getMentalSportSlow() == null ? other.getMentalSportSlow() == null : this.getMentalSportSlow().equals(other.getMentalSportSlow()))
                && (this.getWave() == null ? other.getWave() == null : this.getWave().equals(other.getWave()))
                && (this.getSleepWakeCycle() == null ? other.getSleepWakeCycle() == null : this.getSleepWakeCycle().equals(other.getSleepWakeCycle()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cam
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAcute() == null) ? 0 : getAcute().hashCode());
        result = prime * result + ((getAttention() == null) ? 0 : getAttention().hashCode());
        result = prime * result + ((getThinking() == null) ? 0 : getThinking().hashCode());
        result = prime * result + ((getSence() == null) ? 0 : getSence().hashCode());
        result = prime * result + ((getDirectional() == null) ? 0 : getDirectional().hashCode());
        result = prime * result + ((getCamPatientId() == null) ? 0 : getCamPatientId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getMemoryLoss() == null) ? 0 : getMemoryLoss().hashCode());
        result = prime * result + ((getPerceptionDisorders() == null) ? 0 : getPerceptionDisorders().hashCode());
        result = prime * result + ((getPsychoSportExcitement() == null) ? 0 : getPsychoSportExcitement().hashCode());
        result = prime * result + ((getMentalSportSlow() == null) ? 0 : getMentalSportSlow().hashCode());
        result = prime * result + ((getWave() == null) ? 0 : getWave().hashCode());
        result = prime * result + ((getSleepWakeCycle() == null) ? 0 : getSleepWakeCycle().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cam
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", acute=").append(acute);
        sb.append(", attention=").append(attention);
        sb.append(", thinking=").append(thinking);
        sb.append(", sence=").append(sence);
        sb.append(", directional=").append(directional);
        sb.append(", patientId=").append(camPatientId);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", memoryLoss=").append(memoryLoss);
        sb.append(", perceptionDisorders=").append(perceptionDisorders);
        sb.append(", psychoSportExcitement=").append(psychoSportExcitement);
        sb.append(", mentalSportSlow=").append(mentalSportSlow);
        sb.append(", wave=").append(wave);
        sb.append(", sleepWakeCycle=").append(sleepWakeCycle);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

}
