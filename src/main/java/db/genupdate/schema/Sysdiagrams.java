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
import db.genupdate.daoimpl.SysdiagramsDaoImpl;
@DatabaseTable(tableName = "sysdiagrams", daoClass =SysdiagramsDaoImpl.class)
	public class Sysdiagrams{
@DatabaseField( columnName ="name",canBeNull = false )
	private String name;
@DatabaseField( columnName ="principal_id",canBeNull = false )
	private int principal_id;
@DatabaseField( columnName ="diagram_id",id = true ,canBeNull = false )
	private int diagram_id;
@DatabaseField( columnName ="version")
	private int version;
@DatabaseField( columnName ="definition")
	private byte[] definition;


}