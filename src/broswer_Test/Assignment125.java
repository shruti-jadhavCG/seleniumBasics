package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment125 {
// "Automate below scenario
//	1.launch browser
//	2.goto google.com
//	3.type ""india"" on search textfield
//	4.click on search button"
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getTitle());
		WebElement textarea = driver.findElement(By.id("APjFqb"));
		textarea.sendKeys("India");
//		WebElement searchButton = driver.findElement(By.name("btnK"));
//		searchButton.click();

	}

}
