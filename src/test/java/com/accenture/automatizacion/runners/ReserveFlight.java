package com.accenture.automatizacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features", 
glue = "com.accenture.automatizacion.stepdefinitions", 
snippets = SnippetType.CAMELCASE)

public class ReserveFlight {

}
