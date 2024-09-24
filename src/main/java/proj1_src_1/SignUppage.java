package proj1_src_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SignUppage 
{
@FindBy(id="nav-link-accountList")
WebElement LinkToSignIn;
@FindBy(id="ap_email")
WebElement InputID;
//@FindBy(xpath="//h4[.='Incorrect phone number']")
//WebElement validationID;
@FindBy(id="continue")
WebElement ContinueBtn;
@FindBy(id="ap_password")
WebElement Password;
@FindBy (id="signInSubmit")
WebElement BtnSign;
public void signInlink()
{
	LinkToSignIn.click();
}
public void UserID()
{
	InputID.clear();
	InputID.sendKeys("81496929011");
}
//public void validate()
//{
//	if(validationID.isDisplayed()==true)
//	{
//		System.out.println("Provide valid userID");
//	}
//	else
//	{
//		System.out.println("Provide valid:");
//		continueto();
//	}
//}
public void continueto()
{
	ContinueBtn.click();
}
public void pwd()
{
	Password.sendKeys("aMaz_1711");
}
public void LoginToApp()
{
	BtnSign.click();
}
public SignUppage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}

