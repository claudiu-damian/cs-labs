package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static utils.InitializationUtil.getDriver;

public class JavascriptExecutorUtil {
    private static final WebDriver driver = getDriver();
    private static final JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

    public static String getValidationMessage(WebElement webElement) {
        return (String) javascriptExecutor.executeScript("return arguments[0].validationMessage;", webElement);
    }
}
