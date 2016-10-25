package com.cafe24.pickmetop.resume.model;

import java.util.Date;

public class ResumeLangaugeVo {
	String languageCd;
	String resumeCd;
	String certificateCd;
	String languageName;
	String languageGrade;
	String languageLevel;
	Date languageBegindate;
	Date languageEnddate;
	String languageRegnum;
	String languageHost;
	public String getLanguageCd() {
		return languageCd;
	}
	public void setLanguageCd(String languageCd) {
		this.languageCd = languageCd;
	}
	public String getResumeCd() {
		return resumeCd;
	}
	public void setResumeCd(String resumeCd) {
		this.resumeCd = resumeCd;
	}
	public String getCertificateCd() {
		return certificateCd;
	}
	public void setCertificateCd(String certificateCd) {
		this.certificateCd = certificateCd;
	}
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
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
	public Date getLanguageBegindate() {
		return languageBegindate;
	}
	public void setLanguageBegindate(Date languageBegindate) {
		this.languageBegindate = languageBegindate;
	}
	public Date getLanguageEnddate() {
		return languageEnddate;
	}
	public void setLanguageEnddate(Date languageEnddate) {
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
	@Override
	public String toString() {
		return "ResumeLangaugeVo [languageCd=" + languageCd + ", resumeCd=" + resumeCd + ", certificateCd="
				+ certificateCd + ", languageName=" + languageName + ", languageGrade=" + languageGrade
				+ ", languageLevel=" + languageLevel + ", languageBegindate=" + languageBegindate + ", languageEnddate="
				+ languageEnddate + ", languageRegnum=" + languageRegnum + ", languageHost=" + languageHost + "]";
	}
	

}
