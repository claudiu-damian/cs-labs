package pages.pages_google;

import component.google_components.GoogleMainPageComponent;
import component.google_components.SuggestionsComponent;
import pages.main_pages.MainPage;

public class GoogleMainPage extends MainPage {
    private GoogleMainPageComponent mainPageComponent;
    private SuggestionsComponent suggestionsComponent;

    public void searchFor(String text) {
        mainPageComponent.enterText(text);
        mainPageComponent.searchText();
    }

    public void typeInSearch(String text) {
        mainPageComponent.enterText(text);
    }

    public boolean areSuggestionsSimilarToSearchText(String text) {
        return suggestionsComponent.isTextInList(text);
    }
}
