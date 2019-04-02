package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty(key, value)
		//System.setProperty("webdriver.gecko.driver", "/Users/mariamsikandari/Desktop/Selenium/seleniumTraining/src/main/resources/browsers/chromedriver");
		
		//key
		//chrome = webdriver.chrome.driver
		//mozila = webdriver.geko.driver
		//ie = webdriver.ie.driver
		
		//value
		//always the complete path till .exe
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		//input
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		
		//button
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//radio
		
		driver.findElement(By.xpath("//input[@value='oneway']"));
		
		
		
		
		
		
	}

}
