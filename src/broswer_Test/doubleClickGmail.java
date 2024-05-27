package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class doubleClickGmail {

	public static void main(String[] args)
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		Action

	}

}
