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
import db.genupdate.daoimpl.CpntTypesDaoImpl;
@DatabaseTable(tableName = "CpntTypes", daoClass =CpntTypesDaoImpl.class)
	public class CpntTypes{
@DatabaseField( columnName ="CpntID",id=true ,canBeNull = false )
	private UUID cpntid;
@DatabaseField( columnName ="CpntName")
	private String cpntname;
@DatabaseField( columnName ="CpntType")
	private String cpnttype;
@DatabaseField( columnName ="CpntUnit")
	private String cpntunit;
@DatabaseField( columnName ="CpntYear")
	private BigDecimal cpntyear;
@DatabaseField( columnName ="CpntFunc")
	private String cpntfunc;
@DatabaseField( columnName ="IsPublic")
	private boolean ispublic;
@DatabaseField( columnName ="CpntDesc")
	private String cpntdesc;


}