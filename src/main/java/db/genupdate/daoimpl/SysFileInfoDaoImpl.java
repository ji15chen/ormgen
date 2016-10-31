package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.SysFileInfoDao;
import db.genupdate.schema.SysFileInfo;
public class SysFileInfoDaoImpl extends BaseDaoImpl<SysFileInfo,String>{
public SysFileInfoDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, SysFileInfo.class );
		}
}
