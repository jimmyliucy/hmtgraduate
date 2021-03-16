package com.hmt.graduate.paper.pojo;

import java.io.Serializable;

/**
 * @author HuangMengTian
 * @date 2021-03-16 11:42:42
 */
public class MmseQuestions implements Serializable {
    /**
     * 题目序号
     */
    private Integer questionId;

    /**
     * 题目序号
     */
    private String questionName;

    /**
     * 分数
     */
    private Integer score;

    /**
     * 序列化
     */
    private static final long serialVersionUID = -1524815706496284795L;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName == null ? null : questionName.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", questionId=").append(questionId);
        sb.append(", questionName=").append(questionName);
        sb.append(", score=").append(score);
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
        MmseQuestions other = (MmseQuestions) that;
        return (this.getQuestionId() == null ? other.getQuestionId() == null : this.getQuestionId().equals(other.getQuestionId()))
            && (this.getQuestionName() == null ? other.getQuestionName() == null : this.getQuestionName().equals(other.getQuestionName()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQuestionId() == null) ? 0 : getQuestionId().hashCode());
        result = prime * result + ((getQuestionName() == null) ? 0 : getQuestionName().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        return result;
    }
}