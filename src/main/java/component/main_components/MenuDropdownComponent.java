package component.main_components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import static utils.InitializationUtil.getDriver;

@FindBy(className = "dropdown-menu")
public class MenuDropdownComponent extends HtmlElement {
    @FindBy(className = "col-sm-3")
    private HtmlElement dropdownSection;

    public void selectSectionByTitle(String title) {
        WebElement element = getDriver().findElement(By.xpath(String.format("//*[text()='%s']", title)));
        element.click();
    }
}