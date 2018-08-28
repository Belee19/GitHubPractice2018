package com.anyaut.pom;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	private static WebDriver driver;
	private static String baseUrl;
	static SignInPageFactory signInPageFactory;

	@BeforeClass
	public static void beforeClass() {
		//Location for chrome
		System.setProperty("webdriver.chrome.driver", "G:\\Aumation Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://anyaut.com/orange/index.php";
		signInPageFactory = new SignInPageFactory(driver);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		// Enter ryour user name
		signInPageFactory.enterUserName("example.com");
		signInPageFactory.enterPassword("XYZ123");
		signInPageFactory.clickEyeIcon();
		signInPageFactory.clickSignIn();
	}

	@AfterClass
	public static void afterClass() {
		driver.quit();
	}

}
