package com.cafe24.pickmetop.resume.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.pickmetop.recruit.service.RecruitService;
import com.cafe24.pickmetop.resume.model.ResumeAwardVo;
import com.cafe24.pickmetop.resume.model.ResumeCareerVo;
import com.cafe24.pickmetop.resume.model.ResumeCertificateVo;
import com.cafe24.pickmetop.resume.model.ResumeEtcVo;
import com.cafe24.pickmetop.resume.model.ResumeFamilyVo;
import com.cafe24.pickmetop.resume.model.ResumeHighschoolVo;
import com.cafe24.pickmetop.resume.model.ResumeLanguageVo;
import com.cafe24.pickmetop.resume.model.ResumeMilitaryserviceVo;
import com.cafe24.pickmetop.resume.model.ResumePersonalVo;
import com.cafe24.pickmetop.resume.model.ResumeTrainingVo;
import com.cafe24.pickmetop.resume.model.ResumeUniversityVo;
import com.cafe24.pickmetop.resume.model.ResumeVo;
import com.cafe24.pickmetop.resume.service.ResumeService;


@Controller
public class ResumeController {
	final static Logger Logger = LoggerFactory.getLogger(ResumeController.class);
	@Autowired
	private ResumeService resumeService;
	
	//이력서 입력화면
	@RequestMapping(value="/resumeInsert", method = RequestMethod.GET)
	public String resumeInsert(){
		return "/resume/resumeInsert";
	}
	//이력서 입력처리
	@RequestMapping(value="/resumeInsert", method = RequestMethod.POST)
	public String resumeInsert(ResumeVo resumeVo){
		
	/*	Logger.info("award 매개변수 확인 {}", award.toString());
		Logger.info("career 매개변수 확인 {}", career.toString());
		Logger.info("certificate 매개변수 확인 {}", certificate.toString());
		Logger.info("etc 매개변수 확인 {}", etc.toString());
		Logger.info("family 매개변수 확인 {}", family.toString());
		Logger.info("highshool 매개변수 확인 {}", highshool.toString());
		Logger.info("militaryservice 매개변수 확인 {}", militaryservice.toString());
		Logger.info("language 매개변수 확인 {}", language.toString());
		Logger.info("personal 매개변수 확인 {}", personal.toString());
		Logger.info("training 매개변수 확인 {}", training.toString());
		Logger.info("university 매개변수 확인 {}", university.toString());
		Logger.info("resume 매개변수 확인 {}", resume.toString());
		*/
		resumeService.addResume(resumeVo);
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
