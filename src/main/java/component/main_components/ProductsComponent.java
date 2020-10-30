package component.main_components;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

import static utils.TextUtils.getDoubleFromString;
import static utils.TextUtils.getIntegerFromString;

@FindBy(className = "single-pro")
public class ProductsComponent extends HtmlElement {
    private List<ProductComponent> productComponentList;

    public void addToCartByTitle(String title) {
        productComponentList.stream()
                .filter(product -> product.getTitle().equalsIgnoreCase(title))
                .findAny()
                .orElseThrow(() -> new NoSuchElementException(String.format("No such product with title: %s", title)))
                .addToCart();
    }

    public void hoverByTitle(String title) {
        productComponentList.stream()
                .filter(product -> product.getTitle().equalsIgnoreCase(title))
                .findAny()
                .orElseThrow(() -> new NoSuchElementException(String.format("No such product with title: %s", title)))
                .hoverImage();
    }

    public boolean isViewButtonDisplayed(String title) {
        return productComponentList.stream()
                .filter(product -> product.getTitle().equalsIgnoreCase(title))
                .findAny()
                .orElseThrow(() -> new NoSuchElementException(String.format("No such product with title: %s", title)))
                .isViewProductDisplayed();
    }

    public HashMap<Integer, String> getTitles() {
        HashMap<Integer, String> titles = new HashMap<>();
        productComponentList.forEach(productComponent ->
                titles.put(getIntegerFromString(productComponent.getAttribute("style")),
                productComponent.getTitle()));
        return titles;
    }

    public HashMap<Integer, Double> getPrices() {
        HashMap<Integer, Double> prices = new HashMap<>();
        productComponentList.forEach(productComponent ->
                prices.put(getIntegerFromString(productComponent.getAttribute("style")),
                        getDoubleFromString(productComponent.getPrice())));
        return prices;
    }
}
