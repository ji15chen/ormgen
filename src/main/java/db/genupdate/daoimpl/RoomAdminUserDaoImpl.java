package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.RoomAdminUserDao;
import db.genupdate.schema.RoomAdminUser;
public class RoomAdminUserDaoImpl extends BaseDaoImpl<RoomAdminUser,java.util.UUID>{
public RoomAdminUserDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, RoomAdminUser.class );
		}
}
