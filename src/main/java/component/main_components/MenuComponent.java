package component.main_components;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;
import java.util.NoSuchElementException;

@FindBy(className = "menu--shylock")
public class MenuComponent extends HtmlElement {
    @FindBy(className = "menu__item")
    private Button menuItem;

    private List<MenuItemComponent> menuItemComponentList;

    public void clickOnMenuItem(String title) {
        menuItemComponentList.stream()
                .filter(item -> item.getTitle().equalsIgnoreCase(title))
                .findAny()
                .orElseThrow(() -> new NoSuchElementException("No such section in the menu"))
                .click();
    }
}
