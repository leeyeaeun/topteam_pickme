package com.cafe24.pickmetop.member.model;

public class MemberGeneralVo {
	
	private String general_id;
	private String general_pw;
	private String general_nick;
	private int general_level;
	private String general_date;
	private String general_logdate;
	private int general_state;
	public String getGeneral_id() {
		return general_id;
	}
	public void setGeneral_id(String general_id) {
		this.general_id = general_id;
	}
	public String getGeneral_pw() {
		return general_pw;
	}
	public void setGeneral_pw(String general_pw) {
		this.general_pw = general_pw;
	}
	public String getGeneral_nick() {
		return general_nick;
	}
	public void setGeneral_nick(String general_nick) {
		this.general_nick = general_nick;
	}
	public int getGeneral_level() {
		return general_level;
	}
	public void setGeneral_level(int general_level) {
		this.general_level = general_level;
	}
	public String getGeneral_date() {
		return general_date;
	}
	public void setGeneral_date(String general_date) {
		this.general_date = general_date;
	}
	public String getGeneral_logdate() {
		return general_logdate;
	}
	public void setGeneral_logdate(String general_logdate) {
		this.general_logdate = general_logdate;
	}
	public int getGeneral_state() {
		return general_state;
	}
	public void setGeneral_state(int general_state) {
		this.general_state = general_state;
	}
	@Override
	public String toString() {
		return "MemberGeneralVo [general_id=" + general_id + ", general_pw=" + general_pw + ", general_nick="
				+ general_nick + ", general_level=" + general_level + ", general_date=" + general_date
				+ ", general_logdate=" + general_logdate + ", general_state=" + general_state + "]";
	}
	

}
