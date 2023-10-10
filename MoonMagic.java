package MoonMagic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MoonMagic  extends  POMPage{
	
	public WebDriver driver;
	
	public void DriverInvoke() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		PageFactory.initElements(driver, POMPage.class);
		driver.get("https://moonmagic.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Driver Initiated Sucessfully");

	}
	public void Login() {
		POMPage.mousehover.click();
		POMPage.login_link.click();
		POMPage.email.sendKeys(Credentials.uname);
		POMPage.pswd.sendKeys(Credentials.pwd);
		POMPage.login_button.click();
		System.out.println("Sucessfully Logged in with username and Password");
	}
	public void JewelryHomepage() {
		POMPage.jewelry.click();
		System.out.println("jewelry categories displaying :"+POMPage.submenu.isDisplayed());
		POMPage.Rings.click();
		System.out.println("Landed On Homepage Sucessfully");
	}
	public void SelectItem() {
		POMPage.Flow_Ring.click();
		System.out.println("Flow Ring is selected Sucessfully");
	}
	public void AddingToCart() {
		POMPage.size.click();
		POMPage.Add_to_Cart.click();
		System.out.println("Sucessfully Added Product to cart");
	}
	public void checkOutItem() {
		if(POMPage.pop_up.isDisplayed()) {
		POMPage.pop_up.click();
		}else {
		POMPage.checkout.click();
		}
		System.out.println("Sucessfully Checked out the Item ");
	}
	public void closeTheDriver() {
		driver.quit();
		System.out.println("Driver Closed Sucessfully");
	}
}

