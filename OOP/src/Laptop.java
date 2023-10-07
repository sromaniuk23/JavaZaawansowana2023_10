public class Laptop extends ComputerBase { // Computer jest klasą bazową klasy Laptop
    private int battery;

    public Laptop(String cpu, String ram, String gpu, int battery) {
        // w przypadku klasy pochodnej, wywołanie domyślnego konstruktora klasy bazowej jest wymagane
        super(cpu, ram, gpu);
        this.battery = battery;
    }

    @Override // (1)
    public void configure() {
        // wywołujemy funkcjonalność z klasy bazowej
        super.configure();
        System.out.println("Configure battery: " + battery);
    }

    public int getBattery() {
        return battery;
    }
}