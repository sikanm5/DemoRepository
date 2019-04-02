/**
 * 
 */
package com.udemy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author msikandari
 *
 */
//Stores all the locators and methods of login page
public class Login {
	WebDriver driver;

	//Locate the web elements
	//element on monkey.com
	By userName =By.xpath("//input[@name='username']");
	By passWord =By.xpath("//input[@id='password']");
	By loginButton = By.xpath("//button[@type='submit']");
	public Login(WebDriver driver) {
		
	this.driver = driver;
	}
	
	public void Login(String user, String pass) {
		driver.findElement(userName).sendKeys(user);
		driver.findElement(passWord).sendKeys(pass);
		driver.findElement(loginButton).click();
		
	}
	
	public void typeUserName(String user) {
	
driver.findElement(userName).sendKeys(user);
}
	public void typePassword(String pass) {
	driver.findElement(passWord).sendKeys(pass);
	

}
	public void clickLogin() {
	driver.findElement(loginButton).click();

}



}
