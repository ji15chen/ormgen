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
import db.genupdate.daoimpl.SysLogDaoImpl;
@DatabaseTable(tableName = "SysLog", daoClass =SysLogDaoImpl.class)
	public class SysLog{
@DatabaseField( columnName ="LogID",id=true ,canBeNull = false )
	private UUID logid;
@DatabaseField( columnName ="UserID")
	private UUID userid;
@DatabaseField( columnName ="ModelID")
	private UUID modelid;
@DatabaseField( columnName ="OperateCont")
	private String operatecont;
@DatabaseField( columnName ="ImportClass")
	private UUID importclass;
@DatabaseField( columnName ="OperateDate")
	private Date operatedate;
@DatabaseField( columnName ="OperateType")
	private UUID operatetype;


}