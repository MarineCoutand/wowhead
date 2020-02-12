package autom4.Wowhead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagePNJ {


	
	
	
	
	public PageItem ClicObjet(WebDriver driver, String objet) {
		WebElement lien_item = driver.findElement(By.xpath("//a[@class='q3 listview-cleartext'][contains(.,'" + objet + "')]"));
		lien_item.click();
		return PageFactory.initElements(driver, PageItem.class);
	}
	
}
