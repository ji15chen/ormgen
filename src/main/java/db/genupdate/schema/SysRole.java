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
import db.genupdate.daoimpl.SysRoleDaoImpl;
@DatabaseTable(tableName = "SysRole", daoClass =SysRoleDaoImpl.class)
	public class SysRole{
@DatabaseField( columnName ="RoleID",id=true ,canBeNull = false )
	private UUID roleid;
@DatabaseField( columnName ="RoleName")
	private String rolename;
@DatabaseField( columnName ="ParentID")
	private UUID parentid;


}