package definitions.main_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.main_pages.MainPage;

public class MainPageDefinition {
    private final MainPage mainPage = new MainPage();

    @Given("^I enter website (.*?)$")
    public void enterWebsite(String url) {
        mainPage.enterWebsite(url);
    }

    @When("^I select section (.*?)$")
    public void selectSection(String section) {
        mainPage.enterSection(section);
    }

    @When("^I enter the dropdown section (.*?)$")
    public void selectDropdownSection(String title) {
        mainPage.enterDropdownSection(title);
    }
}
