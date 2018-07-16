package logintest;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class StartLoginTest {

	public static void main(String[] args) {
		
		TestListenerAdapter tla = new TestListenerAdapter();
	    TestNG testng = new TestNG();
	    testng.setTestClasses(new Class[] { LoginTest.class });
	    testng.addListener(tla);
	    testng.run();

	}

}
