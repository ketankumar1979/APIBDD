package APIBDD;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/Resource/HomePage.feature",
//plugin = {"html:target/cucumber-html-report",
// "junit:target/junit-report.xml",
// "json:target/cucumber-report.json",
// "pretty:target/cucumber-pretty.txt"})

//@CucumberOptions(features = "src/test/Resource/PostUser.feature")
@CucumberOptions(features = "src/test/Resource/ListOfUsers.feature")



public class RunCukeTest {
}
