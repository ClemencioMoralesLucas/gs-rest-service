package domain;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Clemencio Morales Lucas on 08/12/2016.
 */
public class GenderTest {

    @Test
    public void testGender() {
        assertEquals(Gender.getValues().size(), Gender.values().length);
        assertTrue(Gender.getValues().contains(Gender.MALE));
        assertTrue(Gender.getValues().contains(Gender.FEMALE));
    }
}