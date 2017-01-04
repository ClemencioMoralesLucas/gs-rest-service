package domain;

/**
 * TODO
 * Test this class EXTENSIVELY
 * Add PMD
 * Add SonarQube or similar
 * Change name to the app: ePassport
 */

public class EPassport {

    private final Identification identification;
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
        private final Identification identification;
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

        public Builder(Identification identification, String name, String surname, String birthDate,
                       Gender gender, ContactData contactData, SpecialNeeds specialNeeds) {
            this.identification = identification;
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
        identification = builder.identification;
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

    public Identification getIdentification() {
        return identification;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EPassport ePassport = (EPassport) o;

        return identification.equals(ePassport.identification);
    }

    @Override
    public int hashCode() {
        return identification.hashCode();
    }
}