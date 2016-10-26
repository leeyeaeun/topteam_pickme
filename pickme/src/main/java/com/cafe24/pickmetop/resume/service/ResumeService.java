package com.cafe24.pickmetop.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.cafe24.pickmetop.resume.repository.ResumeDao;

@Service
public class ResumeService {
	@Autowired
	ResumeDao resumeDao;
	public void insertResume(ResumeVo resume, ResumeAwardVo award, ResumeCareerVo career, ResumeCertificateVo certif, 
			ResumeEducationVo edu, ResumeEtcVo etc, ResumeFamilyVo family, ResumeLangaugeVo language, ResumeMilitaryserviceVo military,
			ResumePersonalVo personal, ResumeTrainningVo trainning){
		resumeDao.insertResume(resume, award, career, certif, edu, etc, family, language, military, personal, trainning);
	}
}
