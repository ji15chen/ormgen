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
@DatabaseTable(tableName = "SysParameter")
	public class SysParameter{
@DatabaseField( columnName ="ParaID",id = true ,canBeNull = false )
	private String paraid;
@DatabaseField( columnName ="ParentID")
	private String parentid;
@DatabaseField( columnName ="ParaName")
	private String paraname;
@DatabaseField( columnName ="ParaSort")
	private int parasort;


}