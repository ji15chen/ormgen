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
@DatabaseField( columnName ="UserID",id=true ,canBeNull = false )
	private UUID userid;
@DatabaseField( columnName ="DeptID")
	private UUID deptid;
@DatabaseField( columnName ="RoleID")
	private UUID roleid;
@DatabaseField( columnName ="UserName")
	private String username;
@DatabaseField( columnName ="LoginID")
	private String loginid;
@DatabaseField( columnName ="Password")
	private String password;
@DatabaseField( columnName ="UseState")
	private boolean usestate;
@DatabaseField( columnName ="ChangeUserID")
	private UUID changeuserid;
@DatabaseField( columnName ="ChangeDate")
	private Date changedate;


}