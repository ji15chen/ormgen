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
@DatabaseTable(tableName = "EquipTypeDetail")
	public class EquipTypeDetail{
@DatabaseField( columnName ="ItemID",id = true ,canBeNull = false )
	private String itemid;
@DatabaseField( columnName ="PkTypeID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="EquipType_PkTypeID")
	private EquipType pktypeid;
@DatabaseField( columnName ="ItemName")
	private String itemname;
@DatabaseField( columnName ="ItemBody")
	private String itembody;
@DatabaseField( columnName ="ItemSort")
	private int itemsort;


}