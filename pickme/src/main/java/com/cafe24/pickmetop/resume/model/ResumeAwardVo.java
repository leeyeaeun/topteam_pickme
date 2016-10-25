package com.cafe24.pickmetop.resume.model;

import java.util.Date;

public class ResumeAwardVo {
	String awardCd;
	String resumeCd;
	String awardName;
	String awardContent;
	String awardHost;
	Date awardDate;
	public String getAwardCd() {
		return awardCd;
	}
	public void setAwardCd(String awardCd) {
		this.awardCd = awardCd;
	}
	public String getResumeCd() {
		return resumeCd;
	}
	public void setResumeCd(String resumeCd) {
		this.resumeCd = resumeCd;
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
	public Date getAwardDate() {
		return awardDate;
	}
	public void setAwardDate(Date awardDate) {
		this.awardDate = awardDate;
	}
	@Override
	public String toString() {
		return "ResumeAwardVo [awardCd=" + awardCd + ", resumeCd=" + resumeCd + ", awardName=" + awardName
				+ ", awardContent=" + awardContent + ", awardHost=" + awardHost + ", awardDate=" + awardDate + "]";
	}

}
