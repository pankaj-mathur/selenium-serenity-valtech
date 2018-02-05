package com.demo.selenium.automation.bdd_jbehave_automation.steps.serenity;

import static org.junit.Assert.assertTrue;

import com.demo.selenium.automation.bdd_jbehave_automation.pages.WebPage;
import com.jcabi.aspects.Loggable;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EndUserSteps extends ScenarioSteps{

    /**
	 * 
	 */
	private static final long serialVersionUID = -2863126367800874621L;
	WebPage webPage;

	@Loggable(Loggable.INFO)
    @Step
    public void is_the_home_page() {
        webPage.open();
    }

	@Loggable(Loggable.INFO)
    @Step
    public void theHomePageIsLoaded() {
    	webPage.open();
	}

	@Loggable(Loggable.INFO)
    @Step
	public void assertThatLatestNewsSectionIsDisplayed() {
		assertTrue("News Section is not displayed", webPage.isSectionPresent());
	}

	@Loggable(Loggable.INFO)
    @Step
	public void userNavigatesToPageUrl(String aboutUrl) {
		webPage.openUrl(aboutUrl);
	}

	@Loggable(Loggable.INFO)
    @Step
	public void assertThatPageTitleIsDisplayed(String aboutTitle) {
		assertTrue("Page title does not match", webPage.getTitle().contentEquals(aboutTitle));
	}
}