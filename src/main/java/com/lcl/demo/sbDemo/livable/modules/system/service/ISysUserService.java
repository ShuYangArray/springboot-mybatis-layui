package com.lcl.demo.sbDemo.livable.modules.system.service;

import java.util.List;

import com.lcl.demo.sbDemo.base.entity.SysUser;

public interface ISysUserService {
	
	List<SysUser> selectList();

	SysUser checkExist(String username, String password);

}
