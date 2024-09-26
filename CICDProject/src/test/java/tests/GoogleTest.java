package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	WebDriver driver;
  @Test
  public void f() {
//	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();

      driver.get("https://www.google.co.in");
      driver.manage().window().minimize(); 
  }
}
