package com.cafe24.pickmetop.member.repository;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.pickmetop.member.model.MemberGeneralVo;
import com.cafe24.pickmetop.member.model.MemberLinkedVo;
import com.cafe24.pickmetop.member.model.MemberWithdrawVo;
import com.cafe24.pickmetop.member.model.MemberWorkstateVo;

@Repository
public class MemberDao {
	private final String NS = "com.cafe24.pickmetop.member.repository.MemberMapper";
	@Autowired
	@Resource(name="sqlSessionMember")
	private SqlSessionTemplate sqlSessionFactoryMember;
	
	public int insertMember(MemberGeneralVo genner, MemberLinkedVo 
			linked, MemberWithdrawVo withdraw, MemberWorkstateVo workstate){
		return sqlSessionFactoryMember.insert(NS+".insertMember", genner);
	
	}
}
