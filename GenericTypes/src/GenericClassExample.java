import java.util.Random;

public class GenericClassExample {
    public static void main(String[] args) {
        //parametryzujemy klase generyczna Cup typem String i tworzymy jej instancje
        Cup<String> stringCup = new Cup<>("coffee");

        stringCup.drink();

        Cup<Sugar> sugarCup = new Cup<Sugar>(new Sugar("Majestic sugar", "brown"));
        sugarCup.drink();

        Tea tea = new Tea("ceylon");
        Cup<Tea> teaCup = fullFillCup(tea);
        teaCup.drink();

        fullFillCup(213.4).drink();
        fullFillCup(452.3f).drink();
        fullFillCup("air").drink();

        System.out.println(randomSelection("String A", "String B"));
        System.out.println(randomSelection(123, 789));

        System.out.println(randomMultiSelection(23, 34, 67, 89));

        showDrinkName(tea);
        showDrinkName(new Coffee("arabic"));
        //to nie zadziala bo String nie dziedziczy po Drink
        //        showDrinkName("sd");

//        useDrinkMethod(stringCup);
        useDrinkMethod(teaCup);
    }

    public static <T> Cup<T> fullFillCup(T liquid) {
        return new Cup<>(liquid);
    }

    public static <T> T randomSelection(T x, T y) {
        //operator ? jest operatorem trojargumentowym i dziala jak if
        //zastosowanie: (warunek) ? (wartosc zwracana gdy true) : (wartosc zwracana gdy false)
        return Math.random() > 0.5 ? x : y;
    }

    public static <T extends Drink> void showDrinkName(T x){
        x.showDrink();
    }

    //? czyli wildcard stosowany jest wowczas gdy chcemy uzyc typu generycznego (klasy badz metody generycznej)
    public static void useDrinkMethod(Cup<? extends Drink> cupWithDrink){
        cupWithDrink.drink();
    }

    @SafeVarargs
    public static <T> T randomMultiSelection(T... values) {
        System.out.println(values.length);
        //chce zeby losowac indeks (calkowity) w zakresie {0, values.length-1}
        //length=11;
        //ostatni indeks = 10;
        //0.12*10=1.2 -> 1
        //0.04*10=0.4 -> 0
        //0.99*10=9.9 -> 9
        //1.00*10=10.0 ->10
        int randomIndex = (int)(Math.random() * 0.99 * (values.length));
        //length=4
        //ostatni indeks =3
        //dla Math.round():
        //0.00-0.49 -> 0;
        //0.50-1.49 -> 1;
        //1.50-2.49 -> 2;
        //2.50-3.00 -> 3;
        Random random = new Random();
        random.nextInt(values.length);

        return values[randomIndex];
    }

}
