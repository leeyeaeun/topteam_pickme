package com.cafe24.pickmetop.resume.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.pickmetop.resume.model.ResumeAwardVo;
import com.cafe24.pickmetop.resume.model.ResumeCareerVo;
import com.cafe24.pickmetop.resume.model.ResumeCertificateVo;
import com.cafe24.pickmetop.resume.model.ResumeClubVo;
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
	
	//01 이력서 입력화면
	@RequestMapping(value="/resumeInsert", method = RequestMethod.GET)
	public String resumeInsert(){
		return "/resume/resumeInsert";
	}
	/*//02 이력서 입력처리
	@RequestMapping(value="/resumeInsert", method = RequestMethod.POST)
	public String resumeInsert(ResumeVo resume){
		resumeService.addResume(resume);
		Logger.info(resume.toString());
		return "/resume/resumeInsert";
	}*/
	//02 이력서 입력처리
	@RequestMapping(value="/resumeInsert", method = RequestMethod.POST)
	public String resumeInsert(ResumeVo resumeVo, ResumePersonalVo personalVo, ResumeHighschoolVo highschoolVo, ResumeUniversityVo universityVo, 
			ResumeFamilyVo resumeFamilyVo, ResumeMilitaryserviceVo militaryserviceVo, ResumeCertificateVo certificateVo, ResumeCareerVo careerVo, 
			ResumeLanguageVo languageVo, ResumeAwardVo awardVo, ResumeTrainingVo trainingVo, ResumeClubVo clubVo, ResumeEtcVo etcVo){
		Logger.info("이력서 입력 : {}", resumeVo.toString());
		Logger.info("개인신상 입력 : {}", personalVo.toString());
		Logger.info("고등학교 입력 : {}", highschoolVo.toString());
		Logger.info("대학교 입력 : {}", universityVo.toString());
		Logger.info("가족 입력 : {}", resumeFamilyVo.getResumeFamilyVoList().toString());
		Logger.info("병역 입력 : {}", militaryserviceVo.toString());
		Logger.info("자격증 입력 : {}", certificateVo.toString());
		Logger.info("경력 입력 : {}", careerVo.toString());
		Logger.info("어학 입력 : {}", languageVo.toString());
		Logger.info("수상이력 입력 : {}", awardVo.toString());
		Logger.info("국내외연수 입력 : {}", trainingVo.toString());
		Logger.info("동아리, 동호회 입력 : {}", clubVo.toString());
		Logger.info("기타,포트폴리오 입력 : {}", etcVo.toString());
		/*resumeService.addResume(resumeVo, personalVo, highschoolVo, universityVo, familyVo, militaryserviceVo, 
				certificateVo, careerVo, languageVo, awardVo, trainingVo, clubVo, etcVo);*/
		return "/resume/resumeInsert";
	}
	
	//03 이력서 리스트
	@RequestMapping(value="/resumeList", method = RequestMethod.GET)
	public String resumeList(Model model){
		model.addAttribute("resumeList", resumeService.getResumeList());
		Logger.info("이력서 리스트 : {}", model.toString());
		return "/resume/resumeList";
	}
	
	//04 이력서 상세보기
	@RequestMapping(value="/resumeDetail", method = RequestMethod.GET)
	public String resumeDetail(Model model, @RequestParam(value="resumeCd") String resumeCd){
		model.addAttribute("resumeDetail", resumeService.getResumeDetail(resumeCd));
		Logger.info(model.toString());
		Logger.info(resumeCd.toString());
		return "/resume/resumeDetail";
	}
	
	
	//05 이력서 수정처리
	//@RequestMapping(value="/resumeUpdate", method = RequestMethod.POST)
	//06 이력서 삭제
	//@RequestMapping(value="/resumeDelete", method = RequestMethod.POST)
	
	//00 자격증 및 어학 검색페이지
	@RequestMapping(value="/resumeCertilangIndex", method = RequestMethod.GET)
	public String resumeCertilangIndex(){
		return "/resume/resumeCertilangIndex";
	}
}
