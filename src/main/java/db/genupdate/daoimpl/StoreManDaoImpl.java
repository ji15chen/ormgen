package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.StoreManDao;
import db.genupdate.schema.StoreMan;
public class StoreManDaoImpl extends BaseDaoImpl<StoreMan,String>{
public StoreManDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, StoreMan.class );
		}
}
