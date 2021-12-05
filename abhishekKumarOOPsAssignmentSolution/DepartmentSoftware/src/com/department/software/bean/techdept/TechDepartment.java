package com.department.software.bean.techdept;

import com.department.software.bean.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	
	private String departmentName;
	private String getTodaysWork;
	private String getWorkDeadline;
	private String getTechStackInformation;
	
	
	public TechDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TechDepartment(String departmentName, String getTodaysWork, String getWorkDeadline, String isTodayaHoliday) {
		super(departmentName, getTodaysWork, getWorkDeadline, isTodayaHoliday);
		// TODO Auto-generated constructor stub
	}
	public TechDepartment(String departmentName, String getTodaysWork, String getWorkDeadline, String isTodayaHoliday,
			String departmentName2, String getTodaysWork2, String getWorkDeadline2, String getTechStackInformation) {
		super(departmentName, getTodaysWork, getWorkDeadline, isTodayaHoliday);
		departmentName = departmentName2;
		getTodaysWork = getTodaysWork2;
		getWorkDeadline = getWorkDeadline2;
		this.getTechStackInformation = getTechStackInformation;
	}
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
	public String getGetTechStackInformation() {
		return getTechStackInformation;
	}
	public void setGetTechStackInformation(String getTechStackInformation) {
		this.getTechStackInformation = getTechStackInformation;
	}
	
	

}
