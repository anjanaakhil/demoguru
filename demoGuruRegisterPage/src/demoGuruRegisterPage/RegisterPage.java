package demoGuruRegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegisterPage {
	@Test
	public void TestMethodRegister() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mgakh\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();//instance for firefox driver
		driver.get("https://demo.guru99.com/test/newtours/register.php");//opens the site
		driver.findElement(By.name("firstName")).sendKeys("anjana");
		driver.findElement(By.name("lastName")).sendKeys("nandakumar");
		driver.findElement(By.name("phone")).sendKeys("000555666");
		driver.findElement(By.id("userName")).sendKeys("abc@def.com");
		driver.findElement(By.name("address1")).sendKeys("address1");
		driver.findElement(By.name("city")).sendKeys("tvm");
		driver.findElement(By.name("state")).sendKeys("kerala");
		driver.findElement(By.name("postalCode")).sendKeys("695010");
		//Select dropdown = new Select(driver.findElement(By.name("country")));
		//dropdown.selectByIndex(3);
		driver.findElement(By.id("email")).sendKeys("anjanaanjana");
		driver.findElement(By.name("password")).sendKeys("abcdef");
		driver.findElement(By.name("confirmPassword")).sendKeys("abcdef");
		driver.findElement(By.name("submit")).click();
	}
}
