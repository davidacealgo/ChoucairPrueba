package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/AppFeatures/confirmOrder.feature",
		glue={"stepDefinitions", "Hooks"},
		tags="@test",
		plugin={"pretty"}
)
public class TestRunner {

}
