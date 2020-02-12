package autom4.Wowhead;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageResultats {

	@FindBy (xpath=" //td[@class='icon-boss-padded']/a[contains(.,'Lardeur')]")
	private WebElement lien_Lardeur;
	
	public PagePNJ ClicLardeur(WebDriver driver) {
		lien_Lardeur.click();
		return PageFactory.initElements(driver, PagePNJ.class);
	}
	
}
