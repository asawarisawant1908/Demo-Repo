package test_demo_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_ExecutionDemo {
  @Test
  public void swaglab() throws InterruptedException {
	WebDriver wd= new ChromeDriver();
	wd.get("https://saucedemo.com");
	  wd.findElement(By.id("user-name")).sendKeys("standard_user");
	  Thread.sleep(3000);
	  wd.findElement(By.id("password")).sendKeys("secret_sauce");
	  Thread.sleep(3000);
	  wd.findElement(By.id("login-button")).click();
	  }
	  
	  
	  
	  @Test
	  public void testLogin() throws InterruptedException {
		  WebDriver wd= new ChromeDriver();
			wd.get("https://practicetestautomation.com/practice-test-login/");
			wd.findElement(By.id("username"))  .sendKeys("student");
			Thread.sleep(3000);
			wd.findElement(By.id("password")).sendKeys("Password123");
			Thread.sleep(3000);
			wd.findElement(By.id("submit")).click();
	  }
}
