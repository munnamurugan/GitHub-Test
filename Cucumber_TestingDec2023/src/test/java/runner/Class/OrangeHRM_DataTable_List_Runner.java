package runner.Class;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\31mun\\eclipse-workspace\\Cucumber_TestingDec2023\\Featurefile\\OrangeHRM_DataTable_List.feature",
glue="step.def",
monochrome = true,
publish = true,
dryRun=false

		)

public class OrangeHRM_DataTable_List_Runner {

}
