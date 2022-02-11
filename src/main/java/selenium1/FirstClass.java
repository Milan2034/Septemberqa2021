package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		login();
		neglogin();
		tearDown();
	}

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\18042\\eclipse-sep2021\\login3\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=login/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	public static void login() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(10000);
	}

	public static void neglogin() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1232");
		driver.findElement(By.name("login")).click();
		Thread.sleep(10000);

	}

	public static void tearDown() {
		driver.close();
	}
}
