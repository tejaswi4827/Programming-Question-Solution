import java.util.Stack;

public class ParenthesisCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "[("; // [(
		Stack stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
				stack.push(str.charAt(i));
			} else {
				// System.out.println(stack.peek() == );
				if (stack.isEmpty())
					System.out.println("not valid");
				Character ch = str.charAt(i);
				if (stack.peek() == (Character) '(' && ch == ')' || stack.peek() == (Character) '{' && ch == '}'
						|| stack.peek() == (Character) '[' && ch == ']') {
					stack.pop();

				} else {
					System.out.println("not valid");
					break;
				}
			}
		}
		if (stack.isEmpty())
			System.out.println("valid");
		else
			System.out.println("not valid");
	}

}
