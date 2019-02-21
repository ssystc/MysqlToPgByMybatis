package com.sunsy.MysqlToPostgresql.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sunsy.MysqlToPostgresql.postgresql.gvauth.mapper.MapperInterfact;
import com.sunsy.MysqlToPostgresql.util.DataSourceSqlSessionFactory;

public class MysqlToPgService {
	
	//mapperName例如Client、ClientService；authOrPermission参数传入auth或permission
	private void dataToPgCore(String mapperName, String authOrPermission){
		try {
			SqlSessionFactory sessionFactory = DataSourceSqlSessionFactory.getSqlSessionFactory("mysql_gv_" + authOrPermission);
			SqlSession session = sessionFactory.openSession();
			String statement = "com.sunsy.MysqlToPostgresql.mysql.gv" + authOrPermission + ".mapper." + mapperName + "Mapper.get" + mapperName + "s";
			List<Object> list = session.selectList(statement);
			System.out.println("table like " + mapperName + "size:" + list.size());
			
			SqlSessionFactory pgSessionFactory = DataSourceSqlSessionFactory.getSqlSessionFactory("pg_gv_" + authOrPermission);
			SqlSession pgSession = pgSessionFactory.openSession();
			String mapperClassName = "com.sunsy.MysqlToPostgresql.postgresql.gv" + authOrPermission + ".mapper.Pg" + mapperName + "Mapper";
			Class<?> mapperClass = Class.forName(mapperClassName);
			MapperInterfact<Object> mapper = (MapperInterfact<Object>) pgSession.getMapper(mapperClass);
			for (Object o : list) {
				mapper.insert(o);
			}
			pgSession.commit();
			pgSession.close();
			System.out.println("table like " + mapperName + "数据导入完毕！");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void dataToPg() {
		dataToPgCore("Client", "auth");
		dataToPgCore("ClientService", "auth");
		dataToPgCore("Element", "permission");
		dataToPgCore("GateLog", "permission");
		dataToPgCore("GroupLeader", "permission");
		dataToPgCore("Group", "permission");
		dataToPgCore("GroupMember", "permission");
		dataToPgCore("GroupType", "permission");
		dataToPgCore("Menu", "permission");
		dataToPgCore("ResourceAuthority", "permission");
		dataToPgCore("Role", "permission");
		dataToPgCore("ServiceInfo", "permission");
		dataToPgCore("User", "permission");
		dataToPgCore("UserRole", "permission");
	}

}
