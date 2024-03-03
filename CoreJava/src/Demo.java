import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		

		int[] arr = { 4, 7, 15, 2, 3, 9, 2, 6 };
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {

			
			String binary = "";
			while (arr[i] != 0) {
				if(arr[i] % 2 == 0)
				{
				binary += arr[i] % 2;
				}
				else {
					binary = "1"+binary;
				}
				arr[i] = arr[i] / 2;
			}
			
			
			
			list.add(binary);
		}
		
		System.out.println(list);

	}

}
