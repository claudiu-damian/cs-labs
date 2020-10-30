package definitions.main_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.main_pages.MensWearPage;

import static org.assertj.core.api.Assertions.assertThat;

public class MensWearDefinition {
    private final MensWearPage mensWearPage = new MensWearPage();

    @When("^I add to cart product (.*?)$")
    public void addToCart(String title) {
        mensWearPage.addProductToCart(title);
    }

    @When("^I change quantity to (.*?)$")
    public void changeQuantityTo(String quantity) {
        mensWearPage.changeQuantityOfProduct(quantity);
    }

    @When("^I hover product (.*?)$")
    public void hoverProduct(String title) {
        mensWearPage.hoverByTitle(title);
    }

    @When("^I select the sorting option (.*?)$")
    public void selectSortingOption(String option) {
        mensWearPage.selectSortingOption(option);
    }

    @Then("^I get the warning message (.*?)$")
    public void validateMessage(String expectedMessage) {
        assertThat(mensWearPage.getMessage()).isEqualTo(expectedMessage);
    }

    @Then("^the View button is displayed for product (.*?)$")
    public void isViewButtonDisplayed(String title) {
        assertThat(mensWearPage.isViewButtonPresentFor(title)).isTrue();
    }

    @Then("products are ordered by names (.*?)$")
    public void areProductsOrderedByNames(String order) {
        assertThat(mensWearPage.areTitlesOrdered(order)).isTrue();
    }

    @Then("products are ordered by prices (.*?)$")
    public void areProductsOrderedByPrices(String order) {
        assertThat(mensWearPage.arePricesOrdered(order)).isTrue();
    }
}
