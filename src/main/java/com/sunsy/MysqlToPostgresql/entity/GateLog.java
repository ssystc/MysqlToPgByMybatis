package com.sunsy.MysqlToPostgresql.entity;

import java.util.Date;


public class GateLog {
	
	private Integer id;

    private String menu;

    private String opt;

    private String uri;

    private Date crt_time;

    private String crt_user;

    private String crt_name;

    private String crt_host;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getOpt() {
		return opt;
	}

	public void setOpt(String opt) {
		this.opt = opt;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Date getCrt_time() {
		return crt_time;
	}

	public void setCrt_time(Date crt_time) {
		this.crt_time = crt_time;
	}

	public String getCrt_user() {
		return crt_user;
	}

	public void setCrt_user(String crt_user) {
		this.crt_user = crt_user;
	}

	public String getCrt_name() {
		return crt_name;
	}

	public void setCrt_name(String crt_name) {
		this.crt_name = crt_name;
	}

	public String getCrt_host() {
		return crt_host;
	}

	public void setCrt_host(String crt_host) {
		this.crt_host = crt_host;
	}
}
