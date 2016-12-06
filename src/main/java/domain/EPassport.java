package domain;

import java.util.Date;

/**
 * TODO
 * Write unit tests for EVERY single class first of all
 * Change name to the app: ePassport
 * Add ant clean install for unit tests
 */

public class EPassport {

    private final String name;
    private final String surname;
    private final String birthDate;
    private final Gender gender;
    private final ContactData contactData;
    private final SpecialNeeds specialNeeds;
    private final String secondSurname;
    private final LoyaltyCard loyaltyCard;
    private final BusinessCard businessCard;

    public static class Builder {
        //Required parameters
        private final String name;
        private final String surname;
        private final String birthDate;
        private final Gender gender;
        private final ContactData contactData;
        private final SpecialNeeds specialNeeds; //Visual impairment, Hearing impairment, Wheelchair required

        //Optional parameters
        private String secondSurname = "";
        private LoyaltyCard loyaltyCard = null; //Company code and card number
        private BusinessCard businessCard = null;

        public Builder(String name, String surname, String birthDate, Gender gender,
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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public ContactData getContactData() {
        return contactData;
    }

    public SpecialNeeds getSpecialNeeds() {
        return specialNeeds;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }

    public BusinessCard getBusinessCard() {
        return businessCard;
    }
}

