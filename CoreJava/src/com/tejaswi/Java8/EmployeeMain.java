package com.tejaswi.Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSInput;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// 1. how many male and female employees are there in organization.

		Map<String, Long> employees = employeeList.stream()
				.collect(Collectors.groupingBy(a -> a.getGender(), Collectors.counting()));
		System.out.println(employees);

		// other approach to print in one line

		employeeList.stream().collect(Collectors.groupingBy(a -> a.getGender(), Collectors.counting())).entrySet()
				.forEach(a -> System.out.println(a.getKey() + "-- " + a.getValue()));

		// 2. how many male employees are there in organization.

		Map<Object, Long> maleEmployee = employeeList.stream()
				.collect(Collectors.groupingBy(gender -> gender.getGender().equals("Male"), Collectors.counting()));
		System.out.println(maleEmployee);

		Long maleCount = employeeList.stream().filter(gender -> gender.getGender().equals("Male")).count();
		System.out.println(maleCount);

		// 3. print the name of all departments in the organization

		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

		// 4. what is the average age of male and female employees

		Map<String, Double> employeesData = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

		for (Entry<String, Double> employee : employeesData.entrySet()) {
			System.out.println("rounded to 3 digit places " + Math.round(employee.getValue() * 1000.0) / 1000.0);
		}
		// using java 8
		employeesData.entrySet().stream().map(a -> Math.round(a.getValue() * 100.0) / 100.0)
				.forEach(System.out::println);
		System.out.println("average age of employee " + employeesData);

		// 5. get the details of highest paid employee in the organization

		Optional<Employee> maximumSalaryEmployee = employeeList.stream().max(Comparator.comparing(Employee::getSalary));

		System.out.println(maximumSalaryEmployee.get().salary);

		// 6. Get the name of all employee who joined after 2015

		List<String> employeesJoinedAfter2015 = employeeList.stream().filter(a -> a.getYearOfJoining() > 2015)
				.map(Employee::getName).collect(Collectors.toList());

		System.out.println(employeesJoinedAfter2015);

		// 7. count the no. of employee in each department

		Map<String, Long> totalEmployeeCountMap = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		System.out.println(totalEmployeeCountMap);

		// 8. What is the average salary of each department?

		Map<String, Double> averageSalaryByDept = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(averageSalaryByDept);

		// 9. Get the details of youngest male employee in the product development
		// department?

		employeeList.stream()
				.filter(emp -> emp.getDepartment().equals("Product Development") && emp.getGender().equals("Male"))
				.min(Comparator.comparing(Employee::getAge));

		// 10. How many male and female employees are there in the sales and marketing
		// team?
		Map<String, Long> empCount = employeeList.stream()
				.filter(emp -> emp.getDepartment().equals("Sales And Marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(empCount);

		// 11. List down the names of all employees in each department?
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet()
				.forEach(a -> System.out.println(a.getKey() + " ----" + a.getValue()));

		// 12. What is the average salary and total salary of the whole organization?
		DoubleSummaryStatistics a = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println(a);
		System.out.println(a.getSum());
		System.out.println(a.getAverage());

		// 13. Separate the employees who are younger or equal to 25 years from those
		// employees who are older than 25 years.

		employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25)).entrySet().stream()
				.forEach((as) -> System.out.println(as.getValue()));

		Map<Boolean, List<Employee>> listMap = employeeList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));

		System.err.println(listMap);
		Map<Object, Object> resultMap = listMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,
				e -> e.getValue().stream().map(Employee::getName).collect(Collectors.toList())));
		System.out.println(resultMap);
	}

}
