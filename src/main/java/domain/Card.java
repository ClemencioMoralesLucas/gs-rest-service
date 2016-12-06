package domain;

/**
 * Created by Clemencio Morales Lucas on 06/12/2016.
 */
public abstract class Card {

    private String companyCode;
    private String cardNumber;

    public Card(final String companyCode, final String cardNumber) {
        this.setCompanyCode(companyCode);
        this.setCardNumber(cardNumber);
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(final String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(final String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (!companyCode.equals(card.companyCode)) return false;
        return cardNumber.equals(card.cardNumber);

    }

    @Override
    public int hashCode() {
        int result = companyCode.hashCode();
        result = 31 * result + cardNumber.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Card{" +
                "companyCode='" + companyCode + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}