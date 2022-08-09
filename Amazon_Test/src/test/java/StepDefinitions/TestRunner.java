package StepDefinitions;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", 
				glue = "StepDefinitions", 
				plugin = {"html:target/cucumber-html-report",
						"json:target/cucumber.json",
						"pretty:target/cucumber-pretty.txt",
						"junit: target/cucumber-results.xml"}
				)

public class TestRunner {

}
