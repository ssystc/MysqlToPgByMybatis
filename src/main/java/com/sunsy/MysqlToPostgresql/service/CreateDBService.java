package com.sunsy.MysqlToPostgresql.service;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;


public class CreateDBService {
	
	public void createDb() {
		
		try {		
			InputStream inStream = CreateDBService.class.getClassLoader().getResourceAsStream("config.properties");  
			Properties prop = new Properties();
			prop.load(inStream);
			
			Class.forName(prop.getProperty("pg.driver"));
			String url = "jdbc:postgresql://" + prop.getProperty("pg.host") + ":" + prop.getProperty("pg.port") + "/postgres";
			Connection conn = DriverManager.getConnection(url, prop.getProperty("pg.username"), prop.getProperty("pg.password"));
			Statement stat = conn.createStatement();
			stat.executeUpdate("create database " + prop.getProperty("pg.gv_auth.name"));
			stat.executeUpdate("create database " + prop.getProperty("pg.gv_permission.name"));
			stat.close();
			conn.close();
			System.out.println(prop.getProperty("pg.gv_auth.name") + " and " + prop.getProperty("pg.gv_permission.name") + "数据库创建完毕");
		} catch (Exception e) {
			System.out.println("Warning:" + e);
		}
	}
	
}
