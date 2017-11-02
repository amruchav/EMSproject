package com.cg.ems.bean;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

public class EmployeeBean {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="employee_SEQUENCE")
	@SequenceGenerator(name="employee_SEQUENCE", sequenceName="EMPLOYEE_ID_SEQ", allocationSize=1)
	private int empId;
	private String firstName;
	private String lastName;
	private Date dateOfJoining;
	private Date dateOfBirth;
	private int deptId;
	private int designationId;
	private String grade;
	private String gender;
	private long salary;
	private String martialStatus;
	private int addressId;
	private long contactNo;
	//desig mapping
	@ManyToOne
	@JoinColumn(name="designationId")
	private DesignationBean desig;
	
	//dept mapping
		@ManyToOne
		@JoinColumn(name="deptId")
		private DepartmentBean dept;
		
		
	//address mapping
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="addressId")
		private AddressBean address;
		
		//login mapping
		@OneToOne(mappedBy="login")
		private EmployeeBean employee;

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			lastName = lastName;
		}

		public Date getDateOfJoining() {
			return dateOfJoining;
		}

		public void setDateOfJoining(Date dateOfJoining) {
			this.dateOfJoining = dateOfJoining;
		}

		public Date getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public int getDeptId() {
			return deptId;
		}

		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}

		public int getDesignationId() {
			return designationId;
		}

		public void setDesignationId(int designationId) {
			this.designationId = designationId;
		}

		public String getGrade() {
			return grade;
		}

		public void setGrade(String grade) {
			this.grade = grade;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public long getSalary() {
			return salary;
		}

		public void setSalary(long salary) {
			this.salary = salary;
		}

		public String getMartialStatus() {
			return martialStatus;
		}

		public void setMartialStatus(String martialStatus) {
			this.martialStatus = martialStatus;
		}

		public int getAddressId() {
			return addressId;
		}

		public void setAddressId(int addressId) {
			this.addressId = addressId;
		}

		public long getContactNo() {
			return contactNo;
		}

		public void setContactNo(long contactNo) {
			this.contactNo = contactNo;
		}

		public DesignationBean getDesig() {
			return desig;
		}

		public void setDesig(DesignationBean desig) {
			this.desig = desig;
		}

		public DepartmentBean getDept() {
			return dept;
		}

		public void setDept(DepartmentBean dept) {
			this.dept = dept;
		}

		public AddressBean getAddress() {
			return address;
		}

		public void setAddress(AddressBean address) {
			this.address = address;
		}

		public EmployeeBean getEmployee() {
			return employee;
		}

		public void setEmployee(EmployeeBean employee) {
			this.employee = employee;
		}
		
		

}