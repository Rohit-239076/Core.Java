package com.code.core;

import java.time.LocalDate;

public class Doctor {
private int docid,experience;
private String Dname,email,Degree;
private LocalDate joinDate;
private double salary;
private Department dept;


public Doctor(int docid, int experience, String dname, String email, String degree, LocalDate joinDate, double salary
		) {
	super();
	this.docid = docid;
	this.experience = experience;
	Dname = dname;
	this.email = email;
	Degree = degree;
	this.joinDate = joinDate;
	this.salary = salary;
//	this.dept = dept;
}


@Override
public String toString() {
	return "Doctor [docid=" + docid + ", experience=" + experience + ", Dname=" + Dname + ", email=" + email
			+ ", Degree=" + Degree + ", joinDate=" + joinDate + ", salary=" + salary + ", dept=" + dept + "]";
}


public int getDocid() {
	return docid;
}


public void setDocid(int docid) {
	this.docid = docid;
}


public int getExperience() {
	return experience;
}


public void setExperience(int experience) {
	this.experience = experience;
}


public String getDname() {
	return Dname;
}


public void setDname(String dname) {
	Dname = dname;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getDegree() {
	return Degree;
}


public void setDegree(String degree) {
	Degree = degree;
}


public LocalDate getJoinDate() {
	return joinDate;
}


public void setJoinDate(LocalDate joinDate) {
	this.joinDate = joinDate;
}


public double getSalary() {
	return salary;
}


public void setSalary(double salary) {
	this.salary = salary;
}


public Department getDept() {
	return dept;
}


public void setDept(Department dept) {
	this.dept = dept;
}


@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	if(obj instanceof Doctor) {
		Doctor Dr=(Doctor)obj;
		return this.getDocid()==Dr.getDocid();
		}
	
return false;
}

}
