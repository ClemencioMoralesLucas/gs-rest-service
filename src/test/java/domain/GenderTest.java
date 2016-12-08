package domain;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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

    @Test
    public void testJustExpectedValues(){
        List<Gender> gender = Gender.getValues();
        for (Gender currentGender: gender) {
            assertTrue(isValid(currentGender));
        }
    }

    private boolean isValid(final Gender currentGender) {
        return currentGender == Gender.MALE || currentGender == Gender.FEMALE;
    }
}