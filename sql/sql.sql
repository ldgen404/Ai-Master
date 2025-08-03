CREATE DATABASE aimaster -- 用户表
-- sk-e84585809b3c4c25a57d8e6f0b94c63a

use aimaster

CREATE TABLE IF NOT EXISTS `user` (
                                      id BIGINT AUTO_INCREMENT COMMENT 'id' PRIMARY KEY,
                                      userAccount VARCHAR(256) NOT NULL COMMENT '账号',
    userPassword VARCHAR(512) NOT NULL COMMENT '密码',
    userName VARCHAR(256) NULL COMMENT '用户昵称',
    userAvatar VARCHAR(1024) NULL COMMENT '用户头像',
    userProfile VARCHAR(512) NULL COMMENT '用户简介',
    userRole VARCHAR(256) DEFAULT 'user' NOT NULL COMMENT '用户角色：user/admin',
    editTime DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '编辑时间',
    createTime DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
    updateTime DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    isDelete TINYINT DEFAULT 0 NOT NULL COMMENT '是否删除',
    vipExpireTime DATETIME NULL COMMENT '会员过期时间',
    vipCode VARCHAR(128) NULL COMMENT '会员兑换码',
    vipNumber BIGINT NULL COMMENT '会员编号',
    shareCode VARCHAR(20) DEFAULT NULL COMMENT '分享码',
    inviteUser BIGINT DEFAULT NULL COMMENT '邀请用户 id',

    UNIQUE KEY uk_userAccount (userAccount),
    INDEX idx_userName (userName)
    ) COMMENT = '用户' COLLATE = utf8mb4_unicode_ci;
