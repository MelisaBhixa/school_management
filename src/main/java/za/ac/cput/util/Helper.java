package za.ac.cput.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.routines.EmailValidator;

public class Helper {

    public static void isValidEmail(String email){
        EmailValidator validator = EmailValidator.getInstance();
        if (validator.isValid(email)) {

        } else {
            throw new IllegalArgumentException("Invalid email address provided");
        }
    }
    public static void isObjectNull(Object object){
        if (object == null)
            throw new NullPointerException("Object is of Null value");
    }
    public static boolean isEmptyOrNull(String string){
        return StringUtils.isEmpty(string);
    }

    public static String setEmptyIfNull(String string){
        if (isEmptyOrNull(string))
            return StringUtils.EMPTY;
        return string;
    }

    public static void checkStringParam(String paramName, String paramValue){
        if (isEmptyOrNull(paramValue))
            throw new IllegalArgumentException(String.format("Invalid value for param: %s", paramName));
    }
}
