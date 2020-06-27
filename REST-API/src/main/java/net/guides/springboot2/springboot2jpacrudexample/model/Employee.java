package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	private long id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String jobName;
	private String depName;
	private String salaryScale;
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String emailId,String jobName,String depName,String salaryScale) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.jobName=jobName;
		this.depName=depName;
		this.salaryScale=salaryScale;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "email_address", nullable = false)
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "job_name", nullable = false)
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	@Column(name = "dep_name", nullable = false)
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Column(name = "salary_scale", nullable = false)
	public String getSalaryScale() {
		return salaryScale;
	}
	public void setSalaryScale(String salaryScale) {
		this.salaryScale = salaryScale;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId +", jobName="+ jobName +", depName="+ depName +", salaryScale="+ salaryScale
				+ "]";
	}
	
}
