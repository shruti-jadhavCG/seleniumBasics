package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class facebooklogin {

	public static void main(String[] args) 
	{
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name(null)).click();

	}

}
