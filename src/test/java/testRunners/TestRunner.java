package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/AppFeatures",
		glue="stepDefinitions",
		tags="@test",
		plugin={"pretty",
				"json:target/MyReports/reports.json",
				"junit:target/MyReports/reports.xml"
				},
		monochrome=false,
		dryRun=false
)
public class TestRunner {

}
