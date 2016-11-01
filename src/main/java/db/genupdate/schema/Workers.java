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
import db.genupdate.daoimpl.WorkersDaoImpl;
@DatabaseTable(tableName = "Workers", daoClass =WorkersDaoImpl.class)
	public class Workers{
@DatabaseField( columnName ="PIOID",id=true ,canBeNull = false )
	private UUID pioid;
@DatabaseField( columnName ="PersonID",id=true ,canBeNull = false )
	private UUID personid;


}