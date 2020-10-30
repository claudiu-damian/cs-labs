package pages.main_pages;

import component.BasePage;
import component.main_components.MenuComponent;
import component.main_components.MenuDropdownComponent;

import static utils.DriverHelperUtil.waitForPage;

public class MainPage extends BasePage {
    private MenuComponent menuComponent;
    private MenuDropdownComponent menuDropdownComponent;

    public void enterSection(String title) {
        menuComponent.clickOnMenuItem(title);
    }

    public void enterDropdownSection(String title) {
        waitForPage();
        menuDropdownComponent.selectSectionByTitle(title);
    }

    public void enterWebsite(String url) {
        driver.get(url);
    }
}
