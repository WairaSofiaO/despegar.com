package com.accenture.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DespegarFlightsPage {
	public static final Target CITY_OF_ORIGIN = Target.the("OriginCity").locatedBy("//div[@class='sbox-3-input -md sbox-3-validation -top-right -icon-left sbox-origin-container places-inline sbox-bind-error-flight-roundtrip-origin-empty']//input[@placeholder='Ingresa desde dónde viajas']");
	public static final Target LAST_SEARCHES = Target.the("LastSearches").locatedBy("//span[@class='ac-group-title eva-3-overline-2']");
	public static final Target CITY_OF_DESTINATION = Target.the("Destination").locatedBy("//div[@class='sbox-3-input -md sbox-3-validation -top-right -icon-left sbox-destination-container sbox-bind-error-flight-roundtrip-destination-empty sbox-bind-error-flight-roundtrip-equal-destination']//input[@placeholder='Ingresa hacia dónde viajas']");
	public static final Target GOING = Target.the("Going").locatedBy("//div[@class='input-container sbox-bind-event-click-start-date']//input[@placeholder='Ida']");
	public static final Target SCHEDULE = Target.the("Schedule").locatedBy("//div[@class='_dpmg2--controlsWrapper']");
	public static final Target DATE_GOING = Target.the("DateGoing").locatedBy("/html/body/div[4]/div/div[5]/div[2]/div[4]/span[25]/span[1]");
	public static final Target RETURN = Target.the("Return").locatedBy("//div[@class='input-container sbox-bind-event-click-end-date']/input[@placeholder='Vuelta']");
	public static final Target DATE_RETURN = Target.the("DateReturn").locatedBy("/html/body/div[4]/div/div[5]/div[2]/div[4]/span[25]/span[1]");
	public static final Target SEARCH = Target.the("Search").locatedBy("//div[@class='sbox-button -ml3-l -mt5-l']//a[@class='sbox-3-btn -primary -md sbox-search']");
	public static final Target SELECT_FIRST_FLIGHT = Target.the("SelectFirstFlight").locatedBy("//span[1]//span[1]//cluster[1]//div[1]//div[1]//div[2]//fare[1]//span[1]//span[1]//div[1]//buy-button[1]//a[1]");

}

