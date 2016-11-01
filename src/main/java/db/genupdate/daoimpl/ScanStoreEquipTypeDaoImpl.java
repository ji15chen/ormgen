package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.ScanStoreEquipTypeDao;
import db.genupdate.schema.ScanStoreEquipType;
public class ScanStoreEquipTypeDaoImpl extends BaseDaoImpl<ScanStoreEquipType,java.util.UUID>{
public ScanStoreEquipTypeDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, ScanStoreEquipType.class );
		}
}
