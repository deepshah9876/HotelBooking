package hotelBooking.pageActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import hotelBooking.pageObjects.BookingFormObjects;
import hotelBooking.util.TestBaseClass;

public class BookingFormPageActions extends TestBaseClass {
	public BookingFormObjects bookingFormObject = new BookingFormObjects();
	static String bookingFormUrl, bookingFormTitle, alertText, incorrectAlertText, address, numberOfRoom, alertMessageMonth, alertMessageYear;

	public void getBookingFormTitle() {
		bookingFormTitle = driver.getTitle();
	}

	public void getBookingFormUrl() {
		bookingFormUrl = driver.getCurrentUrl();
		String expected = ("file" + System.getProperty("user.dir") + prop.getProperty("bookingFormUrl")).replaceAll("[^a-zA-Z0-9]", "");
		String actual = bookingFormUrl.replaceAll("[^a-zA-Z0-9]", "");
		Assert.assertEquals(actual, expected);
	}
	
	public void printBookingFormUrl() {
		System.out.println("URL of Booking form page: " + bookingFormUrl);
	}
	
	public void printAlertMessage(String field) {
		System.out.println("Alert message when " + field + " is not entered: " + alertText);
	}
	
	public void printIncorrectAlertMessage(String field) {
		System.out.println("Alert message when incorrect " + field + " is entered: " + incorrectAlertText);
	}


	public void confirmWithoutFirstName() {
		bookingFormObject.confirmButton.click();
		Alert alert = driver.switchTo().alert();
		alertText = alert.getText();
		alert.accept();
		Assert.assertEquals(alertText, "Please fill the First Name");
	}

	public void confirmWithoutLastName() {
		bookingFormObject.firstNameField.sendKeys(prop.getProperty("firstName"));
		bookingFormObject.confirmButton.click();
		Alert alert = driver.switchTo().alert();
		alertText = alert.getText();
		alert.accept();
		Assert.assertEquals(alertText, "Please fill the Last Name");
	}

	public void confirmWithoutEmail() {
		bookingFormObject.firstNameField.sendKeys(prop.getProperty("firstName"));
		bookingFormObject.lastNameField.sendKeys(prop.getProperty("lastName"));
		bookingFormObject.confirmButton.click();
		Alert alert = driver.switchTo().alert();
		alertText = alert.getText();
		alert.accept();
		Assert.assertEquals(alertText, "Please fill the Email");
	}

	public void confirmWithIncorrectEmail() {
		bookingFormObject.emailField.sendKeys(prop.getProperty("incorrectEmail"));
		bookingFormObject.confirmButton.click();
		Alert alert = driver.switchTo().alert();
		incorrectAlertText = alert.getText();
		alert.accept();
		Assert.assertEquals(incorrectAlertText, "Please enter valid Email Id.");
	}
	
	public void confirmWithoutMobile() {
		bookingFormObject.firstNameField.sendKeys(prop.getProperty("firstName"));
		bookingFormObject.lastNameField.sendKeys(prop.getProperty("lastName"));
		bookingFormObject.emailField.sendKeys(prop.getProperty("correctEmail"));
		bookingFormObject.confirmButton.click();
		Alert alert = driver.switchTo().alert();
		alertText = alert.getText();
		alert.accept();
		Assert.assertEquals(alertText, "Please fill the Mobile No.");
	}

	public void confirmWithIncorrectMobile() {
		bookingFormObject.mobileField.sendKeys(prop.getProperty("incorrectMobile"));
		bookingFormObject.confirmButton.click();
		Alert alert = driver.switchTo().alert();
		incorrectAlertText = alert.getText();
		alert.accept();
		Assert.assertEquals(incorrectAlertText, "Please enter valid Contact no.");
	}

	public void enterAddress() {
		bookingFormObject.firstNameField.sendKeys(prop.getProperty("firstName"));
		bookingFormObject.lastNameField.sendKeys(prop.getProperty("lastName"));
		bookingFormObject.emailField.sendKeys(prop.getProperty("correctEmail"));
		bookingFormObject.mobileField.sendKeys(prop.getProperty("correctMobile"));
		bookingFormObject.addressField.sendKeys(prop.getProperty("address"));
		address = bookingFormObject.addressField.getAttribute("value");
		Assert.assertEquals(prop.getProperty("address"), address);
	}
	
	public void printAddress() {
		System.out.println("Address: " + address);
	}

