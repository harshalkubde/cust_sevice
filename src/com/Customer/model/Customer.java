package com.Customer.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import com.Customer.enums.ServicePlan;

public class Customer {

	private static final AtomicInteger counter = new AtomicInteger(0);
	private int cid;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private double reg_amount;
	private LocalDate dob;
//	private ServicePlan servicePlan;

	public Customer(String fname, String lname, String email, String password, double reg_amount, LocalDate dob
	/* ServicePlan servicePlan */) {
		super();
		this.cid = counter.incrementAndGet();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.reg_amount = reg_amount;
		this.dob = dob;
//		this.servicePlan = servicePlan;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getReg_amount() {
		return reg_amount;
	}

	public void setReg_amount(double reg_amount) {
		this.reg_amount = reg_amount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", password="
				+ password + ", reg_amount=" + reg_amount + ", dob=" + dob + "]";
	}

//	public ServicePlan getServicePlan() {
//		return servicePlan;
//	}
//
//	public void setServicePlan(ServicePlan servicePlan) {
//		this.servicePlan = servicePlan;
//	}

}
