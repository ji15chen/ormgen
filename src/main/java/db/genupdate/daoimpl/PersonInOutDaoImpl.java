package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.PersonInOutDao;
import db.genupdate.schema.PersonInOut;
public class PersonInOutDaoImpl extends BaseDaoImpl<PersonInOut,String>{
public PersonInOutDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, PersonInOut.class );
		}
}
