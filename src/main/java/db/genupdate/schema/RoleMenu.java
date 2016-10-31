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
import db.genupdate.daoimpl.RoleMenuDaoImpl;
@DatabaseTable(tableName = "RoleMenu", daoClass =RoleMenuDaoImpl.class)
	public class RoleMenu{
@DatabaseField( columnName ="RoleID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="SysRole_RoleID")
	private SysRole roleid;
@DatabaseField( columnName ="RoleID",id=true ,canBeNull = false )
	private UUID roleid;
@DatabaseField( columnName ="MenuID",id=true ,canBeNull = false )
	private UUID menuid;


}