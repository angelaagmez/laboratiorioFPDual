package ejemplojdbc.edu.fpdual.conector;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
/**
 * Class responsible from creation DDBB connections.
 *
 */
public class Conector {

    Properties prop = new Properties();

    public Conector() {
        try {
            prop.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    
    public Connection getMySQLConnection() {
    	try {

    	//Indicates which driver is going to be used.
    	Class.forName(prop.getProperty(MySQLConstants.DRIVER));

    		try {
    			//Creates the connection based on the obtained URL.
    			return DriverManager.getConnection(getURL());
    		} catch (SQLException e) {
    			e.printStackTrace();
    		}
    	} catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    		return null;
    }

    /**
     * Obtains the URL to connect to MySQL DDBB
     * @return
     */

	private String getURL() {
		return new StringBuilder().append(prop.getProperty(MySQLConstants.URL_PREFIX))
				.append(prop.getProperty(MySQLConstants.URL_HOST)).append(":")
				.append(prop.getProperty(MySQLConstants.URL_PORT)).append("/")
				.append(prop.getProperty(MySQLConstants.URL_SCHEMA)).append("?user=")
				.append(prop.getProperty(MySQLConstants.USER)).append("&password=")
				.append(prop.getProperty(MySQLConstants.PASSWD)).append("&useSSL=")
				.append(prop.getProperty(MySQLConstants.URL_SSL)).toString();
		// --- jdbc::mysql://localhost:3306/world?user=sa&password=ABG.1998&userlSSL=false
	}
}