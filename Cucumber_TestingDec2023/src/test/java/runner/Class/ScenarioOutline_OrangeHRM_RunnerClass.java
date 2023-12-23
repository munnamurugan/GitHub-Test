package runner.Class;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\31mun\\eclipse-workspace\\Cucumber_TestingDec2023\\Featurefile\\ScenarioOutline_OrangeLogin.feature",
glue="step.def",
monochrome = true,
publish = true,
dryRun=false

		)
public class ScenarioOutline_OrangeHRM_RunnerClass {

}
