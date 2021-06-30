package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomGoogle {
	
	@FindBy(xpath="//input[@title='Search']")
	private WebElement search;
	
	@FindBy(xpath="//span[contains(.,'selenium')]")
	private List<WebElement> get;

	public PomGoogle(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void googleSearch() throws InterruptedException{
		search.sendKeys("selenium");
		Thread.sleep(5000);
		System.out.println(get.size());
		for(int i=0;i<get.size();i++){
			if(get.get(i).getText().equalsIgnoreCase("selenium 30 uses in hindi")){
				get.get(i).click();
				break;
			}
		
				
			
		}
		
	}

}
