package com.cafe24.pickmetop.resume.model;

import java.util.List;

public class ResumeVo {
	//00 이력서 입력
	private String resumeCd;
	private String loginId;
	private String resumeName;
	private String resumeRegdate;
	private String resumeModidate;
	//01 개인신상
	private String personalKorname;
	private String personalEngname;
	private String personalBirthdate;
	private String personalGender;
	private String personalPhone;
	private String personalCellphone;
	private String personalEmail;
	private String personalSns;
	private String personalAddr;
	//private MultipartFile personalPhoto;
	//02 고등학교
	private String highschoolName;
	private String highschoolCategory;
	private String highschoolBegindate;
	private String highschoolEnddate;
	//03 대학교
	private List<String> universityName;
	private List<String> universityCategory;
	private List<String> universityBegindate;
	private List<String> universityEnddate;
	private List<String> universityMajor;
	private List<String> universityDmajorminor;
	private List<String> universityDmajorminorName;
	private List<String> universityCredit;
	//04 가족
	private List<String> familyRelation;
	private List<String> familyName;
	private List<String> familyBirthdate;
	private List<String> familyEducation;
	private List<String> familyJob;
	private List<String> familyCohabit;
	//병역
	private String militaryserviceState;
	private String militaryserviceGroup;
	private String militaryserviceLevel;
	private String militaryserviceBranch;
	private String militaryserviceBegindate;
	private String militaryserviceEnddate;
	//자격면허
	private List<String> certificateCd;
	private List<String> certificateName;
	private List<String> certificateGrade;
	private List<String> certificateHost;
	private List<String> certificateBegindate;
	private List<String> certificateEnddate;
	private List<String> certificateRegnum;
	//경력사항
	private List<String> careerCompany;
	private List<String> careerBegindate;
	private List<String> careerEnddate;
	private List<String> careerPeriod;
	private List<String> careerLevel;
	private List<String> careerResign;
	private List<String> careerDepartment;
	private List<String> careerTask;
	//어학
	private List<String> languageCd;
	private List<String> languageName;
	private List<String> languageTest;
	private List<String> languageGrade;
	private List<String> languageLevel;
	private List<String> languageBegindate;
	private List<String> languageEnddate;
	private List<String> languageRegnum;
	private List<String> languageHost;
	//수상경력
	private List<String> awardName;
	private List<String> awardContent;
	private List<String> awardHost;
	private List<String> awardDate;
	//국내외 연수
	private List<String> trainingCountry;
	private List<String> trainingAcademy;
	private List<String> trainingBegindate;
	private List<String> trainingEnddate;
	private List<String> trainingContent;
	//동아리
	private List<String> clubName;
	private List<String> clubHost;
	private List<String> clubBegindate;
	private List<String> clubEnddate;
	private List<String> clubContent;
	//기타 및 포트폴리오
	private String etcTitle;
	private String etcContent;
	private String etcBegindate;
	private String etcEnddate;
	//private MultipartFile etcFile;
	public String getResumeCd() {
		return resumeCd;
	}
	public void setResumeCd(String resumeCd) {
		this.resumeCd = resumeCd;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getResumeName() {
		return resumeName;
	}
	public void setResumeName(String resumeName) {
		this.resumeName = resumeName;
	}
	public String getResumeRegdate() {
		return resumeRegdate;
	}
	public void setResumeRegdate(String resumeRegdate) {
		this.resumeRegdate = resumeRegdate;
	}
	public String getResumeModidate() {
		return resumeModidate;
	}
	public void setResumeModidate(String resumeModidate) {
		this.resumeModidate = resumeModidate;
	}
	public String getPersonalKorname() {
		return personalKorname;
	}
	public void setPersonalKorname(String personalKorname) {
		this.personalKorname = personalKorname;
	}
	public String getPersonalEngname() {
		return personalEngname;
	}
	public void setPersonalEngname(String personalEngname) {
		this.personalEngname = personalEngname;
	}
	public String getPersonalBirthdate() {
		return personalBirthdate;
	}
	public void setPersonalBirthdate(String personalBirthdate) {
		this.personalBirthdate = personalBirthdate;
	}
	public String getPersonalGender() {
		return personalGender;
	}
	public void setPersonalGender(String personalGender) {
		this.personalGender = personalGender;
	}
	public String getPersonalPhone() {
		return personalPhone;
	}
	public void setPersonalPhone(String personalPhone) {
		this.personalPhone = personalPhone;
	}
	public String getPersonalCellphone() {
		return personalCellphone;
	}
	public void setPersonalCellphone(String personalCellphone) {
		this.personalCellphone = personalCellphone;
	}
	public String getPersonalEmail() {
		return personalEmail;
	}
	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}
	public String getPersonalSns() {
		return personalSns;
	}
	public void setPersonalSns(String personalSns) {
		this.personalSns = personalSns;
	}
	public String getPersonalAddr() {
		return personalAddr;
	}
	public void setPersonalAddr(String personalAddr) {
		this.personalAddr = personalAddr;
	}
	public String getHighschoolName() {
		return highschoolName;
	}
	public void setHighschoolName(String highschoolName) {
		this.highschoolName = highschoolName;
	}
	public String getHighschoolCategory() {
		return highschoolCategory;
	}
	public void setHighschoolCategory(String highschoolCategory) {
		this.highschoolCategory = highschoolCategory;
	}
	public String getHighschoolBegindate() {
		return highschoolBegindate;
	}
	public void setHighschoolBegindate(String highschoolBegindate) {
		this.highschoolBegindate = highschoolBegindate;
	}
	public String getHighschoolEnddate() {
		return highschoolEnddate;
	}
	public void setHighschoolEnddate(String highschoolEnddate) {
		this.highschoolEnddate = highschoolEnddate;
	}
	public List<String> getUniversityName() {
		return universityName;
	}
	public void setUniversityName(List<String> universityName) {
		this.universityName = universityName;
	}
	public List<String> getUniversityCategory() {
		return universityCategory;
	}
	public void setUniversityCategory(List<String> universityCategory) {
		this.universityCategory = universityCategory;
	}
	public List<String> getUniversityBegindate() {
		return universityBegindate;
	}
	public void setUniversityBegindate(List<String> universityBegindate) {
		this.universityBegindate = universityBegindate;
	}
	public List<String> getUniversityEnddate() {
		return universityEnddate;
	}
	public void setUniversityEnddate(List<String> universityEnddate) {
		this.universityEnddate = universityEnddate;
	}
	public List<String> getUniversityMajor() {
		return universityMajor;
	}
	public void setUniversityMajor(List<String> universityMajor) {
		this.universityMajor = universityMajor;
	}
	public List<String> getUniversityDmajorminor() {
		return universityDmajorminor;
	}
	public void setUniversityDmajorminor(List<String> universityDmajorminor) {
		this.universityDmajorminor = universityDmajorminor;
	}
	public List<String> getUniversityDmajorminorName() {
		return universityDmajorminorName;
	}
	public void setUniversityDmajorminorName(List<String> universityDmajorminorName) {
		this.universityDmajorminorName = universityDmajorminorName;
	}
	public List<String> getUniversityCredit() {
		return universityCredit;
	}
	public void setUniversityCredit(List<String> universityCredit) {
		this.universityCredit = universityCredit;
	}
	public List<String> getFamilyRelation() {
		return familyRelation;
	}
	public void setFamilyRelation(List<String> familyRelation) {
		this.familyRelation = familyRelation;
	}
	public List<String> getFamilyName() {
		return familyName;
	}
	public void setFamilyName(List<String> familyName) {
		this.familyName = familyName;
	}
	public List<String> getFamilyBirthdate() {
		return familyBirthdate;
	}
	public void setFamilyBirthdate(List<String> familyBirthdate) {
		this.familyBirthdate = familyBirthdate;
	}
	public List<String> getFamilyEducation() {
		return familyEducation;
	}
	public void setFamilyEducation(List<String> familyEducation) {
		this.familyEducation = familyEducation;
	}
	public List<String> getFamilyJob() {
		return familyJob;
	}
	public void setFamilyJob(List<String> familyJob) {
		this.familyJob = familyJob;
	}
	public List<String> getFamilyCohabit() {
		return familyCohabit;
	}
	public void setFamilyCohabit(List<String> familyCohabit) {
		this.familyCohabit = familyCohabit;
	}
	public String getMilitaryserviceState() {
		return militaryserviceState;
	}
	public void setMilitaryserviceState(String militaryserviceState) {
		this.militaryserviceState = militaryserviceState;
	}
	public String getMilitaryserviceGroup() {
		return militaryserviceGroup;
	}
	public void setMilitaryserviceGroup(String militaryserviceGroup) {
		this.militaryserviceGroup = militaryserviceGroup;
	}
	public String getMilitaryserviceLevel() {
		return militaryserviceLevel;
	}
	public void setMilitaryserviceLevel(String militaryserviceLevel) {
		this.militaryserviceLevel = militaryserviceLevel;
	}
	public String getMilitaryserviceBranch() {
		return militaryserviceBranch;
	}
	public void setMilitaryserviceBranch(String militaryserviceBranch) {
		this.militaryserviceBranch = militaryserviceBranch;
	}
	public String getMilitaryserviceBegindate() {
		return militaryserviceBegindate;
	}
	public void setMilitaryserviceBegindate(String militaryserviceBegindate) {
		this.militaryserviceBegindate = militaryserviceBegindate;
	}
	public String getMilitaryserviceEnddate() {
		return militaryserviceEnddate;
	}
	public void setMilitaryserviceEnddate(String militaryserviceEnddate) {
		this.militaryserviceEnddate = militaryserviceEnddate;
	}
	public List<String> getCertificateCd() {
		return certificateCd;
	}
	public void setCertificateCd(List<String> certificateCd) {
		this.certificateCd = certificateCd;
	}
	public List<String> getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(List<String> certificateName) {
		this.certificateName = certificateName;
	}
	public List<String> getCertificateGrade() {
		return certificateGrade;
	}
	public void setCertificateGrade(List<String> certificateGrade) {
		this.certificateGrade = certificateGrade;
	}
	public List<String> getCertificateHost() {
		return certificateHost;
	}
	public void setCertificateHost(List<String> certificateHost) {
		this.certificateHost = certificateHost;
	}
	public List<String> getCertificateBegindate() {
		return certificateBegindate;
	}
	public void setCertificateBegindate(List<String> certificateBegindate) {
		this.certificateBegindate = certificateBegindate;
	}
	public List<String> getCertificateEnddate() {
		return certificateEnddate;
	}
	public void setCertificateEnddate(List<String> certificateEnddate) {
		this.certificateEnddate = certificateEnddate;
	}
	public List<String> getCertificateRegnum() {
		return certificateRegnum;
	}
	public void setCertificateRegnum(List<String> certificateRegnum) {
		this.certificateRegnum = certificateRegnum;
	}
	public List<String> getCareerCompany() {
		return careerCompany;
	}
	public void setCareerCompany(List<String> careerCompany) {
		this.careerCompany = careerCompany;
	}
	public List<String> getCareerBegindate() {
		return careerBegindate;
	}
	public void setCareerBegindate(List<String> careerBegindate) {
		this.careerBegindate = careerBegindate;
	}
	public List<String> getCareerEnddate() {
		return careerEnddate;
	}
	public void setCareerEnddate(List<String> careerEnddate) {
		this.careerEnddate = careerEnddate;
	}
	public List<String> getCareerPeriod() {
		return careerPeriod;
	}
	public void setCareerPeriod(List<String> careerPeriod) {
		this.careerPeriod = careerPeriod;
	}
	public List<String> getCareerLevel() {
		return careerLevel;
	}
	public void setCareerLevel(List<String> careerLevel) {
		this.careerLevel = careerLevel;
	}
	public List<String> getCareerResign() {
		return careerResign;
	}
	public void setCareerResign(List<String> careerResign) {
		this.careerResign = careerResign;
	}
	public List<String> getCareerDepartment() {
		return careerDepartment;
	}
	public void setCareerDepartment(List<String> careerDepartment) {
		this.careerDepartment = careerDepartment;
	}
	public List<String> getCareerTask() {
		return careerTask;
	}
	public void setCareerTask(List<String> careerTask) {
		this.careerTask = careerTask;
	}
	public List<String> getLanguageCd() {
		return languageCd;
	}
	public void setLanguageCd(List<String> languageCd) {
		this.languageCd = languageCd;
	}
	public List<String> getLanguageName() {
		return languageName;
	}
	public void setLanguageName(List<String> languageName) {
		this.languageName = languageName;
	}
	public List<String> getLanguageTest() {
		return languageTest;
	}
	public void setLanguageTest(List<String> languageTest) {
		this.languageTest = languageTest;
	}
	public List<String> getLanguageGrade() {
		return languageGrade;
	}
	public void setLanguageGrade(List<String> languageGrade) {
		this.languageGrade = languageGrade;
	}
	public List<String> getLanguageLevel() {
		return languageLevel;
	}
	public void setLanguageLevel(List<String> languageLevel) {
		this.languageLevel = languageLevel;
	}
	public List<String> getLanguageBegindate() {
		return languageBegindate;
	}
	public void setLanguageBegindate(List<String> languageBegindate) {
		this.languageBegindate = languageBegindate;
	}
	public List<String> getLanguageEnddate() {
		return languageEnddate;
	}
	public void setLanguageEnddate(List<String> languageEnddate) {
		this.languageEnddate = languageEnddate;
	}
	public List<String> getLanguageRegnum() {
		return languageRegnum;
	}
	public void setLanguageRegnum(List<String> languageRegnum) {
		this.languageRegnum = languageRegnum;
	}
	public List<String> getLanguageHost() {
		return languageHost;
	}
	public void setLanguageHost(List<String> languageHost) {
		this.languageHost = languageHost;
	}
	public List<String> getAwardName() {
		return awardName;
	}
	public void setAwardName(List<String> awardName) {
		this.awardName = awardName;
	}
	public List<String> getAwardContent() {
		return awardContent;
	}
	public void setAwardContent(List<String> awardContent) {
		this.awardContent = awardContent;
	}
	public List<String> getAwardHost() {
		return awardHost;
	}
	public void setAwardHost(List<String> awardHost) {
		this.awardHost = awardHost;
	}
	public List<String> getAwardDate() {
		return awardDate;
	}
	public void setAwardDate(List<String> awardDate) {
		this.awardDate = awardDate;
	}
	public List<String> getTrainingCountry() {
		return trainingCountry;
	}
	public void setTrainingCountry(List<String> trainingCountry) {
		this.trainingCountry = trainingCountry;
	}
	public List<String> getTrainingAcademy() {
		return trainingAcademy;
	}
	public void setTrainingAcademy(List<String> trainingAcademy) {
		this.trainingAcademy = trainingAcademy;
	}
	public List<String> getTrainingBegindate() {
		return trainingBegindate;
	}
	public void setTrainingBegindate(List<String> trainingBegindate) {
		this.trainingBegindate = trainingBegindate;
	}
	public List<String> getTrainingEnddate() {
		return trainingEnddate;
	}
	public void setTrainingEnddate(List<String> trainingEnddate) {
		this.trainingEnddate = trainingEnddate;
	}
	public List<String> getTrainingContent() {
		return trainingContent;
	}
	public void setTrainingContent(List<String> trainingContent) {
		this.trainingContent = trainingContent;
	}
	public List<String> getClubName() {
		return clubName;
	}
	public void setClubName(List<String> clubName) {
		this.clubName = clubName;
	}
	public List<String> getClubHost() {
		return clubHost;
	}
	public void setClubHost(List<String> clubHost) {
		this.clubHost = clubHost;
	}
	public List<String> getClubBegindate() {
		return clubBegindate;
	}
	public void setClubBegindate(List<String> clubBegindate) {
		this.clubBegindate = clubBegindate;
	}
	public List<String> getClubEnddate() {
		return clubEnddate;
	}
	public void setClubEnddate(List<String> clubEnddate) {
		this.clubEnddate = clubEnddate;
	}
	public List<String> getClubContent() {
		return clubContent;
	}
	public void setClubContent(List<String> clubContent) {
		this.clubContent = clubContent;
	}
	public String getEtcTitle() {
		return etcTitle;
	}
	public void setEtcTitle(String etcTitle) {
		this.etcTitle = etcTitle;
	}
	public String getEtcContent() {
		return etcContent;
	}
	public void setEtcContent(String etcContent) {
		this.etcContent = etcContent;
	}
	public String getEtcBegindate() {
		return etcBegindate;
	}
	public void setEtcBegindate(String etcBegindate) {
		this.etcBegindate = etcBegindate;
	}
	public String getEtcEnddate() {
		return etcEnddate;
	}
	public void setEtcEnddate(String etcEnddate) {
		this.etcEnddate = etcEnddate;
	}
	@Override
	public String toString() {
		return "ResumeVo [resumeCd=" + resumeCd + ", loginId=" + loginId + ", resumeName=" + resumeName
				+ ", resumeRegdate=" + resumeRegdate + ", resumeModidate=" + resumeModidate + ", personalKorname="
				+ personalKorname + ", personalEngname=" + personalEngname + ", personalBirthdate=" + personalBirthdate
				+ ", personalGender=" + personalGender + ", personalPhone=" + personalPhone + ", personalCellphone="
				+ personalCellphone + ", personalEmail=" + personalEmail + ", personalSns=" + personalSns
				+ ", personalAddr=" + personalAddr + ", highschoolName=" + highschoolName + ", highschoolCategory="
				+ highschoolCategory + ", highschoolBegindate=" + highschoolBegindate + ", highschoolEnddate="
				+ highschoolEnddate + ", universityName=" + universityName + ", universityCategory="
				+ universityCategory + ", universityBegindate=" + universityBegindate + ", universityEnddate="
				+ universityEnddate + ", universityMajor=" + universityMajor + ", universityDmajorminor="
				+ universityDmajorminor + ", universityDmajorminorName=" + universityDmajorminorName
				+ ", universityCredit=" + universityCredit + ", familyRelation=" + familyRelation + ", familyName="
				+ familyName + ", familyBirthdate=" + familyBirthdate + ", familyEducation=" + familyEducation
				+ ", familyJob=" + familyJob + ", familyCohabit=" + familyCohabit + ", militaryserviceState="
				+ militaryserviceState + ", militaryserviceGroup=" + militaryserviceGroup + ", militaryserviceLevel="
				+ militaryserviceLevel + ", militaryserviceBranch=" + militaryserviceBranch
				+ ", militaryserviceBegindate=" + militaryserviceBegindate + ", militaryserviceEnddate="
				+ militaryserviceEnddate + ", certificateCd=" + certificateCd + ", certificateName=" + certificateName
				+ ", certificateGrade=" + certificateGrade + ", certificateHost=" + certificateHost
				+ ", certificateBegindate=" + certificateBegindate + ", certificateEnddate=" + certificateEnddate
				+ ", certificateRegnum=" + certificateRegnum + ", careerCompany=" + careerCompany + ", careerBegindate="
				+ careerBegindate + ", careerEnddate=" + careerEnddate + ", careerPeriod=" + careerPeriod
				+ ", careerLevel=" + careerLevel + ", careerResign=" + careerResign + ", careerDepartment="
				+ careerDepartment + ", careerTask=" + careerTask + ", languageCd=" + languageCd + ", languageName="
				+ languageName + ", languageTest=" + languageTest + ", languageGrade=" + languageGrade
				+ ", languageLevel=" + languageLevel + ", languageBegindate=" + languageBegindate + ", languageEnddate="
				+ languageEnddate + ", languageRegnum=" + languageRegnum + ", languageHost=" + languageHost
				+ ", awardName=" + awardName + ", awardContent=" + awardContent + ", awardHost=" + awardHost
				+ ", awardDate=" + awardDate + ", trainingCountry=" + trainingCountry + ", trainingAcademy="
				+ trainingAcademy + ", trainingBegindate=" + trainingBegindate + ", trainingEnddate=" + trainingEnddate
				+ ", trainingContent=" + trainingContent + ", clubName=" + clubName + ", clubHost=" + clubHost
				+ ", clubBegindate=" + clubBegindate + ", clubEnddate=" + clubEnddate + ", clubContent=" + clubContent
				+ ", etcTitle=" + etcTitle + ", etcContent=" + etcContent + ", etcBegindate=" + etcBegindate
				+ ", etcEnddate=" + etcEnddate + "]";
	}
	
}
