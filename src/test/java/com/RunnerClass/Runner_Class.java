package com.RunnerClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.BaseClass.BaseTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (features = "C:\\LimeRoadCC\\src\\test\\java\\com\\Future_file\\Lime.feature",
                   glue = "com.StepDefinition",
                   monochrome = true,
                   dryRun = false,
                   strict = true,
                   tags = "@Regression",
                   
                   plugin = {"pretty",
                		   "html:Report/lime.html",
                		   
                		   "json:Repo/limeroad.json",
                		   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                   }
		)

public class Runner_Class extends BaseTest{
     
	@BeforeClass
     public static void launchBrowser() {
     launchBrowser("Chrome");
	}
}
