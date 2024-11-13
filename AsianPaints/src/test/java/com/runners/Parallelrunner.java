package com.runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue= {"com.stepDefinition","com.hook"},
features= {"./src/test/resources/features"},
plugin= {"rerun:target/rerun.txt","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","junit:Reports/Cucumber.xml"})


public class Parallelrunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel =true)
	public Object[][] scenarios() {
		System.setProperty("dataproviderthreadcount","3");
		return super.scenarios();
	}
	}


