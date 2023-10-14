public class Tea extends Drink{

    public Tea(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Tea{" +
                "name='" + name + '\'' +
                '}';
    }
}
