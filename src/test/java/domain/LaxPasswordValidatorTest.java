package domain;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by clemen on 7/12/16.
 */
public class LaxPasswordValidatorTest extends PasswordValidatorTest {

    private static final String INVALID_PASSWORD_1 = "REVOLVER_OCELOT_VS_SOLID_SNAKE";
    private static final String INVALID_PASSWORD_2 = "Rev";
    private static final String INVALID_PASSWORD_3 = "Vulca";
    private static final String INVALID_PASSWORD_4 = "VULCAN";
    private static final String INVALID_PASSWORD_5 = "99999999999";
    private static final String INVALID_PASSWORD_6 = "@";
    private static final String INVALID_PASSWORD_7 = "€#~½¬{¬";
    private static final String INVALID_PASSWORD_8 = "111";
    private static final String INVALID_PASSWORD_9 = StringUtils.EMPTY;
    private static final String INVALID_PASSWORD_10 = "This is a large password";

    private static final String VALID_PASSWORD_1 = "solidsnake";
    private static final String VALID_PASSWORD_2 = "VulcanRaven";
    private static final String VALID_PASSWORD_3 = "sniperWolf";
    private static final String VALID_PASSWORD_4 = "sniper_wolf";
    private static final String VALID_PASSWORD_5 = "OCELoT";
    private static final String VALID_PASSWORD_6 = "Pshycho_Mantis";
    private static final String VALID_PASSWORD_7 = "Liquid Snake";
    private static final String VALID_PASSWORD_8 = "DecoYOctopus";
    private static final String VALID_PASSWORD_9 = "Vul4nR4vn";
    private static final String VALID_PASSWORD_10 = "77777VULCAN0Raven7";

    @Test(expectedExceptions = {IllegalArgumentException.class},
            expectedExceptionsMessageRegExp = PasswordValidator.INVALID_PASSWORD,
            dataProvider = INVALID_PASSWORD_PROVIDER)
    public void testInvalidPasswords(String password) throws Exception {
        new LaxPasswordValidator(password);
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
        new LaxPasswordValidator(password);
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