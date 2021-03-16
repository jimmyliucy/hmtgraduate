--本项目数据库脚本：包括系统表，业务表
一,业务表
CREATE TABLE `SURGERY_BF_ESTIMATE` (
  `ID` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `PATIENT_ID` BIGINT(20) NOT NULL COMMENT '患者表id',
  `AGE` INT(3) NOT NULL COMMENT '年龄',
  `SEX` CHAR(1) NOT NULL COMMENT '性别',
  `EDU_YEAR` INT(3) NOT NULL COMMENT '受教育年限',
  `SURGERY_HIS` INT(1) DEFAULT NULL COMMENT '大手术史',
  `BRAIN_HIS` INT(1) NOT NULL COMMENT '脑部疾病',
  `DEPARTMENT` INT(1) DEFAULT NULL COMMENT '日常休闲活动情况',
  `SURGERY_BF_ILLNESS` INT(1) DEFAULT NULL COMMENT '术前疾病情况',
  `HOME_WORK` INT(1) DEFAULT NULL COMMENT '家务',
  `PLAY_PK` INT(1) DEFAULT NULL COMMENT '玩牌',
  `PLAY_CHESS` INT(1) DEFAULT NULL COMMENT '玩象棋',
  `READ_PAPER` INT(1) DEFAULT NULL COMMENT '读报纸',
  `MON_EXCETS` INT(1) DEFAULT NULL COMMENT '晨练',
  `PLAY_KID` INT(1) DEFAULT NULL COMMENT '带小孩',
  `TRAVEL` INT(1) DEFAULT NULL COMMENT '旅行',
  `GXB_ILLNESS` INT(1) DEFAULT NULL COMMENT '冠心病',
  `GXY_ILLNESS` INT(1) DEFAULT NULL COMMENT '高血压病',
  `TNB_ILLNESS` INT(1) DEFAULT NULL COMMENT '糖尿病',
  `LUNG_ILLNESS` INT(1) DEFAULT NULL COMMENT '肺部感染',
  PRIMARY KEY (`ID`)
) ENGINE=INNODB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8 COMMENT='术前评估';

CREATE TABLE `SURGERYING_ESTIMATE` (
  `ID` bigint(20) NOT NULL COMMENT '主键',
  `MZ_TIME` bigint(2) DEFAULT NULL COMMENT '麻醉时间(小时)',
  `WSQ_BLOOD` int(1) DEFAULT NULL COMMENT '围术期输血(是否)',
  `LOWER_BLOOD` int(1) DEFAULT NULL COMMENT '术中低血压(是否)',
  `MA_WAY` varchar(200) DEFAULT NULL COMMENT '麻醉方式',
  `SURGERY_NAME` varchar(100) DEFAULT NULL COMMENT '手术名称',
  `SURGERY_DATE` datetime DEFAULT NULL COMMENT '手术时间',
  PRIMARY KEY (`ID`)
) ENGINE=INNODB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8 COMMENT='术中评估';

CREATE TABLE `cam` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `acute` int(1) DEFAULT NULL COMMENT '急性起病',
  `attention` int(1) DEFAULT NULL COMMENT '注意障碍',
  `thinking` int(1) DEFAULT NULL COMMENT '思维混乱',
  `sence` int(1) DEFAULT NULL COMMENT '意识水平的改变',
  `directional` int(1) DEFAULT NULL COMMENT '定向障碍',
  `patient_id` int(11) DEFAULT NULL COMMENT '患者主键id',
  `status` int(1) DEFAULT NULL COMMENT '状态',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `memory_loss` int(1) DEFAULT NULL COMMENT '记忆力减退',
  `perception_disorders` int(1) DEFAULT NULL COMMENT '知觉障碍',
  `psycho_sport_excitement` int(1) DEFAULT NULL COMMENT '精神运动性兴奋',
  `mental_sport_slow` int(1) DEFAULT NULL COMMENT '精神运动性迟缓',
  `wave` int(1) DEFAULT NULL COMMENT '波动性',
  `sleep_wake_cycle` int(1) DEFAULT NULL COMMENT '觉醒周期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='谵妄评定方法(The Confusion Assessment Method―CAM)是由美国Inouye教授[2]编制'

