package com.cafe24.pickmetop.resume.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.pickmetop.recruit.service.RecruitService;
import com.cafe24.pickmetop.resume.model.ResumeAwardVo;
import com.cafe24.pickmetop.resume.model.ResumeCareerVo;
import com.cafe24.pickmetop.resume.model.ResumeCertificateVo;
import com.cafe24.pickmetop.resume.model.ResumeEducationVo;
import com.cafe24.pickmetop.resume.model.ResumeEtcVo;
import com.cafe24.pickmetop.resume.model.ResumeFamilyVo;
import com.cafe24.pickmetop.resume.model.ResumeLangaugeVo;
import com.cafe24.pickmetop.resume.model.ResumeMilitaryserviceVo;
import com.cafe24.pickmetop.resume.model.ResumePersonalVo;
import com.cafe24.pickmetop.resume.model.ResumeTrainningVo;
import com.cafe24.pickmetop.resume.model.ResumeVo;

@Controller
public class ResumeController {
	final static Logger Logger = LoggerFactory.getLogger(ResumeController.class);
	@Autowired
	private RecruitService recruitService;
	
	//이력서 입력화면
	@RequestMapping(value="/resumeInsert", method = RequestMethod.GET)
	public String resumeInsert(){
		return "/resume/resumeInsert";
	}
	//이력서 입력처리
	@RequestMapping(value="/resumeInsert", method = RequestMethod.POST)
	public String resumeInsert(ResumeVo resume, ResumeAwardVo award, ResumeCareerVo career, ResumeCertificateVo certif, 
			ResumeEducationVo edu, ResumeEtcVo etc, ResumeFamilyVo family, ResumeLangaugeVo language, ResumeMilitaryserviceVo military,
			ResumePersonalVo personal, ResumeTrainningVo trainning){
		Logger.info("ResumeVo : {}", resume.toString());
		Logger.info("ResumeAwardVo : {}", award.toString());
		Logger.info("ResumeCareerVo : {}", career.toString());
		Logger.info("ResumeCertificateVo : {}", certif.toString());
		Logger.info("ResumeEducationVo : {}", edu.toString());
		Logger.info("ResumeEtcVo : {}", etc.toString());
		Logger.info("ResumeFamilyVo : {}", family.toString());
		Logger.info("ResumeLangaugeVo : {}", language.toString());
		Logger.info("ResumeMilitaryserviceVo : {}", military.toString());
		Logger.info("ResumePersonalVo : {}", personal.toString());
		Logger.info("ResumeTrainningVo : {}", trainning.toString());
		
		return "/resume/resumeInsert";
	}
	//이력서 리스트
	@RequestMapping(value="/resumeList", method = RequestMethod.POST)
	public String resumeList(){
		return "/resume/resumeList";
	}
	
	//이력서 수정화면
	//@RequestMapping(value="")
	//이력서 수정처리
	//@RequestMapping(value="")
	//이력서 삭제
	//@RequestMapping(value="")
	
	//자격증 및 어학 검색페이지
	@RequestMapping(value="/resumeCertilangIndex", method = RequestMethod.GET)
	public String resumeCertilangIndex(){
		return "/resume/resumeCertilangIndex";
	}
}
