package domain;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by Clemencio Morales Lucas on 08/12/2016.
 */
public class SpecialNeedsTest {

    @Test
    public void testSpecialNeeds() throws Exception {
        assertEquals(SpecialNeeds.getValues().size(), SpecialNeeds.values().length);
        assertTrue(SpecialNeeds.getValues().contains(SpecialNeeds.VISUAL_IMPAIRMENT));
        assertTrue(SpecialNeeds.getValues().contains(SpecialNeeds.HEARING_IMPAIRMENT));
        assertTrue(SpecialNeeds.getValues().contains(SpecialNeeds.WHEELCHAIR_REQUIRED));
        assertTrue(SpecialNeeds.getValues().contains(SpecialNeeds.NONE));
    }

    @Test
    public void testJustExpectedValues(){
        List<SpecialNeeds> specialNeeds = SpecialNeeds.getValues();
        for (SpecialNeeds currentSpecialNeed: specialNeeds) {
            assertTrue(isValid(currentSpecialNeed));
        }
    }

    private boolean isValid(final SpecialNeeds currentSpecialNeed) {
        return currentSpecialNeed == SpecialNeeds.VISUAL_IMPAIRMENT ||
                currentSpecialNeed == SpecialNeeds.HEARING_IMPAIRMENT ||
                currentSpecialNeed == SpecialNeeds.WHEELCHAIR_REQUIRED ||
                currentSpecialNeed == SpecialNeeds.NONE;
    }
}