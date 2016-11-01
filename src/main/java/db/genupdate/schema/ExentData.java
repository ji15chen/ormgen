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
import db.genupdate.daoimpl.ExentDataDaoImpl;
@DatabaseTable(tableName = "ExentData", daoClass =ExentDataDaoImpl.class)
	public class ExentData{
@DatabaseField( columnName ="ObjectID")
	private UUID objectid;
@DatabaseField( columnName ="ExtendID")
	private UUID extendid;
@DatabaseField( columnName ="ExtentValue")
	private String extentvalue;
@DatabaseField( columnName ="ExtentSort")
	private int extentsort;


}