 package com.cafe24.pickmetop.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	private  static final Logger Logger = LoggerFactory.getLogger(MemberController.class);
	
	
	//로그인 입력화면
	@RequestMapping("/memberGeneralInsert")
	public String memberInsert(){
		return "/member/general/memberGeneralInsert"; 
	}
	
	@RequestMapping(value="/memberGeneralInsert", method = RequestMethod.POST)
	public String memberInsertt(Model model){
		Logger.debug("Modal:{}", model);
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
	
