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
import db.genupdate.daoimpl.FaultInforDaoImpl;
@DatabaseTable(tableName = "FaultInfor", daoClass =FaultInforDaoImpl.class)
	public class FaultInfor{
@DatabaseField( columnName ="FaultID",id=true ,canBeNull = false )
	private UUID faultid;
@DatabaseField( columnName ="StoreID")
	private UUID storeid;
@DatabaseField( columnName ="FaultTitle")
	private String faulttitle;
@DatabaseField( columnName ="FaultType")
	private UUID faulttype;
@DatabaseField( columnName ="FaultKey")
	private String faultkey;
@DatabaseField( columnName ="FaultDesc")
	private String faultdesc;
@DatabaseField( columnName ="DeptID")
	private UUID deptid;
@DatabaseField( columnName ="UserID")
	private UUID userid;
@DatabaseField( columnName ="CreateDate")
	private Date createdate;
@DatabaseField( columnName ="FaultState")
	private int faultstate;
@DatabaseField( columnName ="EquipCount")
	private BigDecimal equipcount;


}