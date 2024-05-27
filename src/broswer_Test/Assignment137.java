package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment137 {

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		WebElement dropedown = driver.findElement(By.name("Choice1"));
		Select d1 = new Select(dropedown);
		d1.selectByVisibleText("Demo2");

	}

}
