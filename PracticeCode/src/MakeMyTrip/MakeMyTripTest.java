package MakeMyTrip;

import org.testng.annotations.Test;

class MakeMyTripTest {
	MakeMyTripActions book = new MakeMyTripActions();	

	@Test()
	public void Test01() {
		book.DriverInvoke();
		
	}
	@Test()
	public void Test02() {
		book.RemovingPopUp();
	}
	@Test()
	public void Test03() {
		book.verifyingFlightsIconNavigating();
	}
	@Test()
	public void Test04() {
		book.verifyingHotelsIconNavigating();
	}
	@Test()
	public void Test05() {
		book.verifyingHomeStaysIconNavigating();
	}
	@Test()
	public void Test06() {
		book.verifyingHolidayPackageIconNavigating();
	}
	@Test()
	public void Test07() {
		book.verifyingTrainsIconNavigating();
	}
	@Test()
	public void Test08() {
		book.verifyingBusesIconNavigating();
	}
	@Test()
	public void Test09() {
		book.verifyingCabsIconNavigating();
	}
	@Test()
	public void Test10() {
		book.verifyingForexIconNavigating();
	
	}
	@Test()
	public void Test12() {
		book.closeTheDriver();
	}
		
}
	
	
	
	
	
	


