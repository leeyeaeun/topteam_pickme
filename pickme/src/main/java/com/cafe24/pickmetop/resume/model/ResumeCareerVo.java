package com.cafe24.pickmetop.resume.model;

import java.util.Date;

public class ResumeCareerVo {
	String careerCd;
	String resumeCd;
	String careerCompany;
	Date careerBegindate;
	Date careerEnddate;
	String careerPeriod;
	String careerLevel;
	String careerDepartment;
	String careerTask;
	public String getCareerCd() {
		return careerCd;
	}
	public void setCareerCd(String careerCd) {
		this.careerCd = careerCd;
	}
	public String getResumeCd() {
		return resumeCd;
	}
	public void setResumeCd(String resumeCd) {
		this.resumeCd = resumeCd;
	}
	public String getCareerCompany() {
		return careerCompany;
	}
	public void setCareerCompany(String careerCompany) {
		this.careerCompany = careerCompany;
	}
	public Date getCareerBegindate() {
		return careerBegindate;
	}
	public void setCareerBegindate(Date careerBegindate) {
		this.careerBegindate = careerBegindate;
	}
	public Date getCareerEnddate() {
		return careerEnddate;
	}
	public void setCareerEnddate(Date careerEnddate) {
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
	@Override
	public String toString() {
		return "ResumeCareerVo [careerCd=" + careerCd + ", resumeCd=" + resumeCd + ", careerCompany=" + careerCompany
				+ ", careerBegindate=" + careerBegindate + ", careerEnddate=" + careerEnddate + ", careerPeriod="
				+ careerPeriod + ", careerLevel=" + careerLevel + ", careerDepartment=" + careerDepartment
				+ ", careerTask=" + careerTask + "]";
	}

}
