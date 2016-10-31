package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.SysMenuDao;
import db.genupdate.schema.SysMenu;
public class SysMenuDaoImpl extends BaseDaoImpl<SysMenu,String>{
public SysMenuDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, SysMenu.class );
		}
}
