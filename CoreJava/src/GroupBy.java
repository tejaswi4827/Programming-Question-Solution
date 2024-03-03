import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class GroupBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "tejaswi kumar";
		Map<Object, Long> map = Arrays.stream(str.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(str1 -> str1, LinkedHashMap::new, Collectors.counting()));
	
		System.out.println(map);
		
	
		HashMap<Character,Integer> mapi = new HashMap<Character, Integer>();
		
		map.put('a',  (long) 2);
		map.put('b',  (long) 4);
		
		map.entrySet().stream().filter(val-> val.getValue()>2).forEach(System.out::println);
	Map<Object, Object> newMap=	map.entrySet().stream().filter(val-> val.getValue()>2).collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
		
		System.out.println(newMap);
	}

}
