package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment136 {
//	"Demostrate a program on dropdown, use https://www.facebook.com/reg and 
//	select dropdown for date, month and year when creating account"

	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement date = driver.findElement(By.name("birthday_day"));
		Select dateVal = new Select(date);
		dateVal.selectByIndex(22);
		Thread.sleep(5000);
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select monthVal = new Select(month);
		monthVal.selectByIndex(6);
		Thread.sleep(5000);
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select yearVal = new Select(year);
		yearVal.selectByVisibleText("2000");
		Thread.sleep(5000);
		
	}

}
