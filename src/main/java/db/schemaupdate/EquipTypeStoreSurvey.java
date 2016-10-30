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
@DatabaseTable(tableName = "EquipTypeStoreSurvey")
	public class EquipTypeStoreSurvey{
@DatabaseField( columnName ="SurveyTaskPK",id = true ,canBeNull = false )
	private String surveytaskpk;
@DatabaseField( columnName ="EquipTypePK",id = true ,canBeNull = false )
	private String equiptypepk;


}