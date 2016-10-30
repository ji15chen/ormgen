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
@DatabaseTable(tableName = "Workers")
	public class Workers{
@DatabaseField( columnName ="PIOID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="CheckMntcInfo_MtID")
	private CheckMntcInfo pioid;
@DatabaseField( columnName ="PIOID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="PersonInOut_PIOID")
	private PersonInOut pioid;
@DatabaseField( columnName ="PIOID",id = true ,canBeNull = false )
	private String pioid;
@DatabaseField( columnName ="PersonID",id = true ,canBeNull = false )
	private String personid;


}