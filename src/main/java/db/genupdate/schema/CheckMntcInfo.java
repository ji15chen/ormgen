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
import db.genupdate.daoimpl.CheckMntcInfoDaoImpl;
@DatabaseTable(tableName = "CheckMntcInfo", daoClass =CheckMntcInfoDaoImpl.class)
	public class CheckMntcInfo{
@DatabaseField( columnName ="MtID",id=true ,canBeNull = false )
	private UUID mtid;
@DatabaseField( columnName ="DetpID")
	private UUID detpid;
@DatabaseField( columnName ="RoomID")
	private UUID roomid;
@DatabaseField( columnName ="Topic")
	private String topic;
@DatabaseField( columnName ="MtTime")
	private Date mttime;
@DatabaseField( columnName ="MtLong")
	private BigDecimal mtlong;
@DatabaseField( columnName ="MtResult")
	private String mtresult;
@DatabaseField( columnName ="CheckType")
	private UUID checktype;
@DatabaseField( columnName ="CheckResult")
	private String checkresult;
@DatabaseField( columnName ="WeatherID")
	private UUID weatherid;
@DatabaseField( columnName ="WokCount")
	private int wokcount;


}