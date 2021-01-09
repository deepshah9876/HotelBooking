package hotelBooking.stepDefs.runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import hotelBooking.pageActions.PageNavigations;
import hotelBooking.util.TestBaseClass;

public class HotelBookingStepDefs extends TestBaseClass {
	@Given("^I am on Login page$")
	public void i_am_on_Login_page() throws Throwable {
		TestBaseClass.initialize();
	}

	@Given("^Heading of the Login page is matching the expectations$")
	public void heading_of_the_Login_page_is_matching_the_expectations() throws Throwable {
		PageNavigations.loginPage().getLoginPageHeading();
	}

	@Then("^Printing the heading of Login page and closing the browser$")
	public void printing_the_heading_of_Login_page_and_closing_the_browser() throws Throwable {
		PageNavigations.loginPage().printLoginPageHeading();
		TestBaseClass.closeBrowser();
	}

	@Given("^Clicking on login without entering username$")
	public void clicking_on_login_without_entering_username() throws Throwable {
		PageNavigations.loginPage().loginWithoutUserName();
	}

	@Given("^Clicking on login without entering password$")
	public void clicking_on_login_without_entering_password() throws Throwable {
		PageNavigations.loginPage().loginWithoutPassword();
	}

	@Then("^Printing the error messages and closing the browser$")
	public void printing_the_error_messages_and_closing_the_browser() throws Throwable {
		PageNavigations.loginPage().printErrorWithoutUsername();
		PageNavigations.loginPage().printErrorWithoutPassword();
		TestBaseClass.closeBrowser();
	}

	@Given("^Entering the login credentials$")
	public void entering_the_login_credentials() throws Throwable {
		PageNavigations.loginPage().login(TestBaseClass.prop.getProperty("username"), TestBaseClass.prop.getProperty("password"));
	}

	@Given("^Getting redirected to Hotel Booking Form$")
	public void getting_redirected_to_Hotel_Booking_Form() throws Throwable {
		PageNavigations.bookingPage().getBookingFormUrl();
	}

	@Then("^Printing the Hotel booking form URL and closing the browser$")
	public void printing_the_Hotel_booking_form_URL_and_closing_the_browser() throws Throwable {
		PageNavigations.bookingPage().printBookingFormUrl();
		TestBaseClass.closeBrowser();
	}

	@Given("^I am on Booking form$")
	public void i_am_on_Booking_form() throws Throwable {
		TestBaseClass.initialize();
		PageNavigations.loginPage().login(TestBaseClass.prop.getProperty("username"), TestBaseClass.prop.getProperty("password"));
		PageNavigations.bookingPage().getBookingFormUrl();
	}

	@Given("^Clicking on Confirm without entering First Name$")
	public void clicking_on_Confirm_without_entering_First_Name() throws Throwable {
		PageNavigations.bookingPage().confirmWithoutFirstName();
	}

	@Then("^Printing the alert message for first name and closing the browser$")
	public void printing_the_alert_message_for_first_name_and_closing_the_browser() throws Throwable {
		PageNavigations.bookingPage().printAlertMessage("First Name");
		TestBaseClass.closeBrowser();
	}

	@Given("^Clicking on Confirm without entering Last Name$")
	public void clicking_on_Confirm_without_entering_Last_Name() throws Throwable {
		PageNavigations.bookingPage().confirmWithoutLastName();
	}

	@Then("^Printing the alert message for Last name and closing the browser$")
	public void printing_the_alert_message_for_Last_name_and_closing_the_browser() throws Throwable {
		PageNavigations.bookingPage().printAlertMessage("Last Name");
		TestBaseClass.closeBrowser();
	}

	@Given("^Clicking on Confirm without entering Email$")
	public void clicking_on_Confirm_without_entering_Email() throws Throwable {
		PageNavigations.bookingPage().confirmWithoutEmail();
	}

	@Given("^Clicking on Confirm by entering incorrect Email$")
	public void clicking_on_Confirm_by_entering_incorrect_Email() throws Throwable {
		PageNavigations.bookingPage().confirmWithIncorrectEmail();
	}

	@Then("^Printing the alert messages for Email and closing the browser$")
	public void printing_the_alert_messages_for_Email_and_closing_the_browser() throws Throwable {
		PageNavigations.bookingPage().printAlertMessage("Email");
		PageNavigations.bookingPage().printIncorrectAlertMessage("Email");
		TestBaseClass.closeBrowser();
	}

	@Given("^Clicking on Confirm without entering Mobile$")
	public void clicking_on_Confirm_without_entering_Mobile() throws Throwable {
		PageNavigations.bookingPage().confirmWithoutMobile();
	}

	@Given("^Clicking on Confirm by entering incorrect Mobile$")
	public void clicking_on_Confirm_by_entering_incorrect_Mobile() throws Throwable {
		PageNavigations.bookingPage().confirmWithIncorrectMobile();
	}

