package com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper;

import java.util.List;

import com.sunsy.MysqlToPostgresql.entity.User;
import com.sunsy.MysqlToPostgresql.postgresql.gvauth.mapper.MapperInterfact;



public interface PgUserMapper extends MapperInterfact<Object>{

	int createNewTable();
	
	int insert(User record);
}
