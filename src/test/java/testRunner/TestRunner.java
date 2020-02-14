package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


    //@CucumberOptions(features = "src/test/java/features/UpdateHistory.feature", glue = "stepDefinations")

   @CucumberOptions(features = "src/test/java/features/OrderHistory.feature", glue = "stepDefination")
  
public class TestRunner {

}




