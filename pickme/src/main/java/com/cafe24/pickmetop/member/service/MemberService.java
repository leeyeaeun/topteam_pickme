package com.cafe24.pickmetop.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.pickmetop.member.model.MemberGeneralVo;
import com.cafe24.pickmetop.member.model.MemberLinkedVo;
import com.cafe24.pickmetop.member.model.MemberWithdrawVo;
import com.cafe24.pickmetop.member.model.MemberWorkstateVo;
import com.cafe24.pickmetop.member.repository.MemberDao;

@Service
public class MemberService {
	@Autowired
	MemberDao memberDao;
	public void insertMember(MemberGeneralVo genner, MemberLinkedVo linked, MemberWithdrawVo withdraw, 
				MemberWorkstateVo workstate){
		memberDao.insertMember(genner, linked, withdraw, workstate);
	}
}
