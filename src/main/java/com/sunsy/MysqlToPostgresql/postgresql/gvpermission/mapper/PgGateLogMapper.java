package com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sunsy.MysqlToPostgresql.entity.GateLog;
import com.sunsy.MysqlToPostgresql.postgresql.gvauth.mapper.MapperInterfact;


public interface PgGateLogMapper extends MapperInterfact<Object>{

	int createNewTable();

	int insert(GateLog record);
}
