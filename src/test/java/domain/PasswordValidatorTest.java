package domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Clemencio Morales Lucas on 06/12/2016.
 */
public abstract class PasswordValidatorTest {

    PasswordValidator laxPasswordValidator;
    PasswordValidator rigorousPasswordValidator;

    final String INVALID_PASSWORD_PROVIDER = "invalid-passwords";
    final String VALID_PASSWORD_PROVIDER = "valid-passwords";

    @Before
    public void setUp() throws Exception {
//        laxPasswordValidator = new LaxPasswordValidator();
//        rigorousPasswordValidator = new RigorousPasswordValidator();
    }
}