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
import db.genupdate.daoimpl.StoreDetailDaoImpl;
@DatabaseTable(tableName = "StoreDetail", daoClass =StoreDetailDaoImpl.class)
	public class StoreDetail{
@DatabaseField( columnName ="StoreID",id=true ,canBeNull = false )
	private UUID storeid;
@DatabaseField( columnName ="StorePID")
	private UUID storepid;
@DatabaseField( columnName ="StoreCode")
	private String storecode;
@DatabaseField( columnName ="DeptID",canBeNull = false )
	private UUID deptid;
@DatabaseField( columnName ="RFID")
	private String rfid;
@DatabaseField( columnName ="RoomID")
	private UUID roomid;
@DatabaseField( columnName ="FactoryID",canBeNull = false )
	private UUID factoryid;
@DatabaseField( columnName ="PkTypeID",canBeNull = false )
	private UUID pktypeid;
@DatabaseField( columnName ="QuKeyID",canBeNull = false )
	private UUID qukeyid;
@DatabaseField( columnName ="Total")
	private BigDecimal total;
@DatabaseField( columnName ="Price")
	private BigDecimal price;
@DatabaseField( columnName ="UseState")
	private UUID usestate;
@DatabaseField( columnName ="PersonLiableID")
	private UUID personliableid;
@DatabaseField( columnName ="InDepot")
	private UUID indepot;
@DatabaseField( columnName ="ProduceDate",canBeNull = false )
	private Date producedate;
@DatabaseField( columnName ="PurchaseDate")
	private Date purchasedate;
@DatabaseField( columnName ="UseDate")
	private Date usedate;
@DatabaseField( columnName ="AddType")
	private String addtype;
@DatabaseField( columnName ="OtherDate")
	private Date otherdate;


}