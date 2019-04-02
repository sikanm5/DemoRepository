package sectionFive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		int radioSize = driver.findElements(By.xpath("//input[@type ='radio']")).size();
		for(int i =0; i<radioSize;i++) {
			String radioText =driver.findElements(By.xpath("//input[@type ='radio']")).get(i).getAttribute("value");
		    System.out.println(radioText);
		    
		    if(radioText.equalsIgnoreCase("TripPlanner")) {
		    	driver.findElements(By.xpath("//input[@type ='radio']")).get(i).click();
		    }
		  
		
		}
	
			
	
		
	
	}
	
	
		

	

}
