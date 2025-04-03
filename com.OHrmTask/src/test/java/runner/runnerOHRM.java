package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin = {"pretty","json:target/cucumber-reports/Cucumber.json"}, features="src/test/resources/com/features/OHrmTask.feature",
glue="stepDefinitions")
public class runnerOHRM extends AbstractTestNGCucumberTests {

}