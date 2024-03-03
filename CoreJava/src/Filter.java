import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.sound.sampled.Line;

public class Filter {
	public static void main(String... args) {
		List<Integer> ar = Arrays.asList(1, 1, 2, 3);
		
		List<List<Integer>> li= new ArrayList<>();
		li.add(ar);
		li.add(ar);
	int res =	ar.stream().reduce(0, (a1,a2)->a1+a2);
	//other way
	int res1 =	ar.stream().collect(Collectors.summingInt(Integer::intValue));
	
	//for filtering
	//ar.stream().filter(a->a%2!=0).map(b->b*2).forEach(System.out::println);
	
	li.stream().flatMap(Collection::stream).forEach(System.out::println);
	System.out.println(res+ " "+res1);
	
	
	
// converting array to list and list to array 
    int a[] = new int [3];
    a[0]=2;a[1]=4;a[2]=3;
   
 List<Integer> list =Arrays.stream(a).boxed().collect(Collectors.toList());
 
    
  List<Integer> res2 =  list.stream().filter(item -> item %2 == 0).collect(Collectors.toList());
	System.out.println(res2);
	
	int intarr[] = res2.stream().mapToInt(i->i).toArray();
	System.out.println(intarr[0]);
	}
}
