package com.lifan.spring;

import com.lifan.spring.mapper.MapperMain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {
    @Autowired
    MapperMain mapper;

	@ResponseBody
	@RequestMapping("/test")
	public String test() {
	    Object object = mapper.getAccountList();
		return object.toString();
	}
}
