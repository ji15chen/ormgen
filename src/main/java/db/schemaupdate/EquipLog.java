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
@DatabaseTable(tableName = "EquipLog")
	public class EquipLog{
@DatabaseField( columnName ="LogID")
	private String logid;
@DatabaseField( columnName ="SupLogID")
	private String suplogid;
@DatabaseField( columnName ="EquipID")
	private String equipid;
@DatabaseField( columnName ="PkTypeID")
	private String pktypeid;
@DatabaseField( columnName ="Total")
	private int total;
@DatabaseField( columnName ="QuKeyID")
	private String qukeyid;
@DatabaseField( columnName ="DeptID")
	private String deptid;
@DatabaseField( columnName ="OperationType")
	private String operationtype;
@DatabaseField( columnName ="OperationDate")
	private Date operationdate;


}