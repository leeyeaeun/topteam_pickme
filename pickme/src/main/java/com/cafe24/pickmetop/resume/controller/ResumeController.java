package com.cafe24.pickmetop.resume.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.pickmetop.resume.model.ResumeVo;
import com.cafe24.pickmetop.resume.service.ResumeService;


@Controller
public class ResumeController {
	final static Logger Logger = LoggerFactory.getLogger(ResumeController.class);
	@Autowired
	private ResumeService resumeService;
	
	//01 �̷¼� �Է�ȭ��
	@RequestMapping(value="/resumeInsert", method = RequestMethod.GET)
	public String resumeInsert(){
		return "/resume/resumeInsert";
	}
	//02 �̷¼� �Է�ó��
	@RequestMapping(value="/resumeInsert", method = RequestMethod.POST)
	public String resumeInsert(ResumeVo resume){
		resumeService.addResume(resume);
		return "/resume/resumeInsert";
	}
	//03 �̷¼� ����Ʈ
	@RequestMapping(value="/resumeList", method = RequestMethod.GET)
	public String resumeList(Model model){
		model.addAttribute("resumeList", resumeService.getResumeList());
		return "/resume/resumeList";
	}
	
	//04 �̷¼� �󼼺���
	@RequestMapping(value="/resumeDetail", method = RequestMethod.GET)
	public String resumeDetail(Model model, @RequestParam(value="resumeCd") String resumeCd){
		model.addAttribute("resumeDetail", resumeService.getResumeDetail(resumeCd));
		return "/resume/resumeDetail";
	}
	
	
	//05 �̷¼� ����ó��
	//@RequestMapping(value="")
	//06 �̷¼� ����
	//@RequestMapping(value="")
	
	//00 �ڰ��� �� ���� �˻�������
	@RequestMapping(value="/resumeCertilangIndex", method = RequestMethod.GET)
	public String resumeCertilangIndex(){
		return "/resume/resumeCertilangIndex";
	}
}
