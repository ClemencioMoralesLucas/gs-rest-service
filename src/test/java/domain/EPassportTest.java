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

    private Identification identificationSnake;
    private static final String NAME_SNAKE = "Solid";
    private static final String SURNAME_SNAKE = "Snake";
    private static final String SECOND_SURNAME_SNAKE = "Big Boss";
    private static final String BIRTHDATE_SNAKE = "17/02/1991";
    private final String DNI_SNAKE = "13755305V";

    private Identification identificationLiquid;
    private static final String NAME_LIQUID = "Liquid";
    private static final String SURNAME_LIQUID = "Snake";
    private static final String BIRTHDATE_LIQUID = "27/11/1997";
    private final String DNI_LIQUID = "63839734Z";

    private EPassport ePassportBasic;
    private EPassport ePassportFull;

    @Before
    public void setUp() throws Exception {
        identificationSnake = new Dni(DNI_SNAKE);
        identificationLiquid = new Dni(DNI_LIQUID);
        ePassportBasic = new EPassport.Builder(identificationLiquid, NAME_LIQUID, SURNAME_LIQUID, BIRTHDATE_LIQUID, Gender.MALE, null, SpecialNeeds.NONE)
                .build();
        ePassportFull = new EPassport.Builder(identificationSnake, NAME_SNAKE, SURNAME_SNAKE, BIRTHDATE_SNAKE, Gender.MALE, null, SpecialNeeds.NONE)
                .secondSurname(SECOND_SURNAME_SNAKE).loyaltyCard(null).businessCard(null).build();
    }

    @Test
    public void testEPassportSimpleAttributes() throws ParseException {
        assertEquals(ePassportBasic.getName(), NAME_LIQUID);
        assertEquals(ePassportFull.getName(), NAME_SNAKE);
        assertEquals(ePassportFull.getSecondSurname(), SECOND_SURNAME_SNAKE);
        assertNotEquals(ePassportBasic.getBirthDate(), ePassportFull.getBirthDate());
    }

    @Test
    public void testEqualityBetweenEPasswords() {
        //TODO CHECK EQUALITY IN TERMS OF IDENTIFICATION OBJECT
        //assertEquals...passport.equals.other

    }

//    @Test
//    public void testEPassportWithWrongEmail() {
//        ePassportFull = new EPassport.Builder(identificationSnake, NAME_SNAKE, SURNAME_SNAKE, BIRTHDATE_SNAKE, Gender.MALE, null, SpecialNeeds.NONE)
//                .secondSurname(SECOND_SURNAME_SNAKE).loyaltyCard(null).businessCard(null).build();
//    }

    private Date createDate(String date) throws ParseException {
        //This method can be used to create dates like createDate("17/02/1991")
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
//        String dateAsString = "25/12/2010";
        return sourceFormat.parse(date);
    }
}