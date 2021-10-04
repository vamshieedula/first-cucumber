package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/AppFeature"},
		glue = {"StepDefinations"},
		plugin = {"pretty"},
		monochrome = true
		)
public class AmazonTest {

	
	
}
