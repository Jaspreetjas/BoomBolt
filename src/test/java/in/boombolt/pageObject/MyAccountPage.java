package in.boombolt.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	WebDriver driver;
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Dashboard']")
	WebElement dashBoard;
	
	@FindBy(xpath="//a[text()='Pre-Orders']")
	WebElement preOrder;
	
	@FindBy(xpath="//a[text()='Orders']")
	WebElement orders;
	
	@FindBy(xpath="//a[text()='Coupons']")
	WebElement coupons;
	
	@FindBy(xpath="//a[text()='Addresses']")
	WebElement addresses;
	
	@FindBy(xpath="//a[text()='Account details']")
	WebElement accountDetails;
	
	@FindBy(xpath="//ul//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--customer-logout']//a[text()='Logout']")
	WebElement logout;
	
	@FindBy(xpath="//div[@class='user-info']//strong")
	WebElement userInfo;
	
	public void dashBoardButton()
	{
		dashBoard.click();
	}
	
	public void preOrdersButton()
	{
		preOrder.click();
	}
	
	public void ordersButton()
	{
		orders.click();
	}
	
	public void couponsButton()
	{
		coupons.click();
	}
	
	public void addressesButton()
	{
		addresses.click();
	}
	
	public void accountDetailsButton()
	{
		accountDetails.click();
	}
	
	public void logoutButton()
	{
		logout.click();
	}
	
	public String userInfo()
	{
		return userInfo.getText();
	}
}
