package Test;

import org.testng.annotations.Test;

import Base.ProjectSpecifications;
import Page.HomePage;
import Page.SelectingTypeOfTripPage;

public class TC_003_Onewaytrip extends ProjectSpecifications{
	
	HomePage HomePage;
	SelectingTypeOfTripPage book;
	
	@Test
	public void bookOneWayTicket() throws InterruptedException {
		book = new SelectingTypeOfTripPage(driver);
		book.oneWayTrip("Delhi", "Hyderabad", "28", "March 2024");
	}


}
