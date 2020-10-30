package definitions.definition_google;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.pages_google.GoogleMainPage;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleMainPageDefinition {
    private final GoogleMainPage googleMainPage = new GoogleMainPage();

    @When("^I search for (.*?)$")
    public void search(String text) {
        googleMainPage.searchFor(text);
    }

    @When("^I type in search (.*?)$")
    public void typeInSearch(String text) {
        googleMainPage.typeInSearch(text);
    }

    @Then("^I get suggestions with (.*?)$")
    public void doIGetSuggestionWith(String text) {
        assertThat(googleMainPage.areSuggestionsSimilarToSearchText(text)).isTrue();
    }
}
