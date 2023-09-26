package MoonMagic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MoonMagicActions  extends  MoonMagicPOM{
	
	public WebDriver driver;
	
	public void DriverInvoke() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		PageFactory.initElements(driver, MoonMagicPOM.class);
		driver.get("https://moonmagic.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Driver Initiated Sucessfully");

	}
	public void Login() {
		MoonMagicPOM.mousehover.click();
		MoonMagicPOM.login_link.click();
		MoonMagicPOM.email.sendKeys(MoonMagicCredentials.uname);
		MoonMagicPOM.pswd.sendKeys(MoonMagicCredentials.pwd);
		MoonMagicPOM.login_button.click();
		System.out.println("Sucessfully Logged in with username and Password");
	}
	public void JewelryHomepage() {
		MoonMagicPOM.jewelry.click();
		System.out.println("jewelry categories displaying :"+MoonMagicPOM.submenu.isDisplayed());
		MoonMagicPOM.Rings.click();
		System.out.println("Landed On Homepage Sucessfully");
	}
	public void SelectItem() {
		MoonMagicPOM.Flow_Ring.click();
		System.out.println("Flow Ring is selected Sucessfully");
	}
	public void AddingToCart() {
		MoonMagicPOM.size.click();
		MoonMagicPOM.Add_to_Cart.click();
		System.out.println("Sucessfully Added Product to cart");
	}
	public void checkOutItem() {
		if(MoonMagicPOM.pop_up.isDisplayed()) {
		MoonMagicPOM.pop_up.click();
		}else {
		MoonMagicPOM.checkout.click();
		}
		System.out.println("Sucessfully Checked out the Item ");
	}
	public void closeTheDriver() {
		driver.quit();
		System.out.println("Driver Closed Sucessfully");
	}
}

