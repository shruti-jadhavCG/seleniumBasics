package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignmet143 {

	public static void main(String[] args)
	{
//		Launch google.com and do the right click on Gmail
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		Actions a = new Actions(driver);
		a.contextClick(gmail).perform();

	}

}
