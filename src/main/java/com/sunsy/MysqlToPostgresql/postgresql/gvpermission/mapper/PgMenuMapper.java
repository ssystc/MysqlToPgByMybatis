package com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper;

import java.util.List;

import com.sunsy.MysqlToPostgresql.entity.Menu;
import com.sunsy.MysqlToPostgresql.postgresql.gvauth.mapper.MapperInterfact;

public interface PgMenuMapper extends MapperInterfact<Object>{

	int createNewTable();

	int insert(Menu record);
}
