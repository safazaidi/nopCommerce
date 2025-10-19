package com.nopcommerce.e2eTests;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/spec/features"},
		plugin = {"pretty","html:target/report/cucmber-report.html","json:target/report/cucmber.json"},
		//glue = {"src/test/java/com/automation/e2eTests/step_definitions"},
		tags = ("@Login-validCredential"),
		monochrome = true,
		snippets = CAMELCASE
)
public class RunTest {
	

}