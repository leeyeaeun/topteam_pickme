package com.cafe24.pickmetop.resume.model;

import java.util.Date;

public class ResumeVo {
	String resumeCd;
	String loginId;
	String resumeName;
	Date resumeRegdate;
	Date resumeModidate;
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
	public Date getResumeRegdate() {
		return resumeRegdate;
	}
	public void setResumeRegdate(Date resumeRegdate) {
		this.resumeRegdate = resumeRegdate;
	}
	public Date getResumeModidate() {
		return resumeModidate;
	}
	public void setResumeModidate(Date resumeModidate) {
		this.resumeModidate = resumeModidate;
	}
	@Override
	public String toString() {
		return "ResumeVo [resumeCd=" + resumeCd + ", loginId=" + loginId + ", resumeName=" + resumeName
				+ ", resumeRegdate=" + resumeRegdate + ", resumeModidate=" + resumeModidate + "]";
	}
	
}
