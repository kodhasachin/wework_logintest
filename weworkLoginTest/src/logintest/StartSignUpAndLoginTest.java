package logintest;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class StartSignUpAndLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestListenerAdapter tla = new TestListenerAdapter();
	    TestNG testng = new TestNG();
	    testng.setTestClasses(new Class[] { SignUpAndLoginTest.class });
	    testng.addListener(tla);
	    testng.run();

	}

}
