package e2eTests;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Assurence",
        features = {"src/specs/features"},
       //glue={"helpers","classpath/stepDefinitions"}  ,
        plugin = {
                "pretty",
                "com.qmetry.qaf.automation.cucumber.QAFCucumberPlugin",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        })
public class RunCucumberTest {
}