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
import db.genupdate.daoimpl.ExentDataDaoImpl;
@DatabaseTable(tableName = "ExentData", daoClass =ExentDataDaoImpl.class)
	public class ExentData{
@DatabaseField( columnName ="ObjectID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="CpntTypes_CpntID")
	private CpntTypes objectid;
@DatabaseField( columnName ="ObjectID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="EquipType_PkTypeID")
	private EquipType objectid;
@DatabaseField( columnName ="ObjectID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="StoreDetail_StoreID")
	private StoreDetail objectid;
@DatabaseField( columnName ="ExtendID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="ExtendType_ExtendID")
	private ExtendType extendid;
@DatabaseField( columnName ="ExtentValue")
	private String extentvalue;
@DatabaseField( columnName ="ExtentSort")
	private int extentsort;


}