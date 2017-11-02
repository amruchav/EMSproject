package com.cg.ems.bean;

import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;



public class DesignationBean {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Designation_SEQUENCE")
	@SequenceGenerator(name="Designation_SEQUENCE", sequenceName="DESIGNATION_ID_SEQ", allocationSize=1)
	private int desigId;
	private String desigName;
	@OneToMany(mappedBy="desig")
	private Set<EmployeeBean> employee;
	
	
	public int getDesigId() {
		return desigId;
	}
	public void setDesigId(int desigId) {
		this.desigId = desigId;
	}
	public String getDesigName() {
		return desigName;
	}
	public void setDesigName(String desigName) {
		this.desigName = desigName;
	}
	public Set<EmployeeBean> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<EmployeeBean> employee) {
		this.employee = employee;
	}
	
	
}
