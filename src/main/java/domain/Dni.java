package domain;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Clemencio Morales Lucas on 08/12/2016.
 */
public class Dni extends Identification {

    private static final String ZERO_STRING = "0";
    private static final int DNI_LENGTH = 9;
    private static final int CHARACTER_INDEX = 8;
    private static final char[] dniChar = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',  'X',  'B', 'N', 'J',
            'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };

    public Dni(final String identification){
        super(identification);
    }

    @Override
    public boolean isValid(String identification) {
        return Dni.isValidDni(identification);
    }

    public static boolean isValidDni(String identification) {
        String number= StringUtils.EMPTY;
        int index;
        identification = (identification.length() == CHARACTER_INDEX) ?
                (ZERO_STRING +identification) : identification;

        //9º Digit has to be a character and length has to be 9
        if (identification.length() != DNI_LENGTH || !Character.isLetter(identification.charAt(CHARACTER_INDEX))) {
            return false;
        }
        // The first 8 digits must be numbers
        for (int i=0; i<CHARACTER_INDEX; i++) {
            if(!Character.isDigit(identification.charAt(i))){
                return false;
            }
            number += identification.charAt(i);
        }
        index = Integer.parseInt(number);
        index %= dniChar.length;
        if ((Character.toUpperCase(identification.charAt(CHARACTER_INDEX))) != dniChar[index]){
            return false;
        }
        return true;
    }
}