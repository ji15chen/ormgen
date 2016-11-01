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
import db.genupdate.daoimpl.DepartmentDaoImpl;
@DatabaseTable(tableName = "Department", daoClass =DepartmentDaoImpl.class)
	public class Department{
@DatabaseField( columnName ="DeptID",id=true ,canBeNull = false )
	private UUID deptid;
@DatabaseField( columnName ="SupDeptID")
	private UUID supdeptid;
@DatabaseField( columnName ="DeptCode")
	private String deptcode;
@DatabaseField( columnName ="DeptName")
	private String deptname;
@DatabaseField( columnName ="ShortName")
	private String shortname;
@DatabaseField( columnName ="Designation")
	private String designation;
@DatabaseField( columnName ="Address")
	private String address;
@DatabaseField( columnName ="TypeCode")
	private UUID typecode;
@DatabaseField( columnName ="Dwye")
	private int dwye;
@DatabaseField( columnName ="DeptLevel")
	private UUID deptlevel;
@DatabaseField( columnName ="Dwzl")
	private UUID dwzl;
@DatabaseField( columnName ="FirstMgr")
	private UUID firstmgr;
@DatabaseField( columnName ="Descirbe")
	private String descirbe;
@DatabaseField( columnName ="IsEnable")
	private boolean isenable;
@DatabaseField( columnName ="CreateUserID")
	private UUID createuserid;
@DatabaseField( columnName ="ChangeDate")
	private Date changedate;


}