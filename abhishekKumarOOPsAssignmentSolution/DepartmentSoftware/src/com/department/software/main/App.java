package com.department.software.main;
import com.department.software.bean.*;
import com.department.software.bean.admindept.*;
import com.department.software.bean.hrdept.*;
import com.department.software.bean.techdept.*;


public class App extends SuperDepartment {

	public static void main(String[] args) {
		
		SuperDepartment a= new SuperDepartment();		
		a.setDepartmentName("Super Department");
		a.setGetTodaysWork("No Work As if now");
		a.setGetWorkDeadline("Nil");
		a.setIsTodayaHoliday("Today is not a Holiday");
		
		//Setting The value for Admin Department
		AdminDepartment b= new AdminDepartment();
		b.setDepartmentName("Admin Department");
		b.setGetTodaysWork("Complete Your Document Submission");
		b.setGetWorkDeadline("Complete by EOD");
		
		//Printing the value of Admin department
		System.out.println("Welcome to "+b.getDepartmentName());
		System.out.println(b.getGetTodaysWork());
		System.out.println(b.getGetWorkDeadline());
		System.out.println(a.getIsTodayaHoliday());
		
		// Setting the value for Hr Department
		
		HrDepartment c = new HrDepartment();
		c.setDepartmentName("HR Department");
		c.setGetTodaysWork("Fill today's timesheet and mark your attendance");
		c.setGetWorkDeadline("Complete by EOD");
		c.setDoActivity("team Lunch");
		
		//Printing the value of tech department
		System.out.println();
		System.out.println("Welcome to "+c.getDepartmentName());
		System.out.println(c.getDoActivity());
		System.out.println(c.getGetTodaysWork());
		System.out.println(c.getGetWorkDeadline());
		System.out.println(a.getIsTodayaHoliday());
	
		// Setting the value for Technical Department
		
		TechDepartment d= new TechDepartment();
		d.setDepartmentName("Tech Department.");
		d.setGetTodaysWork("Complete Coding of Module 1.");
		d.setGetWorkDeadline("Complete by EOD");
		d.setGetTechStackInformation("Core java");
		
		//Printing the value of tech department
		System.out.println();
		System.out.println("Welcome to "+d.getDepartmentName());
		System.out.println(d.getGetTodaysWork());
		System.out.println(d.getGetWorkDeadline());
		System.out.println(d.getGetTechStackInformation());
		System.out.println(a.getIsTodayaHoliday());
	}
}
