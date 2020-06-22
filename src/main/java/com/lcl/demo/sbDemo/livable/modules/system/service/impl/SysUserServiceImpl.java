package com.lcl.demo.sbDemo.livable.modules.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcl.demo.sbDemo.base.entity.SysUser;
import com.lcl.demo.sbDemo.livable.modules.system.mapper.SysUserMapper;
import com.lcl.demo.sbDemo.livable.modules.system.service.ISysUserService;

@Service
public class SysUserServiceImpl implements ISysUserService{

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public List<SysUser> selectList() {
		return sysUserMapper.selectList();
	}

	@Override
	public SysUser checkExist(String username, String password) {
		return sysUserMapper.checkExist(username, password);
	}

}
