package testpack;
//In TestNg the executing of method is based on alphabet

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Test2 {
	
@AfterTest
	public void WebLoginHome() {
		System.out.println("Hello");
	}
@BeforeClass

public void BeforeClass() {
	System.out.println("It is before class");
}




@AfterSuite
public void afSuite() {
	System.out.println("I am the last");
}
	
	@Test
	public void MobileLoginHome() {
		
		System.out.println("Bye");
	}
 @BeforeTest
	public void LoginApiHome() {
		
		System.out.println("Hi");
	}

}
