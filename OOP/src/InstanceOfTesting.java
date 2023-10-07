public class InstanceOfTesting {
    public static void main(String[] args) {

        BaseClass baseClasses[] = new BaseClass[3];
        baseClasses[0] = new BaseClass();
        baseClasses[1] = new Impl1();
        baseClasses[2] = new Impl2();

        for (BaseClass baseClass: baseClasses){
            showInstanceOfExample(baseClass);
            showInstanceOfExampleJDK17(baseClass);
        }

    }

    //tak naprawdę to piszac typ referencji okreslamy ze moga zostac podane jako argument metody obiekty
    //zarowno podanego typu jak i wszystkich typow pochodnych (klas dziedziczacych po danym typie)
    //typ obiektu moze byc taki sam jak typ referencji badz moze to byc typ dziedziczacy (bedacy potomkiem) typu refencji
    private static void showInstanceOfExample(BaseClass baseClass) {
        //instanceof sprawdza czy obiekt jest danego typu
//        baseClass.sayHi();
        if (baseClass instanceof Impl1) {
            //gdy sprawdzilismy ze obiekt baseClass posiada typ obiektu Impl1 to jezli chcemy uzyc metod z klasy Impl1
            //to musimy zmienic typ referencji na Impl1, bo w typie referencji BaseClass NIE MA metody sayHi();
            Impl1 impl1 = (Impl1) baseClass;
            impl1.sayHi();
        }
    }

    private static void showInstanceOfExampleJDK17(BaseClass baseClass) {
        if (baseClass instanceof Impl1 impl1) { //impl1 -> jest nazwą referencji typu Impl1, do której mamy dostęp wewnątrz ciała bloku if
            impl1.sayHi();
        }
    }
}
