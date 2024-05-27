package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class locateBestSeller {
//  Demostrate a code for Partial linktext locator use amazon application and click bestselllers
	public static void main(String[] args)
	{
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.amazon.in	");
//		WebElement bestSeller = driver.findElement(By.linkText("Best Sellers"));
		WebElement bestSeller1 = driver.findElement(By.partialLinkText("Best"));
		bestSeller1.click();
	}

}
