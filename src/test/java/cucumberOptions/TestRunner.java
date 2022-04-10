package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Selenium\\Login1.feature",
                  glue = "stepDefenition",//just give the package, no need to give exact class
                  plugin = {"pretty","html:test_output.html","json:json_output/cucumber.json", "junit:junit_output/cucumber.xml"},
                  dryRun = false, //check whether all steps are written
                  
                  monochrome= true) 
//with version 6 , cucmber is default strict, so there is no more strict option
 //both feature and glue should be in the same folder


public class TestRunner {

}
