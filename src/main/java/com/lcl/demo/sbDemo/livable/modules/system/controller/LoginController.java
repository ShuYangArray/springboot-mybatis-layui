package com.lcl.demo.sbDemo.livable.modules.system.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lcl.demo.sbDemo.base.entity.SysUser;
import com.lcl.demo.sbDemo.livable.modules.system.service.ISysUserService;

@Controller
public class LoginController {

	@Resource
	ISysUserService sysUserService;

	/**
	 * 前往登录页
	 */
	@RequestMapping("/admin/login")
	public Object login(String err, ModelMap model) {
		if(err != null && err.equals("2")) {
			model.put("err", "无效用户");
		}
		if(err != null && err.equals("3")) {
			model.put("err", "帐号密码错误");
		}
		return "system/login";
	}

	/**
	 * 检查登录
	 */
	@RequestMapping("/admin/checkLogin")
	public void userList(String username, String password, HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("your username:" + username);
		System.out.println("your password:" + password);
		if (username != null) {
			SysUser user = sysUserService.checkExist(username, password);
			if(user != null) {

					request.getSession().setAttribute("user", user);
					response.sendRedirect("/admin/index");
					return;

				//response.sendRedirect("/admin/login?err=2");
			}
			response.sendRedirect("/admin/login?err=3");
		} else {
			response.sendRedirect("/admin/login");
		}
	}

	/**
	 * 前往首页
	 */
	@RequestMapping("/admin/index")
	public Object index() {
		return "system/index";
	}
	
	/**
	 * 注销，前往首页
	 */
	@RequestMapping("/admin/logout")
	public Object logout(HttpServletRequest request) {
		request.getSession().removeAttribute("user");
		return "system/login";
	}
	
	

}
