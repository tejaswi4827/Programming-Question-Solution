package com.tejaswi.sortClassVariable;

import java.util.Comparator;

public class IdCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		//int id = o1.getId()-o2.getId();
	//	int salary = o1.getSalary()-o2.getSalary();
		// checking if id is equal . if equal then sort based on salary or else don't do anything
		//return (id ==0)? salary:id;
	
		return  o1.getSalary() - o2.getSalary();
	}

}
