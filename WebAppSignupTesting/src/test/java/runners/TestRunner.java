package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", // path to feature files
        glue = {"stepDefinitions"},                // path to step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // report output
        monochrome = true                        
)
public class TestRunner extends AbstractTestNGCucumberTests {
    
}
