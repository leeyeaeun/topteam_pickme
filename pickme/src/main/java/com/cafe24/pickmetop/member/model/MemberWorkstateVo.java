package com.cafe24.pickmetop.member.model;

import java.sql.Date;

public class MemberWorkstateVo {
	
	private String withdraw_cd;
	private String company_cd;
	private String login_id;
	private String workstate_state;
	private Date workstate_begindate;
	private Date workstate_enddate;
	private String workstate_regdate;
	private String workstate_modidate;
	public String getWithdraw_cd() {
		return withdraw_cd;
	}
	public void setWithdraw_cd(String withdraw_cd) {
		this.withdraw_cd = withdraw_cd;
	}
	public String getCompany_cd() {
		return company_cd;
	}
	public void setCompany_cd(String company_cd) {
		this.company_cd = company_cd;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getWorkstate_state() {
		return workstate_state;
	}
	public void setWorkstate_state(String workstate_state) {
		this.workstate_state = workstate_state;
	}
	public Date getWorkstate_begindate() {
		return workstate_begindate;
	}
	public void setWorkstate_begindate(Date workstate_begindate) {
		this.workstate_begindate = workstate_begindate;
	}
	public Date getWorkstate_enddate() {
		return workstate_enddate;
	}
	public void setWorkstate_enddate(Date workstate_enddate) {
		this.workstate_enddate = workstate_enddate;
	}
	public String getWorkstate_regdate() {
		return workstate_regdate;
	}
	public void setWorkstate_regdate(String workstate_regdate) {
		this.workstate_regdate = workstate_regdate;
	}
	public String getWorkstate_modidate() {
		return workstate_modidate;
	}
	public void setWorkstate_modidate(String workstate_modidate) {
		this.workstate_modidate = workstate_modidate;
	}
	@Override
	public String toString() {
		return "MemberWorkstateVo [withdraw_cd=" + withdraw_cd + ", company_cd=" + company_cd + ", login_id=" + login_id
				+ ", workstate_state=" + workstate_state + ", workstate_begindate=" + workstate_begindate
				+ ", workstate_enddate=" + workstate_enddate + ", workstate_regdate=" + workstate_regdate
				+ ", workstate_modidate=" + workstate_modidate + "]";
	}
	
}
