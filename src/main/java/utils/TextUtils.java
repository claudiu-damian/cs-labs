package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextUtils {
    public static Integer getIntegerFromString(String text) {
        return Integer.valueOf(text.replaceAll("[^0-9]", ""));
    }

    public static Double getDoubleFromString(String text) {
        double d = 0.0;
        Matcher m = Pattern.compile("(?!=\\d\\.\\d\\.)([\\d.]+)").matcher(text);
        while (m.find())
        {
            d = Double.parseDouble(m.group(1));
        }
        return d;
    }
}
