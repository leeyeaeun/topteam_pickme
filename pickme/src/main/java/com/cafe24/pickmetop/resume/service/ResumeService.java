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
	
	// 01_�̷¼� �Է�
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
		Logger.info("�̷¼� �Է� : {}", resumeVo.toString());
		Logger.info("���νŻ� �Է� : {}", personalVo.toString());
		Logger.info("����б� �Է� : {}", highschoolVo.toString());
		Logger.info("���б� �Է� : {}", universityVo.toString());
		Logger.info("���� �Է� : {}", familyVo.toString());
		Logger.info("���� �Է� : {}", militaryserviceVo.toString());
		Logger.info("�ڰ��� �Է� : {}", certificateVo.toString());
		Logger.info("��� �Է� : {}", careerVo.toString());
		Logger.info("���� �Է� : {}", languageVo.toString());
		Logger.info("�����̷� �Է� : {}", awardVo.toString());
		Logger.info("�����ܿ��� �Է� : {}", trainingVo.toString());
		Logger.info("���Ƹ�, ��ȣȸ �Է� : {}", clubVo.toString());
		Logger.info("��Ÿ,��Ʈ������ �Է� : {}", etcVo.toString());
	}
	
	// 02_�̷¼� ����Ʈ
	public List<ResumeVo> getResumeList(){
		return resumeDao.selectResumeList();
	}
	
	// 03_�̷¼� �󼼺���
	public ResumeVo getResumeDetail(String resumeCd){
		return resumeDao.selectResumeDetailByResumeCd(resumeCd);
	}
	
}
