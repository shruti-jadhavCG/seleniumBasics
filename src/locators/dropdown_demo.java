package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_demo {

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https:\\www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(e1);
		s1.selectByValue("");
	}

}
