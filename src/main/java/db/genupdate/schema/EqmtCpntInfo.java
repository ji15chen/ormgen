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
import db.genupdate.daoimpl.EqmtCpntInfoDaoImpl;
@DatabaseTable(tableName = "EqmtCpntInfo", daoClass =EqmtCpntInfoDaoImpl.class)
	public class EqmtCpntInfo{
@DatabaseField( columnName ="PkTypeID",id=true ,canBeNull = false )
	private UUID pktypeid;
@DatabaseField( columnName ="CpntID",id=true ,canBeNull = false )
	private UUID cpntid;
@DatabaseField( columnName ="CpntCount")
	private int cpntcount;
@DatabaseField( columnName ="IsMaster")
	private boolean ismaster;
@DatabaseField( columnName ="Sorting")
	private int sorting;


}