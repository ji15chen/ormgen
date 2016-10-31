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
import db.genupdate.daoimpl.ExtendTypeDaoImpl;
@DatabaseTable(tableName = "ExtendType", daoClass =ExtendTypeDaoImpl.class)
	public class ExtendType{
@DatabaseField( columnName ="ExtendID",id=true ,canBeNull = false )
	private UUID extendid;
@DatabaseField( columnName ="ExtendCode")
	private String extendcode;
@DatabaseField( columnName ="ExtendName")
	private String extendname;
@DatabaseField( columnName ="ExtendType")
	private UUID extendtype;
@DatabaseField( columnName ="ExtendUnit")
	private UUID extendunit;
@DatabaseField( columnName ="ExtendMin")
	private BigDecimal extendmin;
@DatabaseField( columnName ="ExtendMax")
	private BigDecimal extendmax;
@DatabaseField( columnName ="Describe")
	private String describe;
@DatabaseField( columnName ="TypeCode")
	private UUID typecode;


}