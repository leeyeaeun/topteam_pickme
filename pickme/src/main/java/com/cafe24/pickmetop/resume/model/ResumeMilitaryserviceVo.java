package com.cafe24.pickmetop.resume.model;

import java.util.Date;

public class ResumeMilitaryserviceVo {
	String militaryserviceCd;
	String resumeCd;
	String militaryserviceState;
	String militaryserviceGroup;
	String militaryserviceLevel;
	String militaryserviceBranch;
	Date militaryserviceBegindate;
	Date militaryserviceEnddate;
	public String getMilitaryserviceCd() {
		return militaryserviceCd;
	}
	public void setMilitaryserviceCd(String militaryserviceCd) {
		this.militaryserviceCd = militaryserviceCd;
	}
	public String getResumeCd() {
		return resumeCd;
	}
	public void setResumeCd(String resumeCd) {
		this.resumeCd = resumeCd;
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
	public Date getMilitaryserviceBegindate() {
		return militaryserviceBegindate;
	}
	public void setMilitaryserviceBegindate(Date militaryserviceBegindate) {
		this.militaryserviceBegindate = militaryserviceBegindate;
	}
	public Date getMilitaryserviceEnddate() {
		return militaryserviceEnddate;
	}
	public void setMilitaryserviceEnddate(Date militaryserviceEnddate) {
		this.militaryserviceEnddate = militaryserviceEnddate;
	}
	@Override
	public String toString() {
		return "ResumeMilitaryserviceVo [militaryserviceCd=" + militaryserviceCd + ", resumeCd=" + resumeCd
				+ ", militaryserviceState=" + militaryserviceState + ", militaryserviceGroup=" + militaryserviceGroup
				+ ", militaryserviceLevel=" + militaryserviceLevel + ", militaryserviceBranch=" + militaryserviceBranch
				+ ", militaryserviceBegindate=" + militaryserviceBegindate + ", militaryserviceEnddate="
				+ militaryserviceEnddate + "]";
	}
	

}
