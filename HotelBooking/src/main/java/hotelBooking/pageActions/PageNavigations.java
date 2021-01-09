package hotelBooking.pageActions;

public class PageNavigations {
	public static LoginPageActions loginPage() {
		LoginPageActions loginPageNav = new LoginPageActions();
		return loginPageNav;
	}
	
	public static BookingFormPageActions bookingPage() {
		BookingFormPageActions bookingPageNav = new BookingFormPageActions();
		return bookingPageNav;
	}
	
	public static SuccessPageActions successPage() {
		SuccessPageActions successPageNav = new SuccessPageActions();
		return successPageNav;
	}
}