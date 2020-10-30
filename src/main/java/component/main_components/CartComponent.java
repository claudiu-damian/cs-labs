package component.main_components;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.element.TextInput;

import static utils.JavascriptExecutorUtil.getValidationMessage;

@FindBy(className = "minicart-item-changed")
public class CartComponent extends HtmlElement {
    @FindBy(className = "minicart-details-name")
    private TextBlock itemTitle;

    @FindBy(className = "minicart-quantity")
    private TextInput quantity;

    public void changeQuantity(String newQuantity) {
        quantity.clear();
        quantity.sendKeys(newQuantity);
        quantity.sendKeys(Keys.ENTER);
    }

    public String getWarningText() {
        return getValidationMessage(quantity);
    }
}
