package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue="comstepdefination",dryRun=true)
public class Testrunner{
	
	
	

}
