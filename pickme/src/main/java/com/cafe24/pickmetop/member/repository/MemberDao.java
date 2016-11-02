package com.cafe24.pickmetop.member.repository;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.pickmetop.member.model.MemberGeneralVo;
import com.cafe24.pickmetop.member.model.MemberLinkedVo;
import com.cafe24.pickmetop.member.model.*;

@Repository
public class MemberDao {
	private final String NS = "com.cafe24.pickmetop.member.repository.MemberMapper";
	@Autowired
	@Resource(name="sqlSessionMember")
	private SqlSessionTemplate sqlSessionFactoryMember;
	
	public int Memberjoin(MemberGeneralVo genner){
		return sqlSessionFactoryMember.insert(NS+".insertMember", genner);
	
	}
	public int insertMemberLinkedVo(MemberLinkedVo linke){
		return sqlSessionFactoryMember.insert(NS+".insertMember", linke);
	}
	public int insertMemberWithdrawVo(MemberWithdrawVo withdraw){
		return sqlSessionFactoryMember.insert(NS+".insertMember",  withdraw);
		
	}
	public int insertMemberWorkstateVo(MemberWorkstateVo workstat){
		return sqlSessionFactoryMember.insert(NS+".insertMember", workstat);	
		
		
	}	
		
}
