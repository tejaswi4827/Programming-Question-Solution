package com.tejaswi.sortClassVariable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
		System.out.println(arrayList);
		System.out.println("max salary is : " + arrayList.get(arrayList.size() - 1).getSalary() + " "
				+ arrayList.get(arrayList.size() - 1).getEmpName());

	
		
		// grouping by each employee according to department
		
		
//		Map<String, List<Employee>> groupedByDepartment =	arrayList.stream().collect(Collectors.groupingBy(a -> a.getDept()));
//		System.err.println(groupedByDepartment);
//		
//		groupedByDepartment.forEach((deptName,EmployeeData)->{
//			EmployeeData.forEach(a->System.out.println(deptName+" "+a.getEmpName()));
			
	//	});
	}

}
