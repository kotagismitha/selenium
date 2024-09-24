package fb_test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import fb_source.Fb_login;
public class Testcase2
{
@Test
public void login_to_facebook()
{
	ChromeDriver driver = new ChromeDriver();
	driver.get ("https://www.facebook.com/");
	 System.out.println(driver.getTitle());
	 driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Fb_login fb= new Fb_login(driver);
	fb.un();
	fb.pw();
	fb.login();
}
}

