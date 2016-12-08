package domain;

import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by clemen on 5/12/16.
 */
public class EPassportTest {

    public static final String NAME_SNAKE = "Solid";
    public static final String SURNAME_SNAKE = "Snake";
    public static final String SECOND_SURNAME_SNAKE = "Big Boss";
    public static final String BIRTHDATE_SNAKE = "17/02/1991";

    public static final String NAME_LIQUID = "Liquid";
    public static final String SURNAME_LIQUID = "Snake";
    public static final String BIRTHDATE_LIQUID = "27/11/1997";

    private EPassport ePassportBasic;
    private EPassport ePassportFull;

    @Before
    public void setUp() throws Exception {
        ePassportBasic = new EPassport.Builder(NAME_LIQUID, SURNAME_LIQUID, BIRTHDATE_LIQUID, Gender.MALE, null, SpecialNeeds.NONE)
                .build();
        ePassportFull = new EPassport.Builder(NAME_SNAKE, SURNAME_SNAKE, BIRTHDATE_SNAKE, Gender.MALE, null, SpecialNeeds.NONE)
                .secondSurname(SECOND_SURNAME_SNAKE).loyaltyCard(null).businessCard(null).build();
    }

    @Test
    public void testEPassportAttributes() throws ParseException {
        assertEquals(ePassportBasic.getName(), NAME_LIQUID);

        ePassportBasic.getBirthDate();
        ePassportFull.getBirthDate();
        assertNotEquals(ePassportBasic.getBirthDate(), ePassportFull.getBirthDate());
//        assertEquals(ePassportBasic.getSurname(), SURNAME_LIQUID);
//        assertEquals(ePassportBasic.getSurname(), SURNAME_LIQUID);
//        assertEquals(ePassportBasic.getSurname(), SURNAME_LIQUID);
//        assertEquals(ePassportBasic.getSurname(), SURNAME_LIQUID);
    }

    private Date createDate(String date) throws ParseException {
        //This method can be used to create dates like createDate("17/02/1991")
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
//        String dateAsString = "25/12/2010";
        return sourceFormat.parse(date);
    }
}