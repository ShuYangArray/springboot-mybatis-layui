package com.lcl.demo.sbDemo.livable.modules.userinfo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

@Mapper
public interface UserMapper {
	
	@SelectProvider(type=UserMapperProvider.class, method="getDatas")
	List<Map<String, Object>> getDatas(String name);

	@Select("SELECT * FROM live_user where id=#{id}")
	Map<String, Object> getDataById(Integer id);

}
