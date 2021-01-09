package hotelBooking.pageActions;

import org.testng.Assert;

import hotelBooking.pageObjects.SuccessPageObjects;
import hotelBooking.util.TestBaseClass;

public class SuccessPageActions extends TestBaseClass {
	public SuccessPageObjects successPageObject = new SuccessPageObjects();
	static String successPageUrl, successPageHeading;
	
	public void getSuccessPageUrl() {
		successPageUrl = driver.getCurrentUrl();
		String expected = ("file" + System.getProperty("user.dir") + prop.getProperty("successUrl")).replaceAll("[^a-zA-Z0-9]", "");
		String actual = successPageUrl.replaceAll("[^a-zA-Z0-9]", "");
		Assert.assertEquals(actual, expected);
		System.out.println("URL of Success page: " + successPageUrl);
	}
	
	public void getSuccessPageHeading() {
		successPageHeading = successPageObject.successPageHeading.getText();
		System.out.println("Heading of the Success page: " + successPageHeading);
	}
}
