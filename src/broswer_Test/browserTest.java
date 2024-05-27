package broswer_Test;

import org.openqa.selenium.edge.EdgeDriver;

//  Assignment 122 - Selenium program to get title of browser


public class browserTest {

	public static void main(String[] args) throws InterruptedException  {

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getTitle());
	}

}
