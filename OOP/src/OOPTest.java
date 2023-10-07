import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OOPTest {
    public static void main(String[] args) {
        //Enkapsulacja
        System.out.println("Enkapsulacja:");
        Employee employee1 = new Employee("2", "John","Smith", LocalDate.of(1901, 10, 7));

        System.out.println(employee1.getId());
        System.out.println(employee1.getFirstName());
        System.out.println(employee1.getLastName());
        System.out.println(employee1.getDateOfBirth());

        //do pola firstName nie mamy dostepu, poniewaz jest ono typu private
//        System.out.println(employee1.firstName);

        employee1.setFirstName("James");
        System.out.println(employee1.getFirstName());

        //Kompozycja
        System.out.println("Kompozycja:");
        Computer computer= new Computer(new Processor("x329", 8), new Ram("hxRazor", 32));

        System.out.println(computer);

        //Dziedziczenie
        System.out.println("Dziedziczenie:");
        Car car = new Car();
        SportCar sportCar = new SportCar();

        car.turnOnEngine();
        //mozemy dziedziczyc wielowarstwowo, nie mozna dziedziczyc po dwoch klasach lub wiecej jednoczesnie
        //dziedziczac wielowarstwowo poszczegolnie pola i metody przechodza do kolejnych potomkow
        sportCar.drive();

        Laptop laptop = new Laptop("cpu", "ram", "gpu", 23);
        laptop.configure();
        System.out.println(laptop.getBattery());

        //typReferencji nazwaObiektu = new typObiektu;
        //typ referencji określa do jakich pól i metod mamy dostęp (zakres, zasięg dostępności)
        //typ obiektu określa sposób działania metod (określa ich implementację)
        ComputerBase laptopB = new Laptop("cpu", "ram", "gpu", 23);
        laptopB.configure(); //metoda configure() jest dostępna z typu referencji ComputerBase ale implementacja jest brana z Laptop (typ obiektu)
        //System.out.println(laptopB.getBattery()); //metoda getBattery nie jest dostępna z referencji ComputerBase

        //Polimorfizm
        System.out.println("Polimorfizm:");
        List<Integer> ints = new ArrayList<>(); // programista pracuje na INTERFEJSIE, wykorzystując pewną implementację
        ints.add(1);
        ints.add(7);
        for (int i = 0; i < ints.size(); i++) {
            System.out.println(ints.get(i));
        }

    }
}
