package db.genupdate.schema;

	/**
	*	*@author jichen
	*/

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.io.Serializable;
import java.util.UUID;
import java.math.BigDecimal;
import java.util.Date;
import db.genupdate.daoimpl.SysFileInfoDaoImpl;
@DatabaseTable(tableName = "SysFileInfo", daoClass =SysFileInfoDaoImpl.class)
	public class SysFileInfo{
@DatabaseField( columnName ="FileID",id=true ,canBeNull = false )
	private UUID fileid;
@DatabaseField( columnName ="ObjectID")
	private UUID objectid;
@DatabaseField( columnName ="DeptID")
	private UUID deptid;
@DatabaseField( columnName ="FileName")
	private String filename;
@DatabaseField( columnName ="Title")
	private String title;
@DatabaseField( columnName ="Extension")
	private String extension;
@DatabaseField( columnName ="FileSize")
	private String filesize;
@DatabaseField( columnName ="FileData", dataType = DataType.BYTE_ARRAY)
	private byte[] filedata;
@DatabaseField( columnName ="CategoryID")
	private int categoryid;
@DatabaseField( columnName ="Descn")
	private String descn;
@DatabaseField( columnName ="CreateDate")
	private Date createdate;
@DatabaseField( columnName ="UserID")
	private UUID userid;


}