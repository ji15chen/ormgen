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
import db.genupdate.daoimpl.ScanStoreDaoImpl;
@DatabaseTable(tableName = "ScanStore", daoClass =ScanStoreDaoImpl.class)
	public class ScanStore{
@DatabaseField( columnName ="SCanID",id=true ,canBeNull = false )
	private UUID scanid;
@DatabaseField( columnName ="PSCanID")
	private UUID pscanid;
@DatabaseField( columnName ="Topic")
	private String topic;
@DatabaseField( columnName ="SCanTime")
	private Date scantime;
@DatabaseField( columnName ="ScanPerson")
	private UUID scanperson;
@DatabaseField( columnName ="StartTime")
	private Date starttime;
@DatabaseField( columnName ="EndTime")
	private Date endtime;
@DatabaseField( columnName ="DeptID")
	private UUID deptid;
@DatabaseField( columnName ="State")
	private int state;
@DatabaseField( columnName ="Describe")
	private String describe;
@DatabaseField( columnName ="IncDecType")
	private UUID incdectype;
@DatabaseField( columnName ="IncDecCount")
	private BigDecimal incdeccount;


}