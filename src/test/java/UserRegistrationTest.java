import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    void givenFirstNameWhenProperShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean firstName = userRegistration.validateFirstName("Sounak");
        Assertions.assertTrue(firstName);
    }

    @Test
    void givenLastNameWhenProperShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean lastName = userRegistration.validateLastName("Sarkar");
        Assertions.assertTrue(lastName);
    }

    @Test
    void givenEmailWhenProperShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean email = userRegistration.validateEmail("sounak99@gmail.com");
        Assertions.assertTrue(email);
    }

    @Test
    void givenPhoneNumberWhenProperWithSpaceShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phNumber = userRegistration.validatePhoneNumber("91 9978654231");
        Assertions.assertTrue(phNumber);
    }

    @Test
    void givenPhoneNumberWhenProperWithoutSpaceShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phNumber = userRegistration.validatePhoneNumber("919978654231");
        Assertions.assertTrue(phNumber);
    }

    @Test
    void givenPhoneNumberWhenNotProperShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phNumber = userRegistration.validatePhoneNumber("91997");
        Assertions.assertFalse(phNumber);
    }

    @Test
    void givenPasswordWhenMinEightCharShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();
        boolean password = userRegistration.validatePassword("$arkar@99");
        Assertions.assertTrue(password);
    }
}