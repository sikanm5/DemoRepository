package testpack;

import java.security.acl.Group;
import org.testng.annotations.Parameters;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


import org.testng.annotations.Test;

@Test
public class TestOne {
	
	
	public void WebLogin() {
		System.out.println("Hello");
	}
	@Parameters({"URL"})
	@Test
	public void MobileLogin(String url) {
		
		System.out.println(url);
		System.out.println("Bye");
	}
	@BeforeSuite
	public void Bfsuite() {
		System.out.println("I am 1");
	}
	public void LoginApi() {
		
		System.out.println("Hi");
	}
	@BeforeMethod
	public void bMethod() {
		System.out.println("HiBye");
	}
	public void Hel() {
		System.out.println("Hi");
	}	

}
