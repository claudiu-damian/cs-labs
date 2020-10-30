package component.main_components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextBlock;

import static utils.ActionUtil.hover;

@FindBy(className = "product-men")
public class ProductComponent extends HtmlElement {
    @FindBy(className = "item_price")
    private TextBlock price;

    @FindBy(css = ".item-info-product h4")
    private TextBlock title;

    @FindBy(className = "button")
    private Button addToCartButton;

    @FindBy(className = "men-thumb-item")
    private WebElement productImage;

    @FindBy(className = "link-product-add-cart")
    private Button viewProduct;

    public String getTitle() {
        return title.getText();
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public boolean isViewProductDisplayed() {
        return viewProduct.isDisplayed();
    }

    public void hoverImage() {
        hover(productImage);
    }

    public String getPrice() {
        return price.getText();
    }
}
