package com.lifan.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

	@ResponseBody
	@RequestMapping("/test")
	public String test() {
		return "hello world";
	}
}
