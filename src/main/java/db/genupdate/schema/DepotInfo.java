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
import db.genupdate.daoimpl.DepotInfoDaoImpl;
@DatabaseTable(tableName = "DepotInfo", daoClass =DepotInfoDaoImpl.class)
	public class DepotInfo{
@DatabaseField( columnName ="DeptID",canBeNull = false )
	private UUID deptid;
@DatabaseField( columnName ="RoomID",id=true ,canBeNull = false )
	private UUID roomid;
@DatabaseField( columnName ="RoomName")
	private String roomname;
@DatabaseField( columnName ="RoomType")
	private UUID roomtype;
@DatabaseField( columnName ="DepotAdd")
	private String depotadd;
@DatabaseField( columnName ="DepotArear")
	private BigDecimal depotarear;
@DatabaseField( columnName ="Lever")
	private UUID lever;
@DatabaseField( columnName ="Describe")
	private String describe;
@DatabaseField( columnName ="AirconCount")
	private int airconcount;
@DatabaseField( columnName ="DehCount")
	private int dehcount;


}