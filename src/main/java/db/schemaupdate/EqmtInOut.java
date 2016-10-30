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
@DatabaseTable(tableName = "EqmtInOut")
	public class EqmtInOut{
@DatabaseField( columnName ="EIOID",id = true ,canBeNull = false )
	private String eioid;
@DatabaseField( columnName ="PIOID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="PersonInOut_PIOID")
	private PersonInOut pioid;
@DatabaseField( columnName ="StoreID",canBeNull = false )
	private String storeid;
@DatabaseField( columnName ="Reason")
	private String reason;
@DatabaseField( columnName ="ScanTime")
	private Date scantime;
@DatabaseField( columnName ="Describe")
	private String describe;
@DatabaseField( columnName ="TakeMan")
	private String takeman;


}