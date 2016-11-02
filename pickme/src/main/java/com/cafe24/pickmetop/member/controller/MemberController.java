 package com.cafe24.pickmetop.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.pickmetop.member.service.MemberService;



@Controller
public class MemberController {
	private  static final Logger Logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService memberservice;
	//로그인 입력화면
	@RequestMapping(value="/memberGeneralInsert")
	public String memberjoin(){
		return "/member/general/memberGeneralInsert"; 
	}
	
	@RequestMapping(value="/memberGeneralInsert", method = RequestMethod.POST)
	public String memberjoinn(@RequestParam String id, String pw){
		
		Logger.info("스마트정보교육원{}", id.toString());
		Logger.info("정보:{}", pw.toString());	
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
	
