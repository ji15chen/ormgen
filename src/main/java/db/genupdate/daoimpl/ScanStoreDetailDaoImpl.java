package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.ScanStoreDetailDao;
import db.genupdate.schema.ScanStoreDetail;
public class ScanStoreDetailDaoImpl extends BaseDaoImpl<ScanStoreDetail,String>{
public ScanStoreDetailDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, ScanStoreDetail.class );
		}
}
