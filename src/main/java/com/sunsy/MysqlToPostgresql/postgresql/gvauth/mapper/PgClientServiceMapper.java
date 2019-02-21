package com.sunsy.MysqlToPostgresql.postgresql.gvauth.mapper;

import java.util.List;

import com.sunsy.MysqlToPostgresql.entity.ClientService;


public interface PgClientServiceMapper extends MapperInterfact<Object> {

	int createNewTable();
	
	int insert(ClientService record);
	
}
