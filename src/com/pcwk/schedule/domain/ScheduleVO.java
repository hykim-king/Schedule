package com.pcwk.schedule.domain;

import com.pcwk.cmn.DTO;

public class ScheduleVO extends DTO {

    private String sid;//번호
    private String scheduleDate;//날짜
    private String scheduleContent;//내용 
    
    
	public ScheduleVO() {
		super();
	}


	public ScheduleVO(String sid, String scheduleDate, String scheduleContent) {
		super();
		this.sid = sid;
		this.scheduleDate = scheduleDate;
		this.scheduleContent = scheduleContent;
	}


	public String getSid() {
		return sid;
	}


	public void setSid(String sid) {
		this.sid = sid;
	}


	public String getScheduleDate() {
		return scheduleDate;
	}


	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}


	public String getScheduleContent() {
		return scheduleContent;
	}


	public void setScheduleContent(String scheduleContent) {
		this.scheduleContent = scheduleContent;
	}


	@Override
	public String toString() {
		return "ScheduleVO [sid=" + sid + ", scheduleDate=" + scheduleDate + ", scheduleContent=" + scheduleContent
				+ ", toString()=" + super.toString() + "]";
	}
    
    
    
	
}
