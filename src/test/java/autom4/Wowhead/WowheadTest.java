package autom4.Wowhead;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;



import org.junit.Test;

public class WowheadTest {

	WebDriver driver = new FirefoxDriver();
	String recherche = "Lardeur";
	String item1 = "Chahuteurs de cadavre";
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://fr.wowhead.com/");
		driver.manage().window().maximize();
		PageAccueil pageAccueil = PageFactory.initElements(driver, PageAccueil.class);
		
		//Clic sur le bouton 'Accept Cookies'
		pageAccueil.ClicBoutonAcceptCookies();
		PageResultats pageResultats = pageAccueil.RechercheSurSite(driver, recherche);
		Thread.sleep(5000);
		PagePNJ pagePNJ = pageResultats.ClicLardeur(driver);
		PageItem pageItem = pagePNJ.ClicObjet(driver, item1);
		
		
	}
	
}
