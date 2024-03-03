import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.tejaswi.Employee;

public class EmployeeDept {

//	
//	int add(Long a, Integer b) throws IOException {
//		return a+b;
//		}
//	

	int add(Integer a, long b) {
		return (int) (a + b);
	}

//	
//	int add(Long a, Integer b) throws FileNotFoundException {
//		return a+b;
//		}

	public void name() {
		System.out.println("base");
	}

//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	List<E > ar= new ArrayList<E>();
//		
//		
// ar = employee.stream().groupingby(a->a.department).collect(Collectors.toList());
		EmployeeDept employeeDept = new EmployeeDept();
		System.out.println(employeeDept.add(5, 6));

	}

}
