package com.demo.selenium.automation.bdd_jbehave_automation.pages;

import com.jcabi.aspects.Loggable;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.valtech.com")
public class WebPage extends PageObject {

    @FindBy(css="<h2 class=\\\"block-header__heading\\\">Latest news</h2>")
    private WebElementFacade newsSection;

    @Loggable(Loggable.INFO)
	public boolean isSectionPresent() {
		if (newsSection.isDisplayed())
			return true;
		else
			return false;
	}
}