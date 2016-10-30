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
@DatabaseTable(tableName = "PersonInfo")
	public class PersonInfo{
@DatabaseField( columnName ="PersonID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="FactoryInfo_FactoryID")
	private FactoryInfo personid;
@DatabaseField( columnName ="PersonID",id = true ,canBeNull = false )
	private String personid;
@DatabaseField( columnName ="PersonCode")
	private String personcode;
@DatabaseField( columnName ="PersonName")
	private String personname;
@DatabaseField( columnName ="Sex")
	private String sex;
@DatabaseField( columnName ="PersonType")
	private String persontype;
@DatabaseField( columnName ="JopID")
	private String jopid;
@DatabaseField( columnName ="Status")
	private String status;
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
	private int isdelete;
@DatabaseField( columnName ="CardID")
	private Date cardid;
@DatabaseField( columnName ="Fax")
	private String fax;
@DatabaseField( columnName ="AssociatePK")
	private String associatepk;
@DatabaseField( columnName ="JobInCharge")
	private String jobincharge;
@DatabaseField( columnName ="Profile")
	private String profile;


}