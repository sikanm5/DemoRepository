package sectionFive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
	int checkBoxSize =	driver.findElements(By.xpath("//input[@type ='checkbox']")).size();
	System.out.println(checkBoxSize);
		for(int i = 0; i<checkBoxSize;i++) {
			String check = driver.findElements(By.xpath("//input[@type ='checkbox']")).get(i).getAttribute("value");
			System.out.println(check);
		}
		

	}

}
