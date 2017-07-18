package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static boolean isEmpty(String value) {
        return value == null || "".equals(value);
    }

    public static boolean isEmail(String email) {
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isNumber(String number) {
        try {
            int a = Integer.parseInt(number);
            return a > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
