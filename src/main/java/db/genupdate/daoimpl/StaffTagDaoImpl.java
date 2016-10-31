package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.StaffTagDao;
import db.genupdate.schema.StaffTag;
public class StaffTagDaoImpl extends BaseDaoImpl<StaffTag,String>{
public StaffTagDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, StaffTag.class );
		}
}
