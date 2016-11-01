package db.genupdate.daoimpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.BaseDaoImpl;
import java.sql.SQLException;
import com.j256.ormlite.support.ConnectionSource;
import db.genupdate.dao.CheckMntcDetailDao;
import db.genupdate.schema.CheckMntcDetail;
public class CheckMntcDetailDaoImpl extends BaseDaoImpl<CheckMntcDetail,java.util.UUID>{
public CheckMntcDetailDaoImpl (ConnectionSource connectionSource) throws SQLException {
			super(connectionSource, CheckMntcDetail.class );
		}
}
