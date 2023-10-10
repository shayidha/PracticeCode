package MakeMyTrip;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMpage{

	@FindBy(css="span.commonModal__close")
	static WebElement close;
	@FindBy(css="li.menu_Flights")
	static WebElement flightIcon;
	@FindBy(css="li.menu_Hotels")
	static WebElement HotelIcon;
	@FindBy(css="li.menu_Homestays")
	static WebElement HomeStays;
	@FindBy(css="li.menu_Holidays ")
	static WebElement HolidayPackage;
	@FindBy(css="li.menu_Trains")
	static WebElement Trains;
	@FindBy(css="li.menu_Buses")
	static WebElement Buses;
	@FindBy(css="li.menu_Cabs")
	static WebElement Cabs;
	@FindBy(css="li.menu_Forex")
	static WebElement Forex;
	@FindBy(css="li.menu_TravelInsurance")
	static WebElement TravelInsurance;
	
}

