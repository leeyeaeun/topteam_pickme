package com.cafe24.pickmetop.resume.model;

public class ResumeVo {
	private String resumeCd;
	private String loginId;
	private String resumeName;
	
	private String personalKorname;
	private String personalEngname;
	private String personalBirthdate;
	private String personalGender;
	private String personalPhone;
	private String personalCellphone;
	private String personalEmail;
	private String personalSns;
	private String personalAddr;
	
	private String resumeRegdate;
	private String resumeModidate;
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
	
	
	@Override
	public String toString() {
		return "ResumeVo [resumeCd=" + resumeCd + ", loginId=" + loginId + ", resumeName=" + resumeName
				+ ", resumeRegdate=" + resumeRegdate + ", resumeModidate=" + resumeModidate + "]";
	}
	
}
