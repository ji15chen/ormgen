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
@DatabaseTable(tableName = "DepotInfo")
	public class DepotInfo{
@DatabaseField( columnName ="DeptID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="Department_DeptID")
	private Department deptid;
@DatabaseField( columnName ="RoomID",id = true ,canBeNull = false )
	private String roomid;
@DatabaseField( columnName ="RoomName")
	private String roomname;
@DatabaseField( columnName ="RoomType")
	private String roomtype;
@DatabaseField( columnName ="DepotAdd")
	private String depotadd;
@DatabaseField( columnName ="DepotArear")
	private BigDecimal depotarear;
@DatabaseField( columnName ="Lever")
	private String lever;
@DatabaseField( columnName ="Describe")
	private String describe;
@DatabaseField( columnName ="ConditionerCount")
	private int conditionercount;
@DatabaseField( columnName ="FogCleanerCount")
	private int fogcleanercount;


}