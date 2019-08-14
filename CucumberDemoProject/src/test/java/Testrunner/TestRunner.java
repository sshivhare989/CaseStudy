package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", // feature_file
				 glue = { "StepDefinition" },
				 tags = { "@Register,@Login" })

public class TestRunner {
}
