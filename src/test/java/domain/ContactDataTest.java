package domain;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Clemencio Morales Lucas on 08/12/2016.
 */
public class ContactDataTest {

    private ContactData contactData;
    private Email email;
    private ContactData contactDataOther;
    private Email emailOther;

    private static final String ADDRESS = "C/ Gran Via, 1A";
    private static final String CITY = "Madrid";
    private static final String COUNTRY = "Spain";
    private static final String POSTAL_CODE = "16400";
    private static final String COUNTRY_CODE = "34";
    private static final String PHONE_NUMBER = "677401225";
    private static final String PHONE_NUMBER_OTHER = "666777888";
    private static final String EMAIL_ADDRESS = "mail@clemenciomorales.com";
    private static final String EMAIL_PASSWORD = "solidSnake";
    private static final String EMAIL_ADDRESS_OTHER = "mail@carlosmorales.com";
    private static final String EMAIL_PASSWORD_OTHER = "liquidSnake";

    @BeforeMethod
    public void setUp() throws Exception {
        this.email = new Email(EMAIL_ADDRESS, EMAIL_PASSWORD);
        this.emailOther = new Email(EMAIL_ADDRESS_OTHER, EMAIL_PASSWORD_OTHER);
        this.contactData = new ContactData(email, ADDRESS, CITY, COUNTRY, POSTAL_CODE, COUNTRY_CODE, PHONE_NUMBER);
        this.contactDataOther = new ContactData(emailOther, ADDRESS, CITY, COUNTRY, POSTAL_CODE, COUNTRY_CODE,
                PHONE_NUMBER_OTHER);
    }

    @Test
    public void testContactDataEquality(){
        assertNotEquals(contactData, contactDataOther);
        assertNotEquals(contactData.hashCode(), contactDataOther.hashCode());
        contactDataOther.setEmail(email);
        contactDataOther.setPhoneNumber(PHONE_NUMBER);
        assertEquals(contactData, contactDataOther);
        assertEquals(contactData.hashCode(), contactDataOther.hashCode());
    }
}