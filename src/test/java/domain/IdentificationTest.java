package domain;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by clemen on 19/12/16.
 */
public class IdentificationTest {

    private static final String RANDOM_DNI = "48522069G";
    private static final String ANOTHER_RANDOM_DNI = "30362915V";

    private static final String WRONG_DNI = "74753095Z";
    private static final String ANOTHER_WRONG_DNI = "24932338R";

    private Identification identification = new Dni(RANDOM_DNI);
    private Identification otherIdentification = new Dni(ANOTHER_RANDOM_DNI);

    @Test
    public void testGetIdentification() throws Exception {
        assertEquals(identification.getIdentification(), RANDOM_DNI);
    }

    @Test
    public void testSetValidIdentificationDoesNotThrowException() throws Exception {
        this.identification.setIdentification(ANOTHER_RANDOM_DNI);
        this.identification.setIdentification(RANDOM_DNI);
    }

    @Test
    public void testSameIdentificationsIfSameAttribute(){
        assertEquals(identification, new Dni(RANDOM_DNI));
        assertEquals(otherIdentification, new Dni(ANOTHER_RANDOM_DNI));
    }

    @Test
    public void testDifferentIdentificationsIfDifferentAttribute(){
        assertNotEquals(new Dni(RANDOM_DNI), new Dni(ANOTHER_RANDOM_DNI));
        assertNotEquals(new Dni(ANOTHER_RANDOM_DNI), new Dni(RANDOM_DNI));
    }

    @Test
    public void testIsValidReturnsFalseIfWrongDni() throws Exception {
        assertFalse(this.identification.isValid(WRONG_DNI));
        assertFalse(this.identification.isValid(ANOTHER_WRONG_DNI));
    }

    @Test
    public void testIsValidReturnsTrueIfRightDni() throws Exception {
        assertTrue(this.identification.isValid(RANDOM_DNI));
        assertTrue(this.identification.isValid(ANOTHER_RANDOM_DNI));
    }
}