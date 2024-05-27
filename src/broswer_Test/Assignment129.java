package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment129 {
// Demostrate a code for linktext locator use google application and click gmail linktext
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Gmail")).click();
	}

}
