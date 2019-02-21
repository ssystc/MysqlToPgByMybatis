package com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper;

import java.util.List;

import com.sunsy.MysqlToPostgresql.entity.Role;
import com.sunsy.MysqlToPostgresql.postgresql.gvauth.mapper.MapperInterfact;



public interface PgRoleMapper extends MapperInterfact<Object>{

	int createNewTable();

	int insert(Role record);
}
