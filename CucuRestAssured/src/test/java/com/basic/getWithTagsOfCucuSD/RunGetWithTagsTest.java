package com.basic.getWithTagsOfCucuSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
			
			//dryRun=true,
			tags={"@Important"}, //All scenario executed if this is tag for feature file
			 //tags={"@Smoke"}, //only tag with @smoke
			//tags={"@Smoke","@Regression"}, //AND condition
			 //tags={"@Smoke,@Regression"} , // OR condiction
			monochrome=true,
			dryRun=false,
			features= {"src/test/resources/com/basic/getWithTagsOfCucuFF/"},
			glue={"com/basic/getWithTagsOfCucuSD/"}
		)
		

public class RunGetWithTagsTest {


}
