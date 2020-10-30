package component.main_components;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextBlock;

@FindBy(className = "menu__item")
public class MenuItemComponent extends HtmlElement {
    @FindBy(className = "menu__link")
    private TextBlock title;

    public String getTitle() {
        return title.getText().trim();
    }
}
