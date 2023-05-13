package com.tejaswi;

public class Employee {
	
	
	public Employee(int id, String empName, String dept, int salary) {
		super();
		this.id = id;
		this.empName = empName;
		this.dept = dept;
		this.salary = salary;
	}

	public Employee(int id, String empName, String dept) {
		super();
		this.id = id;
		this.empName = empName;
		this.dept = dept;
	}
	private int id;
	private String empName;
	private String dept;
	private int salary;
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", dept=" + dept + ", salary=" + salary + "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
