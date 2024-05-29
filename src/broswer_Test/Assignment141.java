package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment141 {

	public static void main(String[] args) 
	{
//		Demonstrate a program on drag drop https://grotechminds.com/drag-and-drop/
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.xpath("(//div[@id='container'])[7]"));
		WebElement drop = driver.findElement(By.xpath("(//div[@id='div2']"));

		WebElement drag1 = driver.findElement(By.xpath("//div[@id='div2']"));
		WebElement drop1 = driver.findElement(By.xpath("(//div[@id='container'])[7]"));

		Actions a = new Actions(driver);
		a.dragAndDrop(drag,drop).perform();
		a.dragAndDrop(drag1,drop1).perform();



	}

}
