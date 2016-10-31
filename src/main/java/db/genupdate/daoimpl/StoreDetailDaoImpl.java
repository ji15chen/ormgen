package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.StoreDetailDao;
import db.genupdate.schema.StoreDetail;
public class StoreDetailDaoImpl extends BaseDaoImpl<StoreDetail,String>{
public StoreDetailDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, StoreDetail.class );
		}
}
