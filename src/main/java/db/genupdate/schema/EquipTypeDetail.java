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
import db.genupdate.daoimpl.EquipTypeDetailDaoImpl;
@DatabaseTable(tableName = "EquipTypeDetail", daoClass =EquipTypeDetailDaoImpl.class)
	public class EquipTypeDetail{
@DatabaseField( columnName ="ItemID",id=true ,canBeNull = false )
	private UUID itemid;
@DatabaseField( columnName ="PkTypeID")
	private UUID pktypeid;
@DatabaseField( columnName ="ItemName")
	private String itemname;
@DatabaseField( columnName ="ItemBody")
	private String itembody;
@DatabaseField( columnName ="ItemSort")
	private int itemsort;


}