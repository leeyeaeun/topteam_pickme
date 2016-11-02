package com.cafe24.pickmetop.member.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.pickmetop.member.model.MemberGeneralVo;
import com.cafe24.pickmetop.member.repository.MemberDao;

@Service
public class MemberService {
	private static final Logger logger = LoggerFactory.getLogger(MemberService.class);
	
	@Autowired
	MemberDao memberDao;
	
	public void addMember(MemberGeneralVo memberGeneralVo){
		 memberDao.insertMemberGeneral(memberGeneralVo);
		
		
	}
			
	
}
