import java.util.List;

public class LocalClassExample {
    final int intField = 12;

    public static void main(String[] args) {
        final List<String> names = List.of("Kasia", "Magda", "Gosia");
        final List<String> surnames = List.of("Piszczyk", "Olszańska", "Budrzeńska");
        final int someVariable = 3; // zmienna do zaprezentowania dostępu zmiennych z klas lokalnych
        int anotherVariable = 5;

        class AnotherLocalClassExample {
            private static final String APP_NAME = "DummyApp"; // OK
            public static String INCORRECT_FIELD = "IAmMissingFinal"; // Błąd kompilacji, brak modyfikatora final

            public void printAppName() {
                System.out.println(APP_NAME);
            }

            public static void shouldNotBeDeclaredHere() {} // Błąd kompilacji, metoda statyczna w klasie lokalnej
        }

        class Name { // stworzenie definicji klasy lokalnej, bez modyfikatora dostępu
            private final String firstName;
            private final String lastName;

            public Name(final String firstName, final String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public String getReadableName() {
                //do intField'a nie mamy dostepu bo jest to pole klasy a my mamy dostep jedynie do zmiennych
                // w metodzie w ktorej sie znajdujemy
                System.out.println("Hey I can use outer variable " + someVariable + anotherVariable);
                return firstName + " " + lastName;
            }
        }

        //w klasach lokalnych mozna uzywac tylko zmiennych zewnetrznych ktore sa finalne badz wlasciwie finalne
//        anotherVariable = 12;

        for (int idx = 0; idx < names.size(); idx++) {
            final Name name = new Name(names.get(idx), surnames.get(idx)); // wykorzystanie klasy lokalnej
            System.out.println(name.getReadableName());
        }



        System.out.println(AnotherLocalClassExample.INCORRECT_FIELD);

    }

}
