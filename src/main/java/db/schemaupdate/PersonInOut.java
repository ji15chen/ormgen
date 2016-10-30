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
@DatabaseTable(tableName = "PersonInOut")
	public class PersonInOut{
@DatabaseField( columnName ="PIOID",id = true ,canBeNull = false )
	private String pioid;
@DatabaseField( columnName ="RoomID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="DepotInfo_RoomID")
	private DepotInfo roomid;
@DatabaseField( columnName ="DeptID")
	private String deptid;
@DatabaseField( columnName ="PersonID")
	private String personid;
@DatabaseField( columnName ="InTime")
	private Date intime;
@DatabaseField( columnName ="OutTime")
	private Date outtime;
@DatabaseField( columnName ="ReasonID")
	private String reasonid;
@DatabaseField( columnName ="Approver")
	private String approver;
@DatabaseField( columnName ="EnterType1")
	private String entertype1;
@DatabaseField( columnName ="EnterType2")
	private String entertype2;
@DatabaseField( columnName ="Remark")
	private String remark;


}