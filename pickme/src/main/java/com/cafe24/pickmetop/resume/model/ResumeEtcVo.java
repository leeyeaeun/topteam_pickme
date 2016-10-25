package com.cafe24.pickmetop.resume.model;

import java.io.File;
import java.util.Date;

public class ResumeEtcVo {
	String etcCd;
	String resumeCd;
	String etcTitle;
	String etcContent;
	File etcFile;
	Date etcBegindate;
	Date etcEnddate;
	public String getEtcCd() {
		return etcCd;
	}
	public void setEtcCd(String etcCd) {
		this.etcCd = etcCd;
	}
	public String getResumeCd() {
		return resumeCd;
	}
	public void setResumeCd(String resumeCd) {
		this.resumeCd = resumeCd;
	}
	public String getEtcTitle() {
		return etcTitle;
	}
	public void setEtcTitle(String etcTitle) {
		this.etcTitle = etcTitle;
	}
	public String getEtcContent() {
		return etcContent;
	}
	public void setEtcContent(String etcContent) {
		this.etcContent = etcContent;
	}
	public File getEtcFile() {
		return etcFile;
	}
	public void setEtcFile(File etcFile) {
		this.etcFile = etcFile;
	}
	public Date getEtcBegindate() {
		return etcBegindate;
	}
	public void setEtcBegindate(Date etcBegindate) {
		this.etcBegindate = etcBegindate;
	}
	public Date getEtcEnddate() {
		return etcEnddate;
	}
	public void setEtcEnddate(Date etcEnddate) {
		this.etcEnddate = etcEnddate;
	}
	@Override
	public String toString() {
		return "ResumeEtcVo [etcCd=" + etcCd + ", resumeCd=" + resumeCd + ", etcTitle=" + etcTitle + ", etcContent="
				+ etcContent + ", etcFile=" + etcFile + ", etcBegindate=" + etcBegindate + ", etcEnddate=" + etcEnddate
				+ "]";
	}
	
	
}
