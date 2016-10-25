package com.cafe24.pickmetop.resume.model;

import java.util.Date;

public class ResumeFamilyVo {
	String familyCd;
	String resumeCd;
	String familyRelation;
	String familyName;
	Date familyBirthdate;
	String familyEducation;
	String familyJob;
	String familyCohabit;
	public String getFamilyCd() {
		return familyCd;
	}
	public void setFamilyCd(String familyCd) {
		this.familyCd = familyCd;
	}
	public String getResumeCd() {
		return resumeCd;
	}
	public void setResumeCd(String resumeCd) {
		this.resumeCd = resumeCd;
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
	public Date getFamilyBirthdate() {
		return familyBirthdate;
	}
	public void setFamilyBirthdate(Date familyBirthdate) {
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
	@Override
	public String toString() {
		return "ResumeFamilyVo [familyCd=" + familyCd + ", resumeCd=" + resumeCd + ", familyRelation=" + familyRelation
				+ ", familyName=" + familyName + ", familyBirthdate=" + familyBirthdate + ", familyEducation="
				+ familyEducation + ", familyJob=" + familyJob + ", familyCohabit=" + familyCohabit + "]";
	}
	

}
