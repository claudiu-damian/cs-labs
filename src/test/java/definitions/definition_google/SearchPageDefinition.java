package definitions.definition_google;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.pages_google.SearchPage;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchPageDefinition {
    private final SearchPage searchPage = new SearchPage();

    @When("I click on suggestion")
    public void clickSuggestion() {
        searchPage.selectCorrection();
    }

    @Then("result corresponds")
    public void doesResultCorrespond() {
        assertThat(searchPage.isResultPresent()).isTrue();
    }

    @Then("no results are displayed")
    public void isResultEmpty() {
        assertThat(searchPage.isResultNotPresent()).isTrue();
    }

    @Then("header is displayed")
    public void isHeaderPresent() {
        assertThat(searchPage.isHeaderDisplayed()).isTrue();
    }
}
