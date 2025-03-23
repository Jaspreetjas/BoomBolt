package in.boombolt.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountAddresses extends BasePage{

	WebDriver driver;
	
	public MyAccountAddresses(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h3[text()='Billing address']//following-sibling::a")
	WebElement billingAddressButton;
	
	@FindBy(xpath="//h3[text()='Shipping address']//following-sibling::a")
	WebElement shippingAddressButton;
	
	public void addBillingAddress()
	{
		billingAddressButton.click();
	}
	
	public void addShippingAddress()
	{
		shippingAddressButton.click();
	}
	
	
	
}
