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
import db.genupdate.daoimpl.CheckMntcDetailDaoImpl;
@DatabaseTable(tableName = "CheckMntcDetail", daoClass =CheckMntcDetailDaoImpl.class)
	public class CheckMntcDetail{

@DatabaseField( columnName ="MtID",id=false ,canBeNull = false )
	private UUID mtid;
@DatabaseField( columnName ="StoreID",id=false ,canBeNull = false )
	private UUID storeid;
@DatabaseField( columnName ="MtLong")
	private BigDecimal mtlong;
@DatabaseField( columnName ="MtResult")
	private String mtresult;
@DatabaseField( columnName ="CheckResult")
	private String checkresult;

	@DatabaseField(id=true, useGetSet=true)
	private UUID id;

	public UUID getId() {
		return new UUID(mtid.getMostSignificantBits()+storeid.getMostSignificantBits(), mtid.getLeastSignificantBits()+storeid.getLeastSignificantBits());
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getMtid() {
		return mtid;
	}

	public void setMtid(UUID mtid) {
		this.mtid = mtid;
	}

	public UUID getStoreid() {
		return storeid;
	}

	public void setStoreid(UUID storeid) {
		this.storeid = storeid;
	}

	public BigDecimal getMtlong() {
		return mtlong;
	}

	public void setMtlong(BigDecimal mtlong) {
		this.mtlong = mtlong;
	}

	public String getMtresult() {
		return mtresult;
	}

	public void setMtresult(String mtresult) {
		this.mtresult = mtresult;
	}

	public String getCheckresult() {
		return checkresult;
	}

	public void setCheckresult(String checkresult) {
		this.checkresult = checkresult;
	}
}