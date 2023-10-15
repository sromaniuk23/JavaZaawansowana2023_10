import java.lang.reflect.Method;

public class ReflectionSample {
    public static void main(String[] args) {
        try {
            //najpierw uzyskujemy dostep do klasy tworzac nowy obiekt Class i odnoszac sie po nazwie do klasy Car
            Class<?> carClass = Class.forName("Car");
            //tworzymy nowy obiekt Car uzywajac metody newInstance()
            Car car = (Car) carClass.newInstance();
            //tworzymy obiekt klasy Method (uzyskujemy dostep do wybranej metody)
            Method isPrototypeMethod = carClass.getDeclaredMethod("isPrototype");
            //ustawiamy dostep do metody na true
            isPrototypeMethod.setAccessible(true);
            System.out.println("Is Prototype result: " + isPrototypeMethod.invoke(car));

        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
