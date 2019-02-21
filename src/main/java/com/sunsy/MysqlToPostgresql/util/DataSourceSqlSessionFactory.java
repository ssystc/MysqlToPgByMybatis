package com.sunsy.MysqlToPostgresql.util;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.login.Configuration;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataSourceSqlSessionFactory {

	private static final String configurationPath = "conf.xml";

	
	public static SqlSessionFactory getSqlSessionFactory(String environment) {
		
		Reader reader = null;
		try {  
            reader = Resources.getResourceAsReader(configurationPath);  
        } catch (IOException e) {  
            System.out.println(e.getMessage());  
        }  
		SqlSessionFactory sqlSessionFactory = 
				new SqlSessionFactoryBuilder().build(reader, environment); 
		return sqlSessionFactory;
	}
	

}
