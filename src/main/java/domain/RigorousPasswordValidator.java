package domain;

/**
 * Created by Clemencio Morales Lucas on 06/12/2016.
 */
public class RigorousPasswordValidator extends PasswordValidator {

    private static final String RIGOROUS_PASSWORD = REGEX_START + MUST_CONTAIN_ONE_DIGIT_FROM_ZERO_TO_NINE +
            MUST_CONTAIN_ONE_LOWERCASE_CHAR + MUST_CONTAIN_ONE_UPPERCASE_CHAR + MUST_CONTAIN_ONE_SPECIAL_SYMBOL +
            MUST_MATCH_ANYTHING_PREVIOUSLY_CHECKED + MUST_MAINTAIN_LENGTH_AT_LEAST_8_MAXIMUM_20_CHARS + REGEX_STOP;

    public RigorousPasswordValidator() {
        super(RIGOROUS_PASSWORD);
    }
}
