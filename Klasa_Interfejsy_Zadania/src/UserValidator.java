public class UserValidator {

    public void validateEmails(String email, String alternativeEmail){

        class Email{
            public String validateEmail(String email){
                if(email == null || email.equals("")) return "unknown";
                if(!email.matches("[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]+")) return "unknown";
                return email;
            }
        }

        Email email1 = new Email();

        System.out.println( email1.validateEmail(email));
        System.out.println( email1.validateEmail(alternativeEmail));

    }

}
