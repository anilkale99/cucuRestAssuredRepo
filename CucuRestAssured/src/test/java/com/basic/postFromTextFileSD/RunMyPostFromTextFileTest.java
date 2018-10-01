package com.basic.postFromTextFileSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			monochrome=true,
			dryRun=false,
			features= {"src/test/resources/com/basic/postFromTextFileFF/"},
			glue={"com/basic/postFromTextFileSD/"}
		)
		

public class RunMyPostFromTextFileTest {


}
