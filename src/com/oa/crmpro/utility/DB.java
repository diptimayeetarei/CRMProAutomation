package com.oa.crmpro.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
	
	ConfigProperty configProperty = new ConfigProperty();
	Properties prop = configProperty.readConfigProperties();
	
	public void dbConnect() throws SQLException {
		
		//connecting to DB
		Connection con =DriverManager.getConnection(prop.getProperty("DB_URL"), prop.getProperty("DB_USERNAME"), prop.getProperty("DB_PASSWORD"));
		
	}
	
	
	

}
