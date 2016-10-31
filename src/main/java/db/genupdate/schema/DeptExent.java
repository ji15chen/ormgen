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
import db.genupdate.daoimpl.DeptExentDaoImpl;
@DatabaseTable(tableName = "DeptExent", daoClass =DeptExentDaoImpl.class)
	public class DeptExent{
@DatabaseField( columnName ="ExentID",id=true ,canBeNull = false )
	private UUID exentid;
@DatabaseField( columnName ="DeptID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="Department_DeptID")
	private Department deptid;
@DatabaseField( columnName ="ExentName")
	private String exentname;
@DatabaseField( columnName ="ExentValue")
	private String exentvalue;
@DatabaseField( columnName ="ExentSort")
	private int exentsort;


}