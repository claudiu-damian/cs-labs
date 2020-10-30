package component.google_components;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextBlock;

@FindBy(className = ".erkvQe .sbct")
public class SuggestionComponent extends HtmlElement {
    @FindBy(className = "sbl1")
    private TextBlock text;

    @FindBy(className = "sbic")
    private HtmlElement searchIcon;

    public String getText() {
        return text.getText();
    }
}
