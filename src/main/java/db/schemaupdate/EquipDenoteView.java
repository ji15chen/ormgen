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
@DatabaseTable(tableName = "EquipDenoteView")
	public class EquipDenoteView{
@DatabaseField( columnName ="EquipStoreDenotePK",id = true ,canBeNull = false )
	private String equipstoredenotepk;
@DatabaseField( columnName ="PointID",canBeNull = false /*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="M_Point3_PointID")
	private M_Point3 pointid;
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
@DatabaseField( columnName ="DeptName")
	private String deptname;
@DatabaseField( columnName ="DeptCode")
	private String deptcode;
@DatabaseField( columnName ="EquipCode")
	private String equipcode;
@DatabaseField( columnName ="EquipType")
	private String equiptype;
@DatabaseField( columnName ="Count")
	private BigDecimal count;
@DatabaseField( columnName ="Unit")
	private String unit;
@DatabaseField( columnName ="ProduceDate")
	private Date producedate;
@DatabaseField( columnName ="MaintainTime")
	private Date maintaintime;
@DatabaseField( columnName ="Price")
	private BigDecimal price;
@DatabaseField( columnName ="StoreStatus")
	private String storestatus;
@DatabaseField( columnName ="QuanlityLevel")
	private String quanlitylevel;
@DatabaseField( columnName ="DeptPK"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="DepartDenoteView_PointID")
	private DepartDenoteView deptpk;
@DatabaseField( columnName ="DeptPK"/*//TODO: properly handle foreign key*/,foreign = true ,foreignColumnName ="StoreDetail_StoreID")
	private StoreDetail deptpk;


}