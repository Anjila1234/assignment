package mymavenproject11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assignment {
	ChromeDriver driver;
	@Test
	public void loginone() throws InterruptedException {
//	System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
	 driver = new ChromeDriver ();
	  
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@type='submit']")).submit();

//System.out.println(driver.findElements(By.xpath("//div[@class='inventory_item']")).size());

  List<WebElement> Number = driver.findElements(By.xpath("//div[@class='inventory_item']"));
  System.out.println(Number.size());
  Assert.assertEquals(Number.size(), 6);
    driver.quit();
}

}

