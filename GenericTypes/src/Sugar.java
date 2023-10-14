public class Sugar {
    private String name;
    private String colour;

    public Sugar(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Sugar{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
