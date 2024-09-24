package amz_source;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amz_login
{
	WebDriver driver;
	//Step 1:Locating each Element using the FindBy annotation
	@FindBy(id="nav-link-accountList")
	WebElement hover;
	@FindBy(id="ap_email")
	WebElement username;
	@FindBy(className= "a-button-input")
	WebElement continued;
	@FindBy(id="ap_password")
	WebElement password;
	@FindBy(id="signInSubmit")
	WebElement signIn;
	//Step 2 : Creating seperate methods for each component
	public void hoveron()
	{
		hover.click();
	}
	public void un()
	{
		username.sendKeys("smithabvb@gmail.com");
	}
	public void proceed() 
	{
		continued.click();
	}
	public void pw()
	{
		password.sendKeys("aMaze_1711");
	}
	public void login()
	{
		signIn.click();
	}
	//Step3 : Initializing the element
	public amz_login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	}

