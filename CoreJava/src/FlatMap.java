import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			ArrayList<Integer> arrayList = new ArrayList<>();
			for (int j = 0; j < 3; j++) {
				arrayList.add(j);
			}
			list.add(arrayList);

		}
		System.out.println(list);

		// flat map converts stream of stream to single stream
		List<Integer> flatMapIntegers = list.stream().flatMap(a -> a.stream()).collect(Collectors.toList());
		System.out.println(flatMapIntegers);

//find minimum elements of flat map

		OptionalInt min = flatMapIntegers.stream().mapToInt(a -> a).min();
		System.out.println("minimum number is " + min.getAsInt());

		// find count of element in list
		long count = flatMapIntegers.stream().mapToInt(a -> a).count();
		System.out.println(count);

		/// find maximum element of list java 8
		int maxi = flatMapIntegers.stream().mapToInt(a -> a).max()
				.orElseThrow(() -> new RuntimeException("Error occured!!"));
		System.out.println("maximum number is " + maxi);

		// reverse the list and find only top 4 elements used limit to handle this
		flatMapIntegers.stream().sorted(Collections.reverseOrder()).limit(4).forEach(System.out::print);
		System.out.println();
		System.out.println("fiter number which is divisible by 2 ");
		// filter number which is divisible by 2
		flatMapIntegers.stream().filter(a -> a % 2 == 0).sorted(Collections.reverseOrder()).limit(4)
				.forEach(System.out::print);
		System.out.println();
		// find sum of all elements of list

		Optional<Integer> sum = flatMapIntegers.stream().reduce((a, b) -> a + b);
		if (sum.isPresent()) // checking sum is present or not
			System.out.println("sum of all elements: " + sum.get());

		//getting sum count average min max of list element
		//%[argument_index$][flags][width][.precision]conversion
		// %1$ refers to the first substitution. In this case the string str. # is flag
		// which says the result should use a conversion-dependent alternate form.

		DoubleSummaryStatistics statistics = flatMapIntegers.stream().mapToDouble(a -> a).summaryStatistics();
		System.out.println(String.format("count = %1$d, average = %2$.3f, max = %3$f, min = %4$.2f, sum = %5$.2f",
			
				statistics.getCount(), statistics.getAverage(), statistics.getMax(), statistics.getMin(),
				statistics.getSum()));
		

	}

}
