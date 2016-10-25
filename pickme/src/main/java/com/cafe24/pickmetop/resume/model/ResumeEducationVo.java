package com.cafe24.pickmetop.resume.model;

import java.util.Date;

public class ResumeEducationVo {
	String educationCd;
	String resumeCd;
	String educationLevel;
	String educationName;
	Date educationBegindate;
	Date educationEnddate;
	String educationMajor;
	String educationGrade;
	String educationDoublemajor;
	String educationMinor;
	String educationCredit;
	public String getEducationCd() {
		return educationCd;
	}
	public void setEducationCd(String educationCd) {
		this.educationCd = educationCd;
	}
	public String getResumeCd() {
		return resumeCd;
	}
	public void setResumeCd(String resumeCd) {
		this.resumeCd = resumeCd;
	}
	public String getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	public String getEducationName() {
		return educationName;
	}
	public void setEducationName(String educationName) {
		this.educationName = educationName;
	}
	public Date getEducationBegindate() {
		return educationBegindate;
	}
	public void setEducationBegindate(Date educationBegindate) {
		this.educationBegindate = educationBegindate;
	}
	public Date getEducationEnddate() {
		return educationEnddate;
	}
	public void setEducationEnddate(Date educationEnddate) {
		this.educationEnddate = educationEnddate;
	}
	public String getEducationMajor() {
		return educationMajor;
	}
	public void setEducationMajor(String educationMajor) {
		this.educationMajor = educationMajor;
	}
	public String getEducationGrade() {
		return educationGrade;
	}
	public void setEducationGrade(String educationGrade) {
		this.educationGrade = educationGrade;
	}
	public String getEducationDoublemajor() {
		return educationDoublemajor;
	}
	public void setEducationDoublemajor(String educationDoublemajor) {
		this.educationDoublemajor = educationDoublemajor;
	}
	public String getEducationMinor() {
		return educationMinor;
	}
	public void setEducationMinor(String educationMinor) {
		this.educationMinor = educationMinor;
	}
	public String getEducationCredit() {
		return educationCredit;
	}
	public void setEducationCredit(String educationCredit) {
		this.educationCredit = educationCredit;
	}
	@Override
	public String toString() {
		return "ResumeEducationVo [educationCd=" + educationCd + ", resumeCd=" + resumeCd + ", educationLevel="
				+ educationLevel + ", educationName=" + educationName + ", educationBegindate=" + educationBegindate
				+ ", educationEnddate=" + educationEnddate + ", educationMajor=" + educationMajor + ", educationGrade="
				+ educationGrade + ", educationDoublemajor=" + educationDoublemajor + ", educationMinor="
				+ educationMinor + ", educationCredit=" + educationCredit + "]";
	}
	
	

}
