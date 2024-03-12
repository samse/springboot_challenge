package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.vo.AdminMemberVo;

@Controller
public class DemoController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("DemoController home()");
		return "index";
	}
	
	@RequestMapping("/jsp")
	public String jsp() throws Exception {
		System.out.println("DemoController jsp()");
		return "test";
	}
	
	@RequestMapping("/testJsp")
	public ModelAndView testJsp() throws Exception {
		System.out.println("DemoController testJsp()");
		ModelAndView mnv = new ModelAndView("test");
		mnv.addObject("name", "SAMSE");
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("4");
		list.add("100");
		mnv.addObject("list", list);
		return mnv;
	}

	@ResponseBody
	@RequestMapping("/testValue")
	public String testValue() {
		System.out.println("DemoController testValue()");
		Date date = new Date();
		return "지금 시간은 " + date.toLocaleString();
	}
	
//	@GetMapping("/admin")
//	public String admin(Model model) {
//		AdminMemberVo adminMemberVo = new AdminMemberVo();
//		adminMemberVo.setA_m_name("Samse Lee");
//		adminMemberVo.setA_m_id("samseya");
//		adminMemberVo.setA_m_reg_date(new Date().toLocaleString());
//		model.addAttribute("adminMemberVo", adminMemberVo);
//		return "thymeleaf/admin";
//	}

}
