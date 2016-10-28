package com.cafe24.pickmetop.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.pickmetop.member.model.MemberGeneralVo;
import com.cafe24.pickmetop.member.model.MemberLinkedVo;
import com.cafe24.pickmetop.member.model.MemberWithdrawVo;
import com.cafe24.pickmetop.member.model.MemberWorkstateVo;
import com.cafe24.pickmetop.member.service.MemberService;

@Controller
public class MemberController {
	final static Logger Logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired
	private MemberService memberService;
	
	//로그인 입력화면
	@RequestMapping(value="/memberGeneralInsert", method = RequestMethod.GET)
	public String memberInsert(){
		return "/member/general/memberGeneralInsert";
	}
	//로그인 입력처리
		@RequestMapping(value="/memberGeneralInsert", method = RequestMethod.POST)
		public String memberInsert(MemberGeneralVo genner, MemberLinkedVo linked, MemberWithdrawVo withdraw, 
				MemberWorkstateVo workstate){
			Logger.info("MemberGeneralVo :{}", genner.toString());
			Logger.info("MemberLinkedVo :{}", linked.toString());
			Logger.info("MemberWithdrawVo :{}", withdraw.toString());
			Logger.info("MemberWorkstateVo :{}", workstate.toString());
			
			return "/member/general/memberGeneralInsert";
		}
		
}
