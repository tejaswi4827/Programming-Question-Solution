import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatihar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Starters";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char item : str.toLowerCase().toCharArray()) {

			map.put(item, map.getOrDefault(item, 0) + 1);
		}

		map.entrySet().stream().filter(a -> a.getValue() == 1).limit(1).forEach(a -> System.out.println(a.getKey())

		);
		// System.out.println(map);

		// other approach
		int[] res = new int[26];

		for (char item : str.toLowerCase().toCharArray()) {
			res[item - 'a']++;
		}
		
		for (int i= 0 ;i<res.length;i++) {
			if(res[i] == 1) {
			System.out.println((char)('a'+i));
			break;
			}
		}
	}

}
