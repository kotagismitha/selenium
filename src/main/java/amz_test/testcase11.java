//login to Amazon 
package amz_test;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import amz_source.amz_login;
public class testcase11 
{
@Test
public void login_to_facebook() throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.get ("https://www.amazon.in/");
	 System.out.println(driver.getTitle());
	 driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	amz_login fb= new amz_login(driver);
	fb.hoveron();
	Thread.sleep(2000);
	fb.un();
	fb.proceed();
	fb.pw();
	fb.login();
}
}
