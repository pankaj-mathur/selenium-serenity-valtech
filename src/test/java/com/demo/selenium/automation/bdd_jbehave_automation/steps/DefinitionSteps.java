package com.demo.selenium.automation.bdd_jbehave_automation.steps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.demo.selenium.automation.bdd_jbehave_automation.steps.serenity.EndUserSteps;
import com.jcabi.aspects.Loggable;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Loggable(Loggable.INFO)
    @Given("the user opens home URL")
    public void givenTheUserIsOnTheHomePage() {
        endUser.is_the_home_page();
    }

    @Loggable(Loggable.INFO)
    @When("the home page is loaded")
    public void whenTheHomePageIsLoaded() {
        endUser.theHomePageIsLoaded();
    }

    @Loggable(Loggable.INFO)
    @Then("assert that Latest News section is displayed")
    public void thenAssertThatLatestNewsSectionIsDisplayed() {
        endUser.assertThatLatestNewsSectionIsDisplayed();
    }
    
    @Loggable(Loggable.INFO)
    @When("user navigates to page $aboutUrl")
    public void whenUserNavigatesToPageUrl(String aboutUrl) {
        endUser.userNavigatesToPageUrl(aboutUrl);
    }

    @Loggable(Loggable.INFO)
    @Then("assert that page title $aboutTitle is displayed")
    public void thenAssertThatPageTitleIsDisplayed(String aboutTitle) {
        endUser.assertThatPageTitleIsDisplayed(aboutTitle);
    }


}
