package domain;

import java.util.Arrays;
import java.util.List;

/**
 * Created by clemen on 5/12/16.
 */
public enum Gender {

    MALE, FEMALE;

    public static List<Gender> getValues(){
        return Arrays.asList(Gender.values());
    }
}
