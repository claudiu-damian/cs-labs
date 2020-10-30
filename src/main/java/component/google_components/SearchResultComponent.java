package component.google_components;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextBlock;

@FindBy(className = "rc")
public class SearchResultComponent extends HtmlElement {
    @FindBy(className = "yuRUbf")
    private TextBlock title;

    @FindBy(className = "aCOpRe")
    private TextBlock description;

    public String getTitle() {
        return title.getText();
    }

    public String getDescription() {
        return description.getText();
    }
}
