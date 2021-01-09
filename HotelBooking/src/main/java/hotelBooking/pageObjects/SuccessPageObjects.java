package hotelBooking.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import hotelBooking.util.TestBaseClass;

public class SuccessPageObjects {
	@FindBy(how = How.XPATH, using="//h1")
	public WebElement successPageHeading;
	
	public SuccessPageObjects() {
		PageFactory.initElements(TestBaseClass.driver, this);
	}
}