import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jerry on 2016/10/30.
 */
public class CsvGen {

    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]),"GBK"));
        BufferedWriter fw = null;
        String line;
        String tableName="";
        int status = 0;//0: table, 1, data, 2: data end
        int skiped = 0;
        String dir = args[1];
        List<String> tableList = new ArrayList<String>();
        File fdir = new File(dir);
        if (fdir.exists()){
            FileUtils.deleteDirectory(fdir);
        }
        fdir.mkdirs();

        while((line = fr.readLine()) != null){
            switch (status){
                case 0:
                {
                    String [] splited = line.split(",");
                    if ( (splited.length <=1) && line.contains("(") && line.contains(")"))
                    {
                        int start = line.indexOf("(");
                        int end = line.indexOf(")");
                        tableName = line.substring(start+1, end);
                        if (fw != null){
                            fw.close();
                        }
                        Path path = Paths.get(dir,tableName+".csv");
                        tableList.add(tableName);
                        //fw = new FileWriter(path.toString());
                        fw = new BufferedWriter(new OutputStreamWriter(
                                new FileOutputStream(path.toString()), "GBK"));
                        skiped=0;
                        status = 1;
                    }else{
                        String strCol = StringUtils.join(splited,",");
                        System.out.println(line);
                        fw.write(strCol+"\r\n");
                    }
                }
                break;
                case 1:
                {
                    if ((++skiped) >= 3){
                        skiped = 0;
                        status = 0;
                    }
                }
                break;
            }
        }
        fr.close();

        Path path = Paths.get(dir,"loaddata2sqlserver"+".sql");
        FileWriter ffw = new FileWriter(path.toString());
        for (String table:tableList){
            path = Paths.get(dir,table+".csv");
            ffw.write("DELETE FROM "+table+";\r\n");
            ffw.write("BULK INSERT "+ table +" FROM '"+path.toString()+"' WITH(\n" +
                    " FIELDTERMINATOR = ',',\n" +
                    " ROWTERMINATOR = '\\n'\n" +
                    ");\r\n");
        }
        fw.close();
        ffw.close();

    }
}
