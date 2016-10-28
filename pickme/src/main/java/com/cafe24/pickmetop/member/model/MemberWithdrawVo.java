package com.cafe24.pickmetop.member.model;

import java.sql.Date;

public class MemberWithdrawVo {

	private String withdraw_cd;
	private String withdraw_id;
	private int withdraw_state;
	private Date withdraw_date;
	private String general_id;
	public String getWithdraw_cd() {
		return withdraw_cd;
	}
	public void setWithdraw_cd(String withdraw_cd) {
		this.withdraw_cd = withdraw_cd;
	}
	public String getWithdraw_id() {
		return withdraw_id;
	}
	public void setWithdraw_id(String withdraw_id) {
		this.withdraw_id = withdraw_id;
	}
	public int getWithdraw_state() {
		return withdraw_state;
	}
	public void setWithdraw_state(int withdraw_state) {
		this.withdraw_state = withdraw_state;
	}
	public Date getWithdraw_date() {
		return withdraw_date;
	}
	public void setWithdraw_date(Date withdraw_date) {
		this.withdraw_date = withdraw_date;
	}
	public String getGeneral_id() {
		return general_id;
	}
	public void setGeneral_id(String general_id) {
		this.general_id = general_id;
	}
	@Override
	public String toString() {
		return "MemberWithdrawVo [withdraw_cd=" + withdraw_cd + ", withdraw_id=" + withdraw_id + ", withdraw_state="
				+ withdraw_state + ", withdraw_date=" + withdraw_date + ", general_id=" + general_id + "]";
	}
	
	
}
