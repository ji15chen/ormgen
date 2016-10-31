package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.RoleMenuDao;
import db.genupdate.schema.RoleMenu;
public class RoleMenuDaoImpl extends BaseDaoImpl<RoleMenu,String>{
public RoleMenuDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, RoleMenu.class );
		}
}
