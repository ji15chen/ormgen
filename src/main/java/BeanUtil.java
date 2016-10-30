import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class BeanUtil {
	static StringBuffer header = new StringBuffer();

	static{
		header.append("import com.j256.ormlite.field.DatabaseField;\r\n");
		header.append("import com.j256.ormlite.table.DatabaseTable;\r\n");
		header.append("import java.io.Serializable;\r\n");
		header.append("import java.util.UUID;\r\n");
		header.append("import java.math.BigDecimal;\r\n");
		header.append("import java.util.Date;\r\n");

	}

	public BeanUtil() {
		// TODO Auto-generated constructor stub
	}
	//创建JavaBean文件
	public String createBean(String tbName, List<Map<String, String>> collist,
			Map<String, String> infoMap) {

		StringBuilder fields = new StringBuilder();
		StringBuilder methods = new StringBuilder();

		StringBuilder classInfo = new StringBuilder("\t/**\r\n\t*");
		for (Map<String, String> colmap : collist) {
			String field = colmap.get("filed").toString();
			String type = typeTrans(colmap.get("type").toString());
			colmap.put("finaltype",type);
			fields.append(getFieldStr(colmap,field, type));
			//methods.append(getMethodStr(field, type));
		}

		classInfo.append("\t*@author jichen");
		classInfo.append("\r\n\t*/\r\n\r\n");
		classInfo.append(header);
		classInfo.append("@DatabaseTable(tableName = \""+tbName+"\")\r\n");

		classInfo.append("\tpublic class ").append(upperFirestChar(tbName))
				.append("{\r\n");
		classInfo.append(fields);
		classInfo.append("\r\n");
		classInfo.append(methods);
		classInfo.append("\r\n");
		classInfo.append("}");
		File file = new File(infoMap.get("catName"), upperFirestChar(tbName) + ".java");
		try {
			FileWriter fw = new FileWriter(file);
			if (infoMap.get("packName") == null || infoMap.get("packName").toString().equals("")) {
				
			} else {
				String packageinfo =  "package " + infoMap.get("packName").toString() + ";\r\n\r\n";
				fw.write(packageinfo);
			}
			
			fw.write(classInfo.toString());
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//数据库字段类型与JAVA类型转换
	public String typeTrans(String type) {
		if (type.equals("uniqueidentifier")){
			return "UUID";
		}else
		if (type.contains("bit")) {
			return "boolean";
		}
		else if (type.contains("tinyint")) {
			return "byte";
		} else if (type.contains("int")) {
			return "int";
		} else if (type.contains("datetime")) {
			return "Date";
		} else if (type.contains("BIGINT")) {
			return "Long";
		} else if (type.contains("varchar") || type.contains("date")
				|| type.contains("time") || type.contains("timestamp")
				|| type.contains("text") || type.contains("enum")
				|| type.contains("set")) {
			return "String";
		} else if (type.contains("binary") || type.contains("blob")) {
			return "byte[]";

		}
		else if (type.contains("decimal")){
			return "BigDecimal";
		}
		else if (type.contains("image")){
			return "Serializable";
		}
		else {
			return "Serializable";
		}
	}
	//获取方法字符串 
	private String getMethodStr(String field, String type) {
		StringBuilder get = new StringBuilder("\tpublic ");
		get.append(type).append(" ");
		if (type.equals("boolean")) {
			get.append(field);
		} else {
			get.append("get");
			get.append(upperFirestChar(field));
		}
		get.append("(){").append("\r\n\t\treturn this.").append(field)
				.append(";\r\n\t}\r\n");
		StringBuilder set = new StringBuilder("\tpublic void ");

		if (type.equals("boolean")) {
			set.append(field);
		} else {
			set.append("set");
			set.append(upperFirestChar(field));
		}
		set.append("(").append(type).append(" ").append(field)
				.append("){\r\n\t\tthis.").append(field).append("=")
				.append(field).append(";\r\n\t}\r\n");
		get.append(set);
		return get.toString();
	}

	//首字母大写
	public String upperFirestChar(String src) {
		return src.substring(0, 1).toUpperCase().concat(src.substring(1));
	}

	private String addAttrEntry(String entry, AtomicBoolean firstAttr){
		StringBuffer sb = new StringBuffer();
		if (!firstAttr.get()){
			sb.append(",");
		}
		sb.append(entry);
		firstAttr.set(false);
		return sb.toString();
	}

	private String getFieldAttr(Map<String, String> colmap){
		StringBuffer sb = new StringBuffer();
		AtomicBoolean firstAttr= new AtomicBoolean(true);
		//colmap.put("finaltype",colmap.get("type"));

		sb.append("@DatabaseField( ");
        sb.append(addAttrEntry("columnName =\"" + colmap.get("filed") + "\"", firstAttr));
		if (colmap.get("primary").equals("YES")){
			if (colmap.get("type").equals("uniqueidentifier")){
				sb.append(addAttrEntry("id=true ", firstAttr));
			}else {
				sb.append(addAttrEntry("id = true ", firstAttr));
			}
		}
		if (!colmap.get("nullable").equals("YES")){
			sb.append(addAttrEntry("canBeNull = false ",firstAttr));
		}

		if(colmap.get("foreign").equals("YES")){
			sb.append("/*//TODO: properly handle foreign key*/");
			sb.append(addAttrEntry("foreign = true ",firstAttr));
			sb.append(addAttrEntry("foreignColumnName =\""+colmap.get("foreign_table")+"_"+colmap.get("foreign_field")+"\"", firstAttr));
			colmap.put("finaltype",colmap.get("foreign_table"));
		}
		sb.append(")\r\n");

		return sb.toString();
	}
	//获取字段
	private String getFieldStr(Map<String, String> colmap,String field, String type) {
		StringBuilder sb = new StringBuilder();
		sb.append(getFieldAttr(colmap));
		sb.append("\t").append("private ").append(colmap.get("finaltype")).append(" ")
				.append(field.toLowerCase()).append(";");
		sb.append("\r\n");
		return sb.toString();
	}

}
