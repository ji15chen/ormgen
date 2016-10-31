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
import db.genupdate.daoimpl.RoleKeyDaoImpl;
@DatabaseTable(tableName = "RoleKey", daoClass =RoleKeyDaoImpl.class)
	public class RoleKey{
@DatabaseField( columnName ="RoleID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="RoleMenu_MenuID")
	private RoleMenu roleid;
@DatabaseField( columnName ="RoleID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="RoleMenu_RoleID")
	private RoleMenu roleid;
@DatabaseField( columnName ="RoleID",id=true ,canBeNull = false )
	private UUID roleid;
@DatabaseField( columnName ="KeyID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="SysKey_KeyID")
	private SysKey keyid;
@DatabaseField( columnName ="KeyID",id=true ,canBeNull = false )
	private UUID keyid;
@DatabaseField( columnName ="MenuID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="RoleMenu_MenuID")
	private RoleMenu menuid;
@DatabaseField( columnName ="MenuID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="RoleMenu_RoleID")
	private RoleMenu menuid;
@DatabaseField( columnName ="MenuID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="SysMenu_MenuID")
	private SysMenu menuid;
@DatabaseField( columnName ="MenuID",id=true ,canBeNull = false )
	private UUID menuid;


}