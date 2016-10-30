package db.schemaupdate;

	/**
	*	*@author jichen
	*/

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.io.Serializable;
import java.util.UUID;
import java.math.BigDecimal;
import java.util.Date;
@DatabaseTable(tableName = "SysRole")
	public class SysRole{
@DatabaseField( columnName ="RoleID",id = true ,canBeNull = false )
	private String roleid;
@DatabaseField( columnName ="RoleName")
	private String rolename;
@DatabaseField( columnName ="ParentID")
	private String parentid;


}