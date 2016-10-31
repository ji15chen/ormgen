package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.FactoryInfoDao;
import db.genupdate.schema.FactoryInfo;
public class FactoryInfoDaoImpl extends BaseDaoImpl<FactoryInfo,String>{
public FactoryInfoDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, FactoryInfo.class );
		}
}
