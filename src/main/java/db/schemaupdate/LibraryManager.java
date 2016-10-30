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
@DatabaseTable(tableName = "LibraryManager")
	public class LibraryManager{
@DatabaseField( columnName ="RoomID",canBeNull = false )
	private String roomid;
@DatabaseField( columnName ="PersonID",canBeNull = false )
	private String personid;
@DatabaseField( columnName ="LibraryManPK",id = true ,canBeNull = false )
	private String librarymanpk;


}