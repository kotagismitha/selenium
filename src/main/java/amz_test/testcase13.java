//Add prod to cart
package amz_test;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import amz_source.productiondesc;
public class testcase13
{
@Test
public void Add_prod_to_cart() throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.get ("https://www.amazon.in/");
	 System.out.println(driver.getTitle());
	 driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	productiondesc pd = new productiondesc(driver);
   pd.Add_to_cart();
   pd.buyItems();
}
}

