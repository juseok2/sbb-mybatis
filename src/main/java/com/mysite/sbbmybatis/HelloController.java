package com.mysite.sbbmybatis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/hello")
//	@ResponseBody
	public String hello() {
		return "hello";
	}
}
