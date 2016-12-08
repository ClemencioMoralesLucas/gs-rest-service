package domain;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Clemencio Morales Lucas on 08/12/2016.
 */
public class DniTest {

    private final String VALID_DNI_PROVIDER = "valid-dni-provider";
    private final String INVALID_DNI_PROVIDER = "invalid-dni-provider";

    private final String VALID_DNI_1 = "63839734Z";
    private final String VALID_DNI_2 = "13755305V";
    private final String VALID_DNI_3 = "42848618D";
    private final String VALID_DNI_4 = "66660047K";
    private final String VALID_DNI_5 = "26787906J";
    private final String VALID_DNI_6 = "26232430X";
    private final String VALID_DNI_7 = "62006375p";
    private final String VALID_DNI_8 = "59126474Y";
    private final String VALID_DNI_9 = "60266334D";
    private final String VALID_DNI_10 = "00268680V";

    private final String INVALID_DNI_1 = "63839734";
    private final String INVALID_DNI_2 = "755305V";
    private final String INVALID_DNI_3 = "428488D";
    private final String INVALID_DNI_4 = "6666";
    private final String INVALID_DNI_5 = "26787906H";
    private final String INVALID_DNI_6 = "26232430";
    private final String INVALID_DNI_7 = "6200637225P";
    private final String INVALID_DNI_8 = "059126474Y";
    private final String INVALID_DNI_9 = "60266334C";
    private final String INVALID_DNI_10 = "00268680W";

    @Test(expectedExceptions = {IllegalArgumentException.class},
            expectedExceptionsMessageRegExp = Identification.INVALID_IDENTIFICATION_NUMBER,
            dataProvider = INVALID_DNI_PROVIDER)
    public void testInvalidDNIDoesThrowException(String dni) throws Exception {
        new Dni(dni);
    }

    @DataProvider(name = INVALID_DNI_PROVIDER)
    public Object[][] getInvalidDNIs() {
        return new String[][]{
                {INVALID_DNI_1}, {INVALID_DNI_2}, {INVALID_DNI_3},
                {INVALID_DNI_4}, {INVALID_DNI_5}, {INVALID_DNI_6},
                {INVALID_DNI_7}, {INVALID_DNI_8}, {INVALID_DNI_9},
                {INVALID_DNI_10}
        };
    }

    @Test(dataProvider = VALID_DNI_PROVIDER)
    public void testValidDNIDoesNotThrowException(String dni) throws Exception {
        new Dni(dni);
    }

    @DataProvider(name = VALID_DNI_PROVIDER)
    public Object[][] getValidDNIs() {
        return new String[][]{
                {VALID_DNI_1}, {VALID_DNI_2}, {VALID_DNI_3},
                {VALID_DNI_4}, {VALID_DNI_5}, {VALID_DNI_6},
                {VALID_DNI_7}, {VALID_DNI_8}, {VALID_DNI_9},
                {VALID_DNI_10}
        };
    }
}