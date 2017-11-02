package com.cg.ems.bean;

import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

public class DepartmentBean {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="department_SEQUENCE")
	@SequenceGenerator(name="department_SEQUENCE", sequenceName="DEPARTMENT_ID_SEQ", allocationSize=1)
	private int deptId;
	private String deptName;
	@OneToMany(mappedBy="dept")
	private Set<EmployeeBean> employee;
	
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Set<EmployeeBean> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<EmployeeBean> employee) {
		this.employee = employee;
	}
	
	
}

