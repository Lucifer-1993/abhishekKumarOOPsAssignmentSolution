package com.department.software.bean;

public class SuperDepartment {
	private String departmentName;
	private String getTodaysWork;
	private String getWorkDeadline;
	private String isTodayaHoliday;
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getGetTodaysWork() {
		return getTodaysWork;
	}
	public void setGetTodaysWork(String getTodaysWork) {
		this.getTodaysWork = getTodaysWork;
	}
	public String getGetWorkDeadline() {
		return getWorkDeadline;
	}
	public void setGetWorkDeadline(String getWorkDeadline) {
		this.getWorkDeadline = getWorkDeadline;
	}
	public String getIsTodayaHoliday() {
		return isTodayaHoliday;
	}
	public void setIsTodayaHoliday(String isTodayaHoliday) {
		this.isTodayaHoliday = isTodayaHoliday;
	}
	public SuperDepartment(String departmentName, String getTodaysWork, String getWorkDeadline,
			String isTodayaHoliday) {
		super();
		this.departmentName = departmentName;
		this.getTodaysWork = getTodaysWork;
		this.getWorkDeadline = getWorkDeadline;
		this.isTodayaHoliday = isTodayaHoliday;
	}
	public SuperDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
