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
import db.genupdate.daoimpl.StaffTagDaoImpl;
@DatabaseTable(tableName = "StaffTag", daoClass =StaffTagDaoImpl.class)
	public class StaffTag{
@DatabaseField( columnName ="PersonID",canBeNull = false )
	private UUID personid;
@DatabaseField( columnName ="CardID")
	private String cardid;
@DatabaseField( columnName ="CardPass")
	private String cardpass;


}