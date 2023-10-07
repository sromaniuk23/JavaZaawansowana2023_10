public class InnerClassTest {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        //klase wewnetrzna (non-static) tworzymy z poziomu obiektu klasy zewnetrznej!!!
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
//        OuterClass.InnerClass innerClass = OuterClass.new InnerClass(); //to nie zadziala!
//        new OuterClass.InnerClass();

        //klase zagniezdzona (static) mozemy utworzyc bezposrednio z posiomu klasy zewnetrznej!
        OuterClass.InnerStaticClass innerStaticClass= new OuterClass.InnerStaticClass();

        innerClass.useOuterClassField();

        innerStaticClass.useOuterClassField();

    }
}
