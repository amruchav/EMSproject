<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<h2 align="center">FILL EMPLOYEE DETAILS</h2>
	<form:form modelAttribute="employee" commandName="employee">
		<table>
		<h3>Personal Information:</h3>
			<tr>
				<td> First Name :</td>
				<td>
					<form:input path="firstName"/>
					<form:errors path="firstName"/>
				</td>
			</tr>
			<tr>
				<td> Last Name :</td>
				<td>
					<form:input path="lastName" />
					<form:errors path="lastName"/>
				</td>
			</tr>
			
			<tr>
				<td> Gender :</td>
				<td>
					<form:input type="radio" path="gender"
					 id="rbtnMale" value="M"/>Male
					 <form:input type="radio" path="gender"
					 id="rbtnFemale" value="F"/>Female  
				</td>
			</tr>
			
			<tr>
				<td> Martial Status :</td>
				<td>
					<form:select path="martialStatus">
					<option value="select">--Select--</option>
					<option value="Single">Single</option>
					<option value="Married">Married</option>
					<option value="Separated">Separated</option>
					<option value="Widow">Widow</option>
					<option value="Divorced">Divorced</option>
					</form:select>
				</td>
			</tr>
			
			<tr>
				<td> Date of Birth :</td>
				<td>
					<form:input path="dateOfBirth" />
					<form:errors path="dateOfBirth"/>
				</td>
			</tr>
			</table>
			
			
			<table>
			<h3>Job Specific Information:</h3>
			
			<tr>
				<td> Date of Joining :</td>
				<td>
					<form:input path="dateOfJoining" />
					<form:errors path="dateOfJoining"/>
				</td>
			</tr>
			
			
			<tr>
				<td> Department :</td>
				<td>
					<form:input path="deptName" />
					<form:errors path="deptName"/>
				</td>
			</tr>
			
			<tr>
				<td> Designation :</td>
				<td>
					<form:input path="desig" />
					<form:errors path="desig"/>
				</td>
			</tr>
			
			<tr>
				<td> Salary :</td>
				<td>
					<form:input path="salary" />
					<form:errors path="salary"/>
				</td>
			</tr>
			</table>
			
			
			<table>
			<h3>Address Information:</h3>
			<tr>
				<td> Address line 1 :</td>
				<td>
					<form:input path="address1" />
					<form:errors path="address1"/>
				</td>
			</tr>
			
			<tr>
				<td> Address line 2 :</td>
				<td>
					<form:input path="address2" />
					<form:errors path="address2"/>
				</td>
			</tr>
			
			<tr>
				<td> City :</td>
				<td>
					<form:input path="city" />
					<form:errors path="city"/>
				</td>
			</tr>
			
			<tr>
				<td> State :</td>
				<td>
					<form:input path="state" />
					<form:errors path="state"/>
				</td>
			</tr>
			
			<tr>
				<td> Postal code :</td>
				<td>
					<form:input path="pincode" />
					<form:errors path="pincode"/>
				</td>
			</tr>
			
			<tr>
				<td> Country :</td>
				<td>
					<form:input path="country" />
					<form:errors path="country"/>
				</td>
			</tr>
			</table>
			
			<table>
			<h3> Contact Information:</h3>
			<tr>
				<td> Phone no :</td>
				<td>
					<form:input path="contactNo" />
					<form:errors path="contactNo"/>
				</td>
			</tr>
			
			</table>
</form:form>
</body>
</html>