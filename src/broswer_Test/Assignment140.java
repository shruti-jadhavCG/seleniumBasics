package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment140 {

	public static void main(String[] args)
	{
//		"Demonstrate a program on  how to double click 
//		Launch http://google.com/   
//		and Double click on Gmail"
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		Actions a = new Actions(driver);
		a.doubleClick(gmail).perform();

	}

}
