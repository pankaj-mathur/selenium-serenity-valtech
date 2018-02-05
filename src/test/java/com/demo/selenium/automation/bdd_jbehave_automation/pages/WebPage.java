package com.demo.selenium.automation.bdd_jbehave_automation.pages;

import com.jcabi.aspects.Loggable;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.valtech.com")
public class WebPage extends PageObject {

    @FindBy(name="search")
    private WebElementFacade searchTerms;

    @Loggable(Loggable.INFO)
	public boolean isSectionPresent() {
		if (searchTerms.isDisplayed())
			return true;
		else
			return false;
	}
}