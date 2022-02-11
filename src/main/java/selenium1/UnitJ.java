package selenium1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnitJ {
	static WebDriver driver;

	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\18042\\eclipse-sep2021\\login3\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=login/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
	}

	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	@Test
	public void neglogin() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1232");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

	}


	@After
	public void tearDown() {
		driver.close();
	}
}
