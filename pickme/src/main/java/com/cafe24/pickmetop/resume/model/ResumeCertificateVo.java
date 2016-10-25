package com.cafe24.pickmetop.resume.model;

import java.util.Date;

public class ResumeCertificateVo {
	String memberCertificateCd;
	String resumeCd;
	String certificateCd;
	String certificateGrade;
	String certificateHost;
	Date certificateBegindate;
	Date certificateEnddate;
	String certificateRegnum;
	public String getMemberCertificateCd() {
		return memberCertificateCd;
	}
	public void setMemberCertificateCd(String memberCertificateCd) {
		this.memberCertificateCd = memberCertificateCd;
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
	public String getCertificateGrade() {
		return certificateGrade;
	}
	public void setCertificateGrade(String certificateGrade) {
		this.certificateGrade = certificateGrade;
	}
	public String getCertificateHost() {
		return certificateHost;
	}
	public void setCertificateHost(String certificateHost) {
		this.certificateHost = certificateHost;
	}
	public Date getCertificateBegindate() {
		return certificateBegindate;
	}
	public void setCertificateBegindate(Date certificateBegindate) {
		this.certificateBegindate = certificateBegindate;
	}
	public Date getCertificateEnddate() {
		return certificateEnddate;
	}
	public void setCertificateEnddate(Date certificateEnddate) {
		this.certificateEnddate = certificateEnddate;
	}
	public String getCertificateRegnum() {
		return certificateRegnum;
	}
	public void setCertificateRegnum(String certificateRegnum) {
		this.certificateRegnum = certificateRegnum;
	}
	@Override
	public String toString() {
		return "ResumeCertificateVo [memberCertificateCd=" + memberCertificateCd + ", resumeCd=" + resumeCd
				+ ", certificateCd=" + certificateCd + ", certificateGrade=" + certificateGrade + ", certificateHost="
				+ certificateHost + ", certificateBegindate=" + certificateBegindate + ", certificateEnddate="
				+ certificateEnddate + ", certificateRegnum=" + certificateRegnum + "]";
	}
	

}
