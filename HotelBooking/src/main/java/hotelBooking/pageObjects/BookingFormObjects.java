package hotelBooking.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import hotelBooking.util.TestBaseClass;

public class BookingFormObjects {
	@FindBy(how = How.ID, using = "txtFirstName")
	public WebElement firstNameField;

	@FindBy(how = How.ID, using = "txtLastName")
	public WebElement lastNameField;

	@FindBy(how = How.ID, using = "txtEmail")
	public WebElement emailField;

	@FindBy(how = How.ID, using = "txtPhone")
	public WebElement mobileField;

	@FindBy(how = How.XPATH, using = "//textarea")
	public WebElement addressField;

	@FindBy(how = How.XPATH, using = "//table//tbody//tr[6]//td")
	public WebElement addressLabel;

	@FindBy(how = How.ID, using = "btnPayment")
	public WebElement confirmButton;

	@FindBy(how = How.NAME, using = "city")
	public WebElement cityDropdown;

	@FindBy(how = How.NAME, using = "state")
	public WebElement stateDropdown;

	@FindBy(how = How.NAME, using = "persons")
	public WebElement peopleDropdown;

	@FindBy(how = How.ID, using = "rooms")
	public WebElement numberOfRooms;

	@FindBy(how = How.ID, using = "txtCardholderName")
	public WebElement cardHolderName;

	@FindBy(how = How.ID, using = "txtDebit")
	public WebElement debitCard;

	@FindBy(how = How.ID, using = "txtCvv")
	public WebElement cvv;

	@FindBy(how = How.ID, using = "txtMonth")
	public WebElement expirationMonth;

	@FindBy(how = How.ID, using = "txtYear")
	public WebElement expirationYear;
	
	public BookingFormObjects() {
		PageFactory.initElements(TestBaseClass.driver, this);
	}
}
