-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.21-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 fixedasset 的数据库结构
CREATE DATABASE IF NOT EXISTS `fixedasset` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `fixedasset`;

-- 导出  表 fixedasset.allot 结构
CREATE TABLE IF NOT EXISTS `allot` (
  `allot_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `allot_code` varchar(50) DEFAULT NULL COMMENT '领用单编号',
  `outstock_id` int(11) DEFAULT NULL COMMENT '出库单ID',
  `use_user_id` int(11) NOT NULL COMMENT '领用人ID',
  `use_user_name` varchar(255) DEFAULT NULL COMMENT '领用人名称',
  `use_place` varchar(50) DEFAULT NULL COMMENT '领用地点',
  `allot_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0 未领用 1 已领用',
  `allot_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '分配时间',
  `allot_user_id` int(11) NOT NULL COMMENT '分配员ID',
  PRIMARY KEY (`allot_id`),
  KEY `allot_id_pk_idx` (`allot_id`),
  KEY `aoid_fk` (`outstock_id`),
  KEY `aauid_fk` (`allot_user_id`),
  CONSTRAINT `aauid_fk` FOREIGN KEY (`allot_user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `aoid_fk` FOREIGN KEY (`outstock_id`) REFERENCES `outstock` (`outstock_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分配记录表';

-- 正在导出表  fixedasset.allot 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `allot` DISABLE KEYS */;
/*!40000 ALTER TABLE `allot` ENABLE KEYS */;

-- 导出  表 fixedasset.asset 结构
CREATE TABLE IF NOT EXISTS `asset` (
  `asset_id` int(11) NOT NULL DEFAULT '0' COMMENT '资产ID',
  `asset_code` varchar(255) NOT NULL COMMENT '资产编码(条码)',
  `asset_name` varchar(255) NOT NULL COMMENT '资产名称',
  `type1` int(255) NOT NULL COMMENT '资产大类',
  `type2` int(255) NOT NULL COMMENT '资产小类',
  `type3` int(255) DEFAULT NULL,
  `type4` int(255) DEFAULT NULL,
  `asset_status` int(11) NOT NULL COMMENT '状态 0 初始状态',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_user` int(255) NOT NULL COMMENT '创建人',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改日期',
  `project_id` int(11) NOT NULL COMMENT '申请单ID',
  `project_detail_id` int(11) NOT NULL COMMENT '工程条目ID',
  `outstock_id` int(11) DEFAULT NULL COMMENT '出库单ID',
  `outstock_detail_id` int(11) DEFAULT NULL COMMENT '出库单条目ID',
  `firm` varchar(255) DEFAULT NULL COMMENT '厂商',
  `brand` varchar(255) DEFAULT NULL COMMENT '品牌',
  `model` varchar(255) DEFAULT NULL COMMENT '型号',
  `serial_num` varchar(255) DEFAULT NULL COMMENT '序列号',
  `supplier` varchar(255) DEFAULT NULL COMMENT '供应商',
  `asset_remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `use_entry_id` int(11) DEFAULT NULL COMMENT '责任人ID',
  `use_entry_name` varchar(255) DEFAULT NULL COMMENT '责任人名称',
  `use_place_id` varchar(50) DEFAULT NULL COMMENT '使用地点ID',
  `use_place_name` varchar(255) DEFAULT NULL COMMENT '使用地点名称',
  `price_type` int(11) NOT NULL DEFAULT '1' COMMENT '价格单位 1 元 2 万元',
  `price` decimal(10,2) NOT NULL COMMENT '价格',
  `invoice_code` varchar(255) DEFAULT NULL COMMENT '发票号',
  PRIMARY KEY (`asset_id`),
  UNIQUE KEY `asset_code` (`asset_code`),
  KEY `aas_fk` (`asset_status`),
  KEY `api_fk` (`project_id`),
  KEY `apdi_fk` (`project_detail_id`),
  KEY `aoi_fk` (`outstock_id`),
  KEY `asset_id_pk_idx` (`asset_id`),
  KEY `atype1_fk` (`type1`),
  KEY `atype2_fk` (`type2`),
  KEY `acuid_fk` (`create_user`),
  KEY `aueid_fk` (`use_entry_id`),
  CONSTRAINT `aas_fk` FOREIGN KEY (`asset_status`) REFERENCES `asset_status` (`status_code`),
  CONSTRAINT `acuid_fk` FOREIGN KEY (`create_user`) REFERENCES `user` (`user_id`),
  CONSTRAINT `aoi_fk` FOREIGN KEY (`outstock_id`) REFERENCES `outstock` (`outstock_id`),
  CONSTRAINT `apdi_fk` FOREIGN KEY (`project_detail_id`) REFERENCES `project_detail` (`detail_id`),
  CONSTRAINT `api_fk` FOREIGN KEY (`project_id`) REFERENCES `project` (`project_id`),
  CONSTRAINT `atype1_fk` FOREIGN KEY (`type1`) REFERENCES `asset_type` (`type_code`),
  CONSTRAINT `atype2_fk` FOREIGN KEY (`type2`) REFERENCES `asset_type` (`type_code`),
  CONSTRAINT `aueid_fk` FOREIGN KEY (`use_entry_id`) REFERENCES `use_entry` (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资产表';

-- 正在导出表  fixedasset.asset 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `asset` DISABLE KEYS */;
/*!40000 ALTER TABLE `asset` ENABLE KEYS */;

-- 导出  表 fixedasset.asset_status 结构
CREATE TABLE IF NOT EXISTS `asset_status` (
  `status_id` int(11) NOT NULL DEFAULT '0' COMMENT '状态ID',
  `status_code` int(11) NOT NULL COMMENT '状态编码',
  `status_name` varchar(255) NOT NULL COMMENT '状态名称',
  PRIMARY KEY (`status_id`),
  UNIQUE KEY `status_code` (`status_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  fixedasset.asset_status 的数据：~6 rows (大约)
/*!40000 ALTER TABLE `asset_status` DISABLE KEYS */;
INSERT INTO `asset_status` (`status_id`, `status_code`, `status_name`) VALUES
	(0, 0, '新增'),
	(1, 1, '待用（在库存中）'),
	(2, 2, '在用（已领用）'),
	(3, 3, '报废'),
	(4, 4, '出库中'),
	(5, 5, '已出库（待分配）');
/*!40000 ALTER TABLE `asset_status` ENABLE KEYS */;

-- 导出  表 fixedasset.asset_type 结构
CREATE TABLE IF NOT EXISTS `asset_type` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '资产类型ID',
  `type_code` int(11) NOT NULL COMMENT '类别编码',
  `type_name` varchar(255) NOT NULL COMMENT '类型名称',
  `parent_id` int(11) NOT NULL COMMENT '父级ID',
  PRIMARY KEY (`type_id`),
  UNIQUE KEY `type_code` (`type_code`),
  KEY `atpid_fk` (`parent_id`),
  KEY `type_id_pk_idx` (`type_id`),
  CONSTRAINT `atpid_fk` FOREIGN KEY (`parent_id`) REFERENCES `asset_type` (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  fixedasset.asset_type 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `asset_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `asset_type` ENABLE KEYS */;

-- 导出  表 fixedasset.instock_apply 结构
CREATE TABLE IF NOT EXISTS `instock_apply` (
  `instock_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '入库申请ID',
  `asset_id` int(11) NOT NULL COMMENT '资产ID',
  `apply_user` int(11) NOT NULL COMMENT '申请人',
  `apply_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '申请时间',
  `status` int(11) NOT NULL COMMENT '入库申请状态 0 待审批 1 审批通过 2 审批驳回',
  `instock_type` int(11) NOT NULL COMMENT '入库类型 1 资产归还 2 资产报废',
  `approval_user_id` int(11) DEFAULT NULL COMMENT '审批人',
  `approval_time` timestamp NULL DEFAULT NULL COMMENT '审批时间',
  `instock_remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `last_modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
  PRIMARY KEY (`instock_id`),
  KEY `iaaid_fk` (`asset_id`),
  KEY `iaauid_fk` (`apply_user`),
  KEY `iaappuid_fk` (`approval_user_id`),
  CONSTRAINT `iaaid_fk` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`asset_id`),
  CONSTRAINT `iaappuid_fk` FOREIGN KEY (`approval_user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `iaauid_fk` FOREIGN KEY (`apply_user`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='入库申请表';

-- 正在导出表  fixedasset.instock_apply 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `instock_apply` DISABLE KEYS */;
/*!40000 ALTER TABLE `instock_apply` ENABLE KEYS */;

-- 导出  表 fixedasset.outstock 结构
CREATE TABLE IF NOT EXISTS `outstock` (
  `outstock_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '出库单ID',
  `outstock_name` varchar(255) DEFAULT NULL COMMENT '出库单名称',
  `outstock_code` varchar(255) DEFAULT NULL COMMENT '出库单编码',
  `outstock_status` int(11) NOT NULL DEFAULT '0' COMMENT '出库单状态 0 待审批 1 审批通过 2 审批驳回',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `apply_user_id` int(11) NOT NULL COMMENT '申请人ID',
  `approval_user_id` int(11) DEFAULT NULL COMMENT '审批人ID',
  `approval_time` timestamp NULL DEFAULT NULL COMMENT '审批时间',
  `picture` blob COMMENT '出库单图片',
  `outstock_remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `last_modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
  PRIMARY KEY (`outstock_id`),
  UNIQUE KEY `outstock_code` (`outstock_code`),
  KEY `oauid_fk` (`apply_user_id`),
  KEY `oappuid_fk` (`approval_user_id`),
  CONSTRAINT `oappuid_fk` FOREIGN KEY (`approval_user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `oauid_fk` FOREIGN KEY (`apply_user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='出库单表';

-- 正在导出表  fixedasset.outstock 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `outstock` DISABLE KEYS */;
/*!40000 ALTER TABLE `outstock` ENABLE KEYS */;

-- 导出  表 fixedasset.outstock_detail 结构
CREATE TABLE IF NOT EXISTS `outstock_detail` (
  `outstock_id` int(11) NOT NULL COMMENT '出库单ID',
  `asset_id` int(11) NOT NULL COMMENT '资产ID',
  PRIMARY KEY (`outstock_id`,`asset_id`),
  KEY `odaid_fk` (`asset_id`),
  CONSTRAINT `odaid_fk` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`asset_id`),
  CONSTRAINT `odoid_fk` FOREIGN KEY (`outstock_id`) REFERENCES `outstock` (`outstock_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='工程条目';

-- 正在导出表  fixedasset.outstock_detail 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `outstock_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `outstock_detail` ENABLE KEYS */;

-- 导出  表 fixedasset.project 结构
CREATE TABLE IF NOT EXISTS `project` (
  `project_id` int(11) NOT NULL COMMENT '工程单ID',
  `project_code` varchar(255) NOT NULL COMMENT '工程编号',
  `project_name` varchar(255) DEFAULT NULL COMMENT '工程单名称',
  `project_status` tinyint(2) NOT NULL COMMENT '工程单状态  0待审批 1 审批通过 2 审批驳回',
  `apply_user_id` int(11) NOT NULL COMMENT '申请人',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `approval_time` timestamp NULL DEFAULT NULL COMMENT '审批时间',
  `approval_user_id` int(11) DEFAULT NULL COMMENT '审批人ID',
  `picture` blob COMMENT '资产图片',
  `project_remark` varchar(255) DEFAULT NULL COMMENT '工程单备注',
  PRIMARY KEY (`project_id`),
  UNIQUE KEY `project_code` (`project_code`),
  KEY `paui_fk` (`apply_user_id`),
  KEY `pappui_fk` (`approval_user_id`),
  KEY `p_id_pk_idx` (`project_id`),
  CONSTRAINT `pappui_fk` FOREIGN KEY (`approval_user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `paui_fk` FOREIGN KEY (`apply_user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  fixedasset.project 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
/*!40000 ALTER TABLE `project` ENABLE KEYS */;

-- 导出  表 fixedasset.project_detail 结构
CREATE TABLE IF NOT EXISTS `project_detail` (
  `detail_id` int(11) NOT NULL COMMENT '条目ID',
  `project_id` int(11) NOT NULL COMMENT '工程单ID',
  `detail_code` varchar(255) DEFAULT NULL COMMENT '条目编号',
  `detail_name` varchar(255) DEFAULT NULL COMMENT '资产名称',
  `firm` varchar(255) DEFAULT NULL COMMENT '厂商',
  `picture` blob COMMENT '资产图片',
  `brand` varchar(255) DEFAULT NULL COMMENT '品牌',
  `model` varchar(255) DEFAULT NULL COMMENT '型号',
  `supplier` varchar(255) DEFAULT NULL COMMENT '供应商',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `create_time` timestamp NULL DEFAULT NULL,
  `detail_number` int(11) NOT NULL DEFAULT '1' COMMENT '数量',
  `detail_size` int(255) NOT NULL DEFAULT '1' COMMENT '规格 1 个 2 千克 3 吨 4 其他',
  `detail_price` decimal(10,2) DEFAULT NULL COMMENT '单价',
  `detail_price_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '单价类型 1 元 2 万元 3 亿元',
  `is_asset` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否资产 0 非资产 1 资产',
  `detail_remark` varchar(255) DEFAULT NULL COMMENT '条目备注',
  PRIMARY KEY (`detail_id`),
  KEY `pdpi_fk` (`project_id`),
  KEY `detail_id` (`detail_id`),
  CONSTRAINT `pdpi_fk` FOREIGN KEY (`project_id`) REFERENCES `project` (`project_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='工程条目';

-- 正在导出表  fixedasset.project_detail 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `project_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `project_detail` ENABLE KEYS */;

-- 导出  表 fixedasset.resource 结构
CREATE TABLE IF NOT EXISTS `resource` (
  `resource_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '资源ID',
  `resource_name` varchar(50) NOT NULL COMMENT '资源名称',
  `remark` varchar(50) DEFAULT NULL COMMENT '资源备注',
  `resource_url` varchar(50) DEFAULT NULL COMMENT '资源URL',
  `resource_type` int(11) NOT NULL DEFAULT '1' COMMENT '资源类型 1 一级菜单 2 二级菜单 3 其他',
  `parent_id` int(11) DEFAULT NULL COMMENT '父级ID',
  `icon` varchar(50) DEFAULT NULL COMMENT '图标类',
  `order_no` int(11) DEFAULT NULL COMMENT '序号',
  PRIMARY KEY (`resource_id`),
  KEY `rpid_fk` (`parent_id`),
  CONSTRAINT `rpid_fk` FOREIGN KEY (`parent_id`) REFERENCES `resource` (`resource_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COMMENT='资源';

-- 正在导出表  fixedasset.resource 的数据：~21 rows (大约)
/*!40000 ALTER TABLE `resource` DISABLE KEYS */;
INSERT INTO `resource` (`resource_id`, `resource_name`, `remark`, `resource_url`, `resource_type`, `parent_id`, `icon`, `order_no`) VALUES
	(1, 'home', '首页', '/home', 2, NULL, 'fa  fa-dashboard', 1),
	(2, 'auth_manage', '权限管理', NULL, 1, NULL, 'fa fa-lock', 2),
	(3, 'stock_manage', '库存管理', NULL, 1, NULL, 'fa fa-database', 3),
	(4, 'sys_manage', '系统管理', NULL, 1, NULL, 'fa fa-gears', 4),
	(5, 'user_list', '用户管理', '/user/', 2, 2, 'fa fa-user', 1),
	(6, 'role_list', '角色管理', '/role/', 2, 2, 'fa fa-role', 2),
	(7, 'resource_list', '菜单管理', '/resource/', 2, 2, 'fa fa-menu', 3),
	(8, 'project_apply', '入库申请', '/project/apply', 2, 3, 'fa fa-project', 1),
	(9, 'project_check', '入库审批', '/project/check_get', 2, 3, NULL, 2),
	(10, 'project_list', '入库管理', '/project/get/', 2, 3, NULL, 3),
	(11, 'outstock_apply', '出库申请', '/outstock/apply', 2, 3, NULL, 4),
	(12, 'outstock_check', '出库审批', '/outstock/check', 2, 3, NULL, 5),
	(13, 'asset_allot', '资产分配', '/asset_allot/', 2, 3, NULL, 6),
	(14, 'asset_gohome', '资产回收', '/instock/gohome', 2, 3, NULL, 7),
	(15, 'asset_godown', '资产报废', '/instock/godown', 2, 3, NULL, 8),
	(16, 'asset_check', '资产盘点', '/asset/check_list', 2, 3, NULL, 9),
	(17, 'asset_reallot', '资产转移', '/asset/reallot', 2, 3, NULL, 10),
	(18, 'common_query', '通用查询', '/common_query/', 2, 3, NULL, 11),
	(19, 'asset_type', '资产类别管理', '/asset_type/', 2, 4, NULL, 12),
	(20, 'use_dictory', '领用人维护', '/use_entry/', 2, 4, NULL, 13),
	(21, 'sys_log', '系统日志', '/sys_log/', 2, 4, NULL, 14);
/*!40000 ALTER TABLE `resource` ENABLE KEYS */;

-- 导出  表 fixedasset.role 结构
CREATE TABLE IF NOT EXISTS `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `role_name` varchar(50) NOT NULL COMMENT '角色名称',
  `remark` varchar(50) DEFAULT NULL COMMENT '角色备注',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='角色';

-- 正在导出表  fixedasset.role 的数据：~4 rows (大约)
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` (`role_id`, `role_name`, `remark`) VALUES
	(1, 'SYSMAN', '系统用户'),
	(2, 'ADMIN', '管理员'),
	(3, 'INSTOCKCHECKER', '入库管理员'),
	(4, 'OUTSTOCKCHECKER', '出库管理员'),
	(5, 'TEST', '测试'),
	(6, 'aserasd', '娃儿阿斯蒂芬'),
	(7, 'asdfasdf', '啊手动阀手动阀');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;

-- 导出  表 fixedasset.role_resource 结构
CREATE TABLE IF NOT EXISTS `role_resource` (
  `role_id` int(11) NOT NULL COMMENT '角色ID',
  `resource_id` int(11) NOT NULL COMMENT '资源ID',
  PRIMARY KEY (`role_id`,`resource_id`),
  KEY `FK_role_resource_role` (`role_id`),
  KEY `FK_role_resource_resource` (`resource_id`),
  CONSTRAINT `FK_role_resource_resource` FOREIGN KEY (`resource_id`) REFERENCES `resource` (`resource_id`),
  CONSTRAINT `FK_role_resource_role` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色资源关联表';

-- 正在导出表  fixedasset.role_resource 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `role_resource` DISABLE KEYS */;
INSERT INTO `role_resource` (`role_id`, `resource_id`) VALUES
	(7, 6),
	(7, 7);
/*!40000 ALTER TABLE `role_resource` ENABLE KEYS */;

-- 导出  表 fixedasset.stock_history 结构
CREATE TABLE IF NOT EXISTS `stock_history` (
  `id` int(11) NOT NULL COMMENT 'ID',
  `op_type` int(11) DEFAULT NULL COMMENT '操作类型',
  `op_user_id` int(11) DEFAULT NULL COMMENT '操作人',
  `op_time` timestamp NULL DEFAULT NULL COMMENT '操作时间',
  `op_status` tinyint(4) DEFAULT NULL COMMENT '操作状态 0 已提交 1 已完成 2 已失败',
  `op_asset_code` varchar(50) DEFAULT NULL COMMENT '资产编码',
  `op_project_code` varchar(50) DEFAULT NULL COMMENT '工程单编码',
  `op_outstock_code` varchar(50) DEFAULT NULL COMMENT '出库单编码',
  `op_remark` varchar(50) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`),
  KEY `FK_stock_history_asset` (`op_asset_code`),
  KEY `FK_stock_history_project` (`op_project_code`),
  KEY `FK_stock_history_outstock` (`op_outstock_code`),
  CONSTRAINT `FK_stock_history_asset` FOREIGN KEY (`op_asset_code`) REFERENCES `asset` (`asset_code`),
  CONSTRAINT `FK_stock_history_outstock` FOREIGN KEY (`op_outstock_code`) REFERENCES `outstock` (`outstock_code`),
  CONSTRAINT `FK_stock_history_project` FOREIGN KEY (`op_project_code`) REFERENCES `project` (`project_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='库存记录单：记录出库入库的顺序操作';

-- 正在导出表  fixedasset.stock_history 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `stock_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `stock_history` ENABLE KEYS */;

-- 导出  表 fixedasset.user 结构
CREATE TABLE IF NOT EXISTS `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_name` varchar(50) NOT NULL COMMENT '姓名',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `email` varchar(50) NOT NULL COMMENT '邮箱',
  `fullName` varchar(50) DEFAULT NULL COMMENT '全名',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_user_id` int(11) DEFAULT NULL COMMENT '创建人',
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  `status` int(11) DEFAULT '0' COMMENT '状态 0正常 1 冻结',
  `is_delete` int(11) DEFAULT '0' COMMENT '是否删除0 未删除 1 已删除',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_name` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='系统用户';

-- 正在导出表  fixedasset.user 的数据：~13 rows (大约)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`user_id`, `user_name`, `password`, `email`, `fullName`, `create_time`, `create_user_id`, `modify_time`, `status`, `is_delete`) VALUES
	(1, 'admin', 'admin', 'admin@test.com', '张admin', '2018-03-05 16:27:50', 0, '2018-03-16 23:46:35', 1, 0),
	(2, 'applyer', 'applyer', 'applyer@test.com', '张applyer', '2018-03-05 16:27:51', 0, '2018-03-16 23:46:37', 1, 0),
	(3, 'inadmin', 'inadmin', 'inadmin@test.com', '张inadmin', NULL, NULL, NULL, NULL, NULL),
	(4, 'outadmin', 'outadmin', 'outadmin@test.com', '张outadmin', NULL, NULL, '2018-03-16 23:46:40', 0, 0),
	(5, 'dispacther', 'dispacther', 'dispacther@test.com', '张林广', '2018-03-05 16:27:55', 1, '2018-03-17 00:41:12', 1, 0),
	(10, 'test1', '123456', 'test1@test.com', '张test1', NULL, NULL, '2018-03-16 23:46:43', 1, 0),
	(11, 'tst1111111', '1111111', 'test@test.net', 'test1', '2018-03-16 15:04:27', NULL, '2018-03-17 00:40:24', 1, 0),
	(12, 'sdfasfasfa', 'sadfasdf1111', 'asdfasdfasdf@aaa.com', 'test2', '2018-03-16 15:04:46', NULL, '2018-03-17 00:40:47', 1, 0),
	(14, 'test', 'sadfasfasfd', 'test@test.net', 'test', '2018-03-17 00:48:27', NULL, NULL, 0, 0),
	(15, 'teetet', 'etetetetetet', 'etette@sdfasf.com', 'eet', '2018-03-17 00:48:44', NULL, NULL, 0, 1),
	(16, 'testtt', 'asdfasfdasdf', 'asfafs@sadfas.com', 'asdf', '2018-03-17 00:48:57', NULL, NULL, 0, 1),
	(17, 'tesafdasf', 'asdfasfd', 'sadfa@sadfasdf.com', 'sadf', '2018-03-17 00:49:12', NULL, NULL, 0, 1),
	(18, 'asdfasf', 'asfdasf', 'asfdasf@asdf.com', 'asfdas', '2018-03-17 00:49:27', NULL, NULL, 0, 1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

-- 导出  表 fixedasset.user_role 结构
CREATE TABLE IF NOT EXISTS `user_role` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `FK_user_role_user` (`user_id`),
  KEY `FK_user_role_role` (`role_id`),
  CONSTRAINT `FK_user_role_role` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`),
  CONSTRAINT `FK_user_role_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色关联表';

-- 正在导出表  fixedasset.user_role 的数据：~16 rows (大约)
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` (`user_id`, `role_id`) VALUES
	(1, 1),
	(1, 2),
	(2, 3),
	(3, 3),
	(4, 3),
	(5, 3),
	(10, 1),
	(10, 2),
	(11, 3),
	(12, 2),
	(12, 3),
	(14, 3),
	(15, 3),
	(16, 3),
	(17, 3),
	(18, 3);
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;

-- 导出  表 fixedasset.use_entry 结构
CREATE TABLE IF NOT EXISTS `use_entry` (
  `u_id` int(11) NOT NULL COMMENT 'id',
  `u_code` varchar(50) DEFAULT NULL COMMENT '编号',
  `u_name` varchar(50) DEFAULT NULL COMMENT '名称',
  `group_id` int(11) DEFAULT NULL COMMENT '组',
  `u_status` int(11) DEFAULT NULL COMMENT '状态',
  `u_birthday` date DEFAULT NULL COMMENT '生日',
  `u_sex` int(11) DEFAULT NULL COMMENT '性别',
  `is_delete` int(11) DEFAULT NULL COMMENT '是否删除 0 正常 1 已删除',
  `u_type` tinyint(1) DEFAULT NULL COMMENT '类型 1 领用人 2 地点 3 活动',
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='领用实体表';

-- 正在导出表  fixedasset.use_entry 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `use_entry` DISABLE KEYS */;
/*!40000 ALTER TABLE `use_entry` ENABLE KEYS */;

-- 导出  表 fixedasset.use_entry_group 结构
CREATE TABLE IF NOT EXISTS `use_entry_group` (
  `group_id` int(11) NOT NULL COMMENT '领用组ID',
  `group_name` int(11) NOT NULL COMMENT '领用组名称',
  `group_remark` int(11) DEFAULT NULL COMMENT '领用组备注',
  `group_code` varchar(50) DEFAULT NULL COMMENT '编号',
  `parent_group_id` int(11) DEFAULT NULL COMMENT '父级领用组',
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='领用组';

-- 正在导出表  fixedasset.use_entry_group 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `use_entry_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `use_entry_group` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
