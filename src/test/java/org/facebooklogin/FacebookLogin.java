package org.facebooklogin;

import java.time.Duration;

import org.base.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(MyListeners.class)
public class FacebookLogin extends BaseClass{
	
	
	
	@BeforeClass
	void setup() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	void logo() {
		
		boolean displayed = driver.findElement(By.xpath
				("//*[@class=\"fb_logo _8ilh img\"]")).isDisplayed();
		if (displayed) {
			Assert.assertEquals(true, true);
			System.out.println("logo displayed");
		} else {
			System.out.println("not display");
		}
			
		}
	@Test(priority=2)
	void title() {
		boolean contains = driver.getTitle().contains("log in");
		if (contains) {
			Assert.assertEquals(contains, true);
			System.out.println("title matched");
		} else {
			System.out.println("title not matched");
		}
			
		}
	
	@Test(priority=3)
	void credentials() {
		
		driver.findElement(By.id("email")).sendKeys("shoby");
		driver.findElement(By.id("pass")).sendKeys("smile123");
		Assert.assertTrue(false);
	}
	
	@Test(priority=4, dependsOnMethods="credentials")
	void login() {
		
		driver.findElement(By.name("login"));
		Assert.assertTrue(true);
		
	}
		
	
	@AfterClass
	void afterclass() {	
	driver.quit();
	}
}
	


