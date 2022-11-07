package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(features= {".\\src\\test\\java"},
		 glue="stepDefination",
			dryRun=false,
			monochrome=true,
		//tags="@tag",
			
			plugin= {
					"pretty","html:target/html/report.html"
			}
)
		  
public class RunnerClass extends AbstractTestNGCucumberTests{

 

}