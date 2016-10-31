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
import db.genupdate.daoimpl.PersonInOutDaoImpl;
@DatabaseTable(tableName = "PersonInOut", daoClass =PersonInOutDaoImpl.class)
	public class PersonInOut{
@DatabaseField( columnName ="PIOID",id=true ,canBeNull = false )
	private UUID pioid;
@DatabaseField( columnName ="RoomID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="DepotInfo_RoomID")
	private DepotInfo roomid;
@DatabaseField( columnName ="DeptID")
	private UUID deptid;
@DatabaseField( columnName ="PersonID")
	private UUID personid;
@DatabaseField( columnName ="InTime")
	private Date intime;
@DatabaseField( columnName ="OutTime")
	private Date outtime;
@DatabaseField( columnName ="ReasonID")
	private UUID reasonid;
@DatabaseField( columnName ="Approver")
	private UUID approver;
@DatabaseField( columnName ="EnterType1")
	private String entertype1;
@DatabaseField( columnName ="EnterType2")
	private String entertype2;
@DatabaseField( columnName ="Remark")
	private String remark;


}