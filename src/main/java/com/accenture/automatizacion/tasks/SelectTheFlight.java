package com.accenture.automatizacion.tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.accenture.automatizacion.userinterfaces.DespegarFlightsPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SelectTheFlight implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				WaitUntil.the(DespegarFlightsPage.SELECT_FIRST_FLIGHT,isVisible()),
				Click.on(DespegarFlightsPage.SELECT_FIRST_FLIGHT)
				);
		
	}

	public static SelectTheFlight at() {
		return instrumented(SelectTheFlight.class);
	}

}
