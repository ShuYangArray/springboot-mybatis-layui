package com.lcl.demo.sbDemo.livable.modules.userinfo.service;

import java.util.List;
import java.util.Map;

public interface UserService {
	
	List<Map<String, Object>> getDatas(String name);
	Map<String, Object> getDataById(Integer id);
}
