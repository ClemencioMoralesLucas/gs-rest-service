package domain;

/**
 * Created by clemen on 5/12/16.
 */

public class BusinessCard extends Card {

    private String programmeName;

    public BusinessCard(final String companyCode, final String cardNumber, final String programmeName) {
        super(companyCode, cardNumber);
        this.setProgrammeName(programmeName);
    }

    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(final String programmeName) {
        this.programmeName = programmeName;
    }

    @Override
    public String toString() {
        return "BusinessCard{" +
                "programmeName='" + programmeName + '\'' +
                "} " + super.toString();
    }
}
