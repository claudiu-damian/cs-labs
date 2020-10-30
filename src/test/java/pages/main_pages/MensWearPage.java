package pages.main_pages;

import component.BasePage;
import component.main_components.CartComponent;
import component.main_components.ProductPageComponent;
import component.main_components.ProductsComponent;

import java.util.*;

import static utils.CollectionsUtil.*;
import static utils.DriverHelperUtil.waitForPage;

public class MensWearPage extends BasePage {
    private ProductsComponent productsComponent;
    private CartComponent cartComponent;
    private ProductPageComponent productPageComponent;

    public void addProductToCart(String title) {
        productsComponent.addToCartByTitle(title);
    }

    public void changeQuantityOfProduct(String quantity) {
        cartComponent.changeQuantity(quantity);
    }

    public String getMessage() {
        return cartComponent.getWarningText();
    }

    public void hoverByTitle(String title) {
        productsComponent.hoverByTitle(title);
    }

    public boolean isViewButtonPresentFor(String title) {
        return productsComponent.isViewButtonDisplayed(title);
    }

    public void selectSortingOption(String title) {
        productPageComponent.clickSortBy();
        productPageComponent.selectOption(title);
    }

    public boolean areTitlesOrdered(String order) {
        waitForPage();
        HashMap<Integer, String> sortedMapByKey = sortMapByKey(productsComponent.getTitles());
        List<String> valuesList = getListFromMap(sortedMapByKey);
        return isStringListOrdered(valuesList, order);
    }

    public boolean arePricesOrdered(String order) {
        waitForPage();
        HashMap<Integer, Double> sortedMapByKey = sortMapByKey(productsComponent.getPrices());
        List<Double> valuesList = getListFromMap(sortedMapByKey);
        return isDoubleListOrdered(valuesList, order);
    }
}
