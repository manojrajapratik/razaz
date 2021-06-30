package practice;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

@Listeners(Test1.class)
public class Test {
	public static WebDriver driver;

	@org.testng.annotations.Test(groups = "smoke")

	public void loginM() throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// driver.get("https://www.naukri.com");
		// driver.get("https://www.selenium.dev/downloads/");
		// driver.get("https://www.americanairlines.in/");
		// driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		// driver.findElement(By.xpath("(//div[@class='left-align'])[3]"))
		/*
		 * List<WebElement> findElements =
		 * driver.findElements(By.xpath("//tr")); for (int i = 1; i <
		 * findElements.size(); i++) {
		 * System.out.println(findElements.get(i).getText());
		 * 
		 * }
		 */

	}

}
