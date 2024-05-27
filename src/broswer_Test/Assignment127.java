package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment127 {

//	Launch facebook.com > click on create account > register yourself > Use name and ID locator
	public static void main(String[] args) throws InterruptedException 
	{

		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement register = driver.findElement(By.linkText("Create new account"));
		register.click();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Shruti");
		WebElement surName = driver.findElement(By.name("lastname"));

		WebElement email = driver.findElement(By.name("reg_email__"));
		WebElement password = driver.findElement(By.name("reg_passwd__"));
//		WebElement dobDay = driver.findElement(By.id("u_7_b_No"));
//		WebElement dobMonth = driver.findElement(By.id("u_7_b_No"));
//		WebElement dobYear = driver.findElement(By.id("u_7_b_No"));
//		WebElement gender = driver.findElement(By.id("u_7_b_No"));
		
		
		surName.sendKeys("Jadhav");
		email.sendKeys("test@abc.com");
		password.sendKeys("abc@123");
		


	}

}
