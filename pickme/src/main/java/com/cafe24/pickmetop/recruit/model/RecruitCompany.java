package com.cafe24.pickmetop.recruit.model;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class RecruitCompany {
	String recruitCompanyCd;
	String companyCd;
	String recruitName;
	Date recruitBegindate;
	Date recruitEnddate;
	Date recruitRegdate;
	String recruitRegister;
	Date recruitModidate;
	String recruitModify;
	public String getRecruitCompanyCd() {
		return recruitCompanyCd;
	}
	public void setRecruitCompanyCd(String recruitCompanyCd) {
		this.recruitCompanyCd = recruitCompanyCd;
	}
	public String getCompanyCd() {
		return companyCd;
	}
	public void setCompanyCd(String companyCd) {
		this.companyCd = companyCd;
	}
	public String getRecruitName() {
		return recruitName;
	}
	public void setRecruitName(String recruitName) {
		this.recruitName = recruitName;
	}
	public Date getRecruitBegindate() {
		return recruitBegindate;
	}
	public void setRecruitBegindate(Date recruitBegindate) {
		this.recruitBegindate = recruitBegindate;
	}
	public Date getRecruitEnddate() {
		return recruitEnddate;
	}
	public void setRecruitEnddate(Date recruitEnddate) {
		this.recruitEnddate = recruitEnddate;
	}
	public Date getRecruitRegdate() {
		return recruitRegdate;
	}
	public void setRecruitRegdate(Date recruitRegdate) {
		this.recruitRegdate = recruitRegdate;
	}
	public String getRecruitRegister() {
		return recruitRegister;
	}
	public void setRecruitRegister(String recruitRegister) {
		this.recruitRegister = recruitRegister;
	}
	public Date getRecruitModidate() {
		return recruitModidate;
	}
	public void setRecruitModidate(Date recruitModidate) {
		this.recruitModidate = recruitModidate;
	}
	public String getRecruitModify() {
		return recruitModify;
	}
	public void setRecruitModify(String recruitModify) {
		this.recruitModify = recruitModify;
	}
	@Override
	public String toString() {
		return "RecruitCompany [recruitCompanyCd=" + recruitCompanyCd + ", companyCd=" + companyCd + ", recruitName="
				+ recruitName + ", recruitBegindate=" + recruitBegindate + ", recruitEnddate=" + recruitEnddate
				+ ", recruitRegdate=" + recruitRegdate + ", recruitRegister=" + recruitRegister + ", recruitModidate="
				+ recruitModidate + ", recruitModify=" + recruitModify + "]";
	}
	
}
