package com.oa.crmpro.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DB {
	
	//extra
	static ConfigProperty configProperty = new ConfigProperty();
	static Properties prop = configProperty.readConfigProperties();
   String query=null;
	static Connection con;
	
	
	public static void main(String args[])throws SQLException {
		
		dbConnect();
		getDataFromDB();
		
	}
		
		public static void dbConnect() throws SQLException  {
		
		//connecting to DB
		con =DriverManager.getConnection(prop.getProperty("DB_URL"), prop.getProperty("DB_USERNAME"), prop.getProperty("DB_PASSWORD"));
		
	}
	
	
	public static void getDataFromDB() {
		
		 try {
			PreparedStatement stmt=con.prepareCall("select SCREEN,OBJECT from CRMPROTABLE");
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				
				System.out.println(rs.getInt(1));
				System.out.println("Hi");
			}
	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
