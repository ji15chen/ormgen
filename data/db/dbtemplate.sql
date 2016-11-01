/*
Navicat SQL Server Data Transfer

Source Server         : sqlserver
Source Server Version : 105000
Source Host           : JERRY-PC\SQLEXPRESS:1433
Source Database       : dbtemplate
Source Schema         : dbo

Target Server Type    : SQL Server
Target Server Version : 105000
File Encoding         : 65001

Date: 2016-11-02 00:30:43
*/


-- ----------------------------
-- Table structure for CheckMntcDetail
-- ----------------------------
DROP TABLE [dbo].[CheckMntcDetail]
GO
CREATE TABLE [dbo].[CheckMntcDetail] (
[MtID] uniqueidentifier NOT NULL ,
[StoreID] uniqueidentifier NOT NULL ,
[MtLong] decimal(5) NULL ,
[MtResult] varchar(1000) NULL ,
[CheckResult] varchar(1000) NULL 
)


GO

-- ----------------------------
-- Records of CheckMntcDetail
-- ----------------------------

-- ----------------------------
-- Table structure for CheckMntcInfo
-- ----------------------------
DROP TABLE [dbo].[CheckMntcInfo]
GO
CREATE TABLE [dbo].[CheckMntcInfo] (
[MtID] uniqueidentifier NOT NULL ,
[DetpID] uniqueidentifier NULL ,
[RoomID] uniqueidentifier NULL ,
[Topic] varchar(100) NULL ,
[MtTime] datetime NULL ,
[MtLong] decimal(5) NULL ,
[MtResult] varchar(1000) NULL ,
[CheckType] uniqueidentifier NULL ,
[CheckResult] varchar(1000) NULL ,
[WeatherID] uniqueidentifier NULL ,
[WokCount] int NULL 
)


GO

-- ----------------------------
-- Records of CheckMntcInfo
-- ----------------------------
INSERT INTO [dbo].[CheckMntcInfo] ([MtID], [DetpID], [RoomID], [Topic], [MtTime], [MtLong], [MtResult], [CheckType], [CheckResult], [WeatherID], [WokCount]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'20161001枪支弹药月保养', N'2016-10-01 09:00:00.000', N'60', N'54手枪，修好了2把', N'00000000-0000-0000-0000-000000000001', N'54手枪，6把坏了', N'00000000-0000-0000-0000-000000000001', N'2')
GO
GO
INSERT INTO [dbo].[CheckMntcInfo] ([MtID], [DetpID], [RoomID], [Topic], [MtTime], [MtLong], [MtResult], [CheckType], [CheckResult], [WeatherID], [WokCount]) VALUES (N'00000000-0000-0000-0000-000000000002', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'20161101枪支弹药月保养', N'2016-10-01 09:00:00.000', N'60', N'', N'00000000-0000-0000-0000-000000000001', N'54手枪，2把缺少弹夹', N'00000000-0000-0000-0000-000000000001', N'5')
GO
GO
INSERT INTO [dbo].[CheckMntcInfo] ([MtID], [DetpID], [RoomID], [Topic], [MtTime], [MtLong], [MtResult], [CheckType], [CheckResult], [WeatherID], [WokCount]) VALUES (N'00000000-0000-0000-0000-000000000003', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'20161201枪支弹药月保养', N'2016-10-01 09:00:00.000', N'60', N'完美', N'00000000-0000-0000-0000-000000000001', N'完好', N'00000000-0000-0000-0000-000000000001', N'3')
GO
GO

-- ----------------------------
-- Table structure for CpntTypes
-- ----------------------------
DROP TABLE [dbo].[CpntTypes]
GO
CREATE TABLE [dbo].[CpntTypes] (
[CpntID] uniqueidentifier NOT NULL ,
[CpntName] varchar(50) NULL ,
[CpntType] varchar(50) NULL ,
[CpntUnit] varchar(10) NULL ,
[CpntYear] decimal(38,2) NULL ,
[CpntFunc] varchar(200) NULL ,
[IsPublic] bit NULL ,
[CpntDesc] ntext NULL 
)


GO

-- ----------------------------
-- Records of CpntTypes
-- ----------------------------
INSERT INTO [dbo].[CpntTypes] ([CpntID], [CpntName], [CpntType], [CpntUnit], [CpntYear], [CpntFunc], [IsPublic], [CpntDesc]) VALUES (N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'瞄准器', N'武器', N'件', N'1.00', N'瞄准', N'1', N'<html>...<html>')
GO
GO
INSERT INTO [dbo].[CpntTypes] ([CpntID], [CpntName], [CpntType], [CpntUnit], [CpntYear], [CpntFunc], [IsPublic], [CpntDesc]) VALUES (N'BF1088E9-A7E9-47EC-AD85-2AD0ECCD7BFB', N'瞄准器', N'1', N'件', N'1.00', N'瞄准', N'1', N'<html>...<html>')
GO
GO
INSERT INTO [dbo].[CpntTypes] ([CpntID], [CpntName], [CpntType], [CpntUnit], [CpntYear], [CpntFunc], [IsPublic], [CpntDesc]) VALUES (N'2BB4C335-FAB6-44EE-B95A-32FC38CB59E2', N'枪托', N'武器', N'件', N'2.00', N'', N'0', N'<html>...<html>')
GO
GO
INSERT INTO [dbo].[CpntTypes] ([CpntID], [CpntName], [CpntType], [CpntUnit], [CpntYear], [CpntFunc], [IsPublic], [CpntDesc]) VALUES (N'308847DE-1982-4947-BFED-491B2DF39404', N'轮胎', N'车辆', N'个', N'2.00', N'', N'1', N'<html>...<html>')
GO
GO
INSERT INTO [dbo].[CpntTypes] ([CpntID], [CpntName], [CpntType], [CpntUnit], [CpntYear], [CpntFunc], [IsPublic], [CpntDesc]) VALUES (N'EE03AC6A-59D7-41D2-9E27-4CC6C2F59C49', N'防滑链', N'车辆', N'条', N'1.00', N'', N'0', N'<html>...<html>')
GO
GO

-- ----------------------------
-- Table structure for Department
-- ----------------------------
DROP TABLE [dbo].[Department]
GO
CREATE TABLE [dbo].[Department] (
[DeptID] uniqueidentifier NOT NULL ,
[SupDeptID] uniqueidentifier NULL ,
[DeptCode] varchar(50) NULL ,
[DeptName] varchar(200) NULL ,
[ShortName] varchar(200) NULL ,
[Designation] varchar(50) NULL ,
[Address] varchar(500) NULL ,
[TypeCode] uniqueidentifier NULL ,
[Dwye] int NULL ,
[DeptLevel] uniqueidentifier NULL ,
[Dwzl] uniqueidentifier NULL ,
[FirstMgr] uniqueidentifier NULL ,
[Descirbe] varchar(200) NULL ,
[IsEnable] bit NULL ,
[CreateUserID] uniqueidentifier NULL ,
[ChangeDate] datetime NULL 
)


GO

