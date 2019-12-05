package com.oa.crmpro.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.testng.annotations.Test;

public class DB {
	
	//extra
	static ConfigProperty configProperty = new ConfigProperty();
	static Properties prop = configProperty.readConfigProperties();
   String query=null;
	static Connection con;
	
	@Test
	public static void Test() {
		
		dbConnect();
		getDataFromDB();
		
	}
		
		public static void dbConnect()  {
		
		//connecting to DB
		try {
			con =DriverManager.getConnection(prop.getProperty("DB_URL"), prop.getProperty("DB_USERNAME"), prop.getProperty("DB_PASSWORD"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(con);
	}
	
	
	public static void getDataFromDB() {
		
		// our SQL SELECT query. 
	      // if you only need a few columns, specify them by name instead of using "*"
	      String query = "SELECT SCREEN,OBJECT,BROWSERXPATH FROM CRMPROTABLE";

	      // create the java statement
	      Statement st;
		try {
			st = con.createStatement();
			// execute the query, and get a java resultset
		     
			 ResultSet rs = st.executeQuery(query);
		      // iterate through the java resultset
		      while (rs.next())
		      {
		  
		        String screenvar = rs.getString("SCREEN");
		        System.out.println(screenvar);
		        String objectvar = rs.getString("OBJECT");
		        System.out.println(objectvar);
		        String browservar = rs.getString("BROWSERXPATH");
		        System.out.println(browservar);
		        
		
			
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      
	
	}}


