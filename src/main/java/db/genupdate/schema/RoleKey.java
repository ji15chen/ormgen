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
@DatabaseField( columnName ="RoleID",id=true ,canBeNull = false )
	private UUID roleid;
@DatabaseField( columnName ="KeyID",id=true ,canBeNull = false )
	private UUID keyid;
@DatabaseField( columnName ="MenuID",id=true ,canBeNull = false )
	private UUID menuid;


}