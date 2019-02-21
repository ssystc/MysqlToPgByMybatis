package com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper;

import java.util.List;

import com.sunsy.MysqlToPostgresql.entity.ResourceAuthority;
import com.sunsy.MysqlToPostgresql.postgresql.gvauth.mapper.MapperInterfact;



public interface PgResourceAuthorityMapper extends MapperInterfact<Object>{

	int createNewTable();

	int insert(ResourceAuthority record);
}
