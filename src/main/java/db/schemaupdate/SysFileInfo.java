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
@DatabaseTable(tableName = "SysFileInfo")
	public class SysFileInfo{
@DatabaseField( columnName ="FileID",id = true ,canBeNull = false )
	private String fileid;
@DatabaseField( columnName ="ObjectID")
	private String objectid;
@DatabaseField( columnName ="DeptID")
	private String deptid;
@DatabaseField( columnName ="FileName")
	private String filename;
@DatabaseField( columnName ="Title")
	private String title;
@DatabaseField( columnName ="Extension")
	private String extension;
@DatabaseField( columnName ="FileSize")
	private String filesize;
@DatabaseField( columnName ="FileData")
	private String filedata;
@DatabaseField( columnName ="CategoryID")
	private int categoryid;
@DatabaseField( columnName ="Descn")
	private String descn;
@DatabaseField( columnName ="CreateDate")
	private Date createdate;
@DatabaseField( columnName ="UserID")
	private String userid;


}