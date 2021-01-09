package hotelBooking.stepDefs.runner;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//features//HotelBooking.feature", glue = {
		"hotelBooking.stepDefs.runner" }, monochrome = true, plugin = { "pretty",
				"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"})

public class HotelBookingRunnerTest {
	@AfterClass
	public static void setup() {
		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
		Reporter.setSystemInfo("User Name", "Deep Shah");
		Reporter.setSystemInfo("Application Name", "Hotel Booking");
		Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
		Reporter.setSystemInfo("Environment", "Production");
		Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	}
}