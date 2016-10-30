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
@DatabaseTable(tableName = "SysMenu")
	public class SysMenu{
@DatabaseField( columnName ="MenuID",id = true ,canBeNull = false )
	private String menuid;
@DatabaseField( columnName ="MenuName")
	private String menuname;
@DatabaseField( columnName ="ParentID")
	private String parentid;
@DatabaseField( columnName ="OrderNum")
	private int ordernum;
@DatabaseField( columnName ="Url")
	private String url;
@DatabaseField( columnName ="Remark")
	private String remark;
@DatabaseField( columnName ="IconName")
	private String iconname;


}