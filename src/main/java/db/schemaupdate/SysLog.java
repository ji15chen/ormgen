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
@DatabaseTable(tableName = "SysLog")
	public class SysLog{
@DatabaseField( columnName ="LogID",id = true ,canBeNull = false )
	private String logid;
@DatabaseField( columnName ="UserID"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="SysUser_UserID")
	private SysUser userid;
@DatabaseField( columnName ="ModelID")
	private String modelid;
@DatabaseField( columnName ="OperateCont")
	private String operatecont;
@DatabaseField( columnName ="ImportClass")
	private String importclass;
@DatabaseField( columnName ="OperateDate")
	private Date operatedate;
@DatabaseField( columnName ="OperateType")
	private String operatetype;


}