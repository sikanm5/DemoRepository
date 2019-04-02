package com.udemy.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.udemy.pages.Login;

public class VerifyLogin {
	
@Test	
public void validLogin() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=megamenu");
	Login login = new Login(driver);
	login.Login("seleniumtraining", "selenium1234");
	//login.typeUserName("seleniumtraining");
	//login.typePassword("selenium1234");
	//login.clickLogin();
	driver.quit();
	

}



}
