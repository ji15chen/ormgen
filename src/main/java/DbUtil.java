
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;


public class DbUtil {
	public Statement st ;
	
	public DbUtil(){
		
	}
	/**
	 * paraMap参数
	 * driverClassName 驱动
	 * JdbcURL  jdbc    该字符串为：  config.ini 的JdbcURL+IP地址(含端口号)+dbStr+数据库名称
	 * userName 数据库名称
	 * userpwd 数据库密码
	 * */
	public  Statement getStatement(Map<String,String> paraMap) {
		//加载数据库驱动  
		try {
			Class.forName(paraMap.get("driver"));
			Connection conn = DriverManager.getConnection(paraMap.get("jdbc"), paraMap.get("userName"), paraMap.get("userpwd"));
				if(!conn.isClosed()){
				}else{
					return null;
				}
				// statement用来执行SQL语句
				Statement statement = conn.createStatement();
				return statement;
				// 要执行的SQL语句
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}  
	}
	//读取数据库表信息
	public List<String> getTableNames(Map<String,String> dbInfoMap,String dbName){
		List<String> tableList = new ArrayList<String>(); //存储表名
		try {
		st = this.getStatement(dbInfoMap);
		if(st == null){
			return null;
		}
		//替换数据库名字占位符
		String selTableSql = dbInfoMap.get("showTable").toString().replace("%", dbName);
		ResultSet tabRs = st.executeQuery(selTableSql);
			//保存表名
			while(tabRs.next()){
				tableList.add(tabRs.getString(1));
			}
		}catch (SQLException e) {
				e.printStackTrace();
			return null;
		}
		return tableList;
	}
	//读取表字段信息
	public List<Map<String,String>> getColumnNames(Map<String,String> dbInfoMap,String tabName){
		List<Map<String,String>> colList = new ArrayList<Map<String,String>>(); //存储字段信息
		try {
		st = this.getStatement(dbInfoMap);
		if(st == null){
			return null;
		}
		//替换表名占位符
		String selColumnSql = "SELECT  c.TABLE_SCHEMA ,\n" +
				"        c.TABLE_NAME ,\n" +
				"        c.COLUMN_NAME ,\n" +
				"        CASE WHEN ( ( CHARINDEX('char', c.DATA_TYPE) > 0\n" +
				"                      OR CHARINDEX('binary', c.DATA_TYPE) > 0\n" +
				"                    )\n" +
				"                    AND c.CHARACTER_MAXIMUM_LENGTH <> -1\n" +
				"                  )\n" +
				"             THEN c.DATA_TYPE + '('\n" +
				"                  + CAST(c.CHARACTER_MAXIMUM_LENGTH AS VARCHAR(4)) + ')'\n" +
				"             WHEN ( ( CHARINDEX('CHAR', c.DATA_TYPE) > 0\n" +
				"                      OR CHARINDEX('binary', c.DATA_TYPE) > 0\n" +
				"                    )\n" +
				"                    AND c.CHARACTER_MAXIMUM_LENGTH = -1\n" +
				"                  ) THEN c.DATA_TYPE + '(max)'\n" +
				"             WHEN ( CHARINDEX('numeric', c.DATA_TYPE) > 0 )\n" +
				"             THEN c.DATA_TYPE + '(' + CAST(c.NUMERIC_PRECISION AS VARCHAR(4))\n" +
				"                  + ',' + CAST(c.NUMERIC_SCALE AS VARCHAR(4)) + ')'\n" +
				"             ELSE c.DATA_TYPE\n" +
				"        END AS DATA_TYPE ,\n" +
				"        c.COLUMN_DEFAULT ,\n" +
				"        c.IS_NULLABLE ,\n" +
				"        c.COLUMN_DEFAULT ,\n" +
				"        CASE WHEN tc.CONSTRAINT_TYPE = 'PRIMARY KEY' THEN 'YES'\n" +
				"             ELSE 'NO'\n" +
				"        END AS IS_PRIMARY_KEY ,\n" +
				"        CASE WHEN tc.CONSTRAINT_TYPE = 'FOREIGN KEY' THEN 'YES'\n" +
				"             ELSE 'NO'\n" +
				"        END AS IS_FOREIGN_KEY,\n" +
				"        fkcu.COLUMN_NAME AS FOREIGN_KEY,\n" +
				"        fkcu.TABLE_NAME AS FOREIGN_TABLE\n" +
				"FROM    [INFORMATION_SCHEMA].[COLUMNS] c\n" +
				"        LEFT JOIN [INFORMATION_SCHEMA].[KEY_COLUMN_USAGE] kcu ON kcu.TABLE_SCHEMA = c.TABLE_SCHEMA\n" +
				"                                                              AND kcu.TABLE_NAME = c.TABLE_NAME\n" +
				"                                                              AND kcu.COLUMN_NAME = c.COLUMN_NAME\n" +
				"        LEFT JOIN [INFORMATION_SCHEMA].[TABLE_CONSTRAINTS] tc ON tc.CONSTRAINT_SCHEMA = kcu.CONSTRAINT_SCHEMA\n" +
				"                                                              AND tc.CONSTRAINT_NAME = kcu.CONSTRAINT_NAME\n" +
				"        LEFT JOIN [INFORMATION_SCHEMA].[REFERENTIAL_CONSTRAINTS] fc ON kcu.CONSTRAINT_SCHEMA = fc.CONSTRAINT_SCHEMA\n" +
				"                                                              AND kcu.CONSTRAINT_NAME = fc.CONSTRAINT_NAME\n" +
				"        LEFT JOIN [INFORMATION_SCHEMA].[KEY_COLUMN_USAGE] fkcu ON fkcu.CONSTRAINT_SCHEMA = fc.UNIQUE_CONSTRAINT_SCHEMA\n" +
				"                                                              AND fkcu.CONSTRAINT_NAME = fc.UNIQUE_CONSTRAINT_NAME\n" +
				"WHERE   c.TABLE_NAME = '"+tabName+"'\n" +
				"ORDER BY c.ORDINAL_POSITION\n";
		ResultSet columnRs = st.executeQuery(selColumnSql);
			while(columnRs.next()){
				Map<String,String> colMap =  new HashMap<String,String>();
				colMap.put("filed", columnRs.getString("COLUMN_NAME"));
				colMap.put("type", columnRs.getString("DATA_TYPE"));
				colMap.put("default", columnRs.getString("COLUMN_DEFAULT"));
				colMap.put("nullable", columnRs.getString("IS_NULLABLE"));
				colMap.put("primary", columnRs.getString("IS_PRIMARY_KEY"));
				colMap.put("foreign", columnRs.getString("IS_FOREIGN_KEY"));
				colMap.put("foreign_table", columnRs.getString("FOREIGN_TABLE"));
				colMap.put("foreign_field", columnRs.getString("FOREIGN_KEY"));
				colList.add(colMap);
			}
		}catch (SQLException e) {
				// TODO Auto-generated catch block
			return null;
		}
		return colList;
	}
	
