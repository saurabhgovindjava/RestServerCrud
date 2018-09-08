package com.saurabh.entity;

import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.annotations.SerializedName;

@XmlRootElement
public class EmployeeInfo {
	
	@SerializedName(value = "Employee ID")
  int employee_id;
	@SerializedName(value = "City Name")
  String city_name;
	@SerializedName(value = "Salary")
  String salary;
	@SerializedName(value = "First Name")
  String first_name;
	@SerializedName(value = "Second Name")
  String second_name;
	@SerializedName(value = "Manager Emp Id")
  int manager_emp_id;
	
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getSecond_name() {
		return second_name;
	}
	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}
	public int getManager_emp_id() {
		return manager_emp_id;
	}
	public void setManager_emp_id(int manager_emp_id) {
		this.manager_emp_id = manager_emp_id;
	}
  
  
}
