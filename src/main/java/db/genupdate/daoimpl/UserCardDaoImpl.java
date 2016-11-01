package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.UserCardDao;
import db.genupdate.schema.UserCard;
public class UserCardDaoImpl extends BaseDaoImpl<UserCard,java.util.UUID>{
public UserCardDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, UserCard.class );
		}
}
