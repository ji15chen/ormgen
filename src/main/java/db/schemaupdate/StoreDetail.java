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
@DatabaseTable(tableName = "StoreDetail")
	public class StoreDetail{
@DatabaseField( columnName ="StoreID",id = true ,canBeNull = false )
	private String storeid;
@DatabaseField( columnName ="StorePID")
	private String storepid;
@DatabaseField( columnName ="StoreCode")
	private String storecode;
@DatabaseField( columnName ="DeptID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="Department_DeptID")
	private Department deptid;
@DatabaseField( columnName ="DeptID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="ScanStoreDetail_DetailID")
	private ScanStoreDetail deptid;
@DatabaseField( columnName ="RFID")
	private String rfid;
@DatabaseField( columnName ="RoomID")
	private String roomid;
@DatabaseField( columnName ="FactoryID",canBeNull = false )
	private String factoryid;
@DatabaseField( columnName ="PkTypeID",canBeNull = false )
	private String pktypeid;
@DatabaseField( columnName ="QuKeyID",canBeNull = false )
	private String qukeyid;
@DatabaseField( columnName ="Total")
	private BigDecimal total;
@DatabaseField( columnName ="Price")
	private BigDecimal price;
@DatabaseField( columnName ="UseState")
	private String usestate;
@DatabaseField( columnName ="PersonLiableID")
	private String personliableid;
@DatabaseField( columnName ="InDepot")
	private String indepot;
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