	// 读取配置
	public Map<String,  HashMap<String, String>> getDbConfigMap() {
	    Map<String, HashMap<String, String>> sectionsMap = new HashMap<String, HashMap<String, String>>();  
	    HashMap<String, String> itemsMap = new HashMap<String, String>();  
	    String currentSection = "";
	    BufferedReader reader = null;
		try {
			//读取当前文件路径下的ini文件
			System.out.println(this.getClass().getResourceAsStream("config.ini"));
			 InputStream configStream = this.getClass().getResourceAsStream("config.ini");
			 reader = new BufferedReader(new InputStreamReader(configStream, "gbk"));


			String line = null;
			while ((line = reader.readLine()) != null) {
				 line = line.trim();  
	                if ("".equals(line))  
	                    continue;  
	                if (line.startsWith("[") && line.endsWith("]")) { 
	                	 itemsMap = new HashMap<String, String>();
	                	 currentSection = line.substring(1, line.length() - 1);  
	                     sectionsMap.put(currentSection, itemsMap);  
	                     currentSection = "";  
	                }else{
	                	   int index = line.indexOf("=");  
	                       if (index != -1) {  
	                           String key = line.substring(0, index);  
	                           String value = line.substring(index + 1, line.length());  
	                           itemsMap.put(key, value.trim());  
	                       }  
	                }
			}
			 reader.close();  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {  
            if (reader != null) {  
                try {  
                    reader.close();  
                } catch (IOException e1) {  
                    e1.printStackTrace();  
                }  
            }
             return sectionsMap;
            }
	}
}
