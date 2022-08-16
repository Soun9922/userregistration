import java.util.regex.Pattern;

public class UserRegistration {

    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    public boolean validateFirstName(String fName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return Pattern.matches(NAME_PATTERN, fName);
    }
}
