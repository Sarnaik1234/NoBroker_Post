package TestRunner;
import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\PostYourProperty\\src\\test\\resource\\Features\\Property.feature",glue="StepDefinition",
tags="@Renovation"
//plugin= {"pretty" , "html:target/HTMLReports/NoBrokerReport.html",
//		"json:target/JSONReports/NoBrokerReport.json",
//		"junit:target/JUNITReports/NoBrokerReport.xml",
//		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//}
)

public class TestRunner extends AbstractTestNGCucumberTests{
}