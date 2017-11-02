package com.cg.ems.bean;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

public class LoginDetailsBean {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="login_SEQUENCE")
	@SequenceGenerator(name="login_SEQUENCE", sequenceName="LOGIN_ID_SEQ", allocationSize=1)
	private int loginId;
	private String userName;
	private String password;
	private String role;
	private int empId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="loginId")
	private LoginDetailsBean login;

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public LoginDetailsBean getLogin() {
		return login;
	}

	public void setLogin(LoginDetailsBean login) {
		this.login = login;
	}
	
	
}