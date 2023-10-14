import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class LambdaTest {

    @FunctionalInterface
    public interface DoubleFunction {
        double calculate(double a, double b);
    }

    public static void main(String[] args) {
        Checker<Integer> integerChecker = x -> x%2!=0; //sprawdzanie  nieparzystości
        System.out.println(integerChecker.check(21));

        //przyklad wyrazenia lambda sluzacego do generowania liczb losowych w pewnym specyfinczym zakresie
        IntSupplier provideSomeSpecificRandomNumber = () -> (int)(15*Math.random());
        System.out.println(provideSomeSpecificRandomNumber.getAsInt());

        //tworzymy nowy obiekt:
        Object object1 = new Object();
        //zwracamy wartosc hash tego obiektu za pomoca lambdy:
        IntSupplier object1HashCode = () -> object1.hashCode();

        //innym sposobem zrobienia tego co zrobilem za pomoca lambdy: () -> object1.hashCode()
        //jest zastosowanie ::
        //przez :: mowimy jaka metoda ma zostac zastosowana - robimy wskazanie na jakas metode
        IntSupplier object1HashCodeAlt = object1::hashCode;

        System.out.println(object1HashCode.getAsInt());
        System.out.println(object1HashCodeAlt.getAsInt());

        DoubleFunction calculateCSideInTriangle = (a,b) -> Math.sqrt(Math.pow(a, 2.0)+Math.pow(b, 2.0));
        System.out.println(calculateCSideInTriangle.calculate(3.0, 4.0));

        DoubleFunction makeSomeComplicatedCalculation = (a, b) -> {
          double x = a +b;
          double y = 10*x+7;

          //jak chcemy uzywac klamerek zeby kod rozciagna na wiele linijek, to nalezy zastosowac return
          return Math.sqrt(y);
        };

        System.out.println(makeSomeComplicatedCalculation.calculate(5.0, 7.0));
    }

    private static boolean check(Integer x){
        return x%2!=0;
    }
}
