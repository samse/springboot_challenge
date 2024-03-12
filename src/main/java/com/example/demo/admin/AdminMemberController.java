package com.example.demo.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.vo.AdminMemberVo;

@Controller
public class AdminMemberController {

	@Autowired
	AdminMemberService adminMemberService;
	
	@GetMapping("/admin")
	public String adminHome(Model model) {
		System.out.println("AdminMemberController adminHome()");
		List<AdminMemberVo> adminMemberVos = adminMemberService.selectAllAdminMember();
		model.addAttribute("adminMemberVos", adminMemberVos);
		return "admin";
	}
}
