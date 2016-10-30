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
@DatabaseTable(tableName = "TmpHmdData")
	public class TmpHmdData{
@DatabaseField( columnName ="HytherID",id = true ,canBeNull = false )
	private String hytherid;
@DatabaseField( columnName ="DeptID")
	private String deptid;
@DatabaseField( columnName ="RoomID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="DepotInfo_RoomID")
	private DepotInfo roomid;
@DatabaseField( columnName ="RecTime")
	private Date rectime;
@DatabaseField( columnName ="Temperature")
	private BigDecimal temperature;
@DatabaseField( columnName ="Humidity")
	private BigDecimal humidity;
@DatabaseField( columnName ="Remark")
	private String remark;


}