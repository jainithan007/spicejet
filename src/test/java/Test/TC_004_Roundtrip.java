package Test;

import org.testng.annotations.Test;

import Base.ProjectSpecifications;
import Page.HomePage;
import Page.SelectingTypeOfTripPage;

public class TC_004_Roundtrip extends ProjectSpecifications{

	HomePage HomePage;
	SelectingTypeOfTripPage book;
	

	@Test
	public void bookOneWayTicket() throws InterruptedException {
		book = new SelectingTypeOfTripPage(driver);
		book.roundTrip("Hyderabad", "Delhi", "27", "29", "March 2024");
		
	}
}
