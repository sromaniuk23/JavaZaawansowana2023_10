import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ExampleOfParallelStreams {
    public static void main(String[] args) {
        System.out.println("Sequential:");
        //Tworzymy strumien intow sekwencyjny
        IntStream.range(1, 10)
                .forEach(System.out::println);

        System.out.println("Parallel");
        //Tworzymy strumien intow sekwencyjny, przelaczamy go na rownolegly metoda parallel()
        IntStream.range(1, 10)
                .peek(System.out::println) //peek wywoluje metode typu consumer na elementach strumienia, nie modufikujac
                .parallel() //przelacza na przetwarzanie rownolegle
                .forEach(System.out::println); //dziala tak samo jak peek, ale konczy strumien


        //Przykład 1
        //Tworzymy strumien danych od 1 do 9
        //Dodajemy do danych 100
        //Wyswietlamy
        IntStream.range(1, 10)
                .parallel() //przelaczenie na przetwarzanie rownolegle
                .peek(System.out::println)
                .map(x -> x + 100)
//                .sequential() //przelaczenie na przetwarzanie sekwencyjne
                .forEach(System.out::println);


        //Przykład 2
        //Stworzymy klase anonimowa z metoda rekurencyjna do silni
        //Zrobimy strumien intow od 1 do 30
        //obliczymy silnie rownolegle i sekwencyjnie
        //zamienimy na liste
        //wyswietlimy wyniki

        UnaryOperator<Integer> factorial = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer n) {
                if(n <= 2){
                    return n;
                } else{
                    return n*apply(n-1);
                }
            }
        };

        System.out.println("Example 2");
        List<Integer> factorialResults = IntStream.range(1, 20)
                .parallel() //przetwarzanie rownolegle z zalozenia powinno przyspieszac dzialanie/operacje
                .map(factorial::apply) //stosujemy utworzona metode apply z instancji klasy anonimowej
                .peek(System.out::println)
                .boxed()    //opakowujemy typ danych int -> Integer
                .peek(System.out::println)
                //przy zamienianiu na liste kolejnosc elementow pozostaje zachowana taka sama jak byla na poczatku
                .collect(Collectors.toList()); //zamieniamy na listę

        System.out.println(factorialResults);   //wyswietlamy zawartosc listy

        //Przykład 3
        //Stworzymy klase anonimowa z metoda rekurencyjna do obliczania liczb Fibonacciego
        //Zrobimy strumien intow od 20 do 30
        //wykonamy obliczenia rownolegle i sekwencyjnie
        //zamienimy na liste
        //wyswietlimy wyniki

        UnaryOperator<Long> calculateFibonacciNumber = new UnaryOperator<Long>() {
            @Override
            public Long apply(Long n) {
                if(n<=1){
                    return n;
                } else{
                    return apply(n-1)+apply(n-2);
                }
            }
        };

        long t1 = System.currentTimeMillis(); //pobieram aktualny czas przed przetwarzaniem

//        List<Long> resultsOfFibonacci = Arrays.stream(new Long[]{43L})
//                .parallel()
//                .map(calculateFibonacciNumber::apply)
//                .collect(Collectors.toList());

        List<Long> resultsOfFibonacci = Stream.of(42L, 42L, 42L, 42L, 42L, 42L, 42L, 42L)
                .parallel() //mozna zakomentowac ta linijke azeby zobaczyc roznice miedzy rownoleglym a sekwencyjnym
                .map(calculateFibonacciNumber)
//                .boxed()
                .collect(Collectors.toList());

        long t2 = System.currentTimeMillis(); //pobieram aktualny czas po przetwarzaniu

        //roznica pobranych probek czasowych bedzie stanowic orientacyjny czas pracy strumienia
        System.out.println("Example 3");
        System.out.println("Processing time: " + (t2-t1) + " ms");
        System.out.println(resultsOfFibonacci);
    }
}
