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
import db.genupdate.daoimpl.SysKeyDaoImpl;
@DatabaseTable(tableName = "SysKey", daoClass =SysKeyDaoImpl.class)
	public class SysKey{
@DatabaseField( columnName ="KeyID",id=true ,canBeNull = false )
	private UUID keyid;
@DatabaseField( columnName ="MenuID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="SysMenu_MenuID")
	private SysMenu menuid;
@DatabaseField( columnName ="KeyName")
	private String keyname;
@DatabaseField( columnName ="KeyCode")
	private String keycode;
@DatabaseField( columnName ="KeySort")
	private int keysort;
@DatabaseField( columnName ="KeyImageUrl")
	private String keyimageurl;


}