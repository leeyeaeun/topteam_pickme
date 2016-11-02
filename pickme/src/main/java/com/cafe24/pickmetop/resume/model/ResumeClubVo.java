package com.cafe24.pickmetop.resume.model;

public class ResumeClubVo {
	private String clubCd;
	private String resumeCd;
	private String clubName;
	private String clubHost;
	private String clubBegindate;
	private String clubEnddate;
	private String clubContent;
	public String getClubCd() {
		return clubCd;
	}
	public void setClubCd(String clubCd) {
		this.clubCd = clubCd;
	}
	public String getResumeCd() {
		return resumeCd;
	}
	public void setResumeCd(String resumeCd) {
		this.resumeCd = resumeCd;
	}
	public String getClubHost() {
		return clubHost;
	}
	public void setClubHost(String clubHost) {
		this.clubHost = clubHost;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getClubBegindate() {
		return clubBegindate;
	}
	public void setClubBegindate(String clubBegindate) {
		this.clubBegindate = clubBegindate;
	}
	public String getClubEnddate() {
		return clubEnddate;
	}
	public void setClubEnddate(String clubEnddate) {
		this.clubEnddate = clubEnddate;
	}
	public String getClubContent() {
		return clubContent;
	}
	public void setClubContent(String clubContent) {
		this.clubContent = clubContent;
	}
	@Override
	public String toString() {
		return "ResumeClubVo [clubCd=" + clubCd + ", resumeCd=" + resumeCd + ", clubHost=" + clubHost + ", clubName="
				+ clubName + ", clubBegindate=" + clubBegindate + ", clubEnddate=" + clubEnddate + ", clubContent="
				+ clubContent + "]";
	}
	
}
