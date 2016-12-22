package domain;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by clemen on 19/12/16.
 */
public class IdentificationTest {

    private static final String RANDOM_DNI = "48522069G";
    private static final String ANOTHER_RANDOM_DNI = "30362915V";

    private static final String WRONG_DNI = "74753095J";
    private static final String ANOTHER_WRONG_DNI = "24932338Q";

    private Identification identification = new Dni(RANDOM_DNI);

    @Test
    public void testGetIdentification() throws Exception {
        assertEquals(identification.getIdentification(), RANDOM_DNI);
    }

    @Test
    public void testSetValidIdentificationDoesNotThrowException() throws Exception {
        this.identification.setIdentification(ANOTHER_RANDOM_DNI);
    }

//    @Test//TODO FIXME
//    public void testIsValidReturnsFalseIfWrongDni() throws Exception {
//        assertFalse(this.identification.isValid(WRONG_DNI));
//        assertFalse(this.identification.isValid(ANOTHER_WRONG_DNI));
//    }

}