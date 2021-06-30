package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.AutoConstant;
import pom.PomActitLogn;
import pom.PomGoogle;

public class Test implements AutoConstant {

         @org.testng.annotations.Test
         public void actitime() throws InterruptedException, IOException{
		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();
		// driver.get("https://demo.actitime.com/login.do");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PomActitLogn logn = new PomActitLogn(driver);
		PomGoogle google = new PomGoogle(driver);
		//google.googleSearch();
		logn.loginMethod();
		
		/*
		 * PomGoogle pg=new PomGoogle(driver); pg.googleSearch();
		 */
	}
}