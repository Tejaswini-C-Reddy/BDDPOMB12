package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//WebElement username = driver.findElement(By.name("email"));
	//username.sendKeys("tejureddy1105@gmail.com");
	WebDriver driver;
	
	@FindBy(name="email")
	WebElement uname;
	
	@FindBy(name = "password")
	WebElement pwd;
	
	@FindBy(xpath="//div[@class = ui fluid large blue submit button']")
	WebElement loginBtn;
	
	@FindBy(linkText = "Forgot your password?")
	WebElement forgotLink;
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	//action
	public void login(String strName, String strPwd) {
		uname.sendKeys(strName);
		pwd.sendKeys(strPwd);
		loginBtn.click();
	}
	
	public void forgetPwd()
	{
		forgotLink.click();
	}
	

}
