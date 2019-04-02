package sectionFive;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {

	public static void main(String[] args) {
		// How to switch window to window
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
		//First come first in
		//Two handle id will get and store in this set
		//Set is an interface that there is some elements on that
		Set<String> id =driver.getWindowHandles();
		Iterator<String> element =id.iterator();
	String parent =	element.next();
	String child =	element.next();
	driver.switchTo().window(child);
	//System.out.println(driver.getTitle());
		

	}

}
