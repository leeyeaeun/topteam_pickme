package com.cafe24.pickmetop.resume.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
import com.cafe24.pickmetop.resume.repository.ResumeDao;

@Service
public class ResumeService {
	final static Logger Logger = LoggerFactory.getLogger(ResumeService.class);
	@Autowired
	ResumeDao resumeDao;
	
	// 01_이력서 입력
	@Transactional
	public void addResume(ResumeVo resumeVo, ResumePersonalVo personalVo, ResumeHighschoolVo highschoolVo, ResumeUniversityVo universityVo, 
			ResumeFamilyVo familyVo, ResumeMilitaryserviceVo militaryserviceVo, ResumeCertificateVo certificateVo, ResumeCareerVo careerVo, 
			ResumeLanguageVo languageVo, ResumeAwardVo awardVo, ResumeTrainingVo trainingVo, ResumeClubVo clubVo, ResumeEtcVo etcVo){
		
		resumeVo.setLoginId("walbatrossw@gmail.com");
		
		resumeDao.insertResume(resumeVo);
		resumeDao.insertResumePersonal(personalVo);
		resumeDao.insertResumeHighschool(highschoolVo);
		resumeDao.insertResumeUniversity(universityVo);
		resumeDao.insertResumeFamily(familyVo);
		resumeDao.insertResumeMilitaryservice(militaryserviceVo);
		resumeDao.insertResumeCertificate(certificateVo);
		resumeDao.insertResumeCareer(careerVo);
		resumeDao.insertResumeLanguage(languageVo);
		resumeDao.insertResumeAward(awardVo);
		resumeDao.insertResumeTraining(trainingVo);
		resumeDao.insertResumeClub(clubVo);
		resumeDao.insertResumeEtc(etcVo);
		Logger.info("이력서 입력 : {}", resumeVo.toString());
		Logger.info("개인신상 입력 : {}", personalVo.toString());
		Logger.info("고등학교 입력 : {}", highschoolVo.toString());
		Logger.info("대학교 입력 : {}", universityVo.toString());
		Logger.info("가족 입력 : {}", familyVo.toString());
		Logger.info("병역 입력 : {}", militaryserviceVo.toString());
		Logger.info("자격증 입력 : {}", certificateVo.toString());
		Logger.info("경력 입력 : {}", careerVo.toString());
		Logger.info("어학 입력 : {}", languageVo.toString());
		Logger.info("수상이력 입력 : {}", awardVo.toString());
		Logger.info("국내외연수 입력 : {}", trainingVo.toString());
		Logger.info("동아리, 동호회 입력 : {}", clubVo.toString());
		Logger.info("기타,포트폴리오 입력 : {}", etcVo.toString());
	}
	
	// 02_이력서 리스트
	public List<ResumeVo> getResumeList(){
		return resumeDao.selectResumeList();
	}
	
	// 03_이력서 상세보기
	public ResumeVo getResumeDetail(String resumeCd){
		return resumeDao.selectResumeDetailByResumeCd(resumeCd);
	}
	
}
