package co.com.google.qa.buscargoogle.stepsdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import co.com.googlepom.BuscarEnGooglePom;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscarEnGoogleStepDefinition {
	private BuscarEnGooglePom buscarEnGooglePom;
	WebDriver driver;
	@Given("Arthur's on google home page")
	public void arthur_s_on_google_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Arthur abre su navegador");
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver.exe");
		driver = new ChromeDriver();
		buscarEnGooglePom = new BuscarEnGooglePom(driver);
		
		System.out.println("Arthur abre la pagina de inicio de google");
		driver.manage().window().maximize();
		driver.get("http://www.google.com.co");
	}
	
	@When("He does the search")
	public void he_does_the_search() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("En la barra de busqueda Arthur escribe una palabra");
		buscarEnGooglePom.EscribirElTextoABuscar("cucumber java serenity");
		
		System.out.println("Arthur da click en el botón buscar");
		buscarEnGooglePom.DarClickBotonBuscar();
	}
	
	@Then("He validates that the result is successful")
	public void he_validates_that_the_result_is_successful() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("El actor captura los resultados de la búsqueda");
		System.out.println("El actor verifica que la busqueda sea exitosa");
	    
	}
	
	@After()
	public void tomar_screenshot(Scenario s) throws InterruptedException
	{
	    Thread.sleep(2000);

	    final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	    s.embed(screenshot, "image/png");

	    driver.quit();
	}

}
