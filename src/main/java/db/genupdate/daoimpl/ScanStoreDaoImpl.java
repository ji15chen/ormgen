package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.ScanStoreDao;
import db.genupdate.schema.ScanStore;
public class ScanStoreDaoImpl extends BaseDaoImpl<ScanStore,java.util.UUID>{
public ScanStoreDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, ScanStore.class );
		}
}
