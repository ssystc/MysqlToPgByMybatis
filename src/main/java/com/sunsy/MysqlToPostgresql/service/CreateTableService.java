package com.sunsy.MysqlToPostgresql.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sunsy.MysqlToPostgresql.postgresql.gvauth.mapper.PgClientMapper;
import com.sunsy.MysqlToPostgresql.postgresql.gvauth.mapper.PgClientServiceMapper;
import com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper.PgElementMapper;
import com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper.PgGateLogMapper;
import com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper.PgGroupLeaderMapper;
import com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper.PgGroupMapper;
import com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper.PgGroupMemberMapper;
import com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper.PgGroupTypeMapper;
import com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper.PgMenuMapper;
import com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper.PgResourceAuthorityMapper;
import com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper.PgRoleMapper;
import com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper.PgServiceInfoMapper;
import com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper.PgUserMapper;
import com.sunsy.MysqlToPostgresql.postgresql.gvpermission.mapper.PgUserRoleMapper;
import com.sunsy.MysqlToPostgresql.util.DataSourceSqlSessionFactory;

public class CreateTableService {
	
	public void createAllTable() {
		//gv_auth数据库
		SqlSessionFactory sessionFactory = DataSourceSqlSessionFactory.getSqlSessionFactory("pg_gv_auth");
		
		SqlSession session = sessionFactory.openSession();
		PgClientMapper clientMapper = session.getMapper(PgClientMapper.class);
		clientMapper.createNewTable();
		System.out.println("auth_client表创建成功！");
		
		PgClientServiceMapper clientServiceMapper = session.getMapper(PgClientServiceMapper.class);
		clientServiceMapper.createNewTable();
		System.out.println("auth_client_service表创建成功！");
		
		session.commit();
		session.close();
		
		//gv_permission数据库
		sessionFactory = DataSourceSqlSessionFactory.getSqlSessionFactory("pg_gv_permission");
		
		session = sessionFactory.openSession();
		PgElementMapper elementMapper = session.getMapper(PgElementMapper.class);
		elementMapper.createNewTable();
		System.out.println("base_element表创建成功！");
		
		PgGateLogMapper gateLogMapper = session.getMapper(PgGateLogMapper.class);
		gateLogMapper.createNewTable();
		System.out.println("gate_log表创建成功！");
		
		PgGroupLeaderMapper groupLeaderMapper = session.getMapper(PgGroupLeaderMapper.class);
		groupLeaderMapper.createNewTable();
		System.out.println("base_group_leader表创建成功！");
		
		PgGroupMapper groupMapper = session.getMapper(PgGroupMapper.class);
		groupMapper.createNewTable();
		System.out.println("base_group表创建成功！");
		
		PgGroupMemberMapper groupMemberMapper = session.getMapper(PgGroupMemberMapper.class);
		groupMemberMapper.createNewTable();
		System.out.println("base_group_member表创建成功！");
		
		PgGroupTypeMapper groupTypeMapper = session.getMapper(PgGroupTypeMapper.class);
		groupTypeMapper.createNewTable();
		System.out.println("base_group_type表创建成功！");
		
		PgMenuMapper menuMapper = session.getMapper(PgMenuMapper.class);
		menuMapper.createNewTable();
		System.out.println("base_menu表创建成功！");
		
		PgResourceAuthorityMapper resourceAuthorityMapper = session.getMapper(PgResourceAuthorityMapper.class);
		resourceAuthorityMapper.createNewTable();
		System.out.println("base_resource_authority表创建成功！");
		
		PgRoleMapper roleMapper = session.getMapper(PgRoleMapper.class);
		roleMapper.createNewTable();
		System.out.println("base_role表创建成功！");
		
		PgServiceInfoMapper serviceInfoMapper = session.getMapper(PgServiceInfoMapper.class);
		serviceInfoMapper.createNewTable();
		System.out.println("service_info表创建成功！");
		
		PgUserMapper userMapper = session.getMapper(PgUserMapper.class);
		userMapper.createNewTable();
		System.out.println("base_user表创建成功！");
		
		PgUserRoleMapper userRoleMapper = session.getMapper(PgUserRoleMapper.class);
		userRoleMapper.createNewTable();
		System.out.println("base_user_role表创建成功！");

		session.commit();
		session.close();
	}
}
