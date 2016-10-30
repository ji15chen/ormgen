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
@DatabaseTable(tableName = "CpntTypes")
	public class CpntTypes{
@DatabaseField( columnName ="CpntID",id = true ,canBeNull = false )
	private String cpntid;
@DatabaseField( columnName ="CpntName")
	private String cpntname;
@DatabaseField( columnName ="CpntType")
	private int cpnttype;
@DatabaseField( columnName ="CpntUnit")
	private String cpntunit;
@DatabaseField( columnName ="CpntYear")
	private BigDecimal cpntyear;
@DatabaseField( columnName ="CpntFunc")
	private String cpntfunc;
@DatabaseField( columnName ="IsPublic")
	private int ispublic;
@DatabaseField( columnName ="CpntDesc")
	private String cpntdesc;


}