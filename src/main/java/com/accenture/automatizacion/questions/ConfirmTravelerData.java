package com.accenture.automatizacion.questions;

import com.accenture.automatizacion.userinterfaces.DespegarTravelerForm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ConfirmTravelerData implements Question<Boolean> {
		
	public static Question<Boolean> equals() {
		return new ConfirmTravelerData();
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		String nameConfirm= Text.of(DespegarTravelerForm.NAME_TRAVELER).viewedBy(actor).asString();
		String name= Text.of(DespegarTravelerForm.NAME_RECEIPT).viewedBy(actor).asString();
		
		return nameConfirm.equals(name);
	}

	public static ConfirmTravelerData at() {
		return new ConfirmTravelerData();
	}
}
