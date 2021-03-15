package com.hmt.graduate.paper.pojo;

import java.io.Serializable;

/**
 * @author HuangMengTian
 * @date 2021-03-12 17:02:24
 */
public class SurgeryBfEstimate implements Serializable {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 患者表id
     */
    private Long patientId;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 受教育年限
     */
    private Integer eduYear;

    /**
     * 大手术史
     */
    private Integer surgeryHis;

    /**
     * 脑部疾病
     */
    private Integer brainHis;

    /**
     * 日常休闲活动情况
     */
    private Integer department;

    /**
     * 术前疾病情况
     */
    private Integer surgeryBfIllness;

    /**
     * 家务
     */
    private Integer homeWork;

    /**
     * 玩牌
     */
    private Integer playPk;

    /**
     * 玩象棋
     */
    private Integer playChess;

    /**
     * 读报纸
     */
    private Integer readPaper;

    /**
     * 晨练
     */
    private Integer monExcets;

    /**
     * 带小孩
     */
    private Integer playKid;

    /**
     * 旅行
     */
    private Integer travel;

    /**
     * 冠心病
     */
    private Integer gxbIllness;

    /**
     * 高血压病
     */
    private Integer gxyIllness;

    /**
     * 糖尿病
     */
    private Integer tnbIllness;

    /**
     * 肺部感染
     */
    private Integer lungIllness;

    /**
     * 序列化
     */
    private static final long serialVersionUID = -4917793148114024060L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getEduYear() {
        return eduYear;
    }

    public void setEduYear(Integer eduYear) {
        this.eduYear = eduYear;
    }

    public Integer getSurgeryHis() {
        return surgeryHis;
    }

    public void setSurgeryHis(Integer surgeryHis) {
        this.surgeryHis = surgeryHis;
    }

    public Integer getBrainHis() {
        return brainHis;
    }

