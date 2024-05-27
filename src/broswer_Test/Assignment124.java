package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment124 {

////	"Automate below scenario
//	1.launch browser
//	2.goto other website like amazon/flipcart
//	3.type ""sample eg text"" on search textfield
//	4.click on search button"
	
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement textarea = driver.findElement(By.id("twotabsearchtextbox"));
		textarea.sendKeys("text");
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
	}

}
