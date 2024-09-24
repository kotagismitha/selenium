package proj1_src_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage 
{
WebDriver driver;
@FindBy(id="twotabsearchtextbox")
WebElement search;
@FindBy(id="nav-search-submit-button")
WebElement iconsearch;
//@FindBy(xpath="//div [@class='a-section aok-relative s-image-square-aspect']")
//WebElement firstitem;
@FindBy(id="a-autoid-1-announce")
WebElement add2cart;
@FindBy(linkText="Go to Cart")
WebElement cart;
public void itemsearch()
{
	search.sendKeys("Decor");
}
public void searchicon()
{
	iconsearch.click();
}
//public void Itemselection()
//{
//	firstitem.click();
//}
public void addcart()
{
	add2cart.click();
}
public void goTocart()
{
	cart.click();
}

public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
