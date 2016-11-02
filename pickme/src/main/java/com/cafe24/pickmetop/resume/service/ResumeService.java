package com.cafe24.pickmetop.resume.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	final String resumeCd = "resume_cd_22";
	// 이력서 입력
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
		highschool.setResumeCd(resumeCd);
		highschool.setHighschoolName(resume.getHighschoolName());
		highschool.setHighschoolCategory(resume.getHighschoolCategory());
		highschool.setHighschoolBegindate(resume.getHighschoolBegindate());
		highschool.setHighschoolEnddate(resume.getHighschoolEnddate());
		resumeDao.insertResumeHighschool(highschool);
		
		//03 대학교
		for(int i=0; i<resume.getUniversityName().size(); i++){
		ResumeUniversityVo university = new ResumeUniversityVo();
			university.setResumeCd(resumeCd);
			university.setUniversityName(resume.getUniversityName().get(i));
			university.setUniversityCategory(resume.getUniversityCategory().get(i));
			university.setUniversityBegindate(resume.getUniversityBegindate().get(i));
			university.setUniversityEnddate(resume.getUniversityEnddate().get(i));
			university.setUniversityMajor(resume.getUniversityDmajorminor().get(i));
			university.setUniversityDmajorminorName(resume.getUniversityDmajorminorName().get(i));
			university.setUniversityCredit(resume.getUniversityCredit().get(i));
			resumeDao.insertResumeUniversity(university);
			}
		
		//04 가족
		for(int i = 0; i<resume.getFamilyRelation().size(); i++ ){
			ResumeFamilyVo family = new ResumeFamilyVo();
			family.setResumeCd(resumeCd);
			family.setFamilyRelation(resume.getFamilyRelation().get(i));
			family.setFamilyName(resume.getFamilyName().get(i));
			family.setFamilyBirthdate(resume.getFamilyBirthdate().get(i));
			family.setFamilyEducation(resume.getFamilyEducation().get(i));
			family.setFamilyJob(resume.getFamilyJob().get(i));
			family.setFamilyCohabit(resume.getFamilyCohabit().get(i));
			resumeDao.insertResumeFamily(family);
		}
		
		//05 병역
		ResumeMilitaryserviceVo militaryService = new ResumeMilitaryserviceVo();
		militaryService.setResumeCd(resumeCd);
		militaryService.setMilitaryserviceState(resume.getMilitaryserviceState());
		militaryService.setMilitaryserviceGroup(resume.getMilitaryserviceGroup());
		militaryService.setMilitaryserviceLevel(resume.getMilitaryserviceLevel());
		militaryService.setMilitaryserviceBranch(resume.getMilitaryserviceBranch());
		militaryService.setMilitaryserviceBegindate(resume.getMilitaryserviceBegindate());
		militaryService.setMilitaryserviceEnddate(resume.getMilitaryserviceEnddate());
		resumeDao.insertResumeMilitaryservice(militaryService);
		
		//06 자격면허
		for(int i=0; i<resume.getCertificateName().size(); i++){
			ResumeCertificateVo certificate = new ResumeCertificateVo();
			certificate.setResumeCd(resumeCd);
			certificate.setCertificateName(resume.getCertificateName().get(i));
			certificate.setCertificateCd(resume.getCertificateCd().get(i));
			certificate.setCertificateGrade(resume.getCertificateGrade().get(i));
			certificate.setCertificateHost(resume.getCertificateHost().get(i));
			certificate.setCertificateBegindate(resume.getCertificateBegindate().get(i));
			certificate.setCertificateEnddate(resume.getCertificateEnddate().get(i));
			certificate.setCertificateRegnum(resume.getCertificateEnddate().get(i));
			resumeDao.insertResumeCertificate(certificate);
		}
		
		//07 경력사항
		for(int i=0; i<resume.getCareerCompany().size(); i++){
			ResumeCareerVo career = new ResumeCareerVo();
			career.setResumeCd(resumeCd);
			career.setCareerCompany(resume.getCareerCompany().get(i));
			career.setCareerBegindate(resume.getCareerBegindate().get(i));
			career.setCareerEnddate(resume.getCareerEnddate().get(i));
			career.setCareerPeriod(resume.getCareerPeriod().get(i));
			career.setCareerResign(resume.getCareerResign().get(i));
			career.setCareerLevel(resume.getCareerLevel().get(i));
			career.setCareerDepartment(resume.getCareerDepartment().get(i));
			career.setCareerTask(resume.getCareerTask().get(i));
			resumeDao.insertResumeCareer(career);
		}
		
		//08 어학
		for(int i=0; i<resume.getLanguageName().size(); i++){
			ResumeLanguageVo language = new ResumeLanguageVo();
			language.setResumeCd(resumeCd);
			language.setLanguageName(resume.getLanguageName().get(i));
			language.setLanguageTest(resume.getLanguageTest().get(i));
			language.setLanguageGrade(resume.getLanguageGrade().get(i));
			language.setLanguageLevel(resume.getLanguageLevel().get(i));
			language.setLanguageBegindate(resume.getLanguageBegindate().get(i));
			language.setLanguageEnddate(resume.getLanguageEnddate().get(i));
			language.setLanguageRegnum(resume.getLanguageRegnum().get(i));
			language.setLanguageHost(resume.getLanguageHost().get(i));
			resumeDao.insertResumeLanguage(language);
		}
		
		//09 수상경력
		for(int i=0; i<resume.getAwardName().size(); i++){
			ResumeAwardVo award = new ResumeAwardVo();
			award.setResumeCd(resumeCd);
			award.setAwardName(resume.getAwardName().get(i));
			award.setAwardContent(resume.getAwardContent().get(i));
			award.setAwardHost(resume.getAwardHost().get(i));
			award.setAwardDate(resume.getAwardDate().get(i));
			resumeDao.insertResumeAward(award);
		}
		
		//10 국내외연수
		for(int i=0; i<resume.getTrainingCountry().size(); i++){
			ResumeTrainingVo training = new ResumeTrainingVo();
			training.setResumeCd(resumeCd);
			training.setTrainingCountry(resume.getTrainingCountry().get(i));
			training.setTrainingAcademy(resume.getTrainingAcademy().get(i));
			training.setTrainingBegindate(resume.getTrainingBegindate().get(i));
			training.setTrainingEnddate(resume.getTrainingEnddate().get(i));
			training.setTrainingContent(resume.getTrainingContent().get(i));
			resumeDao.insertResumeTraining(training);
		}
		
		//11 동아리
		for(int i=0; i<resume.getClubName().size(); i++){
			ResumeClubVo club = new ResumeClubVo();
			club.setResumeCd(resumeCd);
			club.setClubName(resume.getClubName().get(i));
			club.setClubHost(resume.getClubHost().get(i));
			club.setClubBegindate(resume.getClubBegindate().get(i));
			club.setClubEnddate(resume.getClubEnddate().get(i));
			club.setClubContent(resume.getClubContent().get(i));
			resumeDao.insertResumeClub(club);
		}
		
		//12 기타 및 포트폴리오
		ResumeEtcVo etc = new ResumeEtcVo();
		etc.setResumeCd(resumeCd);
		etc.setEtcTitle(resume.getEtcTitle());
		etc.setEtcContent(resume.getEtcContent());
		etc.setEtcBegindate(resume.getEtcBegindate());
		etc.setEtcEnddate(resume.getEtcEnddate());
		resumeDao.insertResumeEtc(etc);
	}
	//이력서 리스트
	public List<ResumeVo> getResumeList(){
		return resumeDao.selectResumeList();
	}
	//이력서 상세보기
	public ResumeVo getResumeDetail(String resumeCd){
		return resumeDao.selectResumeDetailByResumeCd(resumeCd);
	}
}
