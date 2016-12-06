package domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Clemencio Morales Lucas on 06/12/2016.
 */

public abstract class PasswordValidator {

    private Pattern pattern;
    private Matcher matcher;
    protected static final String INVALID_PASSWORD = "Invalid password";

    /* Password rules, must start with REGEX_START and end with REGEX_STOP */
    protected static final String REGEX_START = "(";
    protected static final String MUST_CONTAIN_ONE_DIGIT_FROM_ZERO_TO_NINE = "(?=.*\\d)";
    protected static final String MUST_CONTAIN_ONE_LOWERCASE_CHAR = "(?=.*[a-z])";
    protected static final String MUST_CONTAIN_ONE_UPPERCASE_CHAR = "(?=.*[A-Z])";
    protected static final String MUST_CONTAIN_ONE_SPECIAL_SYMBOL = "(?=.*[@#$%])";
    protected static final String MUST_MATCH_ANYTHING_PREVIOUSLY_CHECKED = ".";
    protected static final String MUST_MAINTAIN_LENGTH_AT_LEAST_8_MAXIMUM_20_CHARS = "{8,20}";
    protected static final String MUST_MAINTAIN_LENGTH_AT_LEAST_6_MAXIMUM_20_CHARS = "{6,20}";
    protected static final String REGEX_STOP = ")";

    protected PasswordValidator(final String passwordPattern){
        pattern = Pattern.compile(passwordPattern);
    }

    public boolean validate(final String password){
        matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
