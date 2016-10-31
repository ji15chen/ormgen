package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.SysUserDao;
import db.genupdate.schema.SysUser;
public class SysUserDaoImpl extends BaseDaoImpl<SysUser,String>{
public SysUserDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, SysUser.class );
		}
}
