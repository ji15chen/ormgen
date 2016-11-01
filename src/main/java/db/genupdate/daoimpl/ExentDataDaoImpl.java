package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.ExentDataDao;
import db.genupdate.schema.ExentData;
public class ExentDataDaoImpl extends BaseDaoImpl<ExentData,java.util.UUID>{
public ExentDataDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, ExentData.class );
		}
}
