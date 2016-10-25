package com.cafe24.pickmetop.resume.model;

import java.util.Date;

public class ResumeTrainningVo {
	String trainingCd;
	String resumeCd;
	String trainingCountry;
	String trainingAcademy;
	Date trainingBegindate;
	Date trainingEnddate;
	String trainingContent;
	public String getTrainingCd() {
		return trainingCd;
	}
	public void setTrainingCd(String trainingCd) {
		this.trainingCd = trainingCd;
	}
	public String getResumeCd() {
		return resumeCd;
	}
	public void setResumeCd(String resumeCd) {
		this.resumeCd = resumeCd;
	}
	public String getTrainingCountry() {
		return trainingCountry;
	}
	public void setTrainingCountry(String trainingCountry) {
		this.trainingCountry = trainingCountry;
	}
	public String getTrainingAcademy() {
		return trainingAcademy;
	}
	public void setTrainingAcademy(String trainingAcademy) {
		this.trainingAcademy = trainingAcademy;
	}
	public Date getTrainingBegindate() {
		return trainingBegindate;
	}
	public void setTrainingBegindate(Date trainingBegindate) {
		this.trainingBegindate = trainingBegindate;
	}
	public Date getTrainingEnddate() {
		return trainingEnddate;
	}
	public void setTrainingEnddate(Date trainingEnddate) {
		this.trainingEnddate = trainingEnddate;
	}
	public String getTrainingContent() {
		return trainingContent;
	}
	public void setTrainingContent(String trainingContent) {
		this.trainingContent = trainingContent;
	}
	@Override
	public String toString() {
		return "ResumeTrainningVo [trainingCd=" + trainingCd + ", resumeCd=" + resumeCd + ", trainingCountry="
				+ trainingCountry + ", trainingAcademy=" + trainingAcademy + ", trainingBegindate=" + trainingBegindate
				+ ", trainingEnddate=" + trainingEnddate + ", trainingContent=" + trainingContent + "]";
	}
	
}
