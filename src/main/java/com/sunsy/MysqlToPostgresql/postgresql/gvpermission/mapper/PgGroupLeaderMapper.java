package com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sunsy.MysqlToPostgresql.entity.GroupLeader;
import com.sunsy.MysqlToPostgresql.postgresql.gvauth.mapper.MapperInterfact;


public interface PgGroupLeaderMapper extends MapperInterfact<Object>{

	int createNewTable();

	int insert(GroupLeader record);
}
