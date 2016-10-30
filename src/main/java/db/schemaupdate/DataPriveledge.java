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
@DatabaseTable(tableName = "DataPriveledge")
	public class DataPriveledge{
@DatabaseField( columnName ="SysUserPK")
	private String sysuserpk;
@DatabaseField( columnName ="DeptPK")
	private String deptpk;
@DatabaseField( columnName ="EquipTypePK")
	private String equiptypepk;


}