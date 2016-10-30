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
@DatabaseTable(tableName = "Department")
	public class Department{
@DatabaseField( columnName ="DeptID",id = true ,canBeNull = false )
	private String deptid;
@DatabaseField( columnName ="SupDeptID")
	private String supdeptid;
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
	private String typecode;
@DatabaseField( columnName ="Dwye")
	private int dwye;
@DatabaseField( columnName ="DeptLevel")
	private String deptlevel;
@DatabaseField( columnName ="Dwzl"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="SysParameter_ParaID")
	private SysParameter dwzl;
@DatabaseField( columnName ="FirstMgr")
	private String firstmgr;
@DatabaseField( columnName ="Descirbe")
	private String descirbe;
@DatabaseField( columnName ="IsEnable")
	private int isenable;
@DatabaseField( columnName ="CreateUser")
	private String createuser;
@DatabaseField( columnName ="UpdateTime")
	private Date updatetime;


}