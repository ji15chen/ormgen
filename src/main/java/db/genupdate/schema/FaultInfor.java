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
import db.genupdate.daoimpl.FaultInforDaoImpl;
@DatabaseTable(tableName = "FaultInfor", daoClass =FaultInforDaoImpl.class)
	public class FaultInfor{
@DatabaseField( columnName ="FaultRepotPK")
	private UUID faultrepotpk;
@DatabaseField( columnName ="StorePK"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="StoreDetail_StoreID")
	private StoreDetail storepk;
@DatabaseField( columnName ="FaultTitle")
	private String faulttitle;
@DatabaseField( columnName ="FaultTypePK")
	private UUID faulttypepk;
@DatabaseField( columnName ="FaultKeyword")
	private String faultkeyword;
@DatabaseField( columnName ="FaultDesc")
	private String faultdesc;
@DatabaseField( columnName ="FaultReportDeptPK")
	private UUID faultreportdeptpk;
@DatabaseField( columnName ="FaultReportUserPK")
	private UUID faultreportuserpk;
@DatabaseField( columnName ="FaultReportTime")
	private Date faultreporttime;
@DatabaseField( columnName ="FaultReportStatus")
	private int faultreportstatus;
@DatabaseField( columnName ="FaultStoreCnt")
	private BigDecimal faultstorecnt;


}