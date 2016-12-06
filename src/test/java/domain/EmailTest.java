package domain;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by Clemencio Morales Lucas on 06/12/2016.
 */
public class EmailTest {

    private Email email;

    private static final String VALID_ADDRESS = "mail@clemenciomorales.com";
    private static final String VALID_PASSWORD = "paSSW0rD";
    private static final String OTHER_VALID_ADDRESS = "carlos.morales@alumnos.upm.es";
    private static final String OTHER_VALID_PASSWORD = "an0ther_P4swD";

    private static final String INVALID_ADDRESS = "mailclemenciomorales.com";
    private static final String INVALID_PASSWORD = "pswd";

    @BeforeMethod
    public void setUp(){
        this.email = new Email(VALID_ADDRESS, VALID_PASSWORD);
    }

    @Test(expectedExceptions = {IllegalArgumentException.class}, expectedExceptionsMessageRegExp =
            Email.INVALID_EMAIL + INVALID_ADDRESS)
    public void shouldThrowIllegalArgumentExceptionWhenInvalidAddress() {
        this.email.setAddress(INVALID_ADDRESS);
    }

    @Test(expectedExceptions = {IllegalArgumentException.class}, expectedExceptionsMessageRegExp =
            PasswordValidator.INVALID_PASSWORD)
    public void shouldThrowIllegalArgumentExceptionWhenInvalidPassword() {
        this.email.setPassword(INVALID_PASSWORD);
    }

    @Test
    public void testEmailsWithSameAddressAreEquals(){
        final Email sameEmail = new Email(VALID_ADDRESS, OTHER_VALID_PASSWORD);
        assertTrue(this.email.equals(sameEmail));
        assertTrue(this.email.hashCode() == sameEmail.hashCode());
        sameEmail.setAddress(OTHER_VALID_ADDRESS);
        assertFalse(this.email.equals(sameEmail));
    }

}