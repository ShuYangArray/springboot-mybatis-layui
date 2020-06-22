package com.lcl.demo.sbDemo.livable.modules.system.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lcl.demo.sbDemo.livable.modules.system.service.ISysUserService;

@Controller
public class SysUserController {
	@Resource
	ISysUserService sysUserService;

	@RequestMapping("/admin/sysUser")
	public Object hello(String name){
		ModelAndView mv = new ModelAndView();
		mv.addObject("sysUserList", sysUserService.selectList());
		mv.setViewName("system/sysUser_list");
		return mv;
	}
	
	/**
	 * 前往敬请期待页
	 */
	@RequestMapping("/admin/undo")
	public Object undo() {
		return "system/undo";
	}
	
	/**
	 * 前往主页
	 */
	@RequestMapping("/admin/home")
	public Object index() {
		return "system/home";
	}
	
}
