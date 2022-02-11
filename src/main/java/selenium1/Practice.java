package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	
	public void launchBrowser() {
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\18042\\eclipse-sep2021\\login3\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		/*
		 * driver = new ChromeDriver(); driver.get(
		 * "https://www.walmart.com/?irgwc=1&sourceid=imp_UnYTJ%3Ay8LxyITISWlOTDSSoxUkGyG2z1RT3BQk0&veh=aff&wmlspartner=imp_2055067&clickid=UnYTJ%3Ay8LxyITISWlOTDSSoxUkGyG2z1RT3BQk0&sharedid=usdp-search&affiliates_ad_id=565706&campaign_id=9383"
		 * ); driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		 */
	}
}
