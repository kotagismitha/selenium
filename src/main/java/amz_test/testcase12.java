//search a product
package amz_test;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import amz_source.amz_login;
import amz_source.homepage;
public class testcase12 
{
@Test
public void Search_a_product() throws InterruptedException
		{
			ChromeDriver driver = new ChromeDriver();
			driver.get ("https://www.amazon.in/");
			 System.out.println(driver.getTitle());
			 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			homepage bt= new homepage(driver);
			bt.itemsearch();
			bt.selectitem();
			}		
}
