 package com.cafe24.pickmetop.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.pickmetop.member.model.MemberGeneralVo;
import com.cafe24.pickmetop.member.service.MemberService;



@Controller
public class MemberController {
	private  static final Logger Logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	 MemberService memberService;
	//로그인 입력화면
	@RequestMapping(value="/memberGeneralInsert")
	public String memberjoin(){
		return "/member/general/memberGeneralInsert"; 
	}
	
	@RequestMapping(value="/memberGeneralInsert", method = RequestMethod.POST)
	public String memberGeneralInsert(MemberGeneralVo memberGeneralVo){
		Logger.info("MemberGeneralVo:{}", memberGeneralVo.toString());
		memberService.addMember(memberGeneralVo);
	return "/member/general/memberGeneralInsert";
	
	}
	@RequestMapping(value="/memberLinkedInsert", method = RequestMethod.GET)
	public String memberLinkedInsert(){
		return "/member/linked/memberLinkedInsert";
			
	}
	@RequestMapping(value="/memberLinkedInsert", method = RequestMethod.POST)
	public String memberLinkedInsertt(){
		
			return "/member/linked/memberLinkedInsert";	
		}
	
	
	
	
	
	@RequestMapping(value="/terms", method = RequestMethod.GET)
	public String sterms(){
		return "/common/etc/terms";
	}
	
}
	
