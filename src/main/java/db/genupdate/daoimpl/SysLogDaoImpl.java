package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.SysLogDao;
import db.genupdate.schema.SysLog;
public class SysLogDaoImpl extends BaseDaoImpl<SysLog,java.util.UUID>{
public SysLogDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, SysLog.class );
		}
}
