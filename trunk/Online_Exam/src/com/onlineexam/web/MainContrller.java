package com.onlineexam.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainContrller {
	@RequestMapping("/")
	public String homePage() {
		return "login";
	}
                   @RequestMapping("/testbyramesh")
	public String homePage() {
		return "testbyramesh";
	}
}
