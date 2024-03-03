
public class ExceptionTest {

	static void add(int a, long b) {
		System.out.println("int long");
	}

	void add(long a, int b) {
		System.out.println("long int");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = 8 / 0;
		} catch (Exception e) {
			System.out.println("global");
	}
//		catch (ArithmeticException e) {
//			System.out.println("arithmetic");
//		}
		add(1,1l);

	}

}
