import java.util.Random;

public class Car implements Runnable{
    static Bridge bridge;
    private String name;
    private String type;

    public Car(String name, String type) {
        bridge=new Bridge();
        this.name = name;
        this.type = type;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(new Random().nextInt(3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            bridge.driveThrough(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
