package domain;

import java.util.Arrays;
import java.util.List;

/**
 * Created by clemen on 5/12/16.
 */
public enum SpecialNeeds {

    VISUAL_IMPAIRMENT, HEARING_IMPAIRMENT, WHEELCHAIR_REQUIRED, NONE;

    public static List<SpecialNeeds> getValues(){
        return Arrays.asList(SpecialNeeds.values());
    }
}
