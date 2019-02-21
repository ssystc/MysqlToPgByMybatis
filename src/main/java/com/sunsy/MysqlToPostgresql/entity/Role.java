package com.sunsy.MysqlToPostgresql.entity;

public class Role {
	
	private int id;
    private String role_name;
    private String role_desc;

    public Role(int id, String roleName, String roleDesc) {
        this.id = id;
        this.role_name = roleName;
        this.role_desc = roleDesc;
    }

    public Role() {
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getRole_desc() {
		return role_desc;
	}

	public void setRole_desc(String role_desc) {
		this.role_desc = role_desc;
	}
}
