package com.cafe24.pickmetop.resume.model;

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
	private String universityName;
	private String universityCategory;
	private String universityBegindate;
	private String universityEnddate;
	private String universityMajor;
	private String universityDmajorminor;
	private String universityDmajorminorName;
	private String universityCredit;
	//04 가족
	private String familyRelation;
	private String familyName;
	private String familyBirthdate;
	private String familyEducation;
	private String familyJob;
	private String familyCohabit;
	//병역
	private String militaryserviceState;
	private String militaryserviceGroup;
	private String militaryserviceLevel;
	private String militaryserviceBranch;
	private String militaryserviceBegindate;
	private String militaryserviceEnddate;
	//자격면허
	private String certificateCd;
	private String certificateGrade;
	private String certificateHost;
	private String certificateBegindate;
	private String certificateEnddate;
	private String certificateRegnum;
	//경력사항
	private String careerCompany;
	private String careerBegindate;
	private String careerEnddate;
	private String careerPeriod;
	private String careerLevel;
	private String careerDepartment;
	private String careerTask;
	//어학
	private String languageName;
	private String languageTest;
	private String languageGrade;
	private String languageLevel;
	private String languageBegindate;
	private String languageEnddate;
	private String languageRegnum;
	private String languageHost;
	//수상경력
	private String awardName;
	private String awardContent;
	private String awardHost;
	private String awardDate;
	//국내외 연수
	private String trainingCountry;
	private String trainingAcademy;
	private String trainingBegindate;
	private String trainingEnddate;
	private String trainingContent;
	//동아리
	private String clubHost;
	private String clubName;
	private String clubBegindate;
	private String clubEnddate;
	private String clubContent;
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
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getUniversityCategory() {
		return universityCategory;
	}
	public void setUniversityCategory(String universityCategory) {
		this.universityCategory = universityCategory;
	}
	public String getUniversityBegindate() {
		return universityBegindate;
	}
	public void setUniversityBegindate(String universityBegindate) {
		this.universityBegindate = universityBegindate;
	}
	public String getUniversityEnddate() {
		return universityEnddate;
	}
	public void setUniversityEnddate(String universityEnddate) {
		this.universityEnddate = universityEnddate;
	}
	public String getUniversityMajor() {
		return universityMajor;
	}
	public void setUniversityMajor(String universityMajor) {
		this.universityMajor = universityMajor;
	}
	public String getUniversityDmajorminor() {
		return universityDmajorminor;
	}
	public void setUniversityDmajorminor(String universityDmajorminor) {
		this.universityDmajorminor = universityDmajorminor;
	}
	public String getUniversityDmajorminorName() {
		return universityDmajorminorName;
	}
	public void setUniversityDmajorminorName(String universityDmajorminorName) {
		this.universityDmajorminorName = universityDmajorminorName;
	}
	public String getUniversityCredit() {
		return universityCredit;
	}
	public void setUniversityCredit(String universityCredit) {
		this.universityCredit = universityCredit;
	}
	public String getFamilyRelation() {
		return familyRelation;
	}
	public void setFamilyRelation(String familyRelation) {
		this.familyRelation = familyRelation;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getFamilyBirthdate() {
		return familyBirthdate;
	}
	public void setFamilyBirthdate(String familyBirthdate) {
		this.familyBirthdate = familyBirthdate;
	}
	public String getFamilyEducation() {
		return familyEducation;
	}
	public void setFamilyEducation(String familyEducation) {
		this.familyEducation = familyEducation;
	}
	public String getFamilyJob() {
		return familyJob;
	}
	public void setFamilyJob(String familyJob) {
		this.familyJob = familyJob;
	}
	public String getFamilyCohabit() {
		return familyCohabit;
	}
	public void setFamilyCohabit(String familyCohabit) {
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
	public String getCertificateCd() {
		return certificateCd;
	}
	public void setCertificateCd(String certificateCd) {
		this.certificateCd = certificateCd;
	}
	public String getCertificateGrade() {
		return certificateGrade;
	}
	public void setCertificateGrade(String certificateGrade) {
		this.certificateGrade = certificateGrade;
	}
	public String getCertificateHost() {
		return certificateHost;
	}
	public void setCertificateHost(String certificateHost) {
		this.certificateHost = certificateHost;
	}
	public String getCertificateBegindate() {
		return certificateBegindate;
	}
	public void setCertificateBegindate(String certificateBegindate) {
		this.certificateBegindate = certificateBegindate;
	}
	public String getCertificateEnddate() {
		return certificateEnddate;
	}
	public void setCertificateEnddate(String certificateEnddate) {
		this.certificateEnddate = certificateEnddate;
	}
	public String getCertificateRegnum() {
		return certificateRegnum;
	}
	public void setCertificateRegnum(String certificateRegnum) {
		this.certificateRegnum = certificateRegnum;
	}
	public String getCareerCompany() {
		return careerCompany;
	}
	public void setCareerCompany(String careerCompany) {
		this.careerCompany = careerCompany;
	}
	public String getCareerBegindate() {
		return careerBegindate;
	}
	public void setCareerBegindate(String careerBegindate) {
		this.careerBegindate = careerBegindate;
	}
	public String getCareerEnddate() {
		return careerEnddate;
	}
	public void setCareerEnddate(String careerEnddate) {
		this.careerEnddate = careerEnddate;
	}
	public String getCareerPeriod() {
		return careerPeriod;
	}
	public void setCareerPeriod(String careerPeriod) {
		this.careerPeriod = careerPeriod;
	}
	public String getCareerLevel() {
		return careerLevel;
	}
	public void setCareerLevel(String careerLevel) {
		this.careerLevel = careerLevel;
	}
	public String getCareerDepartment() {
		return careerDepartment;
	}
	public void setCareerDepartment(String careerDepartment) {
		this.careerDepartment = careerDepartment;
	}
	public String getCareerTask() {
		return careerTask;
	}
	public void setCareerTask(String careerTask) {
		this.careerTask = careerTask;
	}
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	public String getLanguageTest() {
		return languageTest;
	}
	public void setLanguageTest(String languageTest) {
		this.languageTest = languageTest;
	}
	public String getLanguageGrade() {
		return languageGrade;
	}
	public void setLanguageGrade(String languageGrade) {
		this.languageGrade = languageGrade;
	}
	public String getLanguageLevel() {
		return languageLevel;
	}
	public void setLanguageLevel(String languageLevel) {
		this.languageLevel = languageLevel;
	}
	public String getLanguageBegindate() {
		return languageBegindate;
	}
	public void setLanguageBegindate(String languageBegindate) {
		this.languageBegindate = languageBegindate;
	}
	public String getLanguageEnddate() {
		return languageEnddate;
	}
	public void setLanguageEnddate(String languageEnddate) {
		this.languageEnddate = languageEnddate;
	}
	public String getLanguageRegnum() {
		return languageRegnum;
	}
	public void setLanguageRegnum(String languageRegnum) {
		this.languageRegnum = languageRegnum;
	}
	public String getLanguageHost() {
		return languageHost;
	}
	public void setLanguageHost(String languageHost) {
		this.languageHost = languageHost;
	}
	public String getAwardName() {
		return awardName;
	}
	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}
	public String getAwardContent() {
		return awardContent;
	}
	public void setAwardContent(String awardContent) {
		this.awardContent = awardContent;
	}
	public String getAwardHost() {
		return awardHost;
	}
	public void setAwardHost(String awardHost) {
		this.awardHost = awardHost;
	}
	public String getAwardDate() {
		return awardDate;
	}
	public void setAwardDate(String awardDate) {
		this.awardDate = awardDate;
	}
	public String getTrainingCountry() {
		return trainingCountry;
	}
	public void setTrainingCountry(String trainingCountry) {
		this.trainingCountry = trainingCountry;
	}
	public String getTrainingAcademy() {
		return trainingAcademy;
	}
	public void setTrainingAcademy(String trainingAcademy) {
		this.trainingAcademy = trainingAcademy;
	}
	public String getTrainingBegindate() {
		return trainingBegindate;
	}
	public void setTrainingBegindate(String trainingBegindate) {
		this.trainingBegindate = trainingBegindate;
	}
	public String getTrainingEnddate() {
		return trainingEnddate;
	}
	public void setTrainingEnddate(String trainingEnddate) {
		this.trainingEnddate = trainingEnddate;
	}
	public String getTrainingContent() {
		return trainingContent;
	}
	public void setTrainingContent(String trainingContent) {
		this.trainingContent = trainingContent;
	}
	public String getClubHost() {
		return clubHost;
	}
	public void setClubHost(String clubHost) {
		this.clubHost = clubHost;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getClubBegindate() {
		return clubBegindate;
	}
	public void setClubBegindate(String clubBegindate) {
		this.clubBegindate = clubBegindate;
	}
	public String getClubEnddate() {
		return clubEnddate;
	}
	public void setClubEnddate(String clubEnddate) {
		this.clubEnddate = clubEnddate;
	}
	public String getClubContent() {
		return clubContent;
	}
	public void setClubContent(String clubContent) {
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
				+ militaryserviceEnddate + ", certificateCd=" + certificateCd + ", certificateGrade=" + certificateGrade
				+ ", certificateHost=" + certificateHost + ", certificateBegindate=" + certificateBegindate
				+ ", certificateEnddate=" + certificateEnddate + ", certificateRegnum=" + certificateRegnum
				+ ", careerCompany=" + careerCompany + ", careerBegindate=" + careerBegindate + ", careerEnddate="
				+ careerEnddate + ", careerPeriod=" + careerPeriod + ", careerLevel=" + careerLevel
				+ ", careerDepartment=" + careerDepartment + ", careerTask=" + careerTask + ", languageName="
				+ languageName + ", languageTest=" + languageTest + ", languageGrade=" + languageGrade
				+ ", languageLevel=" + languageLevel + ", languageBegindate=" + languageBegindate + ", languageEnddate="
				+ languageEnddate + ", languageRegnum=" + languageRegnum + ", languageHost=" + languageHost
				+ ", awardName=" + awardName + ", awardContent=" + awardContent + ", awardHost=" + awardHost
				+ ", awardDate=" + awardDate + ", trainingCountry=" + trainingCountry + ", trainingAcademy="
				+ trainingAcademy + ", trainingBegindate=" + trainingBegindate + ", trainingEnddate=" + trainingEnddate
				+ ", trainingContent=" + trainingContent + ", clubHost=" + clubHost + ", clubName=" + clubName
				+ ", clubBegindate=" + clubBegindate + ", clubEnddate=" + clubEnddate + ", clubContent=" + clubContent
				+ ", etcTitle=" + etcTitle + ", etcContent=" + etcContent + ", etcBegindate=" + etcBegindate
				+ ", etcEnddate=" + etcEnddate + "]";
	}
	
	
}
