package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="week6day1Ass/features/salesforce.feature",glue="steps",monochrome = true,publish = true)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
