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
	
	//일반회원 가입
	public int insertMemberGeneral(MemberGeneralVo memberGeneralVo){
		return sqlSessionFactoryMember.insert(NS+".insertMemberGeneral", memberGeneralVo);
	
	}
	//api 연동회원 로그인
	public int insertMemberLinked(MemberLinkedVo linke){
		return sqlSessionFactoryMember.insert(NS+".insertMemberLinked", linke);
	}
	
	public int insertMemberWithdraw(MemberWithdrawVo withdraw){
		return sqlSessionFactoryMember.insert(NS+".insertMemberWithdraw",  withdraw);
		
	}
	public int insertMemberWorkstate(MemberWorkstateVo workstat){
		return sqlSessionFactoryMember.insert(NS+".insertMemberWorkstate", workstat);	
		
		
	}	
		
}
