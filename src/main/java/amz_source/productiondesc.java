package amz_source;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class productiondesc 
{
@FindBy(id="add-to-cart-button")
WebElement AddToCart;
@FindBy(id="proceed-to-checkout-action")
WebElement buy;
public void Add_to_cart()
{
	AddToCart.click();	
}
public void buyItems()
{
	buy.click();	
}
public  productiondesc (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}

