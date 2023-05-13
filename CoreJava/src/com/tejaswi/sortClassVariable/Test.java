package com.tejaswi.sortClassVariable;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> arrayList = new ArrayList<>();
		arrayList.add(new Employee(1, "Zmit", "cse", 35));
		arrayList.add(new Employee(1, "Abc", "ise", 34));
		arrayList.add(new Employee(1, "Abc", "ise", 39));
		arrayList.add(new Employee(1, "Abc", "ise", 34));
		arrayList.add(new Employee(1, "Abc", "ise", 78));
		Collections.sort(arrayList, new IdCompare());
		System.out.println("max salary is : "+arrayList.get(arrayList.size()-1).getSalary()+" "+arrayList.get(arrayList.size()-1).getEmpName());
		
	}

}
