package cucumber.options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features ="D:\\java eclipse\\com.sharkNinja\\src\\test\\java\\features",glue = {"stepDefination","helper"},tags = "@reg",
plugin = {"pretty","html:target/testreport/report.html"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
