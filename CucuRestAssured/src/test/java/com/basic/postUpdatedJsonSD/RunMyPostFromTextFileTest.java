package com.basic.postUpdatedJsonSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			monochrome=true,
			dryRun=false,
			features= {"src/test/resources/com/basic/postFromTextFileFF/"},
			glue={"com/basic/postUpdatedJsonSD/"}
		)
		

public class RunMyPostFromTextFileTest {


}
