package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.CpntTypesDao;
import db.genupdate.schema.CpntTypes;
public class CpntTypesDaoImpl extends BaseDaoImpl<CpntTypes,java.util.UUID>{
public CpntTypesDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, CpntTypes.class );
		}
}
