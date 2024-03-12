package com.example.demo.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.vo.AdminMemberVo;

@Service
public class AdminMemberService {
	
	@Autowired
	AdminMemberMapper adminMemberMapper;
	

	AdminMemberVo selectAdminMember(int no) {
		System.out.println("AdminMemberService selectAdminMember()");
		return adminMemberMapper.selectAdminMember(no);
	}
	
	List<AdminMemberVo> selectAllAdminMember() {
		System.out.println("AdminMemberService selectAllAdminMember()");
		List<AdminMemberVo> adminMemberVos = adminMemberMapper.selectAllAdminMember();
		System.out.println("  count of all members : " + adminMemberVos.size());
		return adminMemberVos;
	}

}
