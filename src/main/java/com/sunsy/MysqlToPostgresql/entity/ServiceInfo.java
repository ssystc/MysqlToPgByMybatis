package com.sunsy.MysqlToPostgresql.entity;

public class ServiceInfo {
	
	private int id;
	private String service_name;
	private String service_path;
	private String service_state;
	private String package_name;
	private String host_ip;
	private String service_port;
	private int start_order;
	private String start_param;
	private String note1;
	private String note2;
	private String note3;
	private String note4;
	private String note5;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public String getService_path() {
		return service_path;
	}
	public void setService_path(String service_path) {
		this.service_path = service_path;
	}
	public String getService_state() {
		return service_state;
	}
	public void setService_state(String service_state) {
		this.service_state = service_state;
	}
	public String getPackage_name() {
		return package_name;
	}
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
	public String getHost_ip() {
		return host_ip;
	}
	public void setHost_ip(String host_ip) {
		this.host_ip = host_ip;
	}
	public String getService_port() {
		return service_port;
	}
	public void setService_port(String service_port) {
		this.service_port = service_port;
	}
	public int getStart_order() {
		return start_order;
	}
	public void setStart_order(int start_order) {
		this.start_order = start_order;
	}
	public String getStart_param() {
		return start_param;
	}
	public void setStart_param(String start_param) {
		this.start_param = start_param;
	}
	public String getNote1() {
		return note1;
	}
	public void setNote1(String note1) {
		this.note1 = note1;
	}
	public String getNote2() {
		return note2;
	}
	public void setNote2(String note2) {
		this.note2 = note2;
	}
	public String getNote3() {
		return note3;
	}
	public void setNote3(String note3) {
		this.note3 = note3;
	}
	public String getNote4() {
		return note4;
	}
	public void setNote4(String note4) {
		this.note4 = note4;
	}
	public String getNote5() {
		return note5;
	}
	public void setNote5(String note5) {
		this.note5 = note5;
	}
}
