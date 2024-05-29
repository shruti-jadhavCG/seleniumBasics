package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment139 {

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		WebElement dropedown = driver.findElement(By.xpath("(//div[@class='toolrip4'])[1]"));

		Actions a = new Actions(driver);
		a.moveToElement(dropedown);

		

	}

}
