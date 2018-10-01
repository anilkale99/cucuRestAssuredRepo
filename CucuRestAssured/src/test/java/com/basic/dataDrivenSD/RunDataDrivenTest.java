package com.basic.dataDrivenSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			monochrome=true,
			dryRun=false,
			features= {"src/test/resources/com/basic/dataDrivenFF/"},
			glue={"com/basic/dataDrivenSD/"}
		)
		

public class RunDataDrivenTest {


}
