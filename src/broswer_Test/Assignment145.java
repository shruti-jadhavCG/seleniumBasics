package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment145 {

	public static void main(String[] args) 
	{
//		Lanch the Amazon.india and click the Account List & Clikc the Sign in Button & Login Using Hover Over
		
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement hoverver = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		WebElement signin = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		Actions a = new Actions(driver);
		a.moveToElement(hoverver);
		signin.click();
	}

}
