public class OuterClass {

    private static int outerClassStaticField =128;
    private int outerClassField=256;

    void outerClassMethod() {
        System.out.println("I am outer class method");
    }

    //klasa wewnetrzna - klasa wewnetrzna niestatyczna
    //pola i metody statyczne i niestatyczne sa dostepne wewnatrz klasy niestatycznej wewnetrznej
    public class InnerClass {
        void useOuterClassField() {
            System.out.println(outerClassStaticField); // wykorzystanie statycznego pola
            outerClassMethod();                        // wykorzystanie metody
            System.out.println(outerClassField);       // wykorzystanie prywatnego pola
        }
    }

    protected static void outClassStaticMethod() {
        System.out.println("I am out class static method");
    }

    //klasa zagniezdzona - klasa wewnetrzna statyczna
    //klasa zagniezdzona ma dostep jedynie do pol i metod statycznych
    static class InnerStaticClass {

        void useOuterClassField() {
            System.out.println(outerClassStaticField);
            outClassStaticMethod();
            //outerClassMethod(); -> błąd kompilacji, NIE możemy korzystać z metod niestatycznych
        }
    }
}
