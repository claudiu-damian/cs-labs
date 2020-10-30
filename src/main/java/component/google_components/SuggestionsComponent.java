package component.google_components;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

@FindBy(className = "aajZCb")
public class SuggestionsComponent extends HtmlElement {
    private List<SuggestionComponent> suggestionComponents;

    public boolean isTextInList(String text) {
        return suggestionComponents.stream()
                .allMatch(result -> result.getText().contains(text));
    }
}
