package com.example.demo.admin;

import java.util.List;

import com.example.demo.vo.AdminMemberVo;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AdminMemberMapper {
	AdminMemberVo selectAdminMember(int a_m_no);
	List<AdminMemberVo> selectAllAdminMember();
}
