package stetpdefs;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;

import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;

public class CRMStepDef extends TestBase{

	
		LoginPage loginPage;
		HomePage homePage;
		
		
		@Given("User is already on login page")
		public void user_is_already_on_login_page() {
			initialize(); 
		}
		
	  //Fetching as Maps

    	@When("User enters login credentials")
	    public void user_enters_login_credentials(DataTable userCred) {
    		loginPage = new LoginPage();
    		List<Map<String,String>> data = userCred.asMaps();
    		loginPage.login(data.get(0).get("uname"), data.get(0).get("pwd"));
    	}

	
		@Then("User is on Home Page")
		public void user_is_on_home_page() {
			homePage = new HomePage();
			boolean isValid = homePage.isUserLoggedIn();
		    Assert.assertTrue(isValid);
		}

		@Then("Close browser")
		public void close_browser() {
		driver.close();
		}
	
//	@After
//	
//	public void afterScenario(Scenario scenario) throws IOException {
//		if(scenario.isFailed())
//		{
//			TakesScreenshot screen = (TakesScreenshot)driver;
//			File screenshot = screen.getScreenshotAs(OutputType.FILE);
//			byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
//			scenario.attach(fileContent,"image/png", "image1");
//		}
//	}


}
