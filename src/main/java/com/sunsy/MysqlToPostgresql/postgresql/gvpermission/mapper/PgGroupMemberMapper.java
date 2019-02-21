package com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper;

import java.util.List;

import com.sunsy.MysqlToPostgresql.entity.GroupMember;
import com.sunsy.MysqlToPostgresql.postgresql.gvauth.mapper.MapperInterfact;


public interface PgGroupMemberMapper extends MapperInterfact<Object>{

	int createNewTable();
	
	int insert(GroupMember record);
}
