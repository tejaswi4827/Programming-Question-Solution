import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ar = Arrays.asList(1, 1,7, 2, 3, 3, 4, 2);
	Set<Integer> hs = 	ar.stream().collect(Collectors.toSet());
	System.out.println(hs);
	//List<Integer>list=	ar.stream().distinct().collect(Collectors.toList());
	int a[] = {1,2,3,3}; 
	System.out.println(Arrays.stream(a).sum());
int b[]=	IntStream.range(0, a.length).map(i->i*2).toArray();//.forEach(System.out::println);
System.out.println(b[2]);
	//System.out.println(list);
	}

}
