package Test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Base.ProjectSpecifications;
import Page.AddonPage;
import Page.HomePage;
import Page.PassengerDetailsPage;
import Page.PrepaymentPage;
import Page.SelectFlight;
import Page.SelectingTypeOfTripPage;

public class Payment extends ProjectSpecifications{
	
	HomePage HomePage;
	AddonPage addonPage;
	SelectingTypeOfTripPage bookTicket;
	SelectFlight selectFlight;
	PassengerDetailsPage passengerDetailsPage;
	PrepaymentPage payment;
  @Test
  public void payment() throws AWTException, InterruptedException {
	  bookTicket = new SelectingTypeOfTripPage(driver);
		bookTicket.oneWayTrip("Delhi", "Hyderabed", "28", "March 2024");
		
		selectFlight = new SelectFlight(driver);
		selectFlight.selectFlight();
		switchWindows("https://www.spicejet.com/booking");
	
		passengerDetailsPage= new PassengerDetailsPage(driver);
		passengerDetailsPage.contactDetails("Test", "Test", "9553645937", "test@mailinator.com", "India");
		passengerDetailsPage.passengersDetails("Test", "Test", "9553645937");
		passengerDetailsPage.clickContinuButton();
		
		switchWindows("https://www.spicejet.com/booking/addons");
		
		addonPage = new AddonPage(driver);	
		
		Thread.sleep(5000);
		addonPage.addonScreenActions();
  }
}
