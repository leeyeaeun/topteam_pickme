package com.cafe24.pickmetop.resume.model;

public class ResumeHighschoolVo {
	private String highshoolCd;
	private String resumeCd;
	private String highshoolName;
	private String highshoolCategory;
	private String highshoolBegindate;
	private String highshoolEnddate;
	public String getHighshoolCd() {
		return highshoolCd;
	}
	public void setHighshoolCd(String highshoolCd) {
		this.highshoolCd = highshoolCd;
	}
	public String getResumeCd() {
		return resumeCd;
	}
	public void setResumeCd(String resumeCd) {
		this.resumeCd = resumeCd;
	}
	public String getHighshoolName() {
		return highshoolName;
	}
	public void setHighshoolName(String highshoolName) {
		this.highshoolName = highshoolName;
	}
	public String getHighshoolCategory() {
		return highshoolCategory;
	}
	public void setHighshoolCategory(String highshoolCategory) {
		this.highshoolCategory = highshoolCategory;
	}
	public String getHighshoolBegindate() {
		return highshoolBegindate;
	}
	public void setHighshoolBegindate(String highshoolBegindate) {
		this.highshoolBegindate = highshoolBegindate;
	}
	public String getHighshoolEnddate() {
		return highshoolEnddate;
	}
	public void setHighshoolEnddate(String highshoolEnddate) {
		this.highshoolEnddate = highshoolEnddate;
	}
	@Override
	public String toString() {
		return "ResumeHighschoolVo [highshoolCd=" + highshoolCd + ", resumeCd=" + resumeCd + ", highshoolName="
				+ highshoolName + ", highshoolCategory=" + highshoolCategory + ", highshoolBegindate="
				+ highshoolBegindate + ", highshoolEnddate=" + highshoolEnddate + "]";
	}
	
}
