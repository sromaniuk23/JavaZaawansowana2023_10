import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class ExampleStreams {
    public static void main(String[] args) {
        //Strumien na podstawie kolekcji
        Stream<Integer> streamInteger = new LinkedList<Integer>().stream();
        Stream<Integer> streamInteger2 = Arrays.asList(1, 2, 3).stream();
        streamInteger2.forEach(System.out::println); //wypisywanie zawartosci strumienia

        //Strumien na podstawie tablicy
        Integer[] integers = new Integer[]{11, 22, 33, 44, 55};
        Stream<Integer> integerStream = Arrays.stream(integers);
        integerStream.forEach(System.out::println);

        //Strumien na podstawie lancucha znakow, ktory jest rozdzielany z uzyciem RegEx
        Stream<String> stringStream = Pattern.compile(" ").splitAsStream("some longer sequence");
        stringStream.forEach(System.out::println);

        //Strumienie typów prostych
        DoubleStream doubleStream = DoubleStream.of(1.0, 2.0, 3.0);
        IntStream intStream = IntStream.range(5, 10);
        //metoda generate tworzy strumien nieskonczonych danych
        LongStream longStream = LongStream.generate(() -> 1L);
        doubleStream.forEach(System.out::println);
        intStream.forEach(System.out::println);
        //metoda limit ogranicza liczbe elementow w strumieniu
        longStream.limit(5).forEach(System.out::println);

        //Tworzenie strumieni danych losowych
        DoubleStream randomDoubles = new Random().doubles();
        IntStream randomInts = new Random().ints();
        LongStream randomLongs = new Random().longs();
        //tutaj znowu stosujemy metode limit
        randomDoubles.limit(3).forEach(System.out::println);
        randomInts.limit(3).forEach(System.out::println);
        randomLongs.limit(3).forEach(System.out::println);

        //tworzymy strumien losowych intow a nastepnie filtrujemy ten strumien
        //zeby uzyskac liczby w danym zakresie
        //ograniczamy ilosc liczb do 5
        new Random().ints()
                .limit(5)
                .filter(x->x<10)
                .filter(x->x>0)
                .forEach(System.out::println);

        new Random().ints(5, 10).limit(5).forEach(System.out::println);

        //tworzymy strumien nieskonczonych danych losowych typu Double
        DoubleStream randomNumbers = new Random().doubles(); //strumien double'i
        Stream<Double> doubleStreamB = Arrays.asList(1.0, 5.0, 9.0).stream(); //strumien Double'i

        List<Double> listOfRandomNumbers = randomNumbers
                .map(x -> x * 5 - 5) //przemnazamy wszsytkie liczby razy 2 i odejmujemy 1
                .filter(x -> x < 0) //wybieramy tylko liczby mniejsze od 1
                .boxed() //opakowanie typu
                .limit(5)
//                .collect(Collectors.toList()); //to jest pierwotnie dostepny sposob zamiany na liste
                .toList(); //to jest dostepne od javy 17


        System.out.println(listOfRandomNumbers);


        OptionalInt minVal = IntStream.range(14, 100)
                .reduce((a,b)->a<=b?a:b); //a- akumulator (element ktory przechodzi przy uzywaniu reduce na kolejne elementy strumienia)

        System.out.println(minVal.orElse(-1));

        OptionalInt sum = IntStream.range(14, 100)
                //.reduce((acc, curr) -> acc += curr);
                .reduce(Integer::sum);

        System.out.println(sum.orElse(-1));
    }
}
