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
import db.genupdate.daoimpl.StoreManDaoImpl;
@DatabaseTable(tableName = "StoreMan", daoClass =StoreManDaoImpl.class)
	public class StoreMan{
@DatabaseField( columnName ="RoomID",canBeNull = false )
	private UUID roomid;
@DatabaseField( columnName ="PersonID",canBeNull = false )
	private UUID personid;
@DatabaseField( columnName ="AdminID",id=true ,canBeNull = false )
	private UUID adminid;


}