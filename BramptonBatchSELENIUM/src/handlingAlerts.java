import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class handlingAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@type ='submit']")).click();
		//Alert alert = driver.switchTo().alert();
		//String alt = alert.getText();
		System.out.println(driver.switchTo().alert().getText());
		//alert.accept();
		//alert.dismiss();
		
		
	
	
	}

}
