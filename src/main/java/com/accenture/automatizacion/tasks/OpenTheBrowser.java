package com.accenture.automatizacion.tasks;

import com.accenture.automatizacion.userinterfaces.DespegarFlightHome;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.PageObject;

public class OpenTheBrowser implements Task {
	PageObject page;
	
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		actor.wasAbleTo(Open.browserOn(page));
		
	}
	//Este metodo instancia la clase en el stepdefinition
	//este es un performable, y se substituye por el OpenTheBrowser que tambien
	//es un performable
	public static OpenTheBrowser on (DespegarFlightHome despegarHomePage) {
		return Tasks.instrumented(OpenTheBrowser.class, despegarHomePage);
	}
	

}
