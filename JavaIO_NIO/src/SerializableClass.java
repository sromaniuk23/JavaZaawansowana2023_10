import java.io.Serializable;

public class SerializableClass implements Serializable {
    private float f;
    private int num;
    private String name;

    public SerializableClass(float f, int num, String name) {
        this.f = f;
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SerializableClass{" +
                "f=" + f +
                ", num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
