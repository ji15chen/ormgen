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
@DatabaseTable(tableName = "FactoryInfo")
	public class FactoryInfo{
@DatabaseField( columnName ="FactoryID",id = true ,canBeNull = false )
	private String factoryid;
@DatabaseField( columnName ="FactoryName")
	private String factoryname;
@DatabaseField( columnName ="FactoryType")
	private String factorytype;
@DatabaseField( columnName ="Province")
	private String province;
@DatabaseField( columnName ="City")
	private String city;
@DatabaseField( columnName ="District")
	private String district;
@DatabaseField( columnName ="Address")
	private String address;
@DatabaseField( columnName ="PostCode")
	private String postcode;
@DatabaseField( columnName ="FirstMan")
	private String firstman;
@DatabaseField( columnName ="Remark")
	private String remark;
@DatabaseField( columnName ="FactoryDesc")
	private String factorydesc;
@DatabaseField( columnName ="Phone")
	private String phone;


}