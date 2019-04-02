package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestOne {
	@Test
	public void Mobiledemo() {
		System.out.println("hi");
	}
	@Test
	public void Apidemo() {
		System.out.println("bye");
	}
	@Test(dependsOnMethods= {"Mobiledemo"})
	public void Mobilelogggg() {
		System.out.println("byeeeeei");
	}
	

}
