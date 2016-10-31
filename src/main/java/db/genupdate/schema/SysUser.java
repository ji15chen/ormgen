package db.genupdate.schema;

	/**
	*	*@author jichen
	*/

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.io.Serializable;
import java.util.UUID;
import java.math.BigDecimal;
import java.util.Date;
import db.genupdate.daoimpl.SysUserDaoImpl;
@DatabaseTable(tableName = "SysUser", daoClass =SysUserDaoImpl.class)
	public class SysUser{
@DatabaseField( columnName ="UserID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="PersonInfo_PersonID")
	private PersonInfo userid;
@DatabaseField( columnName ="UserID",id=true ,canBeNull = false )
	private UUID userid;
@DatabaseField( columnName ="DeptID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="Department_DeptID")
	private Department deptid;
@DatabaseField( columnName ="RoleID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="SysRole_RoleID")
	private SysRole roleid;
@DatabaseField( columnName ="UserName")
	private String username;
@DatabaseField( columnName ="LoginID")
	private String loginid;
@DatabaseField( columnName ="Password")
	private String password;
@DatabaseField( columnName ="UseState")
	private boolean usestate;
@DatabaseField( columnName ="Updator")
	private UUID updator;
@DatabaseField( columnName ="UpdateTime")
	private Date updatetime;


}