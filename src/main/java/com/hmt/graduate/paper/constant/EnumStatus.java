package com.hmt.graduate.paper.constant;

public class EnumStatus {

    /**
     * 性别枚举
     */
    public enum SexEnum {
        MAN(1, "男"), WOMEN(0, "女");
        public Integer code;
        public String value;
        private SexEnum(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public Integer getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }

        public String getValueByCode(Integer code) {
            for (SexEnum sex: SexEnum.values()) {
                if (sex.getCode() == code){
                    return sex.getValue();
                }
            }
            return null;
        }
    }

    /**
     * 学历枚举
     */
    public enum DegreeEnum {
        ILLITERACY(0, "小学未毕业"), PRIMARYSCHOOL(1, "小学"),
        MIDDLESCHOOL(2, "初中"),HIGHSCHOOL(3, "高中"),
        UNIVERSITY(4, "大学"),POSTGRADUATE(5, "研究生"),
        DOC(6, "博士");

        public Integer code;
        public String value;

        private DegreeEnum(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public Integer getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }

        public String getValueByCode(Integer code) {
            for (DegreeEnum degree: DegreeEnum.values()) {
                if (degree.getCode() == code){
                    return degree.getValue();
                }
            }
            return null;
        }
    }

    /**
     * 婚姻状态枚举
     */
    public enum MarriageEnum {
        MARRIAGED(1, "已婚"), UNMARRIAGE(0, "未婚");
        public Integer code;
        public String value;
        private MarriageEnum(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public Integer getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }

        public String getValueByCode(Integer code) {
            for (MarriageEnum marriage: MarriageEnum.values()) {
                if (marriage.getCode() == code){
                    return marriage.getValue();
                }
            }
            return null;
        }
    }

    /**
     * 谵妄量表枚举
     */
    public enum CAMEnum {
        NOEXEIT(1, "不存在"), LITTLE(2, "轻度"),
        MIDDLE(3, "中度"),serious(4, "严重");
        public Integer code;
        public String value;
        private CAMEnum(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public Integer getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }

        public String getValueByCode(Integer code) {
            for (CAMEnum cam: CAMEnum.values()) {
                if (cam.getCode() == code){
                    return cam.getValue();
                }
            }
            return null;
        }
    }

    /**
     * 手术前中后状态枚举
     */
    public enum SurgeryEnum {
        unsurgery(1, "手术前"),
        surgerying(2, "手术中"),
        surgeryed(3, "手术后");
        public Integer code;
        public String value;
        private SurgeryEnum(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public Integer getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }

        public String getValueByCode(Integer code) {
            for (SurgeryEnum surgery: SurgeryEnum.values()) {
                if (surgery.getCode() == code){
                    return surgery.getValue();
                }
            }
            return null;
        }
    }

}
