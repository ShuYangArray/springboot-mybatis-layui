DROP TABLE IF EXISTS `live_user`;
CREATE TABLE `live_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(40) NOT NULL COMMENT '注册用户登录名',
  `real_name` varchar(40) DEFAULT NULL COMMENT '注册用户真实姓名',
  `password` varchar(40) NOT NULL COMMENT '登录密码',
  `phone` varchar(11) DEFAULT NULL COMMENT '注册用户手机号码',
  `idcard` varchar(18) DEFAULT NULL COMMENT '注册用户身份证号',
  `age` int(11) DEFAULT NULL COMMENT '注册用户年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of live_user
-- ----------------------------
INSERT INTO `live_user` VALUES ('1', 'dx', '东邪', 'dx', null, null, '41');
INSERT INTO `live_user` VALUES ('2', 'xd', '吸毒', 'xd', null, null, '42');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL COMMENT '系統用户名',
  `real_name` varchar(50) DEFAULT NULL COMMENT '系统用户真实姓名',
  `password` varchar(50) NOT NULL COMMENT '系统用户密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '系统管理员', '123456');
INSERT INTO `sys_user` VALUES ('2', 'jvxb', 'java小兵', '123456');
