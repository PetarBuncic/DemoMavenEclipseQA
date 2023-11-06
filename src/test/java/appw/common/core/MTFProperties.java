package appw.common.core;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

/**
 * Created for DEMO template by Petar Buncic on 24.10.23.
 */

public class MTFProperties {

    public static Properties dynamic = new Properties();
    public static Properties database = new Properties();
    
    public static void init() {

        File propertiesDir = new File(System.getProperty("user.dir"), "src/test/properties");

        initFromFile(dynamic, propertiesDir + "/dynamic.properties");
        initFromFile(database, propertiesDir + "/database.properties");
    }

    public static void initFromFile(Properties props, String filepath) {
        try {
            FileInputStream stream = new FileInputStream(filepath);
            props.load(stream);
            stream.close();
        } catch(Exception e) {
            System.out.println("Error initializing props: " + e.getMessage());
        }
    }

    public static String getBrowser() {
        return dynamic.getProperty("browser").toLowerCase();
    }

    public static String getEnvironment() {
        String runEnvironment = System.getProperty("run_environment");
        if(StringUtils.isEmpty(runEnvironment)) {
            return dynamic.getProperty("environment").toLowerCase();
        } else {
            return runEnvironment.toLowerCase();
        }
    }

    public static String getLang() {
        return dynamic.getProperty("lang").toLowerCase();
    }

    public static String getServer() {
        return dynamic.getProperty("server").toLowerCase();
    }
    
    public static String getDemoApp() {
        return dynamic.getProperty("demo_app").toLowerCase();
    }


    public static String getCafDatabaseConnUrl(String client) {
        String serverName;
        String dbName;
        String username;
        String password;   
        
        serverName = database.getProperty("server_name_demo_app");
        dbName = database.getProperty("db_name");
        username = database.getProperty("db_username");
        password = database.getProperty("db_password");

        return "jdbc:sqlserver://" + serverName + ";databaseName=" + dbName +
                ";user=" + username + ";password=" + password;
    }

    public static int getRepeatOnExceptionCount() {
        if(dynamic.getProperty("repeat.on.exception.count") == null) {
            init();
        }

        return Integer.parseInt(dynamic.getProperty("repeat.on.exception.count"));
    }

}
