public class Computer {
    private Processor processor;
    private Ram ram;

    public Computer(Processor processor, Ram ram) {
        this.processor = processor;
        this.ram = ram;
    }

    public void run() {
        // usage of processor and ram object
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", ram=" + ram +
                '}';
    }
}