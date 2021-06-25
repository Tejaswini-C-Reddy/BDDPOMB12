package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		//link one file to another
		features = "src//test//resources//features//CRMLogin.feature",
		glue = {"stetpdefs"},
		dryRun = false,
		monochrome = true,
		publish = true,
		plugin = {"pretty"}
		)
			

	public class CRMRunner {
		
	}
	

