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
@DatabaseTable(tableName = "CheckMntcDetail")
	public class CheckMntcDetail{
@DatabaseField( columnName ="MtDetailID",id = true ,canBeNull = false )
	private String mtdetailid;
@DatabaseField( columnName ="MtID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="CheckMntcInfo_MtID")
	private CheckMntcInfo mtid;
@DatabaseField( columnName ="StoreID",canBeNull = false )
	private String storeid;
@DatabaseField( columnName ="MtLong")
	private BigDecimal mtlong;
@DatabaseField( columnName ="MtResult")
	private String mtresult;
@DatabaseField( columnName ="CheckResult")
	private String checkresult;


}