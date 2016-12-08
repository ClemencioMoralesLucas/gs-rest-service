package domain;

/**
 * Created by Clemencio Morales Lucas on 08/12/2016.
 */
public abstract class Identification {

    private String identification;
    public static final String INVALID_IDENTIFICATION_NUMBER = "Invalid identification number";

    protected Identification(final String identification){
        if (isValid(identification)){
            this.setIdentification(identification);
        } else {
            throw new IllegalArgumentException(INVALID_IDENTIFICATION_NUMBER);
        }
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Identification that = (Identification) o;
        return identification.equals(that.identification);
    }

    @Override
    public int hashCode() {
        return identification.hashCode();
    }

    @Override
    public String toString() {
        return "Identification{" +
                "identification='" + identification + '\'' +
                '}';
    }

    public abstract boolean isValid(String identification);
}
