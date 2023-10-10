package MakeMyTrip;

import org.testng.annotations.Test;

class TestMethods {
	Actions book = new Actions();	

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
		book.verifyingFlightsIcon();
	}
	@Test()
	public void Test04() {
		book.verifyingHotelsIcon();
	}
	@Test()
	public void Test05() {
		book.verifyingHomeStaysIcon();
	}
	@Test()
	public void Test06() {
		book.verifyingHolidayPackageIcon();
	}
	@Test()
	public void Test07() {
		book.verifyingTrainsIcon();
	}
	@Test()
	public void Test08() {
		book.verifyingBusesIcon();
	}
	@Test()
	public void Test09() {
		book.verifyingCabsIcon();
	}
	@Test()
	public void Test10() {
		book.verifyingForexIcon();
	
	}
	@Test()
	public void Test12() {
		book.closeTheDriver();
	}
		
}
	
	
	
	
	
	


