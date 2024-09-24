package proj1_test_1;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import amz_source.productiondesc;
import proj1_src_1.HomePage;
public class test2 
{
	WebDriver driver;
	@Test
	public void Register_On_Amazon() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get ("https://www.amazon.in/");
		 System.out.println(driver.getTitle());
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HomePage reg = new HomePage(driver);
		productiondesc prod= new productiondesc(driver);
		reg.itemsearch();
		reg.searchicon();
		Thread.sleep(4000);
		//reg.Itemselection();
		reg.addcart();
		reg.goTocart();
//		Thread.sleep(4000);
//		System.out.println(driver.getTitle());
//		Thread.sleep(4000);
//		prod.Add_to_cart();
//		prod.buyItems();
		}
	}
