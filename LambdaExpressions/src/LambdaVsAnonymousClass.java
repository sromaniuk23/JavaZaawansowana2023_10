public class LambdaVsAnonymousClass {
    public static void main(String[] args) {

        //Instancja klasy anonimowej implementujacej metode abstrakcyjna z danego interfejsu
        Checker<Integer> isOddAnonymous = new Checker<Integer>() {
            @Override
            public boolean check(Integer object) {
                return object % 2 != 0;
            }
        };

        //Realizacja tego samego za pomoca lambda
        //Dzieki stosownaiu interfejsu funkcyjnego kompilator wie ktora metode zaimplementowac przy uzyciu
        //zdefiniowanego wyrazenia lambda
        Checker<Integer> isOddLambda = x -> x % 2 != 0;

        System.out.println(isOddAnonymous.check(23));
        System.out.println(isOddLambda.check(23));
        System.out.println(isOddAnonymous.check(24));
        System.out.println(isOddLambda.check(24));
    }
}
