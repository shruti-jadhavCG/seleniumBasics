package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class dropdoownUsingKeys {

	public static void main(String[] args) 
	{
		
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.amazon.in");
		WebElement dd = driver.findElement(By.id("searchDropdownBox"));
		dd.click();
		dd.sendKeys(Keys.ENTER);
		dd.sendKeys(Keys.ENTER);
		dd.sendKeys(Keys.ENTER);
		dd.sendKeys(Keys.ENTER);
//Wrong
	}

}
