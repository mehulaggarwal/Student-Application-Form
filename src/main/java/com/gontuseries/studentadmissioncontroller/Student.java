package com.gontuseries.studentadmissioncontroller;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

/*import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
*/
@Entity
@Table(name="StudentInformation")
public class Student {
	
	public String getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	@Id
	@NotEmpty(message="Student Roll No. should not be empty!")
	private String studentRollNo ;
	
	@NotEmpty(message="Student Name should not be empty!")
	@Pattern(regexp="[^0-9]*",message="must contains alphabets only!")
	private String studentName;
	
	@NotEmpty
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@NotEmpty(message="Student Hobby should not be empty!") @IsValidHobby
	private String studentHobby;

	@Transient
	private String captcha;
	
	@NotNull(message="Student Mobile should not be empty!")
	private Long studentMobile;
	
	@Past 
	@Temporal(TemporalType.DATE)
	private Date studentDOB;
	
	//private ArrayList<String> studentSkills;
	
	//private Address studentAddress;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	/*public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}*/
	/*public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}*/
	public String getCaptcha() {
		return captcha;
	}
	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
	

}
