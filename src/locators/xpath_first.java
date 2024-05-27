package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class xpath_first {
//	Absolute xpath

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("file:///D:/Automation_Material/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.xpath("(html/body/input)[1]"));
		un.sendKeys("shruti");
		WebElement hint = driver.findElement(By.xpath("(html/body/input)[2]"));
		hint.sendKeys("hint");
		WebElement pw = driver.findElement(By.xpath("(html/body/input)[3]"));
		pw.sendKeys("password");
		WebElement fn = driver.findElement(By.xpath("(html/body/form/input)[1]"));
		fn.sendKeys("shruti");
		WebElement submit = driver.findElement(By.xpath("(html/body/form/input)[3]"));
//		submit.click();
		WebElement boy = driver.findElement(By.xpath("(html/body/form/input)[4])"));
		boy.click();
		WebElement girl = driver.findElement(By.xpath("(html/body/form/input)[5])"));
		girl.click();
		WebElement baby = driver.findElement(By.xpath("(html/body/form/input)[6])"));
		baby.click();

		
		
		
		

	}

}
