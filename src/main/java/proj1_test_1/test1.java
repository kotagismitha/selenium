package proj1_test_1;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import proj1_src_1.RegistrationPage;
public class test1
{
	@Test
	public void Register_On_Amazon()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get ("https://www.amazon.in/");
		 System.out.println(driver.getTitle());
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		RegistrationPage  reg= new RegistrationPage(driver);
		reg.hoveron();
		reg.Rgsn();
		reg.un();
		reg.num();
		reg.pw();
		reg.proceeds();
		}
	}

