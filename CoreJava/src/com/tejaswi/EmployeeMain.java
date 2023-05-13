package com.tejaswi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1, "Zmit", "cse", 300);
		Employee emp1 = new Employee(2, "Rohit", "cse", 1000);
		Employee emp2 = new Employee(3, "Rahul", "ise", 2000);
//		List<Employee> arr = new ArrayList<>();
//		arr.add(emp);
//		arr.add(emp1);
//		arr.add(emp2);
		// System.out.println(arr.get(2).getEmpName());
		List<Employee> arr = Arrays.asList(emp, emp1, emp2);

		arr.stream().map(Employee::getSalary).filter(sal -> sal > 1000).forEach(System.out::println);

		Optional<Integer> opt = arr.stream().map(Employee::getSalary).filter(sal -> sal > 1000).findFirst();
		// System.out.print(opt.get());

		// optional class to check value is present or not then customize accordingly
		opt.ifPresentOrElse(output -> System.out.println(output), () -> System.out.println("Not Available"));

		// sort employee based on salary

		List<Employee> sortedList = arr.stream().sorted((sal1, sal2) -> sal1.getSalary() - sal2.getSalary())
				.collect(Collectors.toList());
		System.out.println(sortedList);

		// comparing based on name
		List<Employee> sortedListReverse = arr.stream()
				.sorted((sal1, sal2) -> sal1.getEmpName().compareTo(sal2.getEmpName())).collect(Collectors.toList());
		System.out.println(sortedListReverse);

		// comparing based on multiple variables

		// thenComparing is used to sort again if previous sorting is equal
		// like after sorting rohit and rahul have same salary 1000 then again sort
		// based on name
		List<Employee> sortNameAndSalary = arr.stream()
				.sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getEmpName))
				.collect(Collectors.toList());
		System.out.println("hi sir"+sortNameAndSalary);

		// inserting employee object as value of hashmap
		Map<Integer, Employee> hm = new HashMap<>();
		hm.put(1, emp);
		hm.put(2, emp1);
		hm.put(3, emp2);
		System.out.println(hm);
		hm.keySet().forEach(System.out::println);
		hm.values().forEach(System.out::println);
		hm.entrySet().stream().filter(sal->sal.getValue().getSalary()>400).map(Map.Entry::getValue).forEach(System.out::println);
	}

}
