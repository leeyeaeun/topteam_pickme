 package com.cafe24.pickmetop.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cafe24.pickmetop.member.model.MemberGeneralVo;
import com.cafe24.pickmetop.member.service.MemberService;



@Controller
public class MemberController {
	private  static final Logger Logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	 MemberService memberService;
	//01_01 일반회원가입 입력화면
	@RequestMapping(value="/memberGeneralInsert", method = RequestMethod.GET)
	public String memberGeneralInsert(){
		return "/member/general/memberGeneralInsert"; 
	}
	//01_02 일반회원가입 입력처리
	@RequestMapping(value="/memberGeneralInsert", method = RequestMethod.POST)
	public ModelAndView memberGeneralInsertt(HttpServletRequest httpServletRequest){
	
		String generalId = httpServletRequest.getParameter("id");
		System.out.println("id:"+ generalId);
		ModelAndView mv =new ModelAndView();
		mv.setViewName("index");
		mv.addObject("index", generalId);
		return mv;
	}
	
	//02_01 일반회원 로그인화면
	@RequestMapping(value="/memberGeneral", method = RequestMethod.POST)
	public String memberGeneraView(String generalId, String generalPw){
	
	return "/memberGeneral";
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
	
