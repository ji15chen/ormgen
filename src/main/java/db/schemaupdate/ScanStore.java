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
@DatabaseTable(tableName = "ScanStore")
	public class ScanStore{
@DatabaseField( columnName ="SCanID",id = true ,canBeNull = false )
	private String scanid;
@DatabaseField( columnName ="PSCanID")
	private String pscanid;
@DatabaseField( columnName ="Topic")
	private String topic;
@DatabaseField( columnName ="SCanTime")
	private Date scantime;
@DatabaseField( columnName ="ScanPerson")
	private String scanperson;
@DatabaseField( columnName ="StartTime")
	private Date starttime;
@DatabaseField( columnName ="EndTime")
	private Date endtime;
@DatabaseField( columnName ="DeptID")
	private String deptid;
@DatabaseField( columnName ="State")
	private int state;
@DatabaseField( columnName ="Describe")
	private String describe;


}