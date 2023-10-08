public class CW1 {
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();

        userValidator.validateEmails("abc@wp.pl", "janek@gmail.com");
    }
}
