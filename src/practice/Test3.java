package practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

		List<WebElement> link = driver.findElements(By.tagName("a"));
		for (int i = 0; i < link.size(); i++) {
			WebElement getLink = link.get(i);
			String urll = getLink.getAttribute("href");

			URL url = new URL(urll);

			HttpURLConnection openConnection = (HttpURLConnection) url.openConnection();
			openConnection.connect();
			int responseCode = openConnection.getResponseCode();

			if (responseCode >= 400) {

				System.out.println(urll + " link is broken");

			} else {
				System.out.println(urll + " link is not broken");
			}

		}

	}

}
