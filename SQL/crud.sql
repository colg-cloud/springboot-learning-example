-- 主库
CREATE DATABASE springbootdb;

USE springbootdb;

DROP TABLE IF EXISTS  `city`;
CREATE TABLE `city` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '城市编号',
  `province_id` INT(10) UNSIGNED  NOT NULL COMMENT '省份编号',
  `city_name` VARCHAR(25) DEFAULT NULL COMMENT '城市名称',
  `description` VARCHAR(25) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT city VALUES (1, 1, '襄阳市','Colg 的家在襄阳。');



-- 从库
CREATE DATABASE springbootdb_cluster;

USE springbootdb_cluster;

DROP TABLE IF EXISTS `user`;
CREATE TABLE user
(
id INT(10) unsigned PRIMARY KEY NOT NULL COMMENT '用户编号' AUTO_INCREMENT,
user_name VARCHAR(25) COMMENT '用户名称',
description VARCHAR(25) COMMENT '描述'
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT user VALUES (1 ,'Colg','好好学习，天天向上');