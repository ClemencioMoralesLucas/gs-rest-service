package domain;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by clemen on 5/12/16.
 */
public class EPassportTest {

    public static final String NAME_CLEMEN = "Clemencio";
    public static final String SURNAME_CLEMEN = "Morales";
    public static final String NAME_SNAKE = "Solid";
    public static final String SURNAME_SNAKE = "Snake";
    public static final String SECOND_SURNAME_SNAKE = "Big Boss";
    private EPassport ePassportBasic;
    private EPassport ePassportFull;

    @Before
    public void setUp() throws Exception {
        ePassportBasic = new EPassport.Builder(NAME_CLEMEN, SURNAME_CLEMEN, new Date(), Gender.MALE, null, SpecialNeeds.NONE)
                .build();
        ePassportFull = new EPassport.Builder(NAME_SNAKE, SURNAME_SNAKE, new Date(), Gender.MALE, null, SpecialNeeds.NONE)
                .secondSurname(SECOND_SURNAME_SNAKE).loyaltyCard(null).businessCard(null).build();
    }

    @Test
    public void testEPassportAttributes(){
        assertEquals(ePassportBasic.getName(), NAME_CLEMEN);
        //TODO CONTINUE
    }

    @After
    public void tearDown() throws Exception {

    }

}