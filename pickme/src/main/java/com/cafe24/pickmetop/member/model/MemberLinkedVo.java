package com.cafe24.pickmetop.member.model;

public class MemberLinkedVo {

	private String linked_id;
	private String linked_nick;
	private String linked_regdate;
	private String linked_logdate;
	private int linked_state;
	public String getLinked_id() {
		return linked_id;
	}
	public void setLinked_id(String linked_id) {
		this.linked_id = linked_id;
	}
	public String getLinked_nick() {
		return linked_nick;
	}
	public void setLinked_nick(String linked_nick) {
		this.linked_nick = linked_nick;
	}
	public String getLinked_regdate() {
		return linked_regdate;
	}
	public void setLinked_regdate(String linked_regdate) {
		this.linked_regdate = linked_regdate;
	}
	public String getLinked_logdate() {
		return linked_logdate;
	}
	public void setLinked_logdate(String linked_logdate) {
		this.linked_logdate = linked_logdate;
	}
	public int getLinked_state() {
		return linked_state;
	}
	public void setLinked_state(int linked_state) {
		this.linked_state = linked_state;
	}
	@Override
	public String toString() {
		return "MemberLinkedVo [linked_id=" + linked_id + ", linked_nick=" + linked_nick + ", linked_regdate="
				+ linked_regdate + ", linked_logdate=" + linked_logdate + ", linked_state=" + linked_state + "]";
	}
	
	
}
