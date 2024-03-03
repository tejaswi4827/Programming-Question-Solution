package override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Base {

	public void name() throws FileNotFoundException{
		System.out.println("child");
		//throw new FileNotFoundException("not found");

	}
//	Case 1: If The SuperClass doesn't declares an exception
//	a): If SuperClass doesn’t declare any exception and subclass declare checked exception then error will come.
//  b): If SuperClass doesn’t declare any exception and SubClass declare Unchecked exception then  error will not come.
	
	
	
//	Case 2: If The SuperClass declares an exception
// a): If SuperClass declares an exception and SubClass declares exceptions other than the child exception of the SuperClass declared Exception then error will occurs.
// b): If SuperClass declares an exception and SubClass declares a child exception of the SuperClass declared Exception. work fine
// c): If SuperClass declares an exception and SubClass declares without exception. work fine

}