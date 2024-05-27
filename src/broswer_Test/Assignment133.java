package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment133 {

	public static void main(String[] args)
	{
//		Goto Amazon.in locate shoe with relative xpath
		
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.amazon.in	");
		driver.findElement(By.xpath("(//option)[37]")).click();

	}

}
