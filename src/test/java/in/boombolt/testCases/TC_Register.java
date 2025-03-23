package in.boombolt.testCases;

import java.util.Locale;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import in.boombolt.pageObject.AccountRegsLoginPage;
import in.boombolt.pageObject.MyAccountAddresses;
import in.boombolt.pageObject.MyAccountBillingAddress;
import in.boombolt.pageObject.MyAccountPage;

public class TC_Register extends BaseClass{

	@Test
	public void accountRegister()
	{
		AccountRegsLoginPage accountPage = new AccountRegsLoginPage(driver);
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		Faker fakeData = new Faker(new Locale("en-IN"));
		
		String username = fakeData.name().username();
		String password = fakeData.internet().password();
		String email = fakeData.internet().emailAddress();
		
		System.out.println(username+"\t"+password+"\t"+email);
		
		accountPage.registerButton();
		accountPage.registerUserName(username);
		accountPage.registerEmail(email);
		accountPage.registerPassword(password);
		accountPage.registerSubmitButton();
		
		Assert.assertTrue(myAccountPage.userInfo().contains(username));
		
	}
	
	//@Test
	public void addBillingAddress()
	{
		MyAccountPage accountPage = new MyAccountPage(driver);
		accountPage.addressesButton();
		
		MyAccountAddresses accountAddresses = new MyAccountAddresses(driver);
		accountAddresses.addBillingAddress();
		
		MyAccountBillingAddress billingAddress = new MyAccountBillingAddress(driver);
		Faker fakeData = new Faker(new Locale("en-IN"));
		
		billingAddress.billingFirstName(fakeData.name().firstName());
		billingAddress.billingLastName(fakeData.name().lastName());
		billingAddress.billingCompany(fakeData.company().name());
		billingAddress.billingCountryDropdown();
		String countryName = fakeData.address().country();
		System.out.println("CountryName: "+countryName);
		billingAddress.countrySearchBox(countryName);
		billingAddress.billingCountryName();
		billingAddress.billingAddressHouseStreet(fakeData.address().streetAddress());
		//billingAddress.billingAddressApartmentSuite(fakeData.address().);
		billingAddress.billingCity(fakeData.address().cityName());
		billingAddress.billingStateDropdown();
		String stateName = fakeData.address().state();
		billingAddress.billingStateName(stateName);
		billingAddress.billingPostCode(fakeData.address().zipCode());
		billingAddress.billingPhoneNumber(fakeData.phoneNumber().phoneNumber());
		billingAddress.billingAddressSaveButton();
		
		Assert.assertTrue(billingAddress.successMessage().contains("Address changed successfully."));
		

	}
	
	
	
}