CREATE TABLE `mmse_questions` (
  `question_id` int(3) NOT NULL AUTO_INCREMENT COMMENT '题目序号',
  `question_name` varchar(200) DEFAULT NULL COMMENT '题目序号',
  `score` int(2) DEFAULT NULL COMMENT '分数',
  PRIMARY KEY (`question_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='简易精神状态量表-题目表'

CREATE TABLE `mmse_score` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `patient_id` int(11) DEFAULT NULL COMMENT '患者主键id',
  `status` int(1) DEFAULT NULL COMMENT '状态',
  `question_thr` int(1) DEFAULT NULL COMMENT '问题3',
  `question_two` int(1) DEFAULT NULL COMMENT '问题2',
  `question_one` int(1) DEFAULT NULL COMMENT '问题1',
  `crate_time` datetime DEFAULT NULL COMMENT '创建时间',
  `question_four` int(1) DEFAULT NULL COMMENT '问题4',
  `question_five` int(1) DEFAULT NULL COMMENT '问题5',
  `question_six` int(1) DEFAULT NULL COMMENT '问题6',
  `question_sev` int(1) DEFAULT NULL COMMENT '问题7',
  `question_eig` int(1) DEFAULT NULL COMMENT '问题8',
  `question_nine` int(1) DEFAULT NULL COMMENT '问题9',
  `question_ten` int(1) DEFAULT NULL COMMENT '问题10',
  `question_tone` int(1) DEFAULT NULL COMMENT '问题11',
  `question_ttwo` int(1) DEFAULT NULL COMMENT '问题12',
  `question_tthr` int(1) DEFAULT NULL COMMENT '问题13',
  `question_tfour` int(1) DEFAULT NULL COMMENT '问题14',
  `question_tfive` int(1) DEFAULT NULL COMMENT '问题15',
  `question_tsix` int(1) DEFAULT NULL COMMENT '问题16',
  `question_tsev` int(1) DEFAULT NULL COMMENT '问题17',
  `question_teig` int(1) DEFAULT NULL COMMENT '问题18',
  `question_tnin` int(1) DEFAULT NULL COMMENT '问题19',
  `question_wt` int(1) DEFAULT NULL COMMENT '问题20',
  `question_wone` int(1) DEFAULT NULL COMMENT '问题21',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='简易精神状态量表'


CREATE TABLE `patients` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(12) NOT NULL COMMENT '姓名',
  `id_card` varchar(20) NOT NULL COMMENT '身份证',
  `email` varchar(20) NOT NULL COMMENT 'email',
  `pat_nation` varchar(20) NOT NULL COMMENT '民族',
  `pat_job` varchar(20) NOT NULL COMMENT '职业',
  `age` int(11) NOT NULL COMMENT '年龄',
  `sex` int(11) NOT NULL COMMENT '性别',
  `adress` varchar(100) DEFAULT NULL COMMENT '常住地址',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `allergy` varchar(200) DEFAULT NULL COMMENT '过敏史',
  `family_disease` varchar(200) DEFAULT NULL COMMENT '家族遗传病史',
  `symptom` varchar(200) DEFAULT NULL COMMENT '症状',
  `illness_time` date DEFAULT NULL COMMENT '开始发病时间',
  `degree` char(2) DEFAULT NULL COMMENT '受教育年限',
  `phone_no` varchar(11) DEFAULT NULL COMMENT '手机号',
  `hispital_no` varchar(20) DEFAULT NULL COMMENT '住院号',
  `primary_diagnosis` varchar(300) DEFAULT NULL COMMENT '初步诊断',
  `history_disease` varchar(300) DEFAULT NULL COMMENT '既往病史',
  `history_anesthesia` varchar(300) DEFAULT NULL COMMENT '既往麻醉',
  `marriage` char(1) DEFAULT NULL COMMENT '是否结婚1是2否',
  `remark1` varchar(200) DEFAULT NULL COMMENT '备注',
  `remark2` varchar(200) DEFAULT NULL COMMENT '备注',
  `remark3` varchar(200) DEFAULT NULL COMMENT '备注',
  `remark4` varchar(200) DEFAULT NULL COMMENT '备注',
  `remark5` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_card` (`id_card`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='患者表'

二,系统表
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单名称',
  `pid` int(11) NULL DEFAULT NULL COMMENT '父菜单id',
  `zindex` int(2) NULL DEFAULT NULL COMMENT '菜单排序',
  `istype` int(1) NULL DEFAULT NULL COMMENT '权限分类（0 菜单；1 功能）',
  `descpt` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单编号',
  `icon` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单图标名称',
  `page` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单url',
  `insert_time` datetime(0) NULL DEFAULT NULL COMMENT '添加时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 26 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `descpt` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色描述',
  `code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色编号',
  `insert_uid` int(11) NULL DEFAULT NULL COMMENT '操作用户id',
  `insert_time` datetime(0) NULL DEFAULT NULL COMMENT '添加数据时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission`  (
  `permit_id` int(5) NOT NULL AUTO_INCREMENT,
  `role_id` int(5) NOT NULL,
  PRIMARY KEY (`permit_id`, `role_id`) USING BTREE,
  INDEX `perimitid`(`permit_id`) USING BTREE,
  INDEX `roleid`(`role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 26 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '用户名',
  `mobile` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '手机号',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '邮箱',
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '密码',
  `insert_uid` int(11) NULL DEFAULT NULL COMMENT '添加该用户的用户id',
  `insert_time` datetime(0) NULL DEFAULT NULL COMMENT '注册时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `is_del` tinyint(1) NULL DEFAULT 0 COMMENT '是否删除（0：正常；1：已删）',
  `is_job` tinyint(1) NULL DEFAULT 0 COMMENT '是否在职（0：正常；1，离职）',
  `mcode` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '短信验证码',
  `send_time` datetime(0) NULL DEFAULT NULL COMMENT '短信发送时间',
  `version` int(10) NULL DEFAULT 0 COMMENT '更新版本',
  `user_ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '绑定用户客户端ip等信息（用于锁定用户设备）',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `name`(`username`) USING BTREE,
  INDEX `id`(`id`) USING BTREE,
  INDEX `mobile`(`mobile`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Compact;


-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `user_id` int(11) NOT NULL,
  `role_id` int(5) NOT NULL,
  PRIMARY KEY (`user_id`, `role_id`) USING BTREE,
  INDEX `userid`(`user_id`) USING BTREE,
  INDEX `roleid`(`role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;

三,脚本语句
-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES (1, '系统管理', 0, 100, 0, '系统管理', 'system', '', '/', '2020-08-05 16:22:43', '2020-08-05 20:58:34');
INSERT INTO `permission` VALUES (2, '用户管理', 1, 1100, 0, '用户管理', 'usermanage', '', '/user/userList', '2020-08-05 16:27:03', '2020-08-05 20:58:34');
INSERT INTO `permission` VALUES (3, '角色管理', 1, 1200, 0, '角色管理', 'rolemanage', '', '/auth/roleManage', '2020-08-05 16:27:03', '2020-08-05 20:58:34');
INSERT INTO `permission` VALUES (4, '权限管理', 1, 1300, 0, '权限管理', 'permmanage', NULL, '/auth/permList', '2020-08-05 19:17:32', '2020-08-05 20:58:34');
INSERT INTO `permission` VALUES (6, '父菜单', 0, 200, 0, '父菜单', 'fatherMenu', NULL, '/', '2020-08-05 11:07:17', '2020-08-05 20:58:34');
INSERT INTO `permission` VALUES (22, '子菜单1', 6, 2100, 0, '子菜单1', 'menuOne', NULL, '/', '2020-08-05 20:50:42', '2020-08-05 20:58:34');
INSERT INTO `permission` VALUES (23, '子菜单2', 6, 2200, 0, '子菜单2', 'menuTwo', NULL, '/', '2020-08-05 20:58:34', '2020-08-05 20:58:34');
INSERT INTO `permission` VALUES (25, '开通用户', 2, 11100, 1, '开通用户', 'setUserPermission', NULL, '/user/setUser', '2020-08-06 17:48:08', NULL);

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, '超级管理', '超级管理员', 'superman', NULL, '2020-08-05 20:58:34', '2020-08-06 17:48:14');
INSERT INTO `role` VALUES (2, '高级管理员', '高级管理员', 'highmanage', NULL, '2020-08-05 20:58:34', '2020-08-05 20:58:34');
INSERT INTO `role` VALUES (3, '经理', '经理', 'bdmanage', NULL, '2020-08-05 20:58:34', '2020-08-05 20:58:34');
INSERT INTO `role` VALUES (7, '测试', '测试', 'test', NULL, '2020-08-06 13:43:24', NULL);

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES (1, 1);
INSERT INTO `role_permission` VALUES (1, 2);
INSERT INTO `role_permission` VALUES (1, 3);
INSERT INTO `role_permission` VALUES (1, 7);
INSERT INTO `role_permission` VALUES (2, 1);
INSERT INTO `role_permission` VALUES (2, 2);
INSERT INTO `role_permission` VALUES (2, 3);
INSERT INTO `role_permission` VALUES (2, 7);
INSERT INTO `role_permission` VALUES (3, 1);
INSERT INTO `role_permission` VALUES (3, 2);
INSERT INTO `role_permission` VALUES (4, 1);
INSERT INTO `role_permission` VALUES (5, 2);
INSERT INTO `role_permission` VALUES (6, 1);
INSERT INTO `role_permission` VALUES (6, 2);
INSERT INTO `role_permission` VALUES (8, 2);
INSERT INTO `role_permission` VALUES (10, 2);
INSERT INTO `role_permission` VALUES (11, 2);
INSERT INTO `role_permission` VALUES (12, 2);
INSERT INTO `role_permission` VALUES (13, 2);
INSERT INTO `role_permission` VALUES (14, 2);
INSERT INTO `role_permission` VALUES (22, 1);
INSERT INTO `role_permission` VALUES (23, 1);
INSERT INTO `role_permission` VALUES (25, 1);

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'wyait', '12316596566', 'aaa211', 'c33367701511b4f6020ec61ded352059', 1, '2020-08-05 20:58:34', '2020-08-06 13:57:44', 0, 0, '645390', '2020-08-05 20:58:34', 35, '18516596566_Sogou Explorer 2.x_Personal computer_Windows_Browser');
INSERT INTO `user` VALUES (2, 'test', '10999999999', '', 'c33367701511b4f6020ec61ded352059', 1, '2020-08-05 20:58:34', '2020-08-06 17:04:05', 0, 0, '185282', '2020-08-05 20:58:34', 26, '123');

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES (1, 1);
INSERT INTO `user_role` VALUES (2, 3);
INSERT INTO `user_role` VALUES (3, 6);
INSERT INTO `user_role` VALUES (4, 6);
INSERT INTO `user_role` VALUES (5, 6);
INSERT INTO `user_role` VALUES (27, 1);

