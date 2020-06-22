package com.lcl.demo.sbDemo.livable.modules.userinfo.mapper;

public class UserMapperProvider {

	public String getDatas(String name) {
		String sql = "SELECT * FROM live_user where 1 = 1 ";
		if (name != null && name.length() > 0) {
			sql += "and username like CONCAT ('%', #{username}, '%')  ";
		}
		return sql;
	}

}
