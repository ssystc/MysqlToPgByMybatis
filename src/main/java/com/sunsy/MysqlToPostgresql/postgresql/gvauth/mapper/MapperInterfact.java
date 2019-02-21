package com.sunsy.MysqlToPostgresql.postgresql.gvauth.mapper;


public interface MapperInterfact<T> {

	int createNewTable();
	
	int insert(T t);
	
}
