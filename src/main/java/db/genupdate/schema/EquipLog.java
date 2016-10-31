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
import db.genupdate.daoimpl.EquipLogDaoImpl;
@DatabaseTable(tableName = "EquipLog", daoClass =EquipLogDaoImpl.class)
	public class EquipLog{
@DatabaseField( columnName ="LogID",id=true ,canBeNull = false )
	private UUID logid;
@DatabaseField( columnName ="SupLogID")
	private UUID suplogid;
@DatabaseField( columnName ="EquipID")
	private UUID equipid;
@DatabaseField( columnName ="PkTypeID")
	private UUID pktypeid;
@DatabaseField( columnName ="Total")
	private int total;
@DatabaseField( columnName ="QuKeyID")
	private UUID qukeyid;
@DatabaseField( columnName ="DeptID")
	private UUID deptid;
@DatabaseField( columnName ="OperationType")
	private UUID operationtype;
@DatabaseField( columnName ="OperationDate")
	private Date operationdate;


}