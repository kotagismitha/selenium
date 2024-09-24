package fb_source;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Fb_login 
{
//Step 1:Locating each Element using the FindBy annotation
WebDriver driver;
@FindBy(id="email")
WebElement username;
@FindBy(id="pass")
WebElement password;
@FindBy(name="login")
WebElement Login_button;
//Step 2 : Creating seperate methods for each component
public void un()
{
	username.sendKeys("smithabvb@gmail.com");
}
public void pw()
{
	password.sendKeys("900883212@5");
}
public void login()
{
	Login_button.click();
}
//Step3 : Initializing the element
public Fb_login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
