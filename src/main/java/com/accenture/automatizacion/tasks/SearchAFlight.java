package com.accenture.automatizacion.tasks;

import java.util.Properties;

import org.openqa.selenium.Keys;

import com.accenture.automatizacion.userinterfaces.DespegarFlightsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
/*Libreria WebElement*/
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchAFlight implements Task{
	private String cityDestination;
	private String cityOrigin;
	Properties prop = new Properties();

	public SearchAFlight(String cityOrigin,String cityDestination) {
		this.cityDestination=cityDestination;
		this.cityOrigin=cityOrigin;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(cityOrigin).into(DespegarFlightsPage.CITY_OF_ORIGIN),
				WaitUntil.the(DespegarFlightsPage.LAST_SEARCHES,isVisible())
				);
		DespegarFlightsPage.CITY_OF_ORIGIN.resolveFor(actor).sendKeys(Keys.ENTER);
		actor.attemptsTo(
				Enter.theValue(cityDestination).into(DespegarFlightsPage.CITY_OF_DESTINATION),
				WaitUntil.the(DespegarFlightsPage.LAST_SEARCHES,isVisible())
				);
		DespegarFlightsPage.CITY_OF_DESTINATION.resolveFor(actor).sendKeys(Keys.ENTER);	
		actor.attemptsTo(
				Click.on(DespegarFlightsPage.GOING),
				Click.on(DespegarFlightsPage.DATE_GOING),
				Click.on(DespegarFlightsPage.DATE_RETURN),
				Click.on(DespegarFlightsPage.SEARCH)
				);
	}

	public static SearchAFlight at(String cityOrigin, String cityDestination) {
		return instrumented(SearchAFlight.class, cityOrigin, cityDestination);
	}


}
