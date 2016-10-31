package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.WorkersDao;
import db.genupdate.schema.Workers;
public class WorkersDaoImpl extends BaseDaoImpl<Workers,String>{
public WorkersDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, Workers.class );
		}
}
