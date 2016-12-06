package domain;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Clemencio Morales Lucas on 06/12/2016.
 */
public class CardTest {

    private static BusinessCard businessCard;
    private static final String BUSINESS_COMPANY_CODE = "FoxHound";
    private static final String BUSINESS_CARD_NUMBER = "0001";
    private static final String BUSINESS_PROGRAMME_NAME = "Business Programme";

    private static LoyaltyCard loyaltyCard;
    private static final String LOYALTY_COMPANY_CODE = "DeadCell";
    private static final String LOYALTY_CARD_NUMBER = "0002";

    @BeforeClass
    public static void setUp(){
        businessCard = new BusinessCard(BUSINESS_COMPANY_CODE, BUSINESS_CARD_NUMBER, BUSINESS_PROGRAMME_NAME);
        loyaltyCard = new LoyaltyCard(LOYALTY_COMPANY_CODE, LOYALTY_CARD_NUMBER);
    }

    @Test
    public void testBusinessCard(){
        assertEquals(this.businessCard.getCompanyCode(), BUSINESS_COMPANY_CODE);
        assertEquals(this.businessCard.getCardNumber(), BUSINESS_CARD_NUMBER);
        assertEquals(this.businessCard.getProgrammeName(), BUSINESS_PROGRAMME_NAME);
    }

    @Test
    public void testLoyaltyCard(){
        assertEquals(this.loyaltyCard.getCardNumber(), LOYALTY_CARD_NUMBER);
        assertEquals(this.loyaltyCard.getCompanyCode(), LOYALTY_COMPANY_CODE);
    }
}