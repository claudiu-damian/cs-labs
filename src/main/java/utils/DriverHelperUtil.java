package utils;

import lombok.extern.log4j.Log4j2;

import static utils.InitializationUtil.getDriver;

@Log4j2
public class DriverHelperUtil {
    public static void waitForPage() {
        log.info("Waiting for the page to be loaded");
        boolean stillChanging = true;
        String previous = "";
        String current;
        while (stillChanging) {
            current = getDriver().getPageSource();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                log.error("Catch InterruptedException: " + e);
            }
            stillChanging = (!previous.equals(current));
            previous = current;
        }
    }
}
