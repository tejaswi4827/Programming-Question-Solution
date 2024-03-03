
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "tejaswi";
		String revString = "";
		StringBuilder sb = new StringBuilder();
		
		for(int i = str.length()-1;i>=0;i--)
		{
			//revString += a;
			sb.append(str.charAt(i));
			System.out.println(sb);
		}
		System.out.println(sb.toString());
	}

}
