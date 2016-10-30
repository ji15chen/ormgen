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
@DatabaseTable(tableName = "ExtendType")
	public class ExtendType{
@DatabaseField( columnName ="ExtendID",id = true ,canBeNull = false )
	private String extendid;
@DatabaseField( columnName ="ExtendCode")
	private String extendcode;
@DatabaseField( columnName ="ExtendName")
	private String extendname;
@DatabaseField( columnName ="ExtendType")
	private String extendtype;
@DatabaseField( columnName ="ExtendUnit")
	private String extendunit;
@DatabaseField( columnName ="ExtendMin")
	private BigDecimal extendmin;
@DatabaseField( columnName ="ExtendMax")
	private BigDecimal extendmax;
@DatabaseField( columnName ="Describe")
	private String describe;
@DatabaseField( columnName ="TypeCode")
	private String typecode;


}