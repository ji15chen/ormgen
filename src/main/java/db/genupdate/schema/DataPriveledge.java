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
import db.genupdate.daoimpl.DataPriveledgeDaoImpl;
@DatabaseTable(tableName = "DataPriveledge", daoClass =DataPriveledgeDaoImpl.class)
	public class DataPriveledge{
@DatabaseField( columnName ="UserID")
	private UUID userid;
@DatabaseField( columnName ="DeptID")
	private UUID deptid;
@DatabaseField( columnName ="PkTypeID")
	private UUID pktypeid;


}