package domain;

/**
 * Created by Clemencio Morales Lucas on 06/12/2016.
 */
public class LaxPasswordValidator extends PasswordValidator {

    private static final String LAX_PASSWORD = REGEX_START + MUST_CONTAIN_ONE_LOWERCASE_CHAR +
            MUST_MATCH_ANYTHING_PREVIOUSLY_CHECKED + MUST_MAINTAIN_LENGTH_AT_LEAST_6_MAXIMUM_20_CHARS + REGEX_STOP;

    public LaxPasswordValidator() {
        super(LAX_PASSWORD);
    }
}
