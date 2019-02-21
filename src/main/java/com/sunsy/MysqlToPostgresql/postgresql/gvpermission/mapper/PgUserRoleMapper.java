package com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper;

import java.util.List;

import com.sunsy.MysqlToPostgresql.entity.UserRole;
import com.sunsy.MysqlToPostgresql.postgresql.gvauth.mapper.MapperInterfact;


public interface PgUserRoleMapper extends MapperInterfact<UserRole>{

	int createNewTable();

	int insert(UserRole record);
}
