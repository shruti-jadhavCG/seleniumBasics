package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment126 {

// Demonstate a program for facebook.com launch > enter email and pass with help of id locator
	
	public static void main(String[] args) 
	{
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("shruti@gmail.com");
		WebElement pw = driver.findElement(By.id("pass"));
		pw.sendKeys("Test@123");
		

		

	}

}