	@Then("^Printing the alert messages for Mobile and closing the browser$")
	public void printing_the_alert_messages_for_Mobile_and_closing_the_browser() throws Throwable {
		PageNavigations.bookingPage().printAlertMessage("Mobile no");
		PageNavigations.bookingPage().printIncorrectAlertMessage("Mobile no");
		TestBaseClass.closeBrowser();
	}

	@Given("^Entering address in address field$")
	public void entering_address_in_address_field() throws Throwable {
		PageNavigations.bookingPage().enterAddress();
	}

	@Then("^Printing the entered address in console$")
	public void printing_the_entered_address_in_console() throws Throwable {
		PageNavigations.bookingPage().printAddress();
		TestBaseClass.closeBrowser();
	}

	@Given("^Clicking on Confirm without selecting City$")
	public void clicking_on_Confirm_without_selecting_City() throws Throwable {
		PageNavigations.bookingPage().confirmWithoutCity();
	}

	@Then("^Printing the alert messages for City and closing the browser$")
	public void printing_the_alert_messages_for_City_and_closing_the_browser() throws Throwable {
		PageNavigations.bookingPage().printAlertMessage("City");
		TestBaseClass.closeBrowser();
	}

	@Given("^Clicking on Confirm without selecting State$")
	public void clicking_on_Confirm_without_selecting_State() throws Throwable {
		PageNavigations.bookingPage().confirmWithoutState();
	}

	@Then("^Printing the alert messages for State and closing the browser$")
	public void printing_the_alert_messages_for_State_and_closing_the_browser() throws Throwable {
		PageNavigations.bookingPage().printAlertMessage("State");
		TestBaseClass.closeBrowser();
	}

	@Given("^Selecting the number of people$")
	public void selecting_the_number_of_people() throws Throwable {
		PageNavigations.bookingPage().selectPeople();
	}

	@Then("^Printing the number of people and number of Rooms and closing the browser$")
	public void printing_the_number_of_people_and_number_of_Rooms_and_closing_the_browser() throws Throwable {
		PageNavigations.bookingPage().printNumberOfPeople();
		TestBaseClass.closeBrowser();
	}

	@Given("^Clicking on Confirm without entering Card holder Name$")
	public void clicking_on_Confirm_without_entering_Card_holder_Name() throws Throwable {
		PageNavigations.bookingPage().confirmWithoutCardHolder();
	}

	@Then("^Printing the alert message for Card holder name and closing the browser$")
	public void printing_the_alert_message_for_Card_holder_name_and_closing_the_browser() throws Throwable {
		PageNavigations.bookingPage().printAlertMessage("Card holder name");
		TestBaseClass.closeBrowser();
	}

	@Given("^Clicking on Confirm without entering Debit card number$")
	public void clicking_on_Confirm_without_entering_Debit_card_number() throws Throwable {
		PageNavigations.bookingPage().confirmWithoutDebitCard();
	}

	@Then("^Printing the alert message for Debit card number and closing the browser$")
	public void printing_the_alert_message_for_Debit_card_number_and_closing_the_browser() throws Throwable {
		PageNavigations.bookingPage().printAlertMessage("Debit card number");
		TestBaseClass.closeBrowser();
	}

	@Given("^Clicking on Confirm without entering CVV$")
	public void clicking_on_Confirm_without_entering_CVV() throws Throwable {
		PageNavigations.bookingPage().confirmWithoutCVV();
	}

	@Then("^Printing the alert message for CVV and closing the browser$")
	public void printing_the_alert_message_for_CVV_and_closing_the_browser() throws Throwable {
		PageNavigations.bookingPage().printAlertMessage("CVV");
		TestBaseClass.closeBrowser();
	}

	@Given("^Clicking on Confirm without entering Expiration Month$")
	public void clicking_on_Confirm_without_entering_Expiration_Month() throws Throwable {
		PageNavigations.bookingPage().confirmWithoutExpMonth();
	}

	@Given("^Clicking on Confirm without entering Expiration Year$")
	public void clicking_on_Confirm_without_entering_Expiration_Year() throws Throwable {
		PageNavigations.bookingPage().confirmWithoutExpYear();
	}

	@Then("^Printing the alert messages for Expiration Month and Year and closing the browser$")
	public void printing_the_alert_messages_for_Expiration_Month_and_Year_and_closing_the_browser() throws Throwable {
		PageNavigations.bookingPage().printExpMonthAlert("Expiration month");
		PageNavigations.bookingPage().printExpYearAlert("Expiration year");
		TestBaseClass.closeBrowser();
	}
	
	@Given("^Clicking on Confirm after entering all details$")
	public void clicking_on_Confirm_after_entering_all_details() throws Throwable {
		PageNavigations.bookingPage().confirmWithAllDetails();
	}

	@Then("^I am redirected to success page$")
	public void i_am_redirected_to_success_page() throws Throwable {
		PageNavigations.successPage().getSuccessPageUrl();
		PageNavigations.successPage().getSuccessPageHeading();
		TestBaseClass.closeBrowser();
	}
}