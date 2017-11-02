
	package com.cg.ems.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

	public class AddressBean {

		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Address_SEQUENCE")
		@SequenceGenerator(name="Address_SEQUENCE", sequenceName="ADDRESS_ID_SEQ", allocationSize=1)
		private int addressId;
		private String address1;
		private String address2;
		private int pincode;
		private String city;
		private String state;
		private String country;
		
		@OneToOne(mappedBy="address")
		private EmployeeBean employee;

		public int getAddressId() {
			return addressId;
		}

		public void setAddressId(int addressId) {
			this.addressId = addressId;
		}

		public String getAddress1() {
			return address1;
		}

		public void setAddress1(String addr1) {
			address1 = addr1;
		}

		public String getAddress2() {
			return address2;
		}

		public void setAddress2(String addr2) {
			address2 = addr2;
		}

		public int getPincode() {
			return pincode;
		}

		public void setPincode(int pincode) {
			this.pincode = pincode;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public EmployeeBean getEmployee() {
			return employee;
		}

		public void setEmployee(EmployeeBean employee) {
			this.employee = employee;
		}
	
	
		
		
		
	}

