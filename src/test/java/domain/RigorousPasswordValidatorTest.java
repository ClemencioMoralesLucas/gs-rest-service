package domain;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by clemen on 7/12/16.
 */
public class RigorousPasswordValidatorTest {

    private static final String INVALID_PASSWORD_1 = "REVOLVER_OCELOT_VS_SOLID_SNAKE";
    private static final String INVALID_PASSWORD_2 = "Revolver";
    private static final String INVALID_PASSWORD_3 = "vulca2";
    private static final String INVALID_PASSWORD_4 = "1VULCAN1";
    private static final String INVALID_PASSWORD_5 = "111";
    private static final String INVALID_PASSWORD_6 = "@";
    private static final String INVALID_PASSWORD_7 = "€#~½¬{¬";
    private static final String INVALID_PASSWORD_8 = "ThisIsAnInvalidPwd";
    private static final String INVALID_PASSWORD_9 = StringUtils.EMPTY;
    private static final String INVALID_PASSWORD_10 = "This1is1a#massiveAndStrongButInvalidPswd ";

    private static final String VALID_PASSWORD_1 = "SolidSnake#1";
    private static final String VALID_PASSWORD_2 = "VULC4NeR~V€N";
    private static final String VALID_PASSWORD_3 = "SsSn1p€rW00Lf";
    private static final String VALID_PASSWORD_4 = "333Sni€Rwlf";
    private static final String VALID_PASSWORD_5 = "OCELoT#celOT9";
    private static final String VALID_PASSWORD_6 = "Pshyc8@_Manti$";
    private static final String VALID_PASSWORD_7 = "LIQU1D_$n4K€";
    private static final String VALID_PASSWORD_8 = "DecoY%ctopus2";
    private static final String VALID_PASSWORD_9 = "Vul4nR4vn~@";
    private static final String VALID_PASSWORD_10 = "l4stPa$$word.1";

    private static final String INVALID_PASSWORD_PROVIDER = "invalid-passwords";
    private static final String VALID_PASSWORD_PROVIDER = "valid-passwords";

    @Test(expectedExceptions = {IllegalArgumentException.class},
            expectedExceptionsMessageRegExp = PasswordValidator.INVALID_PASSWORD,
            dataProvider = INVALID_PASSWORD_PROVIDER)
    public void testInvalidPasswords(String password) throws Exception {
        new RigorousPasswordValidator(password);
    }

    @DataProvider(name = INVALID_PASSWORD_PROVIDER)
    public Object[][] getInvalidPasswords() {
        return new String[][]{
                {INVALID_PASSWORD_1}, {INVALID_PASSWORD_2}, {INVALID_PASSWORD_3},
                {INVALID_PASSWORD_4}, {INVALID_PASSWORD_5}, {INVALID_PASSWORD_6},
                {INVALID_PASSWORD_7}, {INVALID_PASSWORD_8}, {INVALID_PASSWORD_9},
                {INVALID_PASSWORD_10}
        };
    }

    @Test(dataProvider = VALID_PASSWORD_PROVIDER)
    public void testValidPasswordsDoNotThrowException(String password) throws Exception {
        new RigorousPasswordValidator(password);
    }

    @DataProvider(name = VALID_PASSWORD_PROVIDER)
    public Object[][] getValidPasswords() {
        return new String[][]{
                {VALID_PASSWORD_1}, {VALID_PASSWORD_2}, {VALID_PASSWORD_3},
                {VALID_PASSWORD_4}, {VALID_PASSWORD_5}, {VALID_PASSWORD_6},
                {VALID_PASSWORD_7}, {VALID_PASSWORD_8}, {VALID_PASSWORD_9},
                {VALID_PASSWORD_10}
        };
    }
}