-- ----------------------------
-- Records of Department
-- ----------------------------
INSERT INTO [dbo].[Department] ([DeptID], [SupDeptID], [DeptCode], [DeptName], [ShortName], [Designation], [Address], [TypeCode], [Dwye], [DeptLevel], [Dwzl], [FirstMgr], [Descirbe], [IsEnable], [CreateUserID], [ChangeDate]) VALUES (N'56B6B387-CD03-488D-BD7A-030AD2A525B2', N'B439F3B2-F2D4-4E36-AE4B-6A03BD3536B9', N'5904', N'政治部', N'政治部', N'政治部', N'郑州市郑东新区熊儿河路56号  450018', N'EBB28E55-3F46-476D-924C-156D437095CA', N'100', N'EBB28E55-3F46-476D-924C-156D437095CA', N'00000000-0000-0000-0000-000000000000', N'00000000-0000-0000-0000-000000000000', N'', N'1', N'00000000-0000-0000-0000-000000000000', N'2016-09-28 00:00:00.000')
GO
GO
INSERT INTO [dbo].[Department] ([DeptID], [SupDeptID], [DeptCode], [DeptName], [ShortName], [Designation], [Address], [TypeCode], [Dwye], [DeptLevel], [Dwzl], [FirstMgr], [Descirbe], [IsEnable], [CreateUserID], [ChangeDate]) VALUES (N'FA6402F2-E907-4561-951E-03782B464815', N'B439F3B2-F2D4-4E36-AE4B-6A03BD3536B9', N'5921', N'河南省总队', N'河南省总队', N'豫', N'新疆乌鲁木齐市西山路12号信箱武警训练基地  830063  ', N'EBB28E55-3F46-476D-924C-156D437095CA', N'10', N'EBB28E55-3F46-476D-924C-156D437095CA', N'00000000-0000-0000-0000-000000000000', N'00000000-0000-0000-0000-000000000000', N'', N'1', N'00000000-0000-0000-0000-000000000000', N'2016-09-29 00:00:00.000')
GO
GO
INSERT INTO [dbo].[Department] ([DeptID], [SupDeptID], [DeptCode], [DeptName], [ShortName], [Designation], [Address], [TypeCode], [Dwye], [DeptLevel], [Dwzl], [FirstMgr], [Descirbe], [IsEnable], [CreateUserID], [ChangeDate]) VALUES (N'C9F5B249-46E8-4CE1-868F-038603F3AD5D', N'B439F3B2-F2D4-4E36-AE4B-6A03BD3536B9', N'5936', N'新疆维吾尔自治区总队', N'新疆维吾尔自治区总队', N'', N'510800 广东省广州市花都区新华镇武警8730部队', N'EBB28E55-3F46-476D-924C-156D437095CA', N'188', N'EBB28E55-3F46-476D-924C-156D437095CA', N'00000000-0000-0000-0000-000000000000', N'00000000-0000-0000-0000-000000000000', N'', N'1', N'00000000-0000-0000-0000-000000000000', N'2016-09-30 00:00:00.000')
GO
GO
INSERT INTO [dbo].[Department] ([DeptID], [SupDeptID], [DeptCode], [DeptName], [ShortName], [Designation], [Address], [TypeCode], [Dwye], [DeptLevel], [Dwzl], [FirstMgr], [Descirbe], [IsEnable], [CreateUserID], [ChangeDate]) VALUES (N'D6C519F2-023F-4F34-A23A-045CA9F7C3BF', N'B439F3B2-F2D4-4E36-AE4B-6A03BD3536B9', N'5948', N'１２６师', N'１２６师', N'8730', N'成都市人民中路1段20号', N'EBB28E55-3F46-476D-924C-156D437095CA', N'65', N'EBB28E55-3F46-476D-924C-156D437095CA', N'00000000-0000-0000-0000-000000000000', N'00000000-0000-0000-0000-000000000000', N'', N'1', N'00000000-0000-0000-0000-000000000000', N'2016-10-01 00:00:00.000')
GO
GO
INSERT INTO [dbo].[Department] ([DeptID], [SupDeptID], [DeptCode], [DeptName], [ShortName], [Designation], [Address], [TypeCode], [Dwye], [DeptLevel], [Dwzl], [FirstMgr], [Descirbe], [IsEnable], [CreateUserID], [ChangeDate]) VALUES (N'5AFBE4B3-FFCB-4D7C-8281-08DA7EBED51B', N'B439F3B2-F2D4-4E36-AE4B-6A03BD3536B9', N'5928', N'四川省总队', N'四川省总队', N'蜀', N'青海省西宁市南川西路17号  810012', N'EBB28E55-3F46-476D-924C-156D437095CA', N'80', N'EBB28E55-3F46-476D-924C-156D437095CA', N'00000000-0000-0000-0000-000000000000', N'00000000-0000-0000-0000-000000000000', N'', N'1', N'00000000-0000-0000-0000-000000000000', N'2016-10-02 00:00:00.000')
GO
GO
INSERT INTO [dbo].[Department] ([DeptID], [SupDeptID], [DeptCode], [DeptName], [ShortName], [Designation], [Address], [TypeCode], [Dwye], [DeptLevel], [Dwzl], [FirstMgr], [Descirbe], [IsEnable], [CreateUserID], [ChangeDate]) VALUES (N'373A31B1-0221-4935-A428-0AD94D657FF4', N'B439F3B2-F2D4-4E36-AE4B-6A03BD3536B9', N'5934', N'青海省总队', N'青海省总队', N'青', N'江苏省南京市江东南路6号', N'EBB28E55-3F46-476D-924C-156D437095CA', N'70', N'EBB28E55-3F46-476D-924C-156D437095CA', N'00000000-0000-0000-0000-000000000000', N'00000000-0000-0000-0000-000000000000', N'', N'1', N'00000000-0000-0000-0000-000000000000', N'2016-10-03 00:00:00.000')
GO
GO
INSERT INTO [dbo].[Department] ([DeptID], [SupDeptID], [DeptCode], [DeptName], [ShortName], [Designation], [Address], [TypeCode], [Dwye], [DeptLevel], [Dwzl], [FirstMgr], [Descirbe], [IsEnable], [CreateUserID], [ChangeDate]) VALUES (N'0457A690-CB54-4F99-8AA6-0D1A893EAD76', N'B439F3B2-F2D4-4E36-AE4B-6A03BD3536B9', N'5915', N'江苏省总队', N'江苏省总队', N'苏', N'福建省莆田市后卓武警8710部队司令部警务装备科　351133', N'EBB28E55-3F46-476D-924C-156D437095CA', N'120', N'EBB28E55-3F46-476D-924C-156D437095CA', N'00000000-0000-0000-0000-000000000000', N'00000000-0000-0000-0000-000000000000', N'', N'1', N'00000000-0000-0000-0000-000000000000', N'2016-10-04 00:00:00.000')
GO
GO
INSERT INTO [dbo].[Department] ([DeptID], [SupDeptID], [DeptCode], [DeptName], [ShortName], [Designation], [Address], [TypeCode], [Dwye], [DeptLevel], [Dwzl], [FirstMgr], [Descirbe], [IsEnable], [CreateUserID], [ChangeDate]) VALUES (N'D416306F-2C6F-43D3-A0BB-13C6639C7E0E', N'B439F3B2-F2D4-4E36-AE4B-6A03BD3536B9', N'5946', N'９３师', N'９３师', N'8710', N'福建省莆田市后卓武警8710部队司令部警务装备科　351134', N'EBB28E55-3F46-476D-924C-156D437095CA', N'200', N'EBB28E55-3F46-476D-924C-156D437095CA', N'00000000-0000-0000-0000-000000000000', N'00000000-0000-0000-0000-000000000000', N'', N'1', N'00000000-0000-0000-0000-000000000000', N'2016-10-05 00:00:00.000')
GO
GO
INSERT INTO [dbo].[Department] ([DeptID], [SupDeptID], [DeptCode], [DeptName], [ShortName], [Designation], [Address], [TypeCode], [Dwye], [DeptLevel], [Dwzl], [FirstMgr], [Descirbe], [IsEnable], [CreateUserID], [ChangeDate]) VALUES (N'78F0FAEC-421F-419D-B122-1443456FDD95', N'45AB0028-DBAA-4DFD-AAF1-87E492B76379', N'6901', N'山东省总队', N'山东省总队', N'8711', N'福建省莆田市后卓武警8710部队司令部警务装备科　351135', N'EBB28E55-3F46-476D-924C-156D437095CA', N'40', N'EBB28E55-3F46-476D-924C-156D437095CA', N'00000000-0000-0000-0000-000000000000', N'00000000-0000-0000-0000-000000000000', N'', N'1', N'00000000-0000-0000-0000-000000000000', N'2016-10-06 00:00:00.000')
GO
GO
INSERT INTO [dbo].[Department] ([DeptID], [SupDeptID], [DeptCode], [DeptName], [ShortName], [Designation], [Address], [TypeCode], [Dwye], [DeptLevel], [Dwzl], [FirstMgr], [Descirbe], [IsEnable], [CreateUserID], [ChangeDate]) VALUES (N'B1DEB80D-7FD4-46AA-910B-194F05ED9FC4', N'B439F3B2-F2D4-4E36-AE4B-6A03BD3536B9', N'5919', N'江西省总队', N'江西省总队', N'8712', N'福建省莆田市后卓武警8710部队司令部警务装备科　351136', N'EBB28E55-3F46-476D-924C-156D437095CA', N'90', N'EBB28E55-3F46-476D-924C-156D437095CA', N'00000000-0000-0000-0000-000000000000', N'00000000-0000-0000-0000-000000000000', N'', N'1', N'00000000-0000-0000-0000-000000000000', N'2016-10-07 00:00:00.000')
GO
GO

-- ----------------------------
-- Table structure for DepotInfo
-- ----------------------------
DROP TABLE [dbo].[DepotInfo]
GO
CREATE TABLE [dbo].[DepotInfo] (
[DeptID] uniqueidentifier NOT NULL ,
[RoomID] uniqueidentifier NOT NULL ,
[RoomName] varchar(200) NULL ,
[RoomType] uniqueidentifier NULL ,
[DepotAdd] varchar(200) NULL ,
[DepotArear] decimal(38,2) NULL ,
[Lever] uniqueidentifier NULL ,
[Describe] ntext NULL ,
[AirconCount] int NULL ,
[DehCount] int NULL 
)


GO

