package com.sunsy.MysqlToPostgresql.postgresql.gvauth.mapper;

import java.util.List;

import com.sunsy.MysqlToPostgresql.entity.Client;


public interface PgClientMapper extends MapperInterfact<Client> {

	int createNewTable();
	
	int insert(Client client);
	
}
