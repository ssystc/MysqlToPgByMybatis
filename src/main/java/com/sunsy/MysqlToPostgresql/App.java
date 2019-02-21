package com.sunsy.MysqlToPostgresql;

import com.sunsy.MysqlToPostgresql.service.CreateDBService;
import com.sunsy.MysqlToPostgresql.service.CreateTableService;
import com.sunsy.MysqlToPostgresql.service.MysqlToPgService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CreateDBService createDbService = new CreateDBService();
		createDbService.createDb();
		
		CreateTableService createTableService = new CreateTableService();
		createTableService.createAllTable();
		
		MysqlToPgService dataToPgService = new MysqlToPgService();
		dataToPgService.dataToPg();
    }
}
