package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment135 {

	public static void main(String[] args) throws InterruptedException 
	{
//		Demostrate a program on dropdown, use Amazon.in, use all three methods of Select class
		
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.amazon.in	");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Thread.sleep(5000);
		Select s1 = new Select(dropdown);
		s1.selectByIndex(36);
		Thread.sleep(5000);

		Select s2 = new Select(dropdown);
		s2.selectByValue("search-alias=beauty");
		Thread.sleep(5000);

		Select s3 = new Select(dropdown);
		s3.selectByVisibleText("Furniture");

	}

}
