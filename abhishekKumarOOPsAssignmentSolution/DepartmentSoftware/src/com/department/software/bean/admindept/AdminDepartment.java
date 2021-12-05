package com.department.software.bean.admindept;

import com.department.software.bean.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	
	private String departmentName;
	private String getTodaysWork;
	private String getWorkDeadline;
	
	
	public AdminDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminDepartment(String departmentName, String getTodaysWork, String getWorkDeadline) {
		super();
		this.departmentName = departmentName;
		this.getTodaysWork = getTodaysWork;
		this.getWorkDeadline = getWorkDeadline;
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

}
