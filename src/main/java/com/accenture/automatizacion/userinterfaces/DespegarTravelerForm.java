package com.accenture.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DespegarTravelerForm {
	/*Pay*/
	public static final Target PAY_METHOD = Target.the("payMethod").locatedBy("//span[contains(text(),'PSE')]");
	public static final Target PAY_BANK = Target.the("payBank").locatedBy("//select[@id='card-selector-0']");
	public static final Target PAY_BANK_OPTION = Target.the("payBankOption").locatedBy("//option[contains(text(),'Banco de Bogotá')]");
	
	/*Receipt data*/
	public static final Target NAME_RECEIPT = Target.the("nameReceipt").locatedBy("//input[@id='invoice-first-name-0']");
	public static final Target LAST_NAME_RECEIPT = Target.the("lastNameReceipt").locatedBy("//input[@id='invoice-last-name-0']");
	public static final Target ID_NUMBER_RECEIPT = Target.the("idNumberReceipt").locatedBy("//input[@id='invoice-fiscal-identification-number-0']");
	public static final Target ADDRESS_RECEIPT = Target.the("addressReceipt").locatedBy("//input[@id='0telbs0fgia94lc6nr6fihl']");
	/*Traveler data*/
	public static final Target NAME_TRAVELER = Target.the("nameTraveler").locatedBy("//traveler-first-name-input//div[@class='input-container']/input");
	//public static final Target LAST_NAME_TRAVELER = Target.the("lastNameTraveler").locatedBy("//*[@placeholder='Como figura en el documento de viaje'][@class='input-tag traveler-last-name ng-pristine ng-invalid ng-touched']");
	public static final Target LAST_NAME_TRAVELER = Target.the("lastNameTraveler").locatedBy("//*[@placeholder='Como figura en el documento de viaje'][@class='input-tag traveler-last-name ng-untouched ng-pristine ng-invalid']");
	
	public static final Target ID_NUMBER_TRAVELER = Target.the("idNumberTraveler").locatedBy("//div[@class='form-element col -sm-10']//div[@class='input-container']/input");
	/*Voucher*/
	public static final Target EMAIL_VOUCHER = Target.the("emailVoucher").locatedBy("//*[@placeholder='Ingresa el email de contacto']");
	public static final Target CONFIRM_EMAIL_VOUCHER = Target.the("confirmEmailVoucher").locatedBy("//*[@placeholder='Ingresa tu email']");
	/*Contact*/
	public static final Target AREA_CODE_CONTACT = Target.the("areaCodeContact").locatedBy("//*[@placeholder='Ingresa un código de área']");
	public static final Target PHONE_NUMBER_CONTACT = Target.the("phoneNumberContact").locatedBy("//*[@placeholder='Ingresa un número']");
	/*Confirm data traveler*/
	public static final Target NAME_CONFIRM = Target.the("nameConfirm").locatedBy("///div[@class='traveler']//div[1]/span");
	public static final Target LAST_NAME_CONFIRM = Target.the("lastNameConfirm").locatedBy("//buy-component[@class='ng-invalid ng-touched ng-dirty']//ul//div[2]/span");
	public static final Target ID_NUMBER_CONFIRM = Target.the("idNumberConfirm").locatedBy("//ul//div[3]//span[1]");
	
}
