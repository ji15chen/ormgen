package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.DepotInfoDao;
import db.genupdate.schema.DepotInfo;
public class DepotInfoDaoImpl extends BaseDaoImpl<DepotInfo,String>{
public DepotInfoDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, DepotInfo.class );
		}
}
