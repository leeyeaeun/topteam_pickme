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
	
	//�̷¼� �Է�ȭ��
	@RequestMapping(value="/resumeInsert", method = RequestMethod.GET)
	public String resumeInsert(){
		return "/resume/resumeInsert";
	}
	//�̷¼� �Է�ó��
	@RequestMapping(value="/resumeInsert", method = RequestMethod.POST)
	public String resumeInsert(ResumeVo resumeVo){
		
	/*	Logger.info("award �Ű����� Ȯ�� {}", award.toString());
		Logger.info("career �Ű����� Ȯ�� {}", career.toString());
		Logger.info("certificate �Ű����� Ȯ�� {}", certificate.toString());
		Logger.info("etc �Ű����� Ȯ�� {}", etc.toString());
		Logger.info("family �Ű����� Ȯ�� {}", family.toString());
		Logger.info("highshool �Ű����� Ȯ�� {}", highshool.toString());
		Logger.info("militaryservice �Ű����� Ȯ�� {}", militaryservice.toString());
		Logger.info("language �Ű����� Ȯ�� {}", language.toString());
		Logger.info("personal �Ű����� Ȯ�� {}", personal.toString());
		Logger.info("training �Ű����� Ȯ�� {}", training.toString());
		Logger.info("university �Ű����� Ȯ�� {}", university.toString());
		Logger.info("resume �Ű����� Ȯ�� {}", resume.toString());
		*/
		resumeService.addResume(resumeVo);
		return "/resume/resumeInsert";
	}
	//�̷¼� ����Ʈ
	@RequestMapping(value="/resumeList", method = RequestMethod.POST)
	public String resumeList(){
		return "/resume/resumeList";
	}
	
	//�̷¼� ����ȭ��
	//@RequestMapping(value="")
	//�̷¼� ����ó��
	//@RequestMapping(value="")
	//�̷¼� ����
	//@RequestMapping(value="")
	
	//�ڰ��� �� ���� �˻�������
	@RequestMapping(value="/resumeCertilangIndex", method = RequestMethod.GET)
	public String resumeCertilangIndex(){
		return "/resume/resumeCertilangIndex";
	}
}
