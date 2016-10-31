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
import db.genupdate.daoimpl.SysParameterDaoImpl;
@DatabaseTable(tableName = "SysParameter", daoClass =SysParameterDaoImpl.class)
	public class SysParameter{
@DatabaseField( columnName ="ParaID",id=true ,canBeNull = false )
	private UUID paraid;
@DatabaseField( columnName ="ParentID")
	private UUID parentid;
@DatabaseField( columnName ="ParaName")
	private String paraname;
@DatabaseField( columnName ="ParaSort")
	private int parasort;


}