package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.UserDataPermissionDao;
import db.genupdate.schema.UserDataPermission;
public class UserDataPermissionDaoImpl extends BaseDaoImpl<UserDataPermission,java.util.UUID>{
public UserDataPermissionDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, UserDataPermission.class );
		}
}
