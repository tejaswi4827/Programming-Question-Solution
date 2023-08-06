
public class Singleton {
	private static Singleton instanceSingleton = null;
	public static String str;
	
	//static block can also be used to create single object as static block is called only once
//	static {
//		str = "helloo";
//	}

	private Singleton() {
		str = "hello";
	}
//synchronized for thread safety

	// we can use synchronized block for object creation only so others thread can
	// have read access to methods at the same time
	public static synchronized Singleton name() {
		if (instanceSingleton == null)
			instanceSingleton = new Singleton();
		return instanceSingleton;
	}

	public static void main(String[] args) {

		Singleton objSingleton = Singleton.name();
		Singleton objSingleton1 = Singleton.name();
		System.out.println(objSingleton.hashCode() + " " + objSingleton.str);
		System.out.println(objSingleton1.hashCode());
	}
}
