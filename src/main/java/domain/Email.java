package domain;

import org.apache.commons.validator.EmailValidator;

/**
 * Created by Clemencio Morales Lucas on 06/12/2016.
 */
public class Email {

    private String address;
    private String password;
    private PasswordValidator passwordValidator = new LaxPasswordValidator();
    protected static final String INVALID_EMAIL = "Invalid email: ";

    public Email(String address, String password) {
        this.setAddress(address);
        this.setPassword(password);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(EmailValidator.getInstance().isValid(address)){
            this.address = address;
        } else {
            throw new IllegalArgumentException(INVALID_EMAIL + address);
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(passwordValidator.validate(password)) {
            this.password = password;
        } else {
            throw new IllegalArgumentException(passwordValidator.INVALID_PASSWORD);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;
        return address.equals(email.address);
    }

    @Override
    public int hashCode() {
        return address.hashCode();
    }

    @Override
    public String toString() {
        return "Email{" +
                "address='" + address + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
