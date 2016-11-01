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
import db.genupdate.daoimpl.EquipTypeDaoImpl;
@DatabaseTable(tableName = "EquipType", daoClass =EquipTypeDaoImpl.class)
	public class EquipType{
@DatabaseField( columnName ="PkTypeID",id=true ,canBeNull = false )
	private UUID pktypeid;
@DatabaseField( columnName ="SupPkTypeID")
	private UUID suppktypeid;
@DatabaseField( columnName ="DeptID")
	private UUID deptid;
@DatabaseField( columnName ="UserID")
	private UUID userid;
@DatabaseField( columnName ="AddDate")
	private Date adddate;
@DatabaseField( columnName ="TypeName")
	private String typename;
@DatabaseField( columnName ="TypeCode")
	private String typecode;
@DatabaseField( columnName ="Unit")
	private UUID unit;
@DatabaseField( columnName ="Scale")
	private BigDecimal scale;
@DatabaseField( columnName ="IsEnable")
	private boolean isenable;
@DatabaseField( columnName ="Describe")
	private String describe;
@DatabaseField( columnName ="CategoryID")
	private UUID categoryid;
@DatabaseField( columnName ="WarrantyPeriod")
	private int warrantyperiod;
@DatabaseField( columnName ="LimitedYear")
	private int limitedyear;


}