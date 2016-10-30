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
@DatabaseTable(tableName = "CheckMntcInfo")
	public class CheckMntcInfo{
@DatabaseField( columnName ="MtID",id = true ,canBeNull = false )
	private String mtid;
@DatabaseField( columnName ="DetpID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="Department_DeptID")
	private Department detpid;
@DatabaseField( columnName ="RoomID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="DepotInfo_RoomID")
	private DepotInfo roomid;
@DatabaseField( columnName ="Topic")
	private String topic;
@DatabaseField( columnName ="MtTime")
	private Date mttime;
@DatabaseField( columnName ="MtLong")
	private BigDecimal mtlong;
@DatabaseField( columnName ="MtResult")
	private String mtresult;
@DatabaseField( columnName ="CheckType")
	private String checktype;
@DatabaseField( columnName ="CheckResult")
	private String checkresult;
@DatabaseField( columnName ="WeatherID")
	private String weatherid;
@DatabaseField( columnName ="WokCount")
	private int wokcount;


}