package com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper;

import java.util.List;

import com.sunsy.MysqlToPostgresql.entity.ServiceInfo;
import com.sunsy.MysqlToPostgresql.postgresql.gvauth.mapper.MapperInterfact;


public interface PgServiceInfoMapper extends MapperInterfact<Object>{

	int createNewTable();

	int insert(ServiceInfo record);
}
