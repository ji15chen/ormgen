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
import db.genupdate.daoimpl.ScanStoreEquipTypeDaoImpl;
@DatabaseTable(tableName = "ScanStoreEquipType", daoClass =ScanStoreEquipTypeDaoImpl.class)
	public class ScanStoreEquipType{
@DatabaseField( columnName ="SCanID",id=false ,canBeNull = false )
	private UUID scanid;
@DatabaseField( columnName ="PkTypeID",id=false ,canBeNull = false )
	private UUID pktypeid;


	@DatabaseField(id=true, useGetSet=true)
	private UUID id;

	public UUID getId() {
		return new UUID(scanid.getMostSignificantBits()+pktypeid.getMostSignificantBits(), scanid.getLeastSignificantBits()+pktypeid.getLeastSignificantBits());
	}

	public void setId(UUID id) {
		this.id = id;
	}
}