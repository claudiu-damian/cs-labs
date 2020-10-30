package component.google_components;

import component.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
@FindBy(id = "center_col")
public class SearchPageComponent extends BasePage {
    @FindBy(css = "[class='gL9Hy']")
    private WebElement correction;

    private List<SearchResultComponent> searchResultComponents;

    public boolean doesResultTitleContain(String text) {
        return searchResultComponents.stream()
                .anyMatch(d -> d.getTitle().contains(text));
    }

    public boolean doesDescriptionContain(String text) {
        return searchResultComponents.stream()
                .anyMatch(result -> result.getDescription().contains(text));
    }

    public void selectCorrection() {
        correction.click();
    }

    public boolean isResultNull() {
        return searchResultComponents.isEmpty();
    }
}
