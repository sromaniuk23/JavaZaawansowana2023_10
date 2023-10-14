public class Coffee extends Drink{

    public Coffee(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                '}';
    }
}
