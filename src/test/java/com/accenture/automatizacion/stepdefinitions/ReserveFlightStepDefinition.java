package com.accenture.automatizacion.stepdefinitions;


import org.openqa.selenium.WebDriver;
import com.accenture.automatizacion.tasks.SearchAFlight;
import com.accenture.automatizacion.tasks.SelectTheFlight;
import com.accenture.automatizacion.questions.ConfirmTravelerData;
import com.accenture.automatizacion.tasks.FillTravelerForm;
import com.accenture.automatizacion.tasks.OpenTheBrowser;
import com.accenture.automatizacion.userinterfaces.DespegarFlightHome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class ReserveFlightStepDefinition {
	
	//Instanciar Interfaces
	private DespegarFlightHome despegarFlightHome;
	//Instanciar el actor
	private Actor Sofia = Actor.named("Sofia");
	//Instanciar el WebDriver
	@Managed(driver = "chrome") 
	public WebDriver driver;
	
	@Before
	public void setUp() {
		Sofia.can(BrowseTheWeb.with(driver));
	}
			
	@Given("^the client that open despegar page$")
	public void theClientThatOpenDespegarPage(){
	    // Write code here that turns the phrase above into concrete actions
		Sofia.wasAbleTo(OpenTheBrowser.on(despegarFlightHome));
	}
	
	@When("^the client want to search a flight (.*) to (.*)$")
	public void theClientWantToSearchAFlightMedellinColombiaToBogota(String cityOrigin, String cityDestination) {
	    Sofia.attemptsTo(
	    		SearchAFlight.at(cityOrigin, cityDestination),
	    		SelectTheFlight.at()
	    		);
	}
	
	@When("^the client want to reserve the flight with her data (.*),(.*),(.*),(.*),(.*),(.*), in the traveler form$")
	public void theClientWantToReserveTheFlightWithHerDataWairaSofiaOcampoOrozcoWairaGmailComInTheTravelerForm(String name, String lastName,String idNumber, String areaCode, String phoneNumber,String email ) {
		Sofia.attemptsTo(
				FillTravelerForm.at(name,lastName,idNumber,areaCode,phoneNumber,email)
				);
	}

	@Then("^the client should confirm her data without buying the flight yet$")
	public void theClientShouldConfirmHerDataWithoutBuyingTheFlightYet() {
	    Sofia.should(seeThat(ConfirmTravelerData.at()));
	    
	}

}
