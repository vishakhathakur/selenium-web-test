package bimarian.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestUI {
	
	//@Test
	public void test01Firefox(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://blazemeter.com");
		System.out.println("Firefox browser opened and navigated to google site");
		driver.quit();
	}
	
	@Test
	public void test02Chrome(){
		
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://blazemeter.com");
		System.out.println("Chrome browser opened and navigated to google site");
		driver.quit();
	}
}
