package com.accenture.automatizacion.tasks;

import org.openqa.selenium.Keys;

import com.accenture.automatizacion.userinterfaces.DespegarTravelerForm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillTravelerForm implements Task {

	private String name;
	private String lastName;
	private String idNumber;
	private String areaCode;
	private String phoneNumber;
	private String email;
	
	public FillTravelerForm(String name, String lastName, String idNumber, String areaCode,
			String phoneNumber, String email) {
		this.name = name;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.areaCode = areaCode;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("pay method 1");
		actor.attemptsTo(
				//WaitUntil.the(DespegarTravelerForm.PAY_METHOD,isVisible()),
				Click.on(DespegarTravelerForm.PAY_METHOD),
				Click.on(DespegarTravelerForm.PAY_BANK),
				Click.on(DespegarTravelerForm.PAY_BANK_OPTION),
				
				Click.on(DespegarTravelerForm.NAME_RECEIPT),
				Enter.theValue(name).into(DespegarTravelerForm.NAME_RECEIPT).thenHit(Keys.TAB),
				Enter.theValue(lastName).into(DespegarTravelerForm.LAST_NAME_RECEIPT).thenHit(Keys.TAB).thenHit(Keys.TAB),
				Enter.theValue(idNumber).into(DespegarTravelerForm.ID_NUMBER_RECEIPT).thenHit(Keys.TAB).thenHit(Keys.TAB).thenHit(Keys.TAB).thenHit(Keys.TAB),
				//Enter.theValue(address).into(DespegarTravelerForm.ADDRESS_RECEIPT).thenHit(Keys.TAB),
				
				//Click.on(DespegarTravelerForm.NAME_TRAVELER),
				Enter.theValue(name).into(DespegarTravelerForm.NAME_TRAVELER).thenHit(Keys.TAB),
				Enter.theValue(lastName).into(DespegarTravelerForm.LAST_NAME_TRAVELER),
				Click.on(DespegarTravelerForm.ID_NUMBER_TRAVELER),
				Enter.theValue(idNumber).into(DespegarTravelerForm.ID_NUMBER_TRAVELER).thenHit(Keys.TAB),
				
				Enter.theValue(email).into(DespegarTravelerForm.EMAIL_VOUCHER).thenHit(Keys.TAB),
				Enter.theValue(email).into(DespegarTravelerForm.CONFIRM_EMAIL_VOUCHER).thenHit(Keys.TAB),
				
				Click.on(DespegarTravelerForm.AREA_CODE_CONTACT),
				Enter.theValue(areaCode).into(DespegarTravelerForm.AREA_CODE_CONTACT).thenHit(Keys.TAB),
				Enter.theValue(phoneNumber).into(DespegarTravelerForm.PHONE_NUMBER_CONTACT)				
					
				);
				
		System.out.println("Fin Fill traveler form");
		
	}
	

	public static FillTravelerForm at(String name, String lastName, String idNumber, String areaCode,
			String phoneNumber, String email) {
		return instrumented(FillTravelerForm.class, name, lastName,idNumber,areaCode,phoneNumber,email);
	}


}
