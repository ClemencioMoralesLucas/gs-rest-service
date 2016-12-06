package domain;

/**
 * Created by clemen on 1/12/16.
 */
public class ContactData {

    private Email email;
    private String address;
    private String city;
    private String country;
    private String postalCode;
    private String countryCode;
    private String phoneNumber;

    public ContactData(final Email email, final String address, final String city, final String country,
                       final String postalCode, final String countryCode, final String phoneNumber) {
        this.setEmail(email);
        this.setAddress(address);
        this.setCity(city);
        this.setCountry(country);
        this.setPostalCode(postalCode);
        this.setCountryCode(countryCode);
        this.setPhoneNumber(phoneNumber);
    }

    public Email getEmail() {
        return email;
    }

    private void setEmail(final Email email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactData that = (ContactData) o;

        if (!email.equals(that.email)) return false;
        if (!address.equals(that.address)) return false;
        if (!city.equals(that.city)) return false;
        if (!country.equals(that.country)) return false;
        if (!postalCode.equals(that.postalCode)) return false;
        if (!countryCode.equals(that.countryCode)) return false;
        return phoneNumber.equals(that.phoneNumber);
    }

    @Override
    public int hashCode() {
        int result = email.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + country.hashCode();
        result = 31 * result + postalCode.hashCode();
        result = 31 * result + countryCode.hashCode();
        result = 31 * result + phoneNumber.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
