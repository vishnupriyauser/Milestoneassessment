package com.mindtree.marriott.runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/resources/featureFiles/demo.feature",
glue={"com.mindtree.mariott.stepDefinations"},

dryRun=false,
monochrome=true,
strict=true
)
public class Tests {
		
}
