package domain;

import java.util.Date;

/**
 * TODO
 * Change name to the app: ePassport
 */

public class EPassport {

    private final String name;
    private final String surname;
    private final Date birthDate;
    private final Gender gender;
    private final ContactData contactData;
    private final SpecialNeeds specialNeeds;
    private final String secondSurname;
    private final LoyaltyCard loyaltyCard; //Company code and card number
    private final BusinessCard businessCard; //Programme name and company code (SAME AS LOYALTY CARD, THEY EXTEND FROM CARD)

    public String getName() {
        return name;
    }

    public static class Builder {
        //Required parameters
        private final String name;
        private final String surname;
        private final Date birthDate;
        private final Gender gender;
        private final ContactData contactData;
        private final SpecialNeeds specialNeeds; //Visual impairment, Hearing impairment, Wheelchair required

        //Optional parameters
        private String secondSurname = "";
        private LoyaltyCard loyaltyCard = null; //Company code and card number
        private BusinessCard businessCard = null;

        public Builder(String name, String surname, Date birthDate, Gender gender,
                       ContactData contactData, SpecialNeeds specialNeeds) {
            this.name = name;
            this.surname = surname;
            this.birthDate = birthDate;
            this.gender = gender;
            this.contactData = contactData;
            this.specialNeeds = specialNeeds;
        }

        public Builder secondSurname(final String value) {
            secondSurname = value;
            return this;
        }

        public Builder loyaltyCard(final LoyaltyCard value) {
            loyaltyCard = value;
            return this;
        }

        public Builder businessCard(final BusinessCard value) {
            businessCard = value;
            return this;
        }

        public EPassport build() {
            return new EPassport(this);
        }
    }

    public EPassport(Builder builder) {
        name = builder.name;
        surname = builder.surname;
        birthDate = builder.birthDate;
        gender = builder.gender;
        contactData = builder.contactData;
        specialNeeds = builder.specialNeeds;
        secondSurname = builder.secondSurname;
        loyaltyCard = builder.loyaltyCard;
        businessCard = builder.businessCard;
    }
}

