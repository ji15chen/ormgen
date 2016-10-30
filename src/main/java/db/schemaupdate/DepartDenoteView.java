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
@DatabaseTable(tableName = "DepartDenoteView")
	public class DepartDenoteView{
@DatabaseField( columnName ="PointID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="Department_DeptID")
	private Department pointid;
@DatabaseField( columnName ="PointID",id = true ,canBeNull = false )
	private String pointid;
@DatabaseField( columnName ="PointName")
	private String pointname;
@DatabaseField( columnName ="PointType")
	private int pointtype;
@DatabaseField( columnName ="PointImage")
	private String pointimage;
@DatabaseField( columnName ="Longitude")
	private BigDecimal longitude;
@DatabaseField( columnName ="Latitude")
	private BigDecimal latitude;
@DatabaseField( columnName ="PointZoom")
	private int pointzoom;
@DatabaseField( columnName ="Descn")
	private String descn;
@DatabaseField( columnName ="DepartName")
	private String departname;
@DatabaseField( columnName ="DepartCode")
	private String departcode;


}