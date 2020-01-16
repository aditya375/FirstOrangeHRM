package PackageLearnMaven.ProjectMavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {
	@Test
	public void browserlaunch() {
		String driverPath = System.getProperty("user.dir") + "\\src\\test\\java\\BrowserDrivers\\chromedriver.exe";
		// System.out.println(javaVersion);
		System.setProperty("webdriver.chrome.driver", driverPath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
}
