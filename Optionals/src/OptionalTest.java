import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        String string = "abc";
        //metoda ofNullable tworzy nam nowego optionala z danego obiektu ktory moze byc nullem
        Optional<String> movieContainer = Optional.ofNullable(string);

        movieContainer.ifPresent(System.out::println);
        //metoda orElse(), zwraca nam obiekt z optionala, jesli optional jest pusty wowczas zwraca obiekt podany jako argument
        System.out.println(movieContainer.orElse("Empty string"));

        int[] table = new int[]{1, 23, 12, 53, 82, 74, 99};

        Optional<Integer> optionalInteger = findIndex(table, 13);
        System.out.println(optionalInteger.orElse(-1));

        //metoda isPresent() sprawdza czy cos znajduje sie w optionalu
        if(optionalInteger.isPresent()){
            System.out.println(optionalInteger.get());
        } else {
            System.out.println("Element not found!");
        }
    }

    private static Optional<Integer> findIndex(int[] tab, int element){
        for (int i=0; i<tab.length; i++){
            if(element==tab[i]){
                //metoda of() tworzy nowego optionala z obiektow nienullowych
                return Optional.of(i);
            }
        }

        //empty() tworzy pustego optionala
        return Optional.empty();
    }
}
