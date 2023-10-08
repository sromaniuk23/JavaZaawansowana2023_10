public class RecordsTest {
    public static void main(String[] args) {
        Car car = new Car("Clio","Renault",16);

        System.out.println(car.model());
        System.out.println(car.producer());
        System.out.println(car.wheelSize());

        Car carB = new Car("Ibiza", "Seat"); //tu uzywamy konstruktor niekanoniczny
        System.out.println(carB.wheelSize());

        Car carC = new Car("Clio","Renault",16);
        Car carD = new Car("ABC");
        Car carE = new Car("MA", "MB", "Renault", 17);

        System.out.println(car);
        System.out.println(carB);
        System.out.println(car.equals(car));
        System.out.println(car.equals(carB));
        System.out.println(car.equals(carC));
        System.out.println(carE);
        System.out.println(car.hashCode());
        System.out.println(carB.hashCode());
        System.out.println(carC.hashCode());

        System.out.println(car.getFullName());
        System.out.println(car.isToyota(car));
        System.out.println(Car.isToyota(car));
        System.out.println(Car.SEAT);
        System.out.println(car.SEAT);

    }
}
