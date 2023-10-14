import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class HigherOrderFunction {
    public static void main(String[] args) {
        Function<Double, Double> applySomeQuadraticFunction = x -> 3.0 * Math.pow(x, 2.0) - 5.0 * x + 10;
        Function<Double, Double> someOtherFunction = x -> 1.0 * Math.pow(x, 3.0) - 3.5 * Math.pow(x, 2.0) + 7.5 * x - 12;

        List<Double> doubleList = new ArrayList<>();

        for (double i = -3; i <= 3; i+=0.1) {
            doubleList.add((double) i); //wynika z roznicy miedzy typem prostym a typem referencyjnym
        }

        applyFunctionOnTheList(applySomeQuadraticFunction, doubleList);
        System.out.println("OTHER:");
        applyFunctionOnTheList(someOtherFunction, doubleList);


        Function<Integer, Long> operationA = getOperationFunction(1);
        Function<Integer, Long> operationB = getOperationFunction(4);

        System.out.println(operationA.apply(3));
        System.out.println(operationB.apply(12));
    }

    //funktor
    private static void applyFunctionOnTheList(Function<Double, Double> doubleFunction, List<Double> doubleList) {
        for (Double d : doubleList) {
            System.out.println("value= " + d + " ,result= " + doubleFunction.apply(d));
        }
    }

    //metoda wyzszego rzedu
    private static Function<Integer, Long> getOperationFunction(Integer a){
        if(a==1){
            //jezeli wartosc na wejsciu metody to 1 to zwroc wyrazenie lambda podnoszace do kwadratu
            return x -> (long) x*x;
        }
        else {
            //jezeli wartosc na wejsciu jest inna niz 1 to zwroc wyrazenie lambda zwracajace 256L
            return x -> 256L;
        }
    }
}
