package amz_source;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class homepage 
{
WebDriver driver;
@FindBy(id="twotabsearchtextbox")
WebElement search;
@FindBy(xpath="//img[@data-image-index='1'][1]")
WebElement item;

public void itemsearch()
{
	search.sendKeys("Shoes");
	search.sendKeys(Keys.ENTER);
}
public void selectitem()
{
	item.sendKeys(Keys.ENTER);
}
public  homepage (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}

