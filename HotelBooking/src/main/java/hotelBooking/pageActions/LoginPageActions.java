package hotelBooking.pageActions;

import org.openqa.selenium.By;
import org.testng.Assert;

import hotelBooking.pageObjects.LoginPageObjects;
import hotelBooking.util.TestBaseClass;

public class LoginPageActions extends TestBaseClass {
	public LoginPageObjects loginPageObject = new LoginPageObjects();
	static String loginPageHeading, errorWithoutUsername, errorWithoutPassword;
	
	public String getExpectedHeading() {
		return loginPageObject.expectedLoginPageHeading.getText();	
	}
	
	public void getLoginPageHeading() {
		loginPageHeading = driver.findElement(By.xpath("//h1[@align='center']")).getText();
		Assert.assertEquals(getExpectedHeading(), loginPageHeading);
	}
	
	public void printLoginPageHeading() {
		System.out.println("Heading of Login page: " + loginPageHeading);
	}
	
	public String getExpectedErrorMessageWihoutUsername() {
		return loginPageObject.expectedErrorMessageWihoutUsername.getText();	
	}
	
	public void loginWithoutUserName() {
		loginPageObject.loginButton.click();
		errorWithoutUsername = driver.findElement(By.xpath("//div[@id='userErrMsg']")).getText();
		Assert.assertEquals(getExpectedErrorMessageWihoutUsername(), errorWithoutUsername);
	}
	
	public void printErrorWithoutUsername() {
		System.out.println("Error message when username is not entered: " + errorWithoutUsername);
	}
	
	public String getExpectedErrorMessageWihoutPassword() {
		return loginPageObject.expectedErrorMessageWihoutPassword.getText();
	}
	
	public void loginWithoutPassword() {
		loginPageObject.username.sendKeys("admin");
		loginPageObject.loginButton.click();
		errorWithoutPassword = driver.findElement(By.xpath("//div[@id='pwdErrMsg']")).getText();
		Assert.assertEquals(getExpectedErrorMessageWihoutPassword(), errorWithoutPassword);
	}
	
	public void printErrorWithoutPassword() {
		System.out.println("Error message when password is not entered: " + errorWithoutPassword);
	}
	
	public void login(String uname, String pwd) {
		loginPageObject.username.sendKeys(uname);
		loginPageObject.password.sendKeys(pwd);
		loginPageObject.loginButton.click();
	}
}