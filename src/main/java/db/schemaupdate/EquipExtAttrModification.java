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
@DatabaseTable(tableName = "EquipExtAttrModification")
	public class EquipExtAttrModification{
@DatabaseField( columnName ="StoreExModifyPK",id = true ,canBeNull = false )
	private String storeexmodifypk;
@DatabaseField( columnName ="StorePK")
	private String storepk;
@DatabaseField( columnName ="ExtAttrPK"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="ExentData_ExtendID")
	private ExentData extattrpk;
@DatabaseField( columnName ="ValueBefore")
	private String valuebefore;
@DatabaseField( columnName ="ValueAfter")
	private String valueafter;
@DatabaseField( columnName ="ModifyTime")
	private Date modifytime;
@DatabaseField( columnName ="Modifier")
	private String modifier;


}