-- ----------------------------
-- Records of DepotInfo
-- ----------------------------
INSERT INTO [dbo].[DepotInfo] ([DeptID], [RoomID], [RoomName], [RoomType], [DepotAdd], [DepotArear], [Lever], [Describe], [AirconCount], [DehCount]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'警用器材库', N'00000000-0000-0000-0000-000000000001', N'警用器材', N'.10', N'00000000-0000-0000-0000-000000000001', N'一级', N'1', N'0')
GO
GO
INSERT INTO [dbo].[DepotInfo] ([DeptID], [RoomID], [RoomName], [RoomType], [DepotAdd], [DepotArear], [Lever], [Describe], [AirconCount], [DehCount]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000002', N'武器弹药库', N'00000000-0000-0000-0000-000000000001', N'武器弹药', N'.20', N'00000000-0000-0000-0000-000000000001', N'二级', N'0', N'1')
GO
GO
INSERT INTO [dbo].[DepotInfo] ([DeptID], [RoomID], [RoomName], [RoomType], [DepotAdd], [DepotArear], [Lever], [Describe], [AirconCount], [DehCount]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000003', N'车辆库	', N'00000000-0000-0000-0000-000000000003', N'车辆库', N'.10', N'00000000-0000-0000-0000-000000000003', N'二级', N'1', N'1')
GO
GO

-- ----------------------------
-- Table structure for DeptExent
-- ----------------------------
DROP TABLE [dbo].[DeptExent]
GO
CREATE TABLE [dbo].[DeptExent] (
[ExentID] uniqueidentifier NOT NULL ,
[DeptID] uniqueidentifier NULL ,
[ExentName] varchar(50) NULL ,
[ExentValue] varchar(200) NULL ,
[ExentSort] int NULL 
)


GO

-- ----------------------------
-- Records of DeptExent
-- ----------------------------

-- ----------------------------
-- Table structure for ECFactory
-- ----------------------------
DROP TABLE [dbo].[ECFactory]
GO
CREATE TABLE [dbo].[ECFactory] (
[RecID] uniqueidentifier NOT NULL ,
[FactoryID] uniqueidentifier NOT NULL ,
[PkTypeID] uniqueidentifier NULL ,
[Sorting] int NULL ,
[Describe] varchar(500) NULL 
)


GO

-- ----------------------------
-- Records of ECFactory
-- ----------------------------
INSERT INTO [dbo].[ECFactory] ([RecID], [FactoryID], [PkTypeID], [Sorting], [Describe]) VALUES (N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'00000000-0000-0000-0000-000000000000', N'1', N',,,,,,,,,,,,,,')
GO
GO
INSERT INTO [dbo].[ECFactory] ([RecID], [FactoryID], [PkTypeID], [Sorting], [Describe]) VALUES (N'B898E11D-0376-4B22-A43C-304297214895', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'00000000-0000-0000-0000-000000000001', N'2', N',,,,,,,,,,,,,,')
GO
GO
INSERT INTO [dbo].[ECFactory] ([RecID], [FactoryID], [PkTypeID], [Sorting], [Describe]) VALUES (N'2BB4C335-FAB6-44EE-B95A-32FC38CB59E2', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'00000000-0000-0000-0000-000000000002', N'3', N',,,,,,,,,,,,,,')
GO
GO
INSERT INTO [dbo].[ECFactory] ([RecID], [FactoryID], [PkTypeID], [Sorting], [Describe]) VALUES (N'574AC825-72D5-40C1-9307-39CCEEBEED9F', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'00000000-0000-0000-0000-000000000003', N'4', N',,,,,,,,,,,,,,')
GO
GO
INSERT INTO [dbo].[ECFactory] ([RecID], [FactoryID], [PkTypeID], [Sorting], [Describe]) VALUES (N'66EE3851-1069-4BEE-A069-3F5035FC2E8C', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'00000000-0000-0000-0000-000000000004', N'5', N',,,,,,,,,,,,,,')
GO
GO
INSERT INTO [dbo].[ECFactory] ([RecID], [FactoryID], [PkTypeID], [Sorting], [Describe]) VALUES (N'3B621AB0-34DB-4B23-9EC3-466446BF4272', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'00000000-0000-0000-0000-000000000005', N'1', N',,,,,,,,,,,,,,')
GO
GO
INSERT INTO [dbo].[ECFactory] ([RecID], [FactoryID], [PkTypeID], [Sorting], [Describe]) VALUES (N'308847DE-1982-4947-BFED-491B2DF39404', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'00000000-0000-0000-0000-000000000006', N'1', N',,,,,,,,,,,,,,')
GO
GO
INSERT INTO [dbo].[ECFactory] ([RecID], [FactoryID], [PkTypeID], [Sorting], [Describe]) VALUES (N'EE03AC6A-59D7-41D2-9E27-4CC6C2F59C49', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'00000000-0000-0000-0000-000000000007', N'1', N',,,,,,,,,,,,,,')
GO
GO
INSERT INTO [dbo].[ECFactory] ([RecID], [FactoryID], [PkTypeID], [Sorting], [Describe]) VALUES (N'B65436CA-AD2E-4ADC-8ED3-4E54E2DC90EB', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'00000000-0000-0000-0000-000000000008', N'1', N',,,,,,,,,,,,,,')
GO
GO
INSERT INTO [dbo].[ECFactory] ([RecID], [FactoryID], [PkTypeID], [Sorting], [Describe]) VALUES (N'66EEDF98-0910-4351-B85A-4FDB3E8FFC86', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'00000000-0000-0000-0000-000000000009', N'1', N',,,,,,,,,,,,,,')
GO
GO

-- ----------------------------
-- Table structure for EqmtCpntInfo
-- ----------------------------
DROP TABLE [dbo].[EqmtCpntInfo]
GO
CREATE TABLE [dbo].[EqmtCpntInfo] (
[PkTypeID] uniqueidentifier NOT NULL ,
[CpntID] uniqueidentifier NOT NULL ,
[CpntCount] int NULL ,
[IsMaster] bit NULL ,
[Sorting] int NULL 
)


GO

-- ----------------------------
-- Records of EqmtCpntInfo
-- ----------------------------

-- ----------------------------
-- Table structure for EqmtInOut
-- ----------------------------
DROP TABLE [dbo].[EqmtInOut]
GO
CREATE TABLE [dbo].[EqmtInOut] (
[EIOID] uniqueidentifier NOT NULL ,
[PIOID] uniqueidentifier NULL ,
[StoreID] uniqueidentifier NOT NULL ,
[Reason] varchar(32) NULL ,
[ScanTime] datetime NULL ,
[Describe] varchar(200) NULL ,
[TakeMan] uniqueidentifier NULL 
)


GO

-- ----------------------------
-- Records of EqmtInOut
-- ----------------------------
INSERT INTO [dbo].[EqmtInOut] ([EIOID], [PIOID], [StoreID], [Reason], [ScanTime], [Describe], [TakeMan]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'调拨', N'2016-10-01 09:00:00.000', N'', N'00000000-0000-0000-0000-000000000001')
GO
GO
INSERT INTO [dbo].[EqmtInOut] ([EIOID], [PIOID], [StoreID], [Reason], [ScanTime], [Describe], [TakeMan]) VALUES (N'00000000-0000-0000-0000-000000000002', N'00000000-0000-0000-0000-000000000002', N'00000000-0000-0000-0000-000000000001', N'训练', N'2016-10-01 09:00:00.000', N'', N'00000000-0000-0000-0000-000000000001')
GO
GO
INSERT INTO [dbo].[EqmtInOut] ([EIOID], [PIOID], [StoreID], [Reason], [ScanTime], [Describe], [TakeMan]) VALUES (N'00000000-0000-0000-0000-000000000003', N'00000000-0000-0000-0000-000000000003', N'00000000-0000-0000-0000-000000000001', N'保养', N'2016-10-01 09:00:00.000', N'', N'00000000-0000-0000-0000-000000000001')
GO
GO

-- ----------------------------
-- Table structure for EquipLog
-- ----------------------------
DROP TABLE [dbo].[EquipLog]
GO
CREATE TABLE [dbo].[EquipLog] (
[LogID] uniqueidentifier NULL ,
[SupLogID] uniqueidentifier NULL ,
[EquipID] uniqueidentifier NULL ,
[PkTypeID] uniqueidentifier NULL ,
[Total] int NULL ,
[QuKeyID] uniqueidentifier NULL ,
[DeptID] uniqueidentifier NULL ,
[OperationType] uniqueidentifier NULL ,
[OperationDate] datetime NULL 
)


GO

-- ----------------------------
-- Records of EquipLog
-- ----------------------------

-- ----------------------------
-- Table structure for EquipType
-- ----------------------------
DROP TABLE [dbo].[EquipType]
GO
CREATE TABLE [dbo].[EquipType] (
[PkTypeID] uniqueidentifier NOT NULL ,
[SupPkTypeID] uniqueidentifier NULL ,
[DeptID] uniqueidentifier NULL ,
[UserID] uniqueidentifier NULL ,
[AddDate] datetime NULL ,
[TypeName] varchar(200) NULL ,
[TypeCode] varchar(50) NULL ,
[Unit] uniqueidentifier NULL ,
[Scale] decimal(38,2) NULL ,
[IsEnable] bit NULL ,
[Describe] varchar(200) NULL ,
[CategoryID] uniqueidentifier NULL ,
[WarrantyPeriod] int NULL ,
[LimitedYear] int NULL 
)


GO

-- ----------------------------
-- Records of EquipType
-- ----------------------------
INSERT INTO [dbo].[EquipType] ([PkTypeID], [SupPkTypeID], [DeptID], [UserID], [AddDate], [TypeName], [TypeCode], [Unit], [Scale], [IsEnable], [Describe], [CategoryID], [WarrantyPeriod], [LimitedYear]) VALUES (N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'3F2A93BF-C83A-4122-A9EB-E2B8C11A53E8', N'2397C25F-37E7-4AD4-B13E-993954B9F547', N'00000000-0000-0000-0000-000000000003', N'2016-09-28 00:00:00.000', N'投影机', N'A0310', N'00000000-0000-0000-0000-000000000001', N'5.00', N'0', N'大类', N'00000000-0000-0000-0000-000000000000', N'1', N'10')
GO
GO
INSERT INTO [dbo].[EquipType] ([PkTypeID], [SupPkTypeID], [DeptID], [UserID], [AddDate], [TypeName], [TypeCode], [Unit], [Scale], [IsEnable], [Describe], [CategoryID], [WarrantyPeriod], [LimitedYear]) VALUES (N'B898E11D-0376-4B22-A43C-304297214895', N'92712782-0CD0-418E-BA65-61EBA78F31EF', N'2397C25F-37E7-4AD4-B13E-993954B9F547', N'00000000-0000-0000-0000-000000000003', N'2016-09-28 00:00:00.000', N'文化装备', N'A', N'00000000-0000-0000-0000-000000000001', N'10.00', N'0', N'小类', N'00000000-0000-0000-0000-000000000000', N'2', N'10')
GO
GO
INSERT INTO [dbo].[EquipType] ([PkTypeID], [SupPkTypeID], [DeptID], [UserID], [AddDate], [TypeName], [TypeCode], [Unit], [Scale], [IsEnable], [Describe], [CategoryID], [WarrantyPeriod], [LimitedYear]) VALUES (N'2BB4C335-FAB6-44EE-B95A-32FC38CB59E2', N'2397C25F-37E7-4AD4-B13E-993954B9F547', N'2397C25F-37E7-4AD4-B13E-993954B9F547', N'00000000-0000-0000-0000-000000000003', N'2016-09-28 00:00:00.000', N'野战喊话器电池', N'A0203', N'00000000-0000-0000-0000-000000000001', N'12.00', N'0', N'组件', N'00000000-0000-0000-0000-000000000000', N'3', N'10')
GO
GO
INSERT INTO [dbo].[EquipType] ([PkTypeID], [SupPkTypeID], [DeptID], [UserID], [AddDate], [TypeName], [TypeCode], [Unit], [Scale], [IsEnable], [Describe], [CategoryID], [WarrantyPeriod], [LimitedYear]) VALUES (N'574AC825-72D5-40C1-9307-39CCEEBEED9F', N'2397C25F-37E7-4AD4-B13E-993954B9F547', N'2397C25F-37E7-4AD4-B13E-993954B9F547', N'00000000-0000-0000-0000-000000000003', N'2016-09-28 00:00:00.000', N'野战影音箱', N'A0204', N'00000000-0000-0000-0000-000000000001', N'.00', N'0', N'配件', N'00000000-0000-0000-0000-000000000000', N'4', N'20')
GO
GO
INSERT INTO [dbo].[EquipType] ([PkTypeID], [SupPkTypeID], [DeptID], [UserID], [AddDate], [TypeName], [TypeCode], [Unit], [Scale], [IsEnable], [Describe], [CategoryID], [WarrantyPeriod], [LimitedYear]) VALUES (N'66EE3851-1069-4BEE-A069-3F5035FC2E8C', N'C3032E2D-8617-43A5-9335-8CB6FE2DEDF6', N'2397C25F-37E7-4AD4-B13E-993954B9F547', N'00000000-0000-0000-0000-000000000003', N'2016-09-28 00:00:00.000', N'野战文化车', N'A020201', N'00000000-0000-0000-0000-000000000001', N'.00', N'0', N'装备类型', N'00000000-0000-0000-0000-000000000000', N'5', N'10')
GO
GO
INSERT INTO [dbo].[EquipType] ([PkTypeID], [SupPkTypeID], [DeptID], [UserID], [AddDate], [TypeName], [TypeCode], [Unit], [Scale], [IsEnable], [Describe], [CategoryID], [WarrantyPeriod], [LimitedYear]) VALUES (N'3B621AB0-34DB-4B23-9EC3-466446BF4272', N'574AC825-72D5-40C1-9307-39CCEEBEED9F', N'2397C25F-37E7-4AD4-B13E-993954B9F547', N'00000000-0000-0000-0000-000000000003', N'2016-09-28 00:00:00.000', N'野战影音箱（三基音响）', N'A020402', N'00000000-0000-0000-0000-000000000001', N'.00', N'0', N'装备类型', N'00000000-0000-0000-0000-000000000000', N'6', N'10')
GO
GO
INSERT INTO [dbo].[EquipType] ([PkTypeID], [SupPkTypeID], [DeptID], [UserID], [AddDate], [TypeName], [TypeCode], [Unit], [Scale], [IsEnable], [Describe], [CategoryID], [WarrantyPeriod], [LimitedYear]) VALUES (N'308847DE-1982-4947-BFED-491B2DF39404', N'3F2A93BF-C83A-4122-A9EB-E2B8C11A53E8', N'2397C25F-37E7-4AD4-B13E-993954B9F547', N'00000000-0000-0000-0000-000000000003', N'2016-09-28 00:00:00.000', N'旅团有线广播系统', N'A0306', N'00000000-0000-0000-0000-000000000001', N'.00', N'0', N'装备型号', N'00000000-0000-0000-0000-000000000000', N'7', N'10')
GO
GO
INSERT INTO [dbo].[EquipType] ([PkTypeID], [SupPkTypeID], [DeptID], [UserID], [AddDate], [TypeName], [TypeCode], [Unit], [Scale], [IsEnable], [Describe], [CategoryID], [WarrantyPeriod], [LimitedYear]) VALUES (N'EE03AC6A-59D7-41D2-9E27-4CC6C2F59C49', N'3F2A93BF-C83A-4122-A9EB-E2B8C11A53E8', N'2397C25F-37E7-4AD4-B13E-993954B9F547', N'00000000-0000-0000-0000-000000000003', N'2016-09-28 00:00:00.000', N'旅团音响系统', N'A0307', N'00000000-0000-0000-0000-000000000001', N'.00', N'0', N'装备型号', N'00000000-0000-0000-0000-000000000000', N'8', N'10')
GO
GO
INSERT INTO [dbo].[EquipType] ([PkTypeID], [SupPkTypeID], [DeptID], [UserID], [AddDate], [TypeName], [TypeCode], [Unit], [Scale], [IsEnable], [Describe], [CategoryID], [WarrantyPeriod], [LimitedYear]) VALUES (N'B65436CA-AD2E-4ADC-8ED3-4E54E2DC90EB', N'3F2A93BF-C83A-4122-A9EB-E2B8C11A53E8', N'2397C25F-37E7-4AD4-B13E-993954B9F547', N'00000000-0000-0000-0000-000000000003', N'2016-09-28 00:00:00.000', N'卫星电视接收设备', N'A0303', N'00000000-0000-0000-0000-000000000001', N'.00', N'0', N'装备类型', N'00000000-0000-0000-0000-000000000000', N'9', N'10')
GO
GO
INSERT INTO [dbo].[EquipType] ([PkTypeID], [SupPkTypeID], [DeptID], [UserID], [AddDate], [TypeName], [TypeCode], [Unit], [Scale], [IsEnable], [Describe], [CategoryID], [WarrantyPeriod], [LimitedYear]) VALUES (N'66EEDF98-0910-4351-B85A-4FDB3E8FFC86', N'2397C25F-37E7-4AD4-B13E-993954B9F547', N'00000000-0000-0000-0000-000000000000', N'00000000-0000-0000-0000-000000000003', N'2016-09-28 00:00:00.000', N'野战旅团音响系统', N'A0206', N'00000000-0000-0000-0000-000000000001', N'.00', N'0', N'装备类型', N'00000000-0000-0000-0000-000000000000', N'10', N'10')
GO
GO

-- ----------------------------
-- Table structure for EquipTypeDetail
-- ----------------------------
DROP TABLE [dbo].[EquipTypeDetail]
GO
CREATE TABLE [dbo].[EquipTypeDetail] (
[ItemID] uniqueidentifier NOT NULL ,
[PkTypeID] uniqueidentifier NULL ,
[ItemName] varchar(50) NULL ,
[ItemBody] ntext NULL ,
[ItemSort] int NULL 
)


GO

-- ----------------------------
-- Records of EquipTypeDetail
-- ----------------------------
INSERT INTO [dbo].[EquipTypeDetail] ([ItemID], [PkTypeID], [ItemName], [ItemBody], [ItemSort]) VALUES (N'00000000-0000-0000-0000-000000000001', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'使用说明', N'<html>...<html>', N'1')
GO
GO
INSERT INTO [dbo].[EquipTypeDetail] ([ItemID], [PkTypeID], [ItemName], [ItemBody], [ItemSort]) VALUES (N'00000000-0000-0000-0000-000000000002', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'注意事项', N'<html>...<html>', N'2')
GO
GO

-- ----------------------------
-- Table structure for ExentData
-- ----------------------------
DROP TABLE [dbo].[ExentData]
GO
CREATE TABLE [dbo].[ExentData] (
[ObjectID] uniqueidentifier NULL ,
[ExtendID] uniqueidentifier NULL ,
[ExtentValue] varchar(1000) NULL ,
[ExtentSort] int NULL 
)


GO

-- ----------------------------
-- Records of ExentData
-- ----------------------------
INSERT INTO [dbo].[ExentData] ([ObjectID], [ExtendID], [ExtentValue], [ExtentSort]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'150', N'1')
GO
GO
INSERT INTO [dbo].[ExentData] ([ObjectID], [ExtendID], [ExtentValue], [ExtentSort]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'300', N'1')
GO
GO
INSERT INTO [dbo].[ExentData] ([ObjectID], [ExtendID], [ExtentValue], [ExtentSort]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'200', N'1')
GO
GO
INSERT INTO [dbo].[ExentData] ([ObjectID], [ExtendID], [ExtentValue], [ExtentSort]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'320', N'1')
GO
GO

-- ----------------------------
-- Table structure for ExtendType
-- ----------------------------
DROP TABLE [dbo].[ExtendType]
GO
CREATE TABLE [dbo].[ExtendType] (
[ExtendID] uniqueidentifier NOT NULL ,
[ExtendCode] varchar(50) NULL ,
[ExtendName] varchar(100) NULL ,
[ExtendType] uniqueidentifier NULL ,
[ExtendUnit] uniqueidentifier NULL ,
[ExtendMin] decimal(38,2) NULL ,
[ExtendMax] decimal(38,2) NULL ,
[Describe] varchar(500) NULL ,
[TypeCode] uniqueidentifier NULL 
)


GO

-- ----------------------------
-- Records of ExtendType
-- ----------------------------
INSERT INTO [dbo].[ExtendType] ([ExtendID], [ExtendCode], [ExtendName], [ExtendType], [ExtendUnit], [ExtendMin], [ExtendMax], [Describe], [TypeCode]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'射程', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'50.00', N'600.00', N'枪械', N'00000000-0000-0000-0000-000000000001')
GO
GO
INSERT INTO [dbo].[ExtendType] ([ExtendID], [ExtendCode], [ExtendName], [ExtendType], [ExtendUnit], [ExtendMin], [ExtendMax], [Describe], [TypeCode]) VALUES (N'00000000-0000-0000-0000-000000000002', N'00000000-0000-0000-0000-000000000001', N'最高时速', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'.00', N'300.00', N'车辆', N'00000000-0000-0000-0000-000000000001')
GO
GO
INSERT INTO [dbo].[ExtendType] ([ExtendID], [ExtendCode], [ExtendName], [ExtendType], [ExtendUnit], [ExtendMin], [ExtendMax], [Describe], [TypeCode]) VALUES (N'00000000-0000-0000-0000-000000000003', N'00000000-0000-0000-0000-000000000001', N'最大里程', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'.00', N'500000.00', N'车辆', N'00000000-0000-0000-0000-000000000001')
GO
GO

-- ----------------------------
-- Table structure for FactoryInfo
-- ----------------------------
DROP TABLE [dbo].[FactoryInfo]
GO
CREATE TABLE [dbo].[FactoryInfo] (
[FactoryID] uniqueidentifier NOT NULL ,
[FactoryName] varchar(200) NULL ,
[FactoryType] uniqueidentifier NULL ,
[Province] uniqueidentifier NULL ,
[City] uniqueidentifier NULL ,
[District] uniqueidentifier NULL ,
[Address] varchar(200) NULL ,
[PostCode] varchar(10) NULL ,
[FirstMan] varchar(50) NULL ,
[Remark] varchar(500) NULL ,
[Descn] ntext NULL ,
[Telephone] varchar(50) NULL 
)


GO

-- ----------------------------
-- Records of FactoryInfo
-- ----------------------------
INSERT INTO [dbo].[FactoryInfo] ([FactoryID], [FactoryName], [FactoryType], [Province], [City], [District], [Address], [PostCode], [FirstMan], [Remark], [Descn], [Telephone]) VALUES (N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'武汉龙安集团有限责任公司', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'江岸区888号', N'888888', N'www.jlong.com', N'<html>...<html>', N'000-000000', N'N/A')
GO
GO

-- ----------------------------
-- Table structure for FaultInfor
-- ----------------------------
DROP TABLE [dbo].[FaultInfor]
GO
CREATE TABLE [dbo].[FaultInfor] (
[FaultID] uniqueidentifier NOT NULL ,
[StoreID] uniqueidentifier NULL ,
[FaultTitle] varchar(80) NULL ,
[FaultType] uniqueidentifier NULL ,
[FaultKey] varchar(80) NULL ,
[FaultDesc] ntext NULL ,
[DeptID] uniqueidentifier NULL ,
[UserID] uniqueidentifier NULL ,
[CreateDate] datetime NULL ,
[FaultState] int NULL ,
[EquipCount] decimal(18) NULL 
)


GO

-- ----------------------------
-- Records of FaultInfor
-- ----------------------------
INSERT INTO [dbo].[FaultInfor] ([FaultID], [StoreID], [FaultTitle], [FaultType], [FaultKey], [FaultDesc], [DeptID], [UserID], [CreateDate], [FaultState], [EquipCount]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'54手枪', N'00000000-0000-0000-0000-000000000001', N'致命性故障', N'致命性故障', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'2016-11-02 00:18:14.000', N'1', N'1')
GO
GO

-- ----------------------------
-- Table structure for M_Point
-- ----------------------------
DROP TABLE [dbo].[M_Point]
GO
CREATE TABLE [dbo].[M_Point] (
[PointID] uniqueidentifier NOT NULL ,
[PointName] varchar(80) NULL ,
[PointType] int NULL ,
[PointImage] image NULL ,
[Longitude] decimal(18) NULL ,
[Latitude] decimal(18) NULL ,
[PointZoom] int NULL ,
[Descn] varchar(100) NULL 
)


GO

-- ----------------------------
-- Records of M_Point
-- ----------------------------

-- ----------------------------
-- Table structure for PersonInfo
-- ----------------------------
DROP TABLE [dbo].[PersonInfo]
GO
CREATE TABLE [dbo].[PersonInfo] (
[PersonID] uniqueidentifier NOT NULL ,
[PersonCode] varchar(20) NULL ,
[PersonName] varchar(30) NULL ,
[Sex] uniqueidentifier NULL ,
[PersonType] uniqueidentifier NULL ,
[JopID] uniqueidentifier NULL ,
[Status] uniqueidentifier NULL ,
[MobilPhone] varchar(20) NULL ,
[Phone] varchar(20) NULL ,
[EMail] varchar(50) NULL ,
[QQ] varchar(20) NULL ,
[Birthday] datetime NULL ,
[Describe] varchar(200) NULL ,
[IsDelete] bit NULL ,
[EnlistTime] datetime NULL ,
[Fax] varchar(30) NULL ,
[DeptID] uniqueidentifier NULL ,
[Work] varchar(50) NULL ,
[HeadImage] image NULL 
)


GO

-- ----------------------------
-- Records of PersonInfo
-- ----------------------------

-- ----------------------------
-- Table structure for PersonInOut
-- ----------------------------
DROP TABLE [dbo].[PersonInOut]
GO
CREATE TABLE [dbo].[PersonInOut] (
[PIOID] uniqueidentifier NOT NULL ,
[RoomID] uniqueidentifier NULL ,
[DeptID] uniqueidentifier NULL ,
[PersonID] uniqueidentifier NULL ,
[InTime] datetime NULL ,
[OutTime] datetime NULL ,
[ReasonID] uniqueidentifier NULL ,
[Approver] uniqueidentifier NULL ,
[EnterType1] varchar(10) NULL ,
[EnterType2] varchar(10) NULL ,
[Remark] varchar(500) NULL 
)


GO

-- ----------------------------
-- Records of PersonInOut
-- ----------------------------
INSERT INTO [dbo].[PersonInOut] ([PIOID], [RoomID], [DeptID], [PersonID], [InTime], [OutTime], [ReasonID], [Approver], [EnterType1], [EnterType2], [Remark]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'2016-10-01 09:00:00.000', N'2016-10-01 09:10:00.000', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'', N'', N'')
GO
GO
INSERT INTO [dbo].[PersonInOut] ([PIOID], [RoomID], [DeptID], [PersonID], [InTime], [OutTime], [ReasonID], [Approver], [EnterType1], [EnterType2], [Remark]) VALUES (N'00000000-0000-0000-0000-000000000002', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'2016-10-01 09:00:00.000', N'2016-10-01 09:20:00.000', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'', N'', N'')
GO
GO
INSERT INTO [dbo].[PersonInOut] ([PIOID], [RoomID], [DeptID], [PersonID], [InTime], [OutTime], [ReasonID], [Approver], [EnterType1], [EnterType2], [Remark]) VALUES (N'00000000-0000-0000-0000-000000000003', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'2016-10-01 09:00:00.000', N'2016-10-01 09:10:00.000', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'', N'', N'')
GO
GO

-- ----------------------------
-- Table structure for RoleKey
-- ----------------------------
DROP TABLE [dbo].[RoleKey]
GO
CREATE TABLE [dbo].[RoleKey] (
[RoleID] uniqueidentifier NOT NULL ,
[KeyID] uniqueidentifier NOT NULL ,
[MenuID] uniqueidentifier NOT NULL 
)


GO

-- ----------------------------
-- Records of RoleKey
-- ----------------------------
INSERT INTO [dbo].[RoleKey] ([RoleID], [KeyID], [MenuID]) VALUES (N'00000000-0000-0000-0000-000000000000', N'00000000-0000-0000-0000-000000000000', N'00000000-0000-0000-0000-000000000000')
GO
GO
INSERT INTO [dbo].[RoleKey] ([RoleID], [KeyID], [MenuID]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001')
GO
GO
INSERT INTO [dbo].[RoleKey] ([RoleID], [KeyID], [MenuID]) VALUES (N'00000000-0000-0000-0000-000000000002', N'00000000-0000-0000-0000-000000000002', N'00000000-0000-0000-0000-000000000002')
GO
GO
INSERT INTO [dbo].[RoleKey] ([RoleID], [KeyID], [MenuID]) VALUES (N'00000000-0000-0000-0000-000000000003', N'00000000-0000-0000-0000-000000000003', N'00000000-0000-0000-0000-000000000003')
GO
GO
INSERT INTO [dbo].[RoleKey] ([RoleID], [KeyID], [MenuID]) VALUES (N'00000000-0000-0000-0000-000000000004', N'00000000-0000-0000-0000-000000000004', N'00000000-0000-0000-0000-000000000004')
GO
GO

-- ----------------------------
-- Table structure for RoleMenu
-- ----------------------------
DROP TABLE [dbo].[RoleMenu]
GO
CREATE TABLE [dbo].[RoleMenu] (
[RoleID] uniqueidentifier NOT NULL ,
[MenuID] uniqueidentifier NOT NULL 
)


GO

-- ----------------------------
-- Records of RoleMenu
-- ----------------------------
INSERT INTO [dbo].[RoleMenu] ([RoleID], [MenuID]) VALUES (N'00000000-0000-0000-0000-000000000000', N'00000000-0000-0000-0000-000000000000')
GO
GO
INSERT INTO [dbo].[RoleMenu] ([RoleID], [MenuID]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001')
GO
GO
INSERT INTO [dbo].[RoleMenu] ([RoleID], [MenuID]) VALUES (N'00000000-0000-0000-0000-000000000002', N'00000000-0000-0000-0000-000000000002')
GO
GO
INSERT INTO [dbo].[RoleMenu] ([RoleID], [MenuID]) VALUES (N'00000000-0000-0000-0000-000000000003', N'00000000-0000-0000-0000-000000000003')
GO
GO
INSERT INTO [dbo].[RoleMenu] ([RoleID], [MenuID]) VALUES (N'00000000-0000-0000-0000-000000000004', N'00000000-0000-0000-0000-000000000004')
GO
GO

-- ----------------------------
-- Table structure for RoomAdminUser
-- ----------------------------
DROP TABLE [dbo].[RoomAdminUser]
GO
CREATE TABLE [dbo].[RoomAdminUser] (
[RoomID] uniqueidentifier NOT NULL ,
[PersonID] uniqueidentifier NOT NULL ,
[AdminID] uniqueidentifier NOT NULL 
)


GO

-- ----------------------------
-- Records of RoomAdminUser
-- ----------------------------

-- ----------------------------
-- Table structure for ScanStore
-- ----------------------------
DROP TABLE [dbo].[ScanStore]
GO
CREATE TABLE [dbo].[ScanStore] (
[SCanID] uniqueidentifier NOT NULL ,
[PSCanID] uniqueidentifier NULL ,
[Topic] varchar(80) NULL ,
[SCanTime] datetime NULL ,
[ScanPerson] uniqueidentifier NULL ,
[StartTime] datetime NULL ,
[EndTime] datetime NULL ,
[DeptID] uniqueidentifier NULL ,
[State] int NULL ,
[Describe] varchar(200) NULL ,
[IncDecType] uniqueidentifier NULL ,
[IncDecCount] decimal(18) NULL 
)


GO

-- ----------------------------
-- Records of ScanStore
-- ----------------------------

-- ----------------------------
-- Table structure for ScanStoreDetail
-- ----------------------------
DROP TABLE [dbo].[ScanStoreDetail]
GO
CREATE TABLE [dbo].[ScanStoreDetail] (
[DetailID] uniqueidentifier NOT NULL ,
[ScanID] uniqueidentifier NOT NULL ,
[StoreID] uniqueidentifier NOT NULL ,
[ScanType] uniqueidentifier NULL ,
[Descn] varchar(200) NULL 
)


GO

-- ----------------------------
-- Records of ScanStoreDetail
-- ----------------------------

-- ----------------------------
-- Table structure for ScanStoreEquipType
-- ----------------------------
DROP TABLE [dbo].[ScanStoreEquipType]
GO
CREATE TABLE [dbo].[ScanStoreEquipType] (
[SCanID] uniqueidentifier NOT NULL ,
[PkTypeID] uniqueidentifier NOT NULL 
)


GO

-- ----------------------------
-- Records of ScanStoreEquipType
-- ----------------------------

-- ----------------------------
-- Table structure for StoreDetail
-- ----------------------------
DROP TABLE [dbo].[StoreDetail]
GO
CREATE TABLE [dbo].[StoreDetail] (
[StoreID] uniqueidentifier NOT NULL ,
[StorePID] uniqueidentifier NULL ,
[StoreCode] varchar(50) NULL ,
[DeptID] uniqueidentifier NOT NULL ,
[RFID] varchar(100) NULL ,
[RoomID] uniqueidentifier NULL ,
[FactoryID] uniqueidentifier NOT NULL ,
[PkTypeID] uniqueidentifier NOT NULL ,
[QuKeyID] uniqueidentifier NOT NULL ,
[Total] decimal(38,2) NULL ,
[Price] decimal(38,2) NULL ,
[UseState] uniqueidentifier NULL ,
[PersonLiableID] uniqueidentifier NULL ,
[InDepot] uniqueidentifier NULL ,
[ProduceDate] datetime NOT NULL ,
[PurchaseDate] datetime NULL ,
[UseDate] datetime NULL ,
[AddType] varchar(10) NULL ,
[OtherDate] datetime NULL 
)


GO

-- ----------------------------
-- Records of StoreDetail
-- ----------------------------
INSERT INTO [dbo].[StoreDetail] ([StoreID], [StorePID], [StoreCode], [DeptID], [RFID], [RoomID], [FactoryID], [PkTypeID], [QuKeyID], [Total], [Price], [UseState], [PersonLiableID], [InDepot], [ProduceDate], [PurchaseDate], [UseDate], [AddType], [OtherDate]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000000', N'QZD003', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'2201000444', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'1.00', N'1.50', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'2016-05-01 00:00:00.000', N'2016-09-01 00:00:00.000', N'2016-10-01 00:00:00.000', N'自购', N'2016-09-01 00:00:00.000')
GO
GO
INSERT INTO [dbo].[StoreDetail] ([StoreID], [StorePID], [StoreCode], [DeptID], [RFID], [RoomID], [FactoryID], [PkTypeID], [QuKeyID], [Total], [Price], [UseState], [PersonLiableID], [InDepot], [ProduceDate], [PurchaseDate], [UseDate], [AddType], [OtherDate]) VALUES (N'00000000-0000-0000-0000-000000000002', N'00000000-0000-0000-0000-000000000000', N'QJ009', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'2201000555', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'3.00', N'2.10', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'2016-05-01 00:00:00.000', N'2016-07-01 00:00:00.000', N'2016-10-01 00:00:00.000', N'调拨', N'2016-09-02 00:00:00.000')
GO
GO
INSERT INTO [dbo].[StoreDetail] ([StoreID], [StorePID], [StoreCode], [DeptID], [RFID], [RoomID], [FactoryID], [PkTypeID], [QuKeyID], [Total], [Price], [UseState], [PersonLiableID], [InDepot], [ProduceDate], [PurchaseDate], [UseDate], [AddType], [OtherDate]) VALUES (N'00000000-0000-0000-0000-000000000003', N'00000000-0000-0000-0000-000000000000', N'QZD008', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'2201000666', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'3.00', N'3.80', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'32CF4F13-9DE3-4B78-A042-0BD4F61175A8', N'2016-05-01 00:00:00.000', N'2016-06-01 00:00:00.000', N'2016-10-01 00:00:00.000', N'调拨', N'2016-09-02 00:00:00.000')
GO
GO

-- ----------------------------
-- Table structure for StoreExtendChange
-- ----------------------------
DROP TABLE [dbo].[StoreExtendChange]
GO
CREATE TABLE [dbo].[StoreExtendChange] (
[ChangeID] uniqueidentifier NOT NULL ,
[StoreID] uniqueidentifier NULL ,
[ExtendID] uniqueidentifier NULL ,
[ChangeOld] varchar(1000) NULL ,
[ChangeNew] varchar(1000) NULL ,
[ChangeDate] datetime NULL ,
[ChangeUserID] uniqueidentifier NULL 
)


GO

-- ----------------------------
-- Records of StoreExtendChange
-- ----------------------------

-- ----------------------------
-- Table structure for sysdiagrams
-- ----------------------------
DROP TABLE [dbo].[sysdiagrams]
GO
CREATE TABLE [dbo].[sysdiagrams] (
[name] sysname NOT NULL ,
[principal_id] int NOT NULL ,
[diagram_id] int NOT NULL IDENTITY(1,1) ,
[version] int NULL ,
[definition] varbinary(MAX) NULL 
)


GO

-- ----------------------------
-- Records of sysdiagrams
-- ----------------------------
SET IDENTITY_INSERT [dbo].[sysdiagrams] ON
GO
SET IDENTITY_INSERT [dbo].[sysdiagrams] OFF
GO

-- ----------------------------
-- Table structure for SysFileInfo
-- ----------------------------
DROP TABLE [dbo].[SysFileInfo]
GO
CREATE TABLE [dbo].[SysFileInfo] (
[FileID] uniqueidentifier NOT NULL ,
[ObjectID] uniqueidentifier NULL ,
[DeptID] uniqueidentifier NULL ,
[FileName] varchar(80) NULL ,
[Title] varchar(120) NULL ,
[Extension] varchar(20) NULL ,
[FileSize] varchar(30) NULL ,
[FileData] image NULL ,
[CategoryID] int NULL ,
[Descn] varchar(300) NULL ,
[CreateDate] datetime NULL ,
[UserID] uniqueidentifier NULL 
)


GO

-- ----------------------------
-- Records of SysFileInfo
-- ----------------------------
INSERT INTO [dbo].[SysFileInfo] ([FileID], [ObjectID], [DeptID], [FileName], [Title], [Extension], [FileSize], [FileData], [CategoryID], [Descn], [CreateDate], [UserID]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'2016100809303022.PDF', N'使用手册', N'PDF', N'1MB	', null, N'1', N'???', N'2016-11-01 00:21:32.000', N'00000000-0000-0000-0000-000000000001')
GO
GO

-- ----------------------------
-- Table structure for SysKey
-- ----------------------------
DROP TABLE [dbo].[SysKey]
GO
CREATE TABLE [dbo].[SysKey] (
[KeyID] uniqueidentifier NOT NULL ,
[MenuID] uniqueidentifier NULL ,
[KeyName] varchar(50) NULL ,
[KeyCode] varchar(50) NULL ,
[KeySort] int NULL ,
[KeyImageUrl] varchar(50) NULL 
)


GO

-- ----------------------------
-- Records of SysKey
-- ----------------------------
INSERT INTO [dbo].[SysKey] ([KeyID], [MenuID], [KeyName], [KeyCode], [KeySort], [KeyImageUrl]) VALUES (N'00000000-0000-0000-0000-000000000000', N'00000000-0000-0000-0000-000000000000', N'新增', N'add', N'1', N'add.gif,,,,,,,,,,,,,')
GO
GO
INSERT INTO [dbo].[SysKey] ([KeyID], [MenuID], [KeyName], [KeyCode], [KeySort], [KeyImageUrl]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'编辑', N'edit', N'2', N'edit.gif,,,,,,,,,,,,,')
GO
GO
INSERT INTO [dbo].[SysKey] ([KeyID], [MenuID], [KeyName], [KeyCode], [KeySort], [KeyImageUrl]) VALUES (N'00000000-0000-0000-0000-000000000002', N'00000000-0000-0000-0000-000000000002', N'新增', N'add', N'3', N'add.gif,,,,,,,,,,,,,')
GO
GO
INSERT INTO [dbo].[SysKey] ([KeyID], [MenuID], [KeyName], [KeyCode], [KeySort], [KeyImageUrl]) VALUES (N'00000000-0000-0000-0000-000000000003', N'00000000-0000-0000-0000-000000000003', N'删除', N'delete', N'4', N'delete.gif,,,,,,,,,,,,,')
GO
GO
INSERT INTO [dbo].[SysKey] ([KeyID], [MenuID], [KeyName], [KeyCode], [KeySort], [KeyImageUrl]) VALUES (N'00000000-0000-0000-0000-000000000004', N'00000000-0000-0000-0000-000000000004', N'新增', N'add', N'5', N'add.gif,,,,,,,,,,,,,')
GO
GO
INSERT INTO [dbo].[SysKey] ([KeyID], [MenuID], [KeyName], [KeyCode], [KeySort], [KeyImageUrl]) VALUES (N'00000000-0000-0000-0000-000000000005', N'00000000-0000-0000-0000-000000000005', N'打印', N'print', N'6', N'print.gif,,,,,,,,,,,,,')
GO
GO
INSERT INTO [dbo].[SysKey] ([KeyID], [MenuID], [KeyName], [KeyCode], [KeySort], [KeyImageUrl]) VALUES (N'00000000-0000-0000-0000-000000000006', N'00000000-0000-0000-0000-000000000006', N'新增', N'add', N'7', N'add.gif,,,,,,,,,,,,,')
GO
GO
INSERT INTO [dbo].[SysKey] ([KeyID], [MenuID], [KeyName], [KeyCode], [KeySort], [KeyImageUrl]) VALUES (N'00000000-0000-0000-0000-000000000007', N'00000000-0000-0000-0000-000000000007', N'编辑', N'edit', N'8', N'edit.gif,,,,,,,,,,,,,')
GO
GO
INSERT INTO [dbo].[SysKey] ([KeyID], [MenuID], [KeyName], [KeyCode], [KeySort], [KeyImageUrl]) VALUES (N'00000000-0000-0000-0000-000000000008', N'00000000-0000-0000-0000-000000000008', N'新增', N'add', N'9', N'add.gif,,,,,,,,,,,,,')
GO
GO
INSERT INTO [dbo].[SysKey] ([KeyID], [MenuID], [KeyName], [KeyCode], [KeySort], [KeyImageUrl]) VALUES (N'00000000-0000-0000-0000-000000000009', N'00000000-0000-0000-0000-000000000009', N'编辑', N'edit', N'10', N'edit.gif,,,,,,,,,,,,,')
GO
GO

-- ----------------------------
-- Table structure for SysLog
-- ----------------------------
DROP TABLE [dbo].[SysLog]
GO
CREATE TABLE [dbo].[SysLog] (
[LogID] uniqueidentifier NOT NULL ,
[UserID] uniqueidentifier NULL ,
[ModelID] uniqueidentifier NULL ,
[OperateCont] varchar(500) NULL ,
[ImportClass] uniqueidentifier NULL ,
[OperateDate] datetime NULL ,
[OperateType] uniqueidentifier NULL 
)


GO

-- ----------------------------
-- Records of SysLog
-- ----------------------------

-- ----------------------------
-- Table structure for SysMenu
-- ----------------------------
DROP TABLE [dbo].[SysMenu]
GO
CREATE TABLE [dbo].[SysMenu] (
[MenuID] uniqueidentifier NOT NULL ,
[MenuName] nvarchar(50) NULL ,
[ParentID] uniqueidentifier NULL ,
[OrderNum] int NULL ,
[Url] nvarchar(255) NULL ,
[Remark] nvarchar(255) NULL ,
[IconName] nvarchar(50) NULL 
)


GO

-- ----------------------------
-- Records of SysMenu
-- ----------------------------
INSERT INTO [dbo].[SysMenu] ([MenuID], [MenuName], [ParentID], [OrderNum], [Url], [Remark], [IconName]) VALUES (N'00000000-0000-0000-0000-000000000000', N'用户管理', N'00000000-0000-0000-0000-000000000000', N'1', N'/User/list.aspx', N'N/A', N'user.gif')
GO
GO
INSERT INTO [dbo].[SysMenu] ([MenuID], [MenuName], [ParentID], [OrderNum], [Url], [Remark], [IconName]) VALUES (N'00000000-0000-0000-0000-000000000001', N'性能指标', N'00000000-0000-0000-0000-000000000000', N'2', N'/EquipType/list.aspx', N'N/A', N'user.gif')
GO
GO
INSERT INTO [dbo].[SysMenu] ([MenuID], [MenuName], [ParentID], [OrderNum], [Url], [Remark], [IconName]) VALUES (N'00000000-0000-0000-0000-000000000002', N'实例查询', N'00000000-0000-0000-0000-000000000000', N'3', N'/StoreDetail/list.aspx', N'N/A', N'user.gif')
GO
GO
INSERT INTO [dbo].[SysMenu] ([MenuID], [MenuName], [ParentID], [OrderNum], [Url], [Remark], [IconName]) VALUES (N'00000000-0000-0000-0000-000000000003', N'装备出入库', N'00000000-0000-0000-0000-000000000000', N'4', N'/StoreDetail/list.aspx', N'N/A', N'user.gif')
GO
GO
INSERT INTO [dbo].[SysMenu] ([MenuID], [MenuName], [ParentID], [OrderNum], [Url], [Remark], [IconName]) VALUES (N'00000000-0000-0000-0000-000000000004', N'人员出入库', N'00000000-0000-0000-0000-000000000000', N'5', N'/StoreDetail/list.aspx', N'N/A', N'user.gif')
GO
GO
INSERT INTO [dbo].[SysMenu] ([MenuID], [MenuName], [ParentID], [OrderNum], [Url], [Remark], [IconName]) VALUES (N'00000000-0000-0000-0000-000000000005', N'检查保养登记', N'00000000-0000-0000-0000-000000000000', N'6', N'/StoreDetail/list.aspx', N'N/A', N'user.gif')
GO
GO
INSERT INTO [dbo].[SysMenu] ([MenuID], [MenuName], [ParentID], [OrderNum], [Url], [Remark], [IconName]) VALUES (N'00000000-0000-0000-0000-000000000006', N'角色管理', N'00000000-0000-0000-0000-000000000000', N'7', N'/StoreDetail/list.aspx', N'N/A', N'user.gif')
GO
GO
INSERT INTO [dbo].[SysMenu] ([MenuID], [MenuName], [ParentID], [OrderNum], [Url], [Remark], [IconName]) VALUES (N'00000000-0000-0000-0000-000000000007', N'配件管理', N'00000000-0000-0000-0000-000000000000', N'8', N'/StoreDetail/list.aspx', N'N/A', N'user.gif')
GO
GO
INSERT INTO [dbo].[SysMenu] ([MenuID], [MenuName], [ParentID], [OrderNum], [Url], [Remark], [IconName]) VALUES (N'00000000-0000-0000-0000-000000000008', N'厂家管理', N'00000000-0000-0000-0000-000000000000', N'9', N'/StoreDetail/list.aspx', N'N/A', N'user.gif')
GO
GO
INSERT INTO [dbo].[SysMenu] ([MenuID], [MenuName], [ParentID], [OrderNum], [Url], [Remark], [IconName]) VALUES (N'00000000-0000-0000-0000-000000000009', N'系统管理', N'00000000-0000-0000-0000-000000000000', N'10', N'/StoreDetail/list.aspx', N'N/A', N'user.gif')
GO
GO

-- ----------------------------
-- Table structure for SysParameter
-- ----------------------------
DROP TABLE [dbo].[SysParameter]
GO
CREATE TABLE [dbo].[SysParameter] (
[ParaID] uniqueidentifier NOT NULL ,
[ParentID] uniqueidentifier NULL ,
[ParaName] varchar(100) NULL ,
[ParaSort] int NULL 
)


GO

-- ----------------------------
-- Records of SysParameter
-- ----------------------------
INSERT INTO [dbo].[SysParameter] ([ParaID], [ParentID], [ParaName], [ParaSort]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000000', N'性别', N'1')
GO
GO
INSERT INTO [dbo].[SysParameter] ([ParaID], [ParentID], [ParaName], [ParaSort]) VALUES (N'00000000-0000-0000-0000-000000000002', N'00000000-0000-0000-0000-000000000001', N'男', N'1')
GO
GO
INSERT INTO [dbo].[SysParameter] ([ParaID], [ParentID], [ParaName], [ParaSort]) VALUES (N'00000000-0000-0000-0000-000000000003', N'00000000-0000-0000-0000-000000000001', N'女', N'2')
GO
GO

-- ----------------------------
-- Table structure for SysRole
-- ----------------------------
DROP TABLE [dbo].[SysRole]
GO
CREATE TABLE [dbo].[SysRole] (
[RoleID] uniqueidentifier NOT NULL ,
[RoleName] varchar(50) NULL ,
[ParentID] uniqueidentifier NULL 
)


GO

-- ----------------------------
-- Records of SysRole
-- ----------------------------
INSERT INTO [dbo].[SysRole] ([RoleID], [RoleName], [ParentID]) VALUES (N'00000000-0000-0000-0000-000000000000', N'系统管理员', N'00000000-0000-0000-0000-000000000000')
GO
GO
INSERT INTO [dbo].[SysRole] ([RoleID], [RoleName], [ParentID]) VALUES (N'00000000-0000-0000-0000-000000000001', N'总部', N'00000000-0000-0000-0000-000000000000')
GO
GO
INSERT INTO [dbo].[SysRole] ([RoleID], [RoleName], [ParentID]) VALUES (N'00000000-0000-0000-0000-000000000002', N'支队', N'00000000-0000-0000-0000-000000000000')
GO
GO
INSERT INTO [dbo].[SysRole] ([RoleID], [RoleName], [ParentID]) VALUES (N'00000000-0000-0000-0000-000000000003', N'中队', N'00000000-0000-0000-0000-000000000000')
GO
GO
INSERT INTO [dbo].[SysRole] ([RoleID], [RoleName], [ParentID]) VALUES (N'00000000-0000-0000-0000-000000000004', N'总队', N'00000000-0000-0000-0000-000000000000')
GO
GO

-- ----------------------------
-- Table structure for SysUser
-- ----------------------------
DROP TABLE [dbo].[SysUser]
GO
CREATE TABLE [dbo].[SysUser] (
[UserID] uniqueidentifier NOT NULL ,
[DeptID] uniqueidentifier NULL ,
[RoleID] uniqueidentifier NULL ,
[UserName] varchar(20) NULL ,
[LoginID] varchar(80) NULL ,
[Password] varchar(80) NULL ,
[UseState] bit NULL ,
[ChangeUserID] uniqueidentifier NULL ,
[ChangeDate] datetime NULL 
)


GO

-- ----------------------------
-- Records of SysUser
-- ----------------------------
INSERT INTO [dbo].[SysUser] ([UserID], [DeptID], [RoleID], [UserName], [LoginID], [Password], [UseState], [ChangeUserID], [ChangeDate]) VALUES (N'00000000-0000-0000-0000-000000000000', N'00000000-0000-0000-0000-000000000000', N'00000000-0000-0000-0000-000000000000', N'总部管理员', N'zb0001', N'******', N'1', N'00000000-0000-0000-0000-000000000000', N'2016-09-28 00:00:00.000')
GO
GO
INSERT INTO [dbo].[SysUser] ([UserID], [DeptID], [RoleID], [UserName], [LoginID], [Password], [UseState], [ChangeUserID], [ChangeDate]) VALUES (N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'李连杰', N'liliangjie', N'******', N'1', N'00000000-0000-0000-0000-000000000001', N'2016-09-29 00:00:00.000')
GO
GO
INSERT INTO [dbo].[SysUser] ([UserID], [DeptID], [RoleID], [UserName], [LoginID], [Password], [UseState], [ChangeUserID], [ChangeDate]) VALUES (N'00000000-0000-0000-0000-000000000002', N'00000000-0000-0000-0000-000000000002', N'00000000-0000-0000-0000-000000000002', N'周润发', N'zhou009', N'******', N'1', N'00000000-0000-0000-0000-000000000002', N'2016-09-30 00:00:00.000')
GO
GO
INSERT INTO [dbo].[SysUser] ([UserID], [DeptID], [RoleID], [UserName], [LoginID], [Password], [UseState], [ChangeUserID], [ChangeDate]) VALUES (N'00000000-0000-0000-0000-000000000003', N'00000000-0000-0000-0000-000000000003', N'00000000-0000-0000-0000-000000000003', N'甄子丹', N'zzd1983', N'******', N'1', N'00000000-0000-0000-0000-000000000003', N'2016-10-01 00:00:00.000')
GO
GO
INSERT INTO [dbo].[SysUser] ([UserID], [DeptID], [RoleID], [UserName], [LoginID], [Password], [UseState], [ChangeUserID], [ChangeDate]) VALUES (N'00000000-0000-0000-0000-000000000004', N'00000000-0000-0000-0000-000000000004', N'00000000-0000-0000-0000-000000000004', N'陕西总队', N'shanxi', N'******', N'1', N'00000000-0000-0000-0000-000000000004', N'2016-10-02 00:00:00.000')
GO
GO
INSERT INTO [dbo].[SysUser] ([UserID], [DeptID], [RoleID], [UserName], [LoginID], [Password], [UseState], [ChangeUserID], [ChangeDate]) VALUES (N'00000000-0000-0000-0000-000000000005', N'00000000-0000-0000-0000-000000000000', N'00000000-0000-0000-0000-000000000000', N'西安支队', N'xianzhidui', N'******', N'1', N'00000000-0000-0000-0000-000000000002', N'2016-10-03 00:00:00.000')
GO
GO
INSERT INTO [dbo].[SysUser] ([UserID], [DeptID], [RoleID], [UserName], [LoginID], [Password], [UseState], [ChangeUserID], [ChangeDate]) VALUES (N'00000000-0000-0000-0000-000000000006', N'00000000-0000-0000-0000-000000000001', N'00000000-0000-0000-0000-000000000001', N'山西总队', N'sxzd2016', N'******', N'1', N'00000000-0000-0000-0000-000000000003', N'2016-10-04 00:00:00.000')
GO
GO
INSERT INTO [dbo].[SysUser] ([UserID], [DeptID], [RoleID], [UserName], [LoginID], [Password], [UseState], [ChangeUserID], [ChangeDate]) VALUES (N'00000000-0000-0000-0000-000000000007', N'00000000-0000-0000-0000-000000000002', N'00000000-0000-0000-0000-000000000002', N'宝鸡支队', N'baoji', N'******', N'1', N'00000000-0000-0000-0000-000000000004', N'2016-10-05 00:00:00.000')
GO
GO

-- ----------------------------
-- Table structure for TmpHmdData
-- ----------------------------
DROP TABLE [dbo].[TmpHmdData]
GO
CREATE TABLE [dbo].[TmpHmdData] (
[HytherID] uniqueidentifier NOT NULL ,
[DeptID] uniqueidentifier NULL ,
[RoomID] uniqueidentifier NULL ,
[RecTime] datetime NULL ,
[Temperature] decimal(8,2) NULL ,
[Humidity] decimal(8,2) NULL ,
[Remark] varchar(500) NULL 
)


GO

-- ----------------------------
-- Records of TmpHmdData
-- ----------------------------

-- ----------------------------
-- Table structure for UserCard
-- ----------------------------
DROP TABLE [dbo].[UserCard]
GO
CREATE TABLE [dbo].[UserCard] (
[PersonID] uniqueidentifier NOT NULL ,
[CardID] varchar(20) NULL ,
[CardPass] varchar(80) NULL 
)


GO

-- ----------------------------
-- Records of UserCard
-- ----------------------------

-- ----------------------------
-- Table structure for UserDataPermission
-- ----------------------------
DROP TABLE [dbo].[UserDataPermission]
GO
CREATE TABLE [dbo].[UserDataPermission] (
[RoleID] uniqueidentifier NOT NULL ,
[PkTypeID] uniqueidentifier NOT NULL 
)


GO

-- ----------------------------
-- Records of UserDataPermission
-- ----------------------------

-- ----------------------------
-- Table structure for Workers
-- ----------------------------
DROP TABLE [dbo].[Workers]
GO
CREATE TABLE [dbo].[Workers] (
[PIOID] uniqueidentifier NOT NULL ,
[PersonID] uniqueidentifier NOT NULL 
)


GO

-- ----------------------------
-- Records of Workers
-- ----------------------------

-- ----------------------------
-- Indexes structure for table CheckMntcDetail
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table CheckMntcDetail
-- ----------------------------
ALTER TABLE [dbo].[CheckMntcDetail] ADD PRIMARY KEY ([MtID], [StoreID])
GO

-- ----------------------------
-- Indexes structure for table CheckMntcInfo
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table CheckMntcInfo
-- ----------------------------
ALTER TABLE [dbo].[CheckMntcInfo] ADD PRIMARY KEY ([MtID])
GO

-- ----------------------------
-- Indexes structure for table CpntTypes
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table CpntTypes
-- ----------------------------
ALTER TABLE [dbo].[CpntTypes] ADD PRIMARY KEY ([CpntID])
GO

-- ----------------------------
-- Indexes structure for table Department
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table Department
-- ----------------------------
ALTER TABLE [dbo].[Department] ADD PRIMARY KEY ([DeptID])
GO

-- ----------------------------
-- Indexes structure for table DepotInfo
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table DepotInfo
-- ----------------------------
ALTER TABLE [dbo].[DepotInfo] ADD PRIMARY KEY ([RoomID])
GO

-- ----------------------------
-- Indexes structure for table DeptExent
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table DeptExent
-- ----------------------------
ALTER TABLE [dbo].[DeptExent] ADD PRIMARY KEY ([ExentID])
GO

-- ----------------------------
-- Indexes structure for table ECFactory
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table ECFactory
-- ----------------------------
ALTER TABLE [dbo].[ECFactory] ADD PRIMARY KEY ([RecID], [FactoryID])
GO

-- ----------------------------
-- Indexes structure for table EqmtCpntInfo
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table EqmtCpntInfo
-- ----------------------------
ALTER TABLE [dbo].[EqmtCpntInfo] ADD PRIMARY KEY ([PkTypeID], [CpntID])
GO

-- ----------------------------
-- Indexes structure for table EqmtInOut
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table EqmtInOut
-- ----------------------------
ALTER TABLE [dbo].[EqmtInOut] ADD PRIMARY KEY ([EIOID])
GO

-- ----------------------------
-- Indexes structure for table EquipType
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table EquipType
-- ----------------------------
ALTER TABLE [dbo].[EquipType] ADD PRIMARY KEY ([PkTypeID])
GO

-- ----------------------------
-- Indexes structure for table EquipTypeDetail
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table EquipTypeDetail
-- ----------------------------
ALTER TABLE [dbo].[EquipTypeDetail] ADD PRIMARY KEY ([ItemID])
GO

-- ----------------------------
-- Indexes structure for table ExtendType
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table ExtendType
-- ----------------------------
ALTER TABLE [dbo].[ExtendType] ADD PRIMARY KEY ([ExtendID])
GO

-- ----------------------------
-- Indexes structure for table FactoryInfo
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table FactoryInfo
-- ----------------------------
ALTER TABLE [dbo].[FactoryInfo] ADD PRIMARY KEY ([FactoryID])
GO

-- ----------------------------
-- Indexes structure for table FaultInfor
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table FaultInfor
-- ----------------------------
ALTER TABLE [dbo].[FaultInfor] ADD PRIMARY KEY ([FaultID])
GO

-- ----------------------------
-- Indexes structure for table M_Point
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table M_Point
-- ----------------------------
ALTER TABLE [dbo].[M_Point] ADD PRIMARY KEY ([PointID])
GO

-- ----------------------------
-- Indexes structure for table PersonInfo
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table PersonInfo
-- ----------------------------
ALTER TABLE [dbo].[PersonInfo] ADD PRIMARY KEY ([PersonID])
GO

-- ----------------------------
-- Indexes structure for table PersonInOut
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table PersonInOut
-- ----------------------------
ALTER TABLE [dbo].[PersonInOut] ADD PRIMARY KEY ([PIOID])
GO

-- ----------------------------
-- Indexes structure for table RoleKey
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table RoleKey
-- ----------------------------
ALTER TABLE [dbo].[RoleKey] ADD PRIMARY KEY ([RoleID], [KeyID], [MenuID])
GO

-- ----------------------------
-- Indexes structure for table RoleMenu
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table RoleMenu
-- ----------------------------
ALTER TABLE [dbo].[RoleMenu] ADD PRIMARY KEY ([RoleID], [MenuID])
GO

-- ----------------------------
-- Indexes structure for table RoomAdminUser
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table RoomAdminUser
-- ----------------------------
ALTER TABLE [dbo].[RoomAdminUser] ADD PRIMARY KEY ([AdminID])
GO

-- ----------------------------
-- Indexes structure for table ScanStore
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table ScanStore
-- ----------------------------
ALTER TABLE [dbo].[ScanStore] ADD PRIMARY KEY ([SCanID])
GO

-- ----------------------------
-- Indexes structure for table ScanStoreDetail
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table ScanStoreDetail
-- ----------------------------
ALTER TABLE [dbo].[ScanStoreDetail] ADD PRIMARY KEY ([DetailID])
GO

-- ----------------------------
-- Indexes structure for table ScanStoreEquipType
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table ScanStoreEquipType
-- ----------------------------
ALTER TABLE [dbo].[ScanStoreEquipType] ADD PRIMARY KEY ([SCanID], [PkTypeID])
GO

-- ----------------------------
-- Indexes structure for table StoreDetail
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table StoreDetail
-- ----------------------------
ALTER TABLE [dbo].[StoreDetail] ADD PRIMARY KEY ([StoreID])
GO

-- ----------------------------
-- Indexes structure for table StoreExtendChange
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table StoreExtendChange
-- ----------------------------
ALTER TABLE [dbo].[StoreExtendChange] ADD PRIMARY KEY ([ChangeID])
GO

-- ----------------------------
-- Indexes structure for table sysdiagrams
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table sysdiagrams
-- ----------------------------
ALTER TABLE [dbo].[sysdiagrams] ADD PRIMARY KEY ([diagram_id])
GO

-- ----------------------------
-- Uniques structure for table sysdiagrams
-- ----------------------------
ALTER TABLE [dbo].[sysdiagrams] ADD UNIQUE ([principal_id] ASC, [name] ASC)
GO

-- ----------------------------
-- Indexes structure for table SysFileInfo
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table SysFileInfo
-- ----------------------------
ALTER TABLE [dbo].[SysFileInfo] ADD PRIMARY KEY ([FileID])
GO

-- ----------------------------
-- Indexes structure for table SysKey
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table SysKey
-- ----------------------------
ALTER TABLE [dbo].[SysKey] ADD PRIMARY KEY ([KeyID])
GO

-- ----------------------------
-- Indexes structure for table SysLog
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table SysLog
-- ----------------------------
ALTER TABLE [dbo].[SysLog] ADD PRIMARY KEY ([LogID])
GO

-- ----------------------------
-- Indexes structure for table SysMenu
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table SysMenu
-- ----------------------------
ALTER TABLE [dbo].[SysMenu] ADD PRIMARY KEY ([MenuID])
GO

-- ----------------------------
-- Indexes structure for table SysParameter
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table SysParameter
-- ----------------------------
ALTER TABLE [dbo].[SysParameter] ADD PRIMARY KEY ([ParaID])
GO

-- ----------------------------
-- Indexes structure for table SysRole
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table SysRole
-- ----------------------------
ALTER TABLE [dbo].[SysRole] ADD PRIMARY KEY ([RoleID])
GO

-- ----------------------------
-- Indexes structure for table SysUser
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table SysUser
-- ----------------------------
ALTER TABLE [dbo].[SysUser] ADD PRIMARY KEY ([UserID])
GO

-- ----------------------------
-- Indexes structure for table TmpHmdData
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table TmpHmdData
-- ----------------------------
ALTER TABLE [dbo].[TmpHmdData] ADD PRIMARY KEY ([HytherID])
GO

-- ----------------------------
-- Indexes structure for table UserDataPermission
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table UserDataPermission
-- ----------------------------
ALTER TABLE [dbo].[UserDataPermission] ADD PRIMARY KEY ([RoleID], [PkTypeID])
GO

-- ----------------------------
-- Indexes structure for table Workers
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table Workers
-- ----------------------------
ALTER TABLE [dbo].[Workers] ADD PRIMARY KEY ([PIOID], [PersonID])
GO
