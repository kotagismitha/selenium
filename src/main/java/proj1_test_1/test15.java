package proj1_test_1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import proj1_src_1.SignUppage;
public class test15 
{
	@Test
	public void Login_To_Amazon()
	{
ChromeDriver driver = new ChromeDriver();
driver.get("https:\\www.amazon.in");
driver.manage().window().maximize();
SignUppage logIn = new SignUppage(driver);
	logIn.signInlink();
	logIn.UserID();
	logIn.continueto();
	logIn.pwd();
	logIn.LoginToApp();
//AssertTrue(if Isdisplyed= true )("auth-mfa-otpcode");	
//AssertTrue if (Isdisplayed text!="Hello, sign in");////span[.='Hello, sign in']
//add listener to capture screenshots
    }
}
