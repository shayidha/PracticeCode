package MakeMyTrip;

import java.time.Duration;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripActions extends MakeMyTripPOM{
	public WebDriver driver;
	
	public void DriverInvoke() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		PageFactory.initElements(driver, MakeMyTripPOM.class);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Driver Initiated Sucessfully");
	}
	public void RemovingPopUp() {
		if(MakeMyTripPOM.close.isDisplayed()) {
			MakeMyTripPOM.close.click();
			System.out.println("Popup is clicked");
		}else {
			System.out.println("Popup is not displayed");
		}
	}
	
	public void verifyingFlightsIconNavigating() {

		int repeat=0;
		while(repeat<= 3) {
			try {
				MakeMyTripPOM.flightIcon.click();
				break;
			}catch(StaleElementReferenceException e)
			{
				e.printStackTrace();
			}
			repeat++;
		}	
		System.out.println(driver.getTitle());
		String ExpectedTitle = "Flight Booking, Cheap Flights , Air Ticket Booking at Lowest Airfare | MakeMyTrip";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ExpectedTitle,ActualTitle);
		System.out.println("Successfully Navigated to the Flight Booking page");
	}
	public void verifyingHotelsIconNavigating()  {
		MakeMyTripPOM.HotelIcon.click();
		System.out.println(driver.getTitle());
		String ExpectedTitle = "MakeMyTrip.com: Save upto 60% on Hotel Booking 4,442,00+ Hotels Worldwide";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ExpectedTitle,ActualTitle);
		System.out.println("Successfully navigated to the Hotel Booking page");
	}
	public void verifyingHomeStaysIconNavigating()  {
		MakeMyTripPOM.HomeStays.click();
		System.out.println(driver.getTitle());
		String ExpectedTitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ExpectedTitle,ActualTitle);
		System.out.println("Successfully navigated to the Homestays page");
	}
	public void verifyingHolidayPackageIconNavigating() {
		MakeMyTripPOM.HolidayPackage.click();
		System.out.println(driver.getTitle());
		String ExpectedTitle = "Holiday Packages, Indian Holidays, Honeymoon Packages, India Tourism, Holidays India, Vacation Package : MakeMyTrip";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ExpectedTitle,ActualTitle);
		System.out.println("Successfully navigaetd to the Holiday Package page");
	}
	public void verifyingTrainsIconNavigating()  {
		MakeMyTripPOM.Trains.click();
		System.out.println(driver.getTitle());
		String ExpectedTitle = "Book Train Ticket Online From IRCTC Authorized Partner - MakeMyTrip";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ExpectedTitle,ActualTitle);
		System.out.println("Successfully navigaetd to Train Booking page");
	}
	public void verifyingBusesIconNavigating()  {
		MakeMyTripPOM.Buses.click();
		System.out.println(driver.getTitle());
		String ExpectedTitle = "Online Bus Ticket Booking, Book Confirmed Reservation Tickets @ MakeMyTrip";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ExpectedTitle,ActualTitle);
		System.out.println("Successfully navigated to th Bus Booking page");
	}
	public void verifyingCabsIconNavigating()  {
		MakeMyTripPOM.Cabs.click();
		System.out.println(driver.getTitle());
		String ExpectedTitle = "Online Cab Booking - Book Outstation Cabs at Lowest Fare @ MakeMyTrip";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ExpectedTitle,ActualTitle);
		System.out.println("Successfully navigated to the Car Booking page");
	}
	public void verifyingForexIconNavigating()  {
		MakeMyTripPOM.Forex.click();
		System.out.println(driver.getTitle());
		String ExpectedTitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ExpectedTitle,ActualTitle);
		System.out.println("Successfully navigated to the Forex Booking page");
	}


	public void closeTheDriver() {
		driver.quit();
		System.out.println("Driver Closed Sucessfully");
	}
	
}
