package co.com.googlepom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.BasePage;

public class BuscarEnGooglePom {
	private WebDriver driver;
	private BasePage basePage;
	private By inputBuscar = By.xpath("//input[@title='Buscar']");
	private By btnBuscar = By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Buscar con Google']");
	
	public BuscarEnGooglePom(WebDriver driver) {
		this.driver = driver;
		basePage = new BasePage(driver);
	}
	
	public void EscribirElTextoABuscar(String cadenaBuscar) {
		basePage.writeText(inputBuscar, cadenaBuscar);
	}
	
	public void DarClickBotonBuscar() {
		basePage.submit(btnBuscar);
	}
}
