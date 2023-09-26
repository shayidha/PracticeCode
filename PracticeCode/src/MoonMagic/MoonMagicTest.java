package MoonMagic;

import org.testng.annotations.Test;

public class MoonMagicTest {
	MoonMagicActions moon = new MoonMagicActions();
	@Test
	public void Test01() {
		 moon.DriverInvoke();
	}
	@Test
	public void Test02() {
		moon.Login();
	}
	@Test
	public void Test03() {
		moon.JewelryHomepage();
	}
	@Test
	public void Test04() {
		moon.SelectItem();
	}
	@Test
	public void Test05() {
		moon.AddingToCart();
	}
	@Test
	public void Test06() {
		moon.checkOutItem();
	}
	@Test
	public void Test07() {
		moon.closeTheDriver();
	}
}