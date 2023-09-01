package com.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/resources/features",
		glue = "stepdefinitions",
		plugin = {"pretty","html:target/cucumber-reports"},
		dryRun = true
		)

public class RunAddMeetingTest {

	
}
