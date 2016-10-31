package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.PersonInfoDao;
import db.genupdate.schema.PersonInfo;
public class PersonInfoDaoImpl extends BaseDaoImpl<PersonInfo,String>{
public PersonInfoDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, PersonInfo.class );
		}
}
