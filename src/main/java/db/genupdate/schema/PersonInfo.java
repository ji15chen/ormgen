package db.genupdate.schema;

	/**
	*	*@author jichen
	*/

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.io.Serializable;
import java.util.UUID;
import java.math.BigDecimal;
import java.util.Date;
import db.genupdate.daoimpl.PersonInfoDaoImpl;
@DatabaseTable(tableName = "PersonInfo", daoClass =PersonInfoDaoImpl.class)
	public class PersonInfo{
@DatabaseField( columnName ="PersonID",id=true ,canBeNull = false )
	private UUID personid;
@DatabaseField( columnName ="PersonCode")
	private String personcode;
@DatabaseField( columnName ="PersonName")
	private String personname;
@DatabaseField( columnName ="Sex")
	private UUID sex;
@DatabaseField( columnName ="PersonType")
	private UUID persontype;
@DatabaseField( columnName ="JopID")
	private UUID jopid;
@DatabaseField( columnName ="Status")
	private UUID status;
@DatabaseField( columnName ="MobilPhone")
	private String mobilphone;
@DatabaseField( columnName ="Phone")
	private String phone;
@DatabaseField( columnName ="EMail")
	private String email;
@DatabaseField( columnName ="QQ")
	private String qq;
@DatabaseField( columnName ="Birthday")
	private Date birthday;
@DatabaseField( columnName ="Describe")
	private String describe;
@DatabaseField( columnName ="IsDelete")
	private boolean isdelete;
@DatabaseField( columnName ="EnlistTime")
	private Date enlisttime;
@DatabaseField( columnName ="Fax")
	private String fax;
@DatabaseField( columnName ="DeptID")
	private UUID deptid;
@DatabaseField( columnName ="Work")
	private String work;
@DatabaseField( columnName ="HeadImage", dataType = DataType.BYTE_ARRAY)
	private byte[] headimage;


}