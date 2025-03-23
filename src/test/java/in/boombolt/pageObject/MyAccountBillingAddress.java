package in.boombolt.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountBillingAddress extends BasePage{
	
	WebDriver driver;
	
	public MyAccountBillingAddress(WebDriver driver)
	{
		super(driver);
	}

	
	@FindBy(id="billing_first_name")
	WebElement billingFirstName;
	
	@FindBy(id="billing_last_name")
	WebElement billingLastName;
	
	@FindBy(id="billing_company")
	WebElement billingCompany;
	
	@FindBy(xpath="//span[text()='Select a country / region…']")
	WebElement billingCountryDropdown;
	
	@FindBy(xpath="//input[@aria-owns='select2-billing_country-results']")
	WebElement countrySearchBox;
	
	//@FindBy(xpath="//ul[@id='select2-billing_country-results']//li[text()='India']")
	
	@FindBy(xpath="//ul[@id='select2-billing_country-results']//li")
	WebElement billingCountryName;
	
	@FindBy(xpath="//input[@placeholder='House number and street name']")
	WebElement billingAddressHouseStreet;
	
	@FindBy(xpath="//input[@placeholder='Apartment, suite, unit, etc. (optional)']")
	WebElement billingAddressApartmentSuite;
	
	@FindBy(id="billing_city")
	WebElement billingCity;
	
	@FindBy(xpath="//span[@id='select2-billing_state-container']")
	WebElement billingStateDropdown;
	
	//@FindBy(xpath="//ul[@id='select2-billing_state-results']//li[text()='Goa']")
	
	@FindBy(xpath="//ul[@id='select2-billing_state-results']")
	WebElement billingStateName;
	
	@FindBy(xpath="//input[@id='billing_postcode']")
	WebElement billingPostCode;
	
	@FindBy(xpath="//input[@id='billing_phone']")
	WebElement billingPhoneNumber;
	
	@FindBy(xpath="//input[@id='billing_email']")
	WebElement billingEmail;
	
	@FindBy(xpath="//button[@name='save_address']")
	WebElement billingAddressSaveButton;
	
	@FindBy(xpath="//div[@role='alert']")
	WebElement successMessage;
	
	public void billingFirstName(String firstName)
	{
		billingFirstName.sendKeys(firstName);
	}
	
	public void billingLastName(String lastName)
	{
		billingLastName.sendKeys(lastName);
	}
	
	public void billingCompany(String companyName)
	{
		billingCompany.sendKeys(companyName);
	}
	
	public void billingCountryDropdown()
	{
		billingCountryDropdown.click();
	}
	
	public void countrySearchBox(String countryName)
	{
		countrySearchBox.sendKeys(countryName);;
	}
	
	public void billingCountryName()
	{
		billingCountryName.click();
	}
	
	public void billingAddressHouseStreet(String houseStreetAddress)
	{
		billingAddressHouseStreet.sendKeys(houseStreetAddress);
	}
	
	public void billingAddressApartmentSuite(String apartmentSuiteAddress)
	{
		billingAddressApartmentSuite.sendKeys(apartmentSuiteAddress);
	}
	
	public void billingCity(String cityName)
	{
		billingCity.sendKeys(cityName);
	}
	
	public void billingStateDropdown()
	{
		billingStateDropdown.click();
	}
	
	public void billingStateName(String stateName)
	{
		billingStateName.findElement(By.xpath("//li[text()='"+stateName+"']")).click();
	}
	
	public void billingPostCode(String postalCode)
	{
		billingPostCode.sendKeys(postalCode);
	}
	
	public void billingPhoneNumber(String phoneNumber)
	{
		billingPhoneNumber.sendKeys(phoneNumber);
	}
	
	public void billingAddressSaveButton()
	{
		billingAddressSaveButton.click();
	}
	
	public String successMessage()
	{
		return successMessage.getText();
	}
	
	
}
