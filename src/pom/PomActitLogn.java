package pom;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.AutoConstant;
import generic.ExcelLibrary;

public class PomActitLogn extends ExcelLibrary{
	
	@FindBy(id="username")
	private WebElement uname;

	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwd;

    @FindBy(xpath="//div[.='Login ']")
    private WebElement login;
    
   public PomActitLogn(WebDriver driver){
    	PageFactory.initElements(driver, this);
    }  
    
    public void loginMethod() throws IOException{
    	uname.sendKeys(ExcelLibrary.getCellValue(sheet_path, sheet_name,3,0));
    	pwd.sendKeys(ExcelLibrary.getCellValue(sheet_path, sheet_name, 3,1));
    	login.click();
    	
    }
}
