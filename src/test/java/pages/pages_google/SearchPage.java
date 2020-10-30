package pages.pages_google;

import component.google_components.SearchPageComponent;
import org.openqa.selenium.By;
import pages.main_pages.MainPage;
import utils.ExecutionContext;

import static enums.context_keys.Data.SUGGESTION;

public class SearchPage extends MainPage {
    private SearchPageComponent searchPageComponent;

    public void selectCorrection() {
        ExecutionContext.put(SUGGESTION, searchPageComponent.getCorrection().getText());
        searchPageComponent.selectCorrection();
    }

    public boolean isResultPresent() {
        return searchPageComponent.doesDescriptionContain((String) ExecutionContext.get(SUGGESTION));
    }

    public boolean isResultNotPresent() {
        return searchPageComponent.isResultNull();
    }

    public boolean isHeaderDisplayed() {
        By header = By.cssSelector(".sfbg");
        return driver.findElement(header).isDisplayed();
    }
}
