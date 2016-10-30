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
@DatabaseTable(tableName = "ScanStoreDetail")
	public class ScanStoreDetail{
@DatabaseField( columnName ="DetailID",id = true ,canBeNull = false )
	private String detailid;
@DatabaseField( columnName ="ScanID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="ScanStore_SCanID")
	private ScanStore scanid;
@DatabaseField( columnName ="StoreID",canBeNull = false )
	private String storeid;
@DatabaseField( columnName ="PkTypeID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="EquipType_PkTypeID")
	private EquipType pktypeid;
@DatabaseField( columnName ="AlterType")
	private String altertype;
@DatabaseField( columnName ="AlterCount")
	private BigDecimal altercount;
@DatabaseField( columnName ="Memo")
	private String memo;


}