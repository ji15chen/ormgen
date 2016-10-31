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
import db.genupdate.daoimpl.CheckMntcDetailDaoImpl;
@DatabaseTable(tableName = "CheckMntcDetail", daoClass =CheckMntcDetailDaoImpl.class)
	public class CheckMntcDetail{
@DatabaseField( columnName ="MtID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="CheckMntcInfo_MtID")
	private CheckMntcInfo mtid;
@DatabaseField( columnName ="MtID",id=true ,canBeNull = false )
	private UUID mtid;
@DatabaseField( columnName ="StoreID",id=true ,canBeNull = false )
	private UUID storeid;
@DatabaseField( columnName ="MtLong")
	private BigDecimal mtlong;
@DatabaseField( columnName ="MtResult")
	private String mtresult;
@DatabaseField( columnName ="CheckResult")
	private String checkresult;


}