	public void confirmWithoutCity() {
		bookingFormObject.firstNameField.sendKeys(prop.getProperty("firstName"));
		bookingFormObject.lastNameField.sendKeys(prop.getProperty("lastName"));
		bookingFormObject.emailField.sendKeys(prop.getProperty("correctEmail"));
		bookingFormObject.mobileField.sendKeys(prop.getProperty("correctMobile"));
		bookingFormObject.addressField.sendKeys(prop.getProperty("address"));
		bookingFormObject.confirmButton.click();
		Alert alert = driver.switchTo().alert();
		alertText = alert.getText();
		alert.accept();
		Assert.assertEquals(alertText, "Please select city");
	}

	public void confirmWithoutState() {
		bookingFormObject.firstNameField.sendKeys(prop.getProperty("firstName"));
		bookingFormObject.lastNameField.sendKeys(prop.getProperty("lastName"));
		bookingFormObject.emailField.sendKeys(prop.getProperty("correctEmail"));
		bookingFormObject.mobileField.sendKeys(prop.getProperty("correctMobile"));
		bookingFormObject.addressField.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(bookingFormObject.cityDropdown);
		selCity.selectByVisibleText(prop.getProperty("city"));
		bookingFormObject.confirmButton.click();
		Alert alert = driver.switchTo().alert();
		alertText = alert.getText();
		alert.accept();
		Assert.assertEquals(alertText, "Please select state");
	}

	public void selectPeople() {
		bookingFormObject.firstNameField.sendKeys(prop.getProperty("firstName"));
		bookingFormObject.lastNameField.sendKeys(prop.getProperty("lastName"));
		bookingFormObject.emailField.sendKeys(prop.getProperty("correctEmail"));
		bookingFormObject.mobileField.sendKeys(prop.getProperty("correctMobile"));
		bookingFormObject.addressField.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(bookingFormObject.cityDropdown);
		selCity.selectByVisibleText(prop.getProperty("city"));
		Select selState = new Select(bookingFormObject.stateDropdown);
		selState.selectByVisibleText(prop.getProperty("state"));
		Select selPeople = new Select(bookingFormObject.peopleDropdown);
		selPeople.selectByVisibleText(prop.getProperty("persons"));
		numberOfRoom = bookingFormObject.numberOfRooms.getText();
	}
	
	public void printNumberOfPeople() {
		System.out.println("Number of rooms booked: " + numberOfRoom);
	}

	public void confirmWithoutCardHolder() {
		bookingFormObject.firstNameField.sendKeys(prop.getProperty("firstName"));
		bookingFormObject.lastNameField.sendKeys(prop.getProperty("lastName"));
		bookingFormObject.emailField.sendKeys(prop.getProperty("correctEmail"));
		bookingFormObject.mobileField.sendKeys(prop.getProperty("correctMobile"));
		bookingFormObject.addressField.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(bookingFormObject.cityDropdown);
		selCity.selectByVisibleText(prop.getProperty("city"));
		Select selState = new Select(bookingFormObject.stateDropdown);
		selState.selectByVisibleText(prop.getProperty("state"));
		Select selPeople = new Select(bookingFormObject.peopleDropdown);
		selPeople.selectByVisibleText(prop.getProperty("persons"));
		bookingFormObject.confirmButton.click();
		Alert alert = driver.switchTo().alert();
		alertText = alert.getText();
		alert.accept();
		Assert.assertEquals(alertText, "Please fill the Card holder name");
	}

	public void confirmWithoutDebitCard() {
		bookingFormObject.firstNameField.sendKeys(prop.getProperty("firstName"));
		bookingFormObject.lastNameField.sendKeys(prop.getProperty("lastName"));
		bookingFormObject.emailField.sendKeys(prop.getProperty("correctEmail"));
		bookingFormObject.mobileField.sendKeys(prop.getProperty("correctMobile"));
		bookingFormObject.addressField.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(bookingFormObject.cityDropdown);
		selCity.selectByVisibleText(prop.getProperty("city"));
		Select selState = new Select(bookingFormObject.stateDropdown);
		selState.selectByVisibleText(prop.getProperty("state"));
		Select selPeople = new Select(bookingFormObject.peopleDropdown);
		selPeople.selectByVisibleText(prop.getProperty("persons"));
		bookingFormObject.cardHolderName.sendKeys(prop.getProperty("cardHolderName"));
		bookingFormObject.confirmButton.click();
		Alert alert = driver.switchTo().alert();
		alertText = alert.getText();
		alert.accept();
		Assert.assertEquals(alertText, "Please fill the Debit card Number");
	}

	public void confirmWithoutCVV() {
		bookingFormObject.firstNameField.sendKeys(prop.getProperty("firstName"));
		bookingFormObject.lastNameField.sendKeys(prop.getProperty("lastName"));
		bookingFormObject.emailField.sendKeys(prop.getProperty("correctEmail"));
		bookingFormObject.mobileField.sendKeys(prop.getProperty("correctMobile"));
		bookingFormObject.addressField.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(bookingFormObject.cityDropdown);
		selCity.selectByVisibleText(prop.getProperty("city"));
		Select selState = new Select(bookingFormObject.stateDropdown);
		selState.selectByVisibleText(prop.getProperty("state"));
		Select selPeople = new Select(bookingFormObject.peopleDropdown);
		selPeople.selectByVisibleText(prop.getProperty("persons"));
		bookingFormObject.cardHolderName.sendKeys(prop.getProperty("cardHolderName"));
		bookingFormObject.debitCard.sendKeys(prop.getProperty("debitCard"));
		bookingFormObject.confirmButton.click();
		Alert alert = driver.switchTo().alert();
		alertText = alert.getText();
		alert.accept();
		Assert.assertEquals(alertText, "Please fill the CVV");
	}

	public void confirmWithoutExpMonth() {
		bookingFormObject.firstNameField.sendKeys(prop.getProperty("firstName"));
		bookingFormObject.lastNameField.sendKeys(prop.getProperty("lastName"));
		bookingFormObject.emailField.sendKeys(prop.getProperty("correctEmail"));
		bookingFormObject.mobileField.sendKeys(prop.getProperty("correctMobile"));
		bookingFormObject.addressField.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(bookingFormObject.cityDropdown);
		selCity.selectByVisibleText(prop.getProperty("city"));
		Select selState = new Select(bookingFormObject.stateDropdown);
		selState.selectByVisibleText(prop.getProperty("state"));
		Select selPeople = new Select(bookingFormObject.peopleDropdown);
		selPeople.selectByVisibleText(prop.getProperty("persons"));
		bookingFormObject.cardHolderName.sendKeys(prop.getProperty("cardHolderName"));
		bookingFormObject.debitCard.sendKeys(prop.getProperty("debitCard"));
		bookingFormObject.cvv.sendKeys(prop.getProperty("cvv"));
		bookingFormObject.confirmButton.click();
		Alert alert = driver.switchTo().alert();
		alertMessageMonth = alert.getText();
		alert.accept();
		Assert.assertEquals(alertMessageMonth, "Please fill expiration month");
	}
	
	public void printExpMonthAlert(String field) {
		System.out.println("Alert message when " + field + " is not entered: " + alertMessageMonth);
	}

	public void confirmWithoutExpYear() {
		bookingFormObject.expirationMonth.sendKeys(prop.getProperty("expirationMonth"));
		bookingFormObject.confirmButton.click();
		Alert alert = driver.switchTo().alert();
		alertMessageYear = alert.getText();
		alert.accept();
		Assert.assertEquals(alertMessageYear, "Please fill the expiration year");
	}
	
	public void printExpYearAlert(String field) {
		System.out.println("Alert message when " + field + " is not entered: " + alertMessageYear);
	}
	
	public void confirmWithAllDetails() {
		bookingFormObject.firstNameField.sendKeys(prop.getProperty("firstName"));
		bookingFormObject.lastNameField.sendKeys(prop.getProperty("lastName"));
		bookingFormObject.emailField.sendKeys(prop.getProperty("correctEmail"));
		bookingFormObject.mobileField.sendKeys(prop.getProperty("correctMobile"));
		bookingFormObject.addressField.sendKeys(prop.getProperty("address"));
		Select selCity = new Select(bookingFormObject.cityDropdown);
		selCity.selectByVisibleText(prop.getProperty("city"));
		Select selState = new Select(bookingFormObject.stateDropdown);
		selState.selectByVisibleText(prop.getProperty("state"));
		Select selPeople = new Select(bookingFormObject.peopleDropdown);
		selPeople.selectByVisibleText(prop.getProperty("persons"));
		bookingFormObject.cardHolderName.sendKeys(prop.getProperty("cardHolderName"));
		bookingFormObject.debitCard.sendKeys(prop.getProperty("debitCard"));
		bookingFormObject.cvv.sendKeys(prop.getProperty("cvv"));
		bookingFormObject.expirationMonth.sendKeys(prop.getProperty("expirationMonth"));
		bookingFormObject.expirationYear.sendKeys(prop.getProperty("expirationYear"));
		bookingFormObject.confirmButton.click();
	}
}