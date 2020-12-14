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
	
	
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getComissionPCT() {
		return comissionPCT;
	}
	public void setComissionPCT(float comissionPCT) {
		this.comissionPCT = comissionPCT;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getDepartamentId() {
		return departamentId;
	}
	public void setDepartamentId(int departamentId) {
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
