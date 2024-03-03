import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CommonList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		list1.add("loop");
		list1.add("hello");
		list1.add("time");
		list1.add("smart");
		list1.add("world");
		list1.add("smart");

		list2.add("pool");
		list2.add("emit");
		list2.add("aloha");
		list2.add("emit");
		list2.add("trams");

		System.out.println(list1);
		System.out.println(list2);

		LinkedHashSet<String> ls1 = new LinkedHashSet<String>(list1);
		LinkedHashSet<String> ls2 = new LinkedHashSet<String>(list2);

//		System.out.println(ls1);
//		System.out.println(ls2);

		list1 = new ArrayList<String>(ls1);
		list2 = new ArrayList<String>(ls2);
		System.out.println("***************************************");
		System.out.println(list1);
		System.out.println(list2);

		for (int i = 0; i < list1.size(); i++) {
			StringBuffer sBuffer = new StringBuffer(list1.get(i));
			System.out.println(list1.get(i));
			if (list2.contains(sBuffer.reverse().toString())) {

				list1.set(i, null);
				list2.remove(sBuffer.toString());

			}

			System.err.println(list1);
		}

		System.out.println("***************************************");
		list1 = list1.stream().filter(Item -> Item != null).collect(Collectors.toList());
		System.out.println(list1);
		System.out.println(list2);
	}

}
