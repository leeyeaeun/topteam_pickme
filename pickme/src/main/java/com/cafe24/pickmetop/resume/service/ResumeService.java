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
	final String resumeCd = "resume_cd_51";
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
		ResumeUniversityVo university = new ResumeUniversityVo();
		university.setResumeCd(resumeCd);
		university.setUniversityName(resume.getUniversityName());
		university.setUniversityCategory(resume.getUniversityCategory());
		university.setUniversityBegindate(resume.getUniversityBegindate());
		university.setUniversityEnddate(resume.getUniversityEnddate());
		university.setUniversityMajor(resume.getUniversityDmajorminor());
		university.setUniversityDmajorminorName(resume.getUniversityDmajorminorName());
		university.setUniversityCredit(resume.getUniversityCredit());
		resumeDao.insertResumeUniversity(university);
		
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
		ResumeCertificateVo certificate = new ResumeCertificateVo();
		certificate.setResumeCd(resumeCd);
		certificate.setCertificateCd(resume.getCertificateCd());
		certificate.setCertificateGrade(resume.getCertificateGrade());
		certificate.setCertificateHost(resume.getCertificateHost());
		certificate.setCertificateBegindate(resume.getCertificateBegindate());
		certificate.setCertificateEnddate(resume.getCertificateEnddate());
		certificate.setCertificateRegnum(resume.getCertificateEnddate());
		resumeDao.insertResumeCertificate(certificate);
		
		//07 경력사항
		ResumeCareerVo career = new ResumeCareerVo();
		career.setResumeCd(resumeCd);
		career.setCareerCompany(resume.getCareerCompany());
		career.setCareerBegindate(resume.getCareerBegindate());
		career.setCareerEnddate(resume.getCareerEnddate());
		career.setCareerPeriod(resume.getCareerPeriod());
		career.setCareerResign(resume.getCareerResign());
		career.setCareerLevel(resume.getCareerLevel());
		career.setCareerDepartment(resume.getCareerDepartment());
		career.setCareerTask(resume.getCareerTask());
		resumeDao.insertResumeCareer(career);
		
		//08 어학
		ResumeLanguageVo language = new ResumeLanguageVo();
		language.setResumeCd(resumeCd);
		language.setLanguageName(resume.getLanguageName());
		language.setLanguageTest(resume.getLanguageTest());
		language.setLanguageGrade(resume.getLanguageGrade());
		language.setLanguageLevel(resume.getLanguageLevel());
		language.setLanguageBegindate(resume.getLanguageBegindate());
		language.setLanguageEnddate(resume.getLanguageEnddate());
		language.setLanguageRegnum(resume.getLanguageRegnum());
		language.setLanguageHost(resume.getLanguageHost());
		resumeDao.insertResumeLanguage(language);
		
		//09 수상경력
		ResumeAwardVo award = new ResumeAwardVo();
		award.setResumeCd(resumeCd);
		award.setAwardName(resume.getAwardName());
		award.setAwardContent(resume.getAwardContent());
		award.setAwardHost(resume.getAwardHost());
		award.setAwardDate(resume.getAwardDate());
		resumeDao.insertResumeAward(award);
		
		//10 국내외연수
		ResumeTrainingVo training = new ResumeTrainingVo();
		training.setResumeCd(resumeCd);
		training.setTrainingCountry(resume.getTrainingCountry());
		training.setTrainingAcademy(resume.getTrainingAcademy());
		training.setTrainingBegindate(resume.getTrainingBegindate());
		training.setTrainingEnddate(resume.getTrainingEnddate());
		training.setTrainingContent(resume.getTrainingContent());
		resumeDao.insertResumeTraining(training);
		
		//11 동아리
		ResumeClubVo club = new ResumeClubVo();
		club.setResumeCd(resumeCd);
		club.setClubHost(resume.getClubHost());
		club.setClubName(resume.getClubName());
		club.setClubBegindate(resume.getClubBegindate());
		club.setClubEnddate(resume.getClubEnddate());
		club.setClubContent(resume.getClubContent());
		resumeDao.insertResumeClub(club);
		
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
