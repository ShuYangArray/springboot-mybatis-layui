package com.lcl.demo.sbDemo.base.entity;

public class SysUser {

	private int id;
	private String username;
	private String realName;
	private String password;
	private int valid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}

	public SysUser(int id, String username, String realName, String password, int valid) {
		super();
		this.id = id;
		this.username = username;
		this.realName = realName;
		this.password = password;
		this.valid = valid;
	}

	public SysUser() {
		super();
	}

	@Override
	public String toString() {
		return "SysUser [id=" + id + ", username=" + username + ", realName=" + realName + ", password=" + password
				+ ", valid=" + valid + "]";
	}

}
