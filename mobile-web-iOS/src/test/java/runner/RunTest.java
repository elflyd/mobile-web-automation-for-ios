package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "src/test/java/resources/Login.feature", "src/test/java/resources/ForgotPassword.feature",
       "src/test/java/resources/Register.feature"
        },
        glue = { "misli",
                "utility" }, monochrome = true, plugin = { "pretty",

        "json:target/cucumber-reports/AutomationReport.json"

},
        dryRun = false,tags = "@sms or @e-mail or @correct or @incorrect or @register "
         )

public class RunTest  {


}