package com.cafe24.pickmetop.resume.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.pickmetop.resume.model.ResumeHighschoolVo;
import com.cafe24.pickmetop.resume.model.ResumePersonalVo;
import com.cafe24.pickmetop.resume.model.ResumeUniversityVo;
import com.cafe24.pickmetop.resume.model.ResumeVo;
import com.cafe24.pickmetop.resume.repository.ResumeDao;

@Service
public class ResumeService {
	final static Logger Logger = LoggerFactory.getLogger(ResumeService.class);
	@Autowired
	ResumeDao resumeDao;
	final String resumeCd = "resume_cd_9";
	
	public void addResume(ResumeVo resume){
		resume.setResumeCd(resumeCd);
		resume.setLoginId("더블에스");
		resumeDao.insertResume(resume);
		//01 개인신상
		ResumePersonalVo personal = new ResumePersonalVo();
		personal.setResumeCd(resumeCd);
		personal.setPersonalKorname(resume.getPersonalKorname());
		personal.setPersonalEngname(resume.getPersonalEngname());
		personal.setPersonalBirthdate(resume.getPersonalBirthdate());
		personal.setPersonalGender(resume.getPersonalGender());
		personal.setPersonalPhone(resume.getPersonalPhone());
		personal.setPersonalCellphone(resume.getPersonalCellphone());
		personal.setPersonalEmail(resume.getPersonalEmail());
		personal.setPersonalSns(resume.getPersonalSns());
		personal.setPersonalAddr(resume.getPersonalAddr());
		resumeDao.insertResumePersonal(personal);
		
		//02 고등학교
		ResumeHighschoolVo highschool = new ResumeHighschoolVo();
		highschool.setResumeCd(resume.getResumeCd());
		highschool.setHighschoolName(resume.getHighschoolName());
		highschool.setHighschoolCategory(resume.getHighschoolCategory());
		highschool.setHighschoolBegindate(resume.getHighschoolBegindate());
		highschool.setHighschoolEnddate(resume.getHighschoolEnddate());
		resumeDao.insertResumeHighschool(highschool);
		
		//03 대학교
		ResumeUniversityVo university = new ResumeUniversityVo();
		university.setResumeCd(resume.getResumeCd());
		university.setUniversityName(resume.getUniversityName());
		university.setUniversityCategory(resume.getUniversityCategory());
		university.setUniversityBegindate(resume.getUniversityBegindate());
		university.setUniversityEnddate(resume.getUniversityEnddate());
		university.setUniversityMajor(resume.getUniversityDmajorminor());
		university.setUniversityDmajorminorName(resume.getUniversityDmajorminorName());
		university.setUniversityCredit(resume.getUniversityCredit());
		resumeDao.insertResumeUniversity(university);
	}
}
