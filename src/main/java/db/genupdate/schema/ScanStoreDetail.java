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
import db.genupdate.daoimpl.ScanStoreDetailDaoImpl;
@DatabaseTable(tableName = "ScanStoreDetail", daoClass =ScanStoreDetailDaoImpl.class)
	public class ScanStoreDetail{
@DatabaseField( columnName ="DetailID",id=true ,canBeNull = false )
	private UUID detailid;
@DatabaseField( columnName ="ScanID",canBeNull = false )
	private UUID scanid;
@DatabaseField( columnName ="StoreID",canBeNull = false )
	private UUID storeid;
@DatabaseField( columnName ="ScanType")
	private UUID scantype;
@DatabaseField( columnName ="Descn")
	private String descn;


}