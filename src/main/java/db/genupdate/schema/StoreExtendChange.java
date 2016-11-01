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
import db.genupdate.daoimpl.StoreExtendChangeDaoImpl;
@DatabaseTable(tableName = "StoreExtendChange", daoClass =StoreExtendChangeDaoImpl.class)
	public class StoreExtendChange{
@DatabaseField( columnName ="ChangeID",id=true ,canBeNull = false )
	private UUID changeid;
@DatabaseField( columnName ="StoreID")
	private UUID storeid;
@DatabaseField( columnName ="ExtendID")
	private UUID extendid;
@DatabaseField( columnName ="ChangeOld")
	private String changeold;
@DatabaseField( columnName ="ChangeNew")
	private String changenew;
@DatabaseField( columnName ="ChangeDate")
	private Date changedate;
@DatabaseField( columnName ="ChangeUserID")
	private UUID changeuserid;


}