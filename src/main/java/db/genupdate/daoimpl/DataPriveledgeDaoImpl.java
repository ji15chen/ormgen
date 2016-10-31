package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.DataPriveledgeDao;
import db.genupdate.schema.DataPriveledge;
public class DataPriveledgeDaoImpl extends BaseDaoImpl<DataPriveledge,String>{
public DataPriveledgeDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, DataPriveledge.class );
		}
}
