package com.example.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	@RequestMapping("/testValue2")
	public String testValue() {
		System.out.println("DemoRestController testValue2()");
		Date date = new Date();
		return "지금 당장의 시간은 " + date.toLocaleString();
	}

}
