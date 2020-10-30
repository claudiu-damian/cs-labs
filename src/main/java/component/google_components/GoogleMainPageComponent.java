package component.google_components;


import component.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

@FindBy(id = "viewport")
public class GoogleMainPageComponent extends BasePage {
    @FindBy(css = "[alt='Google']")
    private Button logo;

    @FindBy(className = "gLFyf")
    private TextInput searchBox;

    public void enterText(String text) {
        searchBox.sendKeys(text);
    }

    public void searchText() {
        searchBox.sendKeys(Keys.ENTER);
    }
}
