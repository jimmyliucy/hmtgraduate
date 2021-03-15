package com.hmt.graduate.paper.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author HuangMengTian
 * @date 2021-03-15 16:16:38
 */
public class SurgeryingEstimateDTO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 患者ID
     */
    private Long parentId;

    /**
     * 麻醉时间(小时)
     */
    private Long mzTime;

    /**
     * 围术期输血(是否)
     */
    private Integer wsqBlood;

    /**
     * 术中低血压(是否)
     */
    private Integer lowerBlood;

    /**
     * 麻醉方式
     */
    private String maWay;

    /**
     * 手术名称
     */
    private String surgeryName;

    /**
     * 手术时间
     */
    private Date surgeryDate;

    /**
     * 序列化
     */
    private static final long serialVersionUID = -625805163017321361L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getMzTime() {
        return mzTime;
    }

    public void setMzTime(Long mzTime) {
        this.mzTime = mzTime;
    }

    public Integer getWsqBlood() {
        return wsqBlood;
    }

    public void setWsqBlood(Integer wsqBlood) {
        this.wsqBlood = wsqBlood;
    }

    public Integer getLowerBlood() {
        return lowerBlood;
    }

    public void setLowerBlood(Integer lowerBlood) {
        this.lowerBlood = lowerBlood;
    }

    public String getMaWay() {
        return maWay;
    }

    public void setMaWay(String maWay) {
        this.maWay = maWay == null ? null : maWay.trim();
    }

    public String getSurgeryName() {
        return surgeryName;
    }

    public void setSurgeryName(String surgeryName) {
        this.surgeryName = surgeryName == null ? null : surgeryName.trim();
    }

    public Date getSurgeryDate() {
        return surgeryDate;
    }

    public void setSurgeryDate(Date surgeryDate) {
        this.surgeryDate = surgeryDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", mzTime=").append(mzTime);
        sb.append(", wsqBlood=").append(wsqBlood);
        sb.append(", lowerBlood=").append(lowerBlood);
        sb.append(", maWay=").append(maWay);
        sb.append(", surgeryName=").append(surgeryName);
        sb.append(", surgeryDate=").append(surgeryDate);
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
        SurgeryingEstimateDTO other = (SurgeryingEstimateDTO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getMzTime() == null ? other.getMzTime() == null : this.getMzTime().equals(other.getMzTime()))
            && (this.getWsqBlood() == null ? other.getWsqBlood() == null : this.getWsqBlood().equals(other.getWsqBlood()))
            && (this.getLowerBlood() == null ? other.getLowerBlood() == null : this.getLowerBlood().equals(other.getLowerBlood()))
            && (this.getMaWay() == null ? other.getMaWay() == null : this.getMaWay().equals(other.getMaWay()))
            && (this.getSurgeryName() == null ? other.getSurgeryName() == null : this.getSurgeryName().equals(other.getSurgeryName()))
            && (this.getSurgeryDate() == null ? other.getSurgeryDate() == null : this.getSurgeryDate().equals(other.getSurgeryDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getMzTime() == null) ? 0 : getMzTime().hashCode());
        result = prime * result + ((getWsqBlood() == null) ? 0 : getWsqBlood().hashCode());
        result = prime * result + ((getLowerBlood() == null) ? 0 : getLowerBlood().hashCode());
        result = prime * result + ((getMaWay() == null) ? 0 : getMaWay().hashCode());
        result = prime * result + ((getSurgeryName() == null) ? 0 : getSurgeryName().hashCode());
        result = prime * result + ((getSurgeryDate() == null) ? 0 : getSurgeryDate().hashCode());
        return result;
    }
}