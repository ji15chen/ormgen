package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.SysRoleDao;
import db.genupdate.schema.SysRole;
public class SysRoleDaoImpl extends BaseDaoImpl<SysRole,String>{
public SysRoleDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, SysRole.class );
		}
}
