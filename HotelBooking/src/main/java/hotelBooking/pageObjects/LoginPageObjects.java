package hotelBooking.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import hotelBooking.util.TestBaseClass;

public class LoginPageObjects {
	@FindBy(how = How.XPATH, using = "//h1[@align='center']")
	public WebElement expectedLoginPageHeading;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Login']")
	public WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = "//div[@id='userErrMsg']")
	public WebElement expectedErrorMessageWihoutUsername;
	
	@FindBy(how = How.NAME, using = "userName")
	public WebElement username;
	
	@FindBy(how = How.NAME, using = "userPwd")
	public WebElement password;
	
    @FindBy(how = How.XPATH, using = "//div[@id='pwdErrMsg']")
    public WebElement expectedErrorMessageWihoutPassword;
    
    public LoginPageObjects() {
		PageFactory.initElements(TestBaseClass.driver, this);
	}
}