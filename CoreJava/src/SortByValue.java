import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Ram", 6);
		hm.put("Rohan", 3);
		hm.put("Rohit", 4);
		hm.put("Rohit1", 14);
		//sorting map by value
	Map<String, Integer> lhm=	hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(lhm);
	}

}
