package com.lcl.demo.sbDemo.livable.modules.system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.lcl.demo.sbDemo.base.entity.SysUser;

@Mapper
public interface SysUserMapper {

	@Select("select id, username, real_name as realName, password from sys_user")
	List<SysUser> selectList();

	@Select("select id, username, real_name as realName, password from sys_user where username = #{username} and password = #{password}")
	SysUser checkExist(@Param("username") String username, @Param("password") String password);
	
}
