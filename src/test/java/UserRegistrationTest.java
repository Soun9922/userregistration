import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    void givenFirstNameWhenProperShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateFirstName("Sounak");
    }

    @Test
    void givenLastNameWhenProperShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateLastName("Sarkar");
    }
}
