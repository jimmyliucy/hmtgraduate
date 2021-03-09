package com.hmt.graduate.paper.pojo;

import java.io.Serializable;

public class MmseQuestions implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmse_questions.question_id
     *
     */
    private Integer questionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmse_questions.question_name
     *
     */
    private String questionName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmse_questions.score
     *
     */
    private Integer score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mmse_questions
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmse_questions.question_id
     *
     * @return the value of mmse_questions.question_id
     *
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmse_questions.question_id
     *
     * @param questionId the value for mmse_questions.question_id
     *
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmse_questions.question_name
     *
     * @return the value of mmse_questions.question_name
     *
     */
    public String getQuestionName() {
        return questionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmse_questions.question_name
     *
     * @param questionName the value for mmse_questions.question_name
     *
     */
    public void setQuestionName(String questionName) {
        this.questionName = questionName == null ? null : questionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmse_questions.score
     *
     * @return the value of mmse_questions.score
     *
     * @mbg.generated
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmse_questions.score
     *
     * @param score the value for mmse_questions.score
     *
     * @mbg.generated
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmse_questions
     *
     * @mbg.generated
     */
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmse_questions
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQuestionId() == null) ? 0 : getQuestionId().hashCode());
        result = prime * result + ((getQuestionName() == null) ? 0 : getQuestionName().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmse_questions
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", questionId=").append(questionId);
        sb.append(", questionName=").append(questionName);
        sb.append(", score=").append(score);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}