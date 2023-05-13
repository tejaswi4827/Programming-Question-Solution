import java.util.Arrays;
import java.util.List;

public class JavaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= Arrays.asList(1,2,3,4);
		list.stream().forEach(System.out::println);
		System.out.println("hi");
	}

}
