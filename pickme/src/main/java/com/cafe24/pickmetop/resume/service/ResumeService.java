package com.cafe24.pickmetop.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.pickmetop.resume.model.ResumeAwardVo;
import com.cafe24.pickmetop.resume.model.ResumeCareerVo;
import com.cafe24.pickmetop.resume.model.ResumeCertificateVo;
import com.cafe24.pickmetop.resume.model.ResumeHighschoolVo;
import com.cafe24.pickmetop.resume.model.ResumeEtcVo;
import com.cafe24.pickmetop.resume.model.ResumeFamilyVo;
import com.cafe24.pickmetop.resume.model.ResumeLanguageVo;
import com.cafe24.pickmetop.resume.model.ResumeMilitaryserviceVo;
import com.cafe24.pickmetop.resume.model.ResumePersonalVo;
import com.cafe24.pickmetop.resume.model.ResumeTrainingVo;
import com.cafe24.pickmetop.resume.model.ResumeVo;
import com.cafe24.pickmetop.resume.repository.ResumeDao;

@Service
public class ResumeService {
	@Autowired
	ResumeDao resumeDao;
	public void addResume(ResumeVo resumeVo){
		resumeVo.setResumeCd("resume_cd_5");
		resumeVo.setLoginId("À±»ó¼·");
		ResumePersonalVo resumePersonalVo = new ResumePersonalVo();
		resumePersonalVo.setResumeCd(resumeVo.getResumeCd());
		resumePersonalVo.setPersonalKorname(resumeVo.getPersonalKorname());
		resumePersonalVo.setPersonalEngname(resumeVo.getPersonalEngname());
		resumePersonalVo.setPersonalBirthdate(resumeVo.getPersonalBirthdate());
		resumePersonalVo.setPersonalPhone(resumeVo.getPersonalPhone());
		resumePersonalVo.setPersonalCellphone(resumeVo.getPersonalCellphone());
		resumePersonalVo.setPersonalEmail(resumeVo.getPersonalEmail());
		resumePersonalVo.setPersonalSns(resumeVo.getPersonalSns());
		resumePersonalVo.setPersonalAddr(resumeVo.getPersonalAddr());
		
		resumeDao.insertResume(resumeVo);
		resumeDao.insertResumePersonal(resumePersonalVo);
	}
}
