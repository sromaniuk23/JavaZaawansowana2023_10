import java.util.Objects;

public record Car(String model, String producer, int wheelSize) implements EngineInterface {

    private static final String TOYOTA = "Toyota";
    public static final String SEAT = "Seat";

    public Car(String model, String producer) { // konstruktor niekanoniczny
        this(model, producer, 4);       // MUSIMY odwołać się do innego konstruktora tego rekordu przy pomocy this
    }
    //sygnatura metody to jest: nazwa + lista TYPOW argumentow
    //nazwy samych argumentow NIE MAJA znaczenia
    //znaczenie maja typy argumentow, liczba argumentow, kolejnosc argumentow
    //sygnatura Car(String, int) to co innego niz Car(int, String)
    public Car(String model, int wheelSize){
        this(model, "Toyota", wheelSize);
    }

    public Car(int wheelSize, String model){
        this(model, "Toyota", wheelSize);
    }

    public Car(String modelA, String modelB, String producer, int wheelSize){
        this(modelA+modelB, producer, wheelSize);
    }

    public Car(String model) { //konstruktor niekanoniczny
        this(model, "Toyota");
    }

    public static boolean isToyota(Car car) {
        return car.model.equals(TOYOTA);
    }

    public String getFullName() {
        return producer + " " + model;
    }

    private boolean isHybrid() {
        return producer.equals(TOYOTA);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", wheelSize=" + wheelSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //najpierw sprawdzamy czy to ten sam obiekt (czy referencje wskazuja na ten sam obiekt)
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return wheelSize == car.wheelSize && Objects.equals(model, car.model) && Objects.equals(producer, car.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer, wheelSize);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped!");
    }
}
