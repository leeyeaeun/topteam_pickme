package com.cafe24.pickmetop.resume.model;

import java.io.File;
import java.util.Date;

public class ResumePersonalVo {
	//*보류 칼럼값 수정필요!!!!!!!!!!!!!!
	String personalCd;
	String resumeCd;
	String personalKorname;
	String personalEngname;
	Date personalBirthdate;
	String personalGender;
	String personalPhone;
	String personalCellphone;
	String personalEmail;
	String personalSns;
	String personalAddr;
	File personalPhoto;
	Date personalRegdate;
	Date personalModidate;
	public String getPersonalCd() {
		return personalCd;
	}
	public void setPersonalCd(String personalCd) {
		this.personalCd = personalCd;
	}
	public String getResumeCd() {
		return resumeCd;
	}
	public void setResumeCd(String resumeCd) {
		this.resumeCd = resumeCd;
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
	public Date getPersonalBirthdate() {
		return personalBirthdate;
	}
	public void setPersonalBirthdate(Date personalBirthdate) {
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
	public File getPersonalPhoto() {
		return personalPhoto;
	}
	public void setPersonalPhoto(File personalPhoto) {
		this.personalPhoto = personalPhoto;
	}
	public Date getPersonalRegdate() {
		return personalRegdate;
	}
	public void setPersonalRegdate(Date personalRegdate) {
		this.personalRegdate = personalRegdate;
	}
	public Date getPersonalModidate() {
		return personalModidate;
	}
	public void setPersonalModidate(Date personalModidate) {
		this.personalModidate = personalModidate;
	}
	@Override
	public String toString() {
		return "ResumePersonalVo [personalCd=" + personalCd + ", resumeCd=" + resumeCd + ", personalKorname="
				+ personalKorname + ", personalEngname=" + personalEngname + ", personalBirthdate=" + personalBirthdate
				+ ", personalGender=" + personalGender + ", personalPhone=" + personalPhone + ", personalCellphone="
				+ personalCellphone + ", personalEmail=" + personalEmail + ", personalSns=" + personalSns
				+ ", personalAddr=" + personalAddr + ", personalPhoto=" + personalPhoto + ", personalRegdate="
				+ personalRegdate + ", personalModidate=" + personalModidate + "]";
	}
	
}
