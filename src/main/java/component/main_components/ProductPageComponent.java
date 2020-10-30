package component.main_components;

import component.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.htmlelements.element.Button;

import static utils.InitializationUtil.getDriver;

@FindBy(className = "banner-bootom-w3-agileits")
public class ProductPageComponent extends BasePage {
    @FindBy(id = "country1")
    private Button sortBy;

    private final By sortingOptions = By.cssSelector("#country1 option");

    public void clickSortBy() {
        sortBy.click();
    }

    public void selectOption(String title) {
        findElements(sortingOptions).stream()
                .filter(option -> option.getText().equalsIgnoreCase(title))
                .findAny()
                .orElseThrow(() -> new NoSuchElementException("No such sorting option: " + title))
                .click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.textToBePresentInElement(sortBy, title));
    }
}
