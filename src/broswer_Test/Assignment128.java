package broswer_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment128 {

	public static void main(String[] args) throws InterruptedException
	{
//		Register yourself on amazon application with use id and name locators
		
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		Thread.sleep(5000);
//		driver.findElement(By.name("Account & Lists")).click();
//		driver.findElement(By.name("Sign in")).click();
		driver.findElement(By.linkText("Create your Amazon account")).click();
		WebElement custNm = driver.findElement(By.id("ap_customer_name"));
		WebElement email = driver.findElement(By.id("ap_phone_number"));
		WebElement pw = driver.findElement(By.id("ap_password"));
		custNm.sendKeys("Shruti");
		email.sendKeys("7845612300");
		pw.sendKeys("hhshh@jhshf55");
		
		
		
		

	}

}
