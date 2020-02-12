package autom4.Wowhead;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;



import org.junit.Test;

public class WowheadTest {

//	private WebDriver driver = new FirefoxDriver();
	private WebDriver driver;
	private String recherche = "Lardeur";
	private String item1 = "Chahuteurs";
	private String BROWSER=System.getProperty("browser");
	
	@Test
	public void test() throws InterruptedException {
		if(BROWSER=="Firefox") {
			driver = new FirefoxDriver();
		}else if(BROWSER=="Chrome"){
			driver = new ChromeDriver();
		}
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
