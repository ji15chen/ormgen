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
import db.genupdate.daoimpl.FactoryInfoDaoImpl;
@DatabaseTable(tableName = "FactoryInfo", daoClass =FactoryInfoDaoImpl.class)
	public class FactoryInfo{
@DatabaseField( columnName ="FactoryID",id=true ,canBeNull = false )
	private UUID factoryid;
@DatabaseField( columnName ="FactoryName")
	private String factoryname;
@DatabaseField( columnName ="FactoryType")
	private UUID factorytype;
@DatabaseField( columnName ="Province")
	private UUID province;
@DatabaseField( columnName ="City")
	private UUID city;
@DatabaseField( columnName ="District")
	private UUID district;
@DatabaseField( columnName ="Address")
	private String address;
@DatabaseField( columnName ="PostCode")
	private String postcode;
@DatabaseField( columnName ="FirstMan")
	private String firstman;
@DatabaseField( columnName ="Remark")
	private String remark;
@DatabaseField( columnName ="Descn")
	private String descn;
@DatabaseField( columnName ="Telephone")
	private String telephone;


}