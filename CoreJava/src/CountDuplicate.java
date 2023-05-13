import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CountDuplicate {
	public static void main(String... args) {
		List<Character> chars = Arrays.asList('a', 'a', 'b', 'b', 'b');
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char c : chars) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}

		System.out.println(hm);

		// second approach
		chars.stream().collect(Collectors.toSet()).forEach(aa->
		{
			int value = Collections.frequency(chars, aa);
			System.out.println(aa+" "+value);
		}
				);
		
		
		
		//third approach
		
		Set<Character> charss = chars.stream().collect(Collectors.toSet());
		for (char val : charss) {
			System.out.println(val+":"+Collections.frequency(chars, val));
		}

		// System.out.println(Collections.frequency(chars, 'a'));
	}
}
