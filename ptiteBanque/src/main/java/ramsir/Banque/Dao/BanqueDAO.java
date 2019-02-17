package ramsir.Banque.Dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class BanqueDAO {

	private static boolean init = false;
	private static Properties properties;
	private static Connection connection;
	
	/*
	 * 
	 *  Fonction pour chargerment des données 
	 * */
	
	public static boolean loadDao() throws  Exception
	{
		properties = new Properties();
		try(FileInputStream file= new FileInputStream("conf.properties")){	
			properties.load(file);
		}	
		Class.forName(properties.getProperty("jdbc.driver.class"));
		String url= properties.getProperty("jdbc.url");
		String login= properties.getProperty("jdbc.login");
		String pwd= properties.getProperty("jdbc.password");
		
		try {
			connection = DriverManager.getConnection(url, login, pwd);
			init = true;
		} catch (Exception e) {
		}
		return init;
	}
	
	/*
	 * 
	 * 
	 * **/

	public static ResultSet getData(String lSql) throws Exception {
		ResultSet resultSet = null;

		if (loadDao()) {

			PreparedStatement stm = null;
			try {
				stm = connection.prepareStatement(lSql);
				resultSet = stm.executeQuery();
				return resultSet;

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}

		}
		return null;
	}
	
	/*
	 * 
	 * */
	public static int setData(String lSql) throws Exception {
		// boolean isValid = false;
		int result = 0;
		if (loadDao()) {
			PreparedStatement stmt = null;
			try {
				stmt = (PreparedStatement) connection.prepareStatement(lSql);
				result = stmt.executeUpdate();
				System.out.println(result);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return result;
	}
	
}
