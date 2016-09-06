package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {

	@RequestMapping
	public String main() {
		System.out.println("Test Git commit");
		System.out.println("ok");
		return "/index";
	}
}
