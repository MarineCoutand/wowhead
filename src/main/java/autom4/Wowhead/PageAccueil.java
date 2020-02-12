package autom4.Wowhead;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PageAccueil {

	@FindBy(xpath = "//button[contains(.,'Accept and Continue')]")
	private WebElement bouton_acceptCookies;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement barreRecherche;
	
	public void ClicBoutonAcceptCookies() {
		bouton_acceptCookies.click();
	}
	
	public PageResultats RechercheSurSite(WebDriver driver, String recherche) {
		barreRecherche.clear();
		barreRecherche.sendKeys(recherche);
		barreRecherche.submit();
		return PageFactory.initElements(driver, PageResultats.class);
	}
	
}