    public void setBrainHis(Integer brainHis) {
        this.brainHis = brainHis;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Integer getSurgeryBfIllness() {
        return surgeryBfIllness;
    }

    public void setSurgeryBfIllness(Integer surgeryBfIllness) {
        this.surgeryBfIllness = surgeryBfIllness;
    }

    public Integer getHomeWork() {
        return homeWork;
    }

    public void setHomeWork(Integer homeWork) {
        this.homeWork = homeWork;
    }

    public Integer getPlayPk() {
        return playPk;
    }

    public void setPlayPk(Integer playPk) {
        this.playPk = playPk;
    }

    public Integer getPlayChess() {
        return playChess;
    }

    public void setPlayChess(Integer playChess) {
        this.playChess = playChess;
    }

    public Integer getReadPaper() {
        return readPaper;
    }

    public void setReadPaper(Integer readPaper) {
        this.readPaper = readPaper;
    }

    public Integer getMonExcets() {
        return monExcets;
    }

    public void setMonExcets(Integer monExcets) {
        this.monExcets = monExcets;
    }

    public Integer getPlayKid() {
        return playKid;
    }

    public void setPlayKid(Integer playKid) {
        this.playKid = playKid;
    }

    public Integer getTravel() {
        return travel;
    }

    public void setTravel(Integer travel) {
        this.travel = travel;
    }

    public Integer getGxbIllness() {
        return gxbIllness;
    }

    public void setGxbIllness(Integer gxbIllness) {
        this.gxbIllness = gxbIllness;
    }

    public Integer getGxyIllness() {
        return gxyIllness;
    }

    public void setGxyIllness(Integer gxyIllness) {
        this.gxyIllness = gxyIllness;
    }

    public Integer getTnbIllness() {
        return tnbIllness;
    }

    public void setTnbIllness(Integer tnbIllness) {
        this.tnbIllness = tnbIllness;
    }

    public Integer getLungIllness() {
        return lungIllness;
    }

    public void setLungIllness(Integer lungIllness) {
        this.lungIllness = lungIllness;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", patientId=").append(patientId);
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", eduYear=").append(eduYear);
        sb.append(", surgeryHis=").append(surgeryHis);
        sb.append(", brainHis=").append(brainHis);
        sb.append(", department=").append(department);
        sb.append(", surgeryBfIllness=").append(surgeryBfIllness);
        sb.append(", homeWork=").append(homeWork);
        sb.append(", playPk=").append(playPk);
        sb.append(", playChess=").append(playChess);
        sb.append(", readPaper=").append(readPaper);
        sb.append(", monExcets=").append(monExcets);
        sb.append(", playKid=").append(playKid);
        sb.append(", travel=").append(travel);
        sb.append(", gxbIllness=").append(gxbIllness);
        sb.append(", gxyIllness=").append(gxyIllness);
        sb.append(", tnbIllness=").append(tnbIllness);
        sb.append(", lungIllness=").append(lungIllness);
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
        SurgeryBfEstimate other = (SurgeryBfEstimate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPatientId() == null ? other.getPatientId() == null : this.getPatientId().equals(other.getPatientId()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getEduYear() == null ? other.getEduYear() == null : this.getEduYear().equals(other.getEduYear()))
            && (this.getSurgeryHis() == null ? other.getSurgeryHis() == null : this.getSurgeryHis().equals(other.getSurgeryHis()))
            && (this.getBrainHis() == null ? other.getBrainHis() == null : this.getBrainHis().equals(other.getBrainHis()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getSurgeryBfIllness() == null ? other.getSurgeryBfIllness() == null : this.getSurgeryBfIllness().equals(other.getSurgeryBfIllness()))
            && (this.getHomeWork() == null ? other.getHomeWork() == null : this.getHomeWork().equals(other.getHomeWork()))
            && (this.getPlayPk() == null ? other.getPlayPk() == null : this.getPlayPk().equals(other.getPlayPk()))
            && (this.getPlayChess() == null ? other.getPlayChess() == null : this.getPlayChess().equals(other.getPlayChess()))
            && (this.getReadPaper() == null ? other.getReadPaper() == null : this.getReadPaper().equals(other.getReadPaper()))
            && (this.getMonExcets() == null ? other.getMonExcets() == null : this.getMonExcets().equals(other.getMonExcets()))
            && (this.getPlayKid() == null ? other.getPlayKid() == null : this.getPlayKid().equals(other.getPlayKid()))
            && (this.getTravel() == null ? other.getTravel() == null : this.getTravel().equals(other.getTravel()))
            && (this.getGxbIllness() == null ? other.getGxbIllness() == null : this.getGxbIllness().equals(other.getGxbIllness()))
            && (this.getGxyIllness() == null ? other.getGxyIllness() == null : this.getGxyIllness().equals(other.getGxyIllness()))
            && (this.getTnbIllness() == null ? other.getTnbIllness() == null : this.getTnbIllness().equals(other.getTnbIllness()))
            && (this.getLungIllness() == null ? other.getLungIllness() == null : this.getLungIllness().equals(other.getLungIllness()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPatientId() == null) ? 0 : getPatientId().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getEduYear() == null) ? 0 : getEduYear().hashCode());
        result = prime * result + ((getSurgeryHis() == null) ? 0 : getSurgeryHis().hashCode());
        result = prime * result + ((getBrainHis() == null) ? 0 : getBrainHis().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getSurgeryBfIllness() == null) ? 0 : getSurgeryBfIllness().hashCode());
        result = prime * result + ((getHomeWork() == null) ? 0 : getHomeWork().hashCode());
        result = prime * result + ((getPlayPk() == null) ? 0 : getPlayPk().hashCode());
        result = prime * result + ((getPlayChess() == null) ? 0 : getPlayChess().hashCode());
        result = prime * result + ((getReadPaper() == null) ? 0 : getReadPaper().hashCode());
        result = prime * result + ((getMonExcets() == null) ? 0 : getMonExcets().hashCode());
        result = prime * result + ((getPlayKid() == null) ? 0 : getPlayKid().hashCode());
        result = prime * result + ((getTravel() == null) ? 0 : getTravel().hashCode());
        result = prime * result + ((getGxbIllness() == null) ? 0 : getGxbIllness().hashCode());
        result = prime * result + ((getGxyIllness() == null) ? 0 : getGxyIllness().hashCode());
        result = prime * result + ((getTnbIllness() == null) ? 0 : getTnbIllness().hashCode());
        result = prime * result + ((getLungIllness() == null) ? 0 : getLungIllness().hashCode());
        return result;
    }
}