package sectionFive;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNonHtmlPopUp {

	public static void main(String[] args) {
		// We use Alert object when we can not spy on the pop up on the web page
		
				WebDriver driver = new ChromeDriver();
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				driver.findElement(By.xpath("//input[@type ='submit']")).click();
				//Alert alert = driver.switchTo().alert();
				System.out.println(driver.switchTo().alert().getText());
				//String alt = alert.getText();
				//System.out.println(driver.switchTo().alert().getText());
				//alert.accept();
				//alert.dismiss();
				
		

	}

}
