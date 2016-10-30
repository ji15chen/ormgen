/*
 * CognitiV NAO1.0
 * Copyright (c) 2016 Samsung Electronics, Inc.
 * All right reserved.
 *
 * This software is the confidential and proprietary information of Samsung Electronics,
 * Inc.
 * ("Confidential Information"). You shall not disclose such Confidential Information and
 * shall use it only in accordance with the terms of the license agreement you entered
 * into with Samsung Electronics.
 *
 * Author: Ji Chen<ji15.chen@samsung.com>
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class OrmGen {
    static DbUtil dbutil = new DbUtil();
    static BeanUtil butil = new BeanUtil();
    static HashMap<String, String> dbInfoMap;

    public static void main(String[] args) throws IOException {

        dbInfoMap = new HashMap();
        Properties props = new Properties();
        props.load(new FileInputStream("config.properties"));
        for (Map.Entry<Object, Object> entry : props.entrySet()) {
            dbInfoMap.put(entry.getKey().toString(), entry.getValue().toString());
        }

        if (dbInfoMap.get("catName") != null) {
            if (dbInfoMap.get("catName").toString().equals("")) {
                dbInfoMap.put("catName", "D://");
            }
            if ((new File(dbInfoMap.get("catName").toString()).isDirectory()) != true) {
                System.out.println("目录不存在，请重新输入");
            } else {
                if (dbInfoMap.get("packName") != null && !dbInfoMap.get("packName").toString().equals("")) {
                    String catPack = dbInfoMap.get("catName").toString() + dbInfoMap.get("packName").toString();
                    catPack = catPack.replace(".", "/");
                    new File(catPack).mkdirs();
                    dbInfoMap.put("catName", catPack);
                }
                List<String> tableList = dbutil.getTableNames(dbInfoMap, dbInfoMap.get("dbName").toString());
                for (int i = 0; i < tableList.size(); i++) {
                    String tabName = tableList.get(i);
                    List<Map<String, String>> tabFileds = dbutil.getColumnNames(dbInfoMap, tabName);
                    butil.createBean(tabName, tabFileds, dbInfoMap);
                }
            }
        }
    }

}
