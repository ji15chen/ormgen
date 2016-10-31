package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.SysKeyDao;
import db.genupdate.schema.SysKey;
public class SysKeyDaoImpl extends BaseDaoImpl<SysKey,String>{
public SysKeyDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, SysKey.class );
		}
}