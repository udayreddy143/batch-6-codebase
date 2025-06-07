package org.jaswincodecraft.model;

public class Employee {
	
	
	private Double requestDay;
	
	private Double agreedDay;
	
	private Double reqestNight;
	
	private Double agreedNight;
	
	private String comment;
	
	private Department department;
	
	private String action;
	
	private String approveMode;

  
	

	public Double getRequestDay() {
		return requestDay;
	}




	public void setRequestDay(Double requestDay) {
		this.requestDay = requestDay;
	}




	public Double getAgreedDay() {
		return agreedDay;
	}




	public void setAgreedDay(Double agreedDay) {
		this.agreedDay = agreedDay;
	}




	public Double getReqestNight() {
		return reqestNight;
	}




	public void setReqestNight(Double reqestNight) {
		this.reqestNight = reqestNight;
	}




	public Double getAgreedNight() {
		return agreedNight;
	}




	public void setAgreedNight(Double agreedNight) {
		this.agreedNight = agreedNight;
	}




	public String getComment() {
		return comment;
	}




	public void setComment(String comment) {
		this.comment = comment;
	}




	public Department getDepartment() {
		return department;
	}




	public void setDepartment(Department department) {
		this.department = department;
	}




	public String getAction() {
		return action;
	}




	public void setAction(String action) {
		this.action = action;
	}




	public String getApproveMode() {
		return approveMode;
	}




	public void setApproveMode(String approveMode) {
		this.approveMode = approveMode;
	}




	@Override
	public String toString() {
		return "Employee{"+
				"requestDay=" + requestDay + '\'' +
				", agreedDay=" + agreedDay + '\'' +
				", reqestNight=" + reqestNight+ '\'' +
				", agreedNight=" + agreedNight +'\'' +
				", comment=" + comment + '\'' +
				", department=" + department + '\'' +
				", action="+ action + '\'' +
				", approveMode=" + approveMode + '}';
	}
	
	
	


}
