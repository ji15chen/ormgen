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
@DatabaseTable(tableName = "EquipType")
	public class EquipType{
@DatabaseField( columnName ="PkTypeID",id = true ,canBeNull = false )
	private String pktypeid;
@DatabaseField( columnName ="SupPkTypeID")
	private String suppktypeid;
@DatabaseField( columnName ="DeptID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="Department_DeptID")
	private Department deptid;
@DatabaseField( columnName ="UserID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="SysUser_UserID")
	private SysUser userid;
@DatabaseField( columnName ="AddDate")
	private Date adddate;
@DatabaseField( columnName ="TypeName")
	private String typename;
@DatabaseField( columnName ="TypeCode")
	private String typecode;
@DatabaseField( columnName ="Unit")
	private String unit;
@DatabaseField( columnName ="Scale")
	private BigDecimal scale;
@DatabaseField( columnName ="IsEnable")
	private int isenable;
@DatabaseField( columnName ="Describe")
	private String describe;
@DatabaseField( columnName ="CategoryID")
	private String categoryid;
@DatabaseField( columnName ="WarrantyPeriod")
	private int warrantyperiod;
@DatabaseField( columnName ="Life")
	private int life;
@DatabaseField( columnName ="Count")
	private BigDecimal count;


}