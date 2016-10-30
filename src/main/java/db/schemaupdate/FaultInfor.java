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
@DatabaseTable(tableName = "FaultInfor")
	public class FaultInfor{
@DatabaseField( columnName ="FaltReportPK")
	private String faltreportpk;
@DatabaseField( columnName ="StorePK"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="StoreDetail_StoreID")
	private StoreDetail storepk;
@DatabaseField( columnName ="FaultTitle")
	private String faulttitle;
@DatabaseField( columnName ="FaultType")
	private String faulttype;
@DatabaseField( columnName ="FaultKeyword")
	private String faultkeyword;
@DatabaseField( columnName ="FaultDescription")
	private String faultdescription;
@DatabaseField( columnName ="FaultReportDeptPK")
	private String faultreportdeptpk;
@DatabaseField( columnName ="FaultReportPersonPK")
	private String faultreportpersonpk;
@DatabaseField( columnName ="FaultReportTime")
	private Date faultreporttime;
@DatabaseField( columnName ="Status")
	private int status;
@DatabaseField( columnName ="StoreCount")
	private BigDecimal storecount;


}