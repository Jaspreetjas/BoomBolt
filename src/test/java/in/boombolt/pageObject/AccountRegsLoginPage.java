package in.boombolt.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegsLoginPage extends BasePage
{

	WebDriver driver;
	
	public AccountRegsLoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement registerButton;
	
	@FindBy(xpath="//input[@id='username']")
	WebElement userNameBox;
	
	@FindBy(id="password")
	WebElement passwordBox;
	
	@FindBy(id="rememberme")
	WebElement rememberMeCheckBox;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement loginSubmitButton;
	
	@FindBy(xpath="//a[text()='Lost your password?']")
	WebElement lostPasswordLink;
	
	@FindBy(xpath="//input[@id='reg_username']")
	WebElement registerUserName;
	
	@FindBy(xpath="//input[@id='reg_email']")
	WebElement registerEmail;
	
	@FindBy(xpath="//input[@id='reg_password']")
	WebElement registerPassword;
	
	@FindBy(xpath="//input[@name='register']")
	WebElement registerSubmitButton;
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement homeButton;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement loginButton;
	
	public void registerButton()
	{
		registerButton.click();
	}
	
	public void registerUserName(String username)
	{
		registerUserName.sendKeys(username);
	}
	
	public void registerPassword(String password)
	{
		registerPassword.sendKeys(password);
	}
	
	public void registerEmail(String email)
	{
		registerEmail.sendKeys(email);
	}
	
	public void registerSubmitButton()
	{
		registerSubmitButton.click();
	}
	
	public void homeButton()
	{
		homeButton.click();
	}
	
}
