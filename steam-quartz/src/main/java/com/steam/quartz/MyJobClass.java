package com.steam.quartz;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.steam.dao.TestDao;

public class MyJobClass {
    
	@Autowired
	private TestDao testDao;
	
	public void testJob(){
		List<Map<String,Object>> list=testDao.test();
		for(Map<String,Object> map:list ){
			System.out.println(map.get("userName"));
		}
	}
	
}
