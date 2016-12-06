package domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Clemencio Morales Lucas on 06/12/2016.
 */
public class PasswordValidatorTest {

    PasswordValidator laxPasswordValidator;
    PasswordValidator rigorousPasswordValidator;

    @Before
    public void setUp() throws Exception {
        laxPasswordValidator = new LaxPasswordValidator();
        rigorousPasswordValidator = new RigorousPasswordValidator();
    }

    @Test
    public void validate() throws Exception {
        assertFalse(laxPasswordValidator.validate(""));
        //TODO viene aqui test reusable, pillar contraseñas de entrada de aqui y cambiar por nombres Metal Gear https://www.mkyong.com/regular-expressions/how-to-validate-password-with-regular-expression/
    }

}