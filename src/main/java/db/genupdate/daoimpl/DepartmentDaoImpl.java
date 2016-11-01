package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.DepartmentDao;
import db.genupdate.schema.Department;
public class DepartmentDaoImpl extends BaseDaoImpl<Department,java.util.UUID>{
public DepartmentDaoImpl (ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, Department.class );
		}
}
