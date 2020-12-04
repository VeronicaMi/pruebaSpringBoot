package com.indra.bbva.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEES")

public class EmployeesEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long employeeId;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "PHONE_NUMER")
	private String phoneNumber;
	@Column(name = "HIRE_DATE")
	private Date hireDate;
	@Column(name = "JOB_ID")
	private String jobId;
	@Column(name = "SALARY")
	private float salary;
	@Column(name = "COMISSION_PCT")
	private float comissionPCT;
	@Column(name = "MANAGER_ID")
	private int managerId;
	@Column(name = "DEPARTAMENT_ID")
	private int departamentId;
	
	public EmployeesEntity() {}
	
	public EmployeesEntity(long employeeId, String firstName, String lastName, String email, String phoneNumber,
			Date hireDate, String jobId, float salary, float comissionPCT, int managerId, int departamentId) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.salary = salary;
		this.comissionPCT = comissionPCT;
		this.managerId = managerId;
		this.departamentId = departamentId;
	}
	
	
	private long getEmployeeId() {
		return employeeId;
	}
	private void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	private String getFirstName() {
		return firstName;
	}
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	private String getLastName() {
		return lastName;
	}
	private void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	private String getPhoneNumber() {
		return phoneNumber;
	}
	private void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	private Date getHireDate() {
		return hireDate;
	}
	private void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	private String getJobId() {
		return jobId;
	}
	private void setJobId(String jobId) {
		this.jobId = jobId;
	}
	private float getSalary() {
		return salary;
	}
	private void setSalary(float salary) {
		this.salary = salary;
	}
	private float getComissionPCT() {
		return comissionPCT;
	}
	private void setComissionPCT(float comissionPCT) {
		this.comissionPCT = comissionPCT;
	}
	private int getManagerId() {
		return managerId;
	}
	private void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	private int getDepartamentId() {
		return departamentId;
	}
	private void setDepartamentId(int departamentId) {
		this.departamentId = departamentId;
	}

	@Override
	public String toString() {
		return "EmployeesEntity [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", jobId=" + jobId
				+ ", salary=" + salary + ", comissionPCT=" + comissionPCT + ", managerId=" + managerId
				+ ", departamentId=" + departamentId + "]";
	}
	
	
	
	
}
