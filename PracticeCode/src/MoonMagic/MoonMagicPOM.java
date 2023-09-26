package MoonMagic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class MoonMagicPOM 
{
	@FindBy(xpath="(//span[@class='aicon icon-mm-person'])[1]")
	static WebElement mousehover ;
	@FindBy(id="customer_login_link")
	static WebElement login_link ;
	@FindBy(id="email")
	static WebElement email ;
	@FindBy(id="password")
	static WebElement pswd;
	@FindBy(xpath="//button[text()='Log In']")
	static WebElement login_button;
	@FindBy(xpath="//span[text()='jewelry']")
	static WebElement jewelry;
	@FindBy(xpath="//ul[@class='site-nav__children container  container--large']")
	static WebElement submenu;
	@FindBy(xpath="//a[text()='Rings']")
	static WebElement Rings;
	@FindBy(xpath="//h3[text()='Flow Ring']")
	static WebElement Flow_Ring;
	@FindBy(xpath="//span[text()='6']")
	static WebElement size;
	@FindBy(xpath="//span[text()='Add to Cart']")
	static WebElement Add_to_Cart;
	@FindBy(xpath="//div[text()='No, thanks']")
	static WebElement pop_up;
	@FindBy(xpath ="//a[@class='button button--checkout']")
	static WebElement checkout;
	
	}


   

