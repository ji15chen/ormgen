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
import db.genupdate.daoimpl.ECFactoryDaoImpl;
@DatabaseTable(tableName = "ECFactory", daoClass =ECFactoryDaoImpl.class)
	public class ECFactory{
@DatabaseField( columnName ="RecID",id=true ,canBeNull = false )
	private UUID recid;
@DatabaseField( columnName ="FactoryID",id=true ,canBeNull = false )
	private UUID factoryid;
@DatabaseField( columnName ="PkTypeID")
	private UUID pktypeid;
@DatabaseField( columnName ="Sorting")
	private int sorting;
@DatabaseField( columnName ="Describe")
	private String describe;


}