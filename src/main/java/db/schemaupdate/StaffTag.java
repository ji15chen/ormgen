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
@DatabaseTable(tableName = "StaffTag")
	public class StaffTag{
@DatabaseField( columnName ="PersonID",canBeNull = false )
	private String personid;
@DatabaseField( columnName ="TagID")
	private String tagid;
@DatabaseField( columnName ="CardPass")
	private String cardpass;


}