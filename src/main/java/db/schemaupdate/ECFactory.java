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
@DatabaseTable(tableName = "ECFactory")
	public class ECFactory{
@DatabaseField( columnName ="RecID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="CpntTypes_CpntID")
	private CpntTypes recid;
@DatabaseField( columnName ="RecID",id = true ,canBeNull = false )
	private String recid;
@DatabaseField( columnName ="FactoryID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="FactoryInfo_FactoryID")
	private FactoryInfo factoryid;
@DatabaseField( columnName ="FactoryID",id = true ,canBeNull = false )
	private String factoryid;
@DatabaseField( columnName ="PkTypeID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="EquipType_PkTypeID")
	private EquipType pktypeid;
@DatabaseField( columnName ="Sorting")
	private int sorting;
@DatabaseField( columnName ="Describe")
	private String describe;


}