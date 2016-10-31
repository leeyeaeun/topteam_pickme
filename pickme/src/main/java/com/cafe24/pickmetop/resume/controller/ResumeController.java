package com.cafe24.pickmetop.resume.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.pickmetop.resume.model.ResumeVo;
import com.cafe24.pickmetop.resume.service.ResumeService;


@Controller
public class ResumeController {
	final static Logger Logger = LoggerFactory.getLogger(ResumeController.class);
	@Autowired
	private ResumeService resumeService;
	
	//01 이력서 입력화면
	@RequestMapping(value="/resumeInsert", method = RequestMethod.GET)
	public String resumeInsert(){
		return "/resume/resumeInsert";
	}
	//02 이력서 입력처리
	@RequestMapping(value="/resumeInsert", method = RequestMethod.POST)
	public String resumeInsert(ResumeVo resume){
		resumeService.addResume(resume);
		return "/resume/resumeInsert";
	}
	//03 이력서 리스트
	@RequestMapping(value="/resumeList", method = RequestMethod.POST)
	public String resumeList(){
		return "/resume/resumeList";
	}
	
	//04 이력서 수정화면
	//@RequestMapping(value="")
	//05 이력서 수정처리
	//@RequestMapping(value="")
	//06 이력서 삭제
	//@RequestMapping(value="")
	
	//00 자격증 및 어학 검색페이지
	@RequestMapping(value="/resumeCertilangIndex", method = RequestMethod.GET)
	public String resumeCertilangIndex(){
		return "/resume/resumeCertilangIndex";
	}
}
