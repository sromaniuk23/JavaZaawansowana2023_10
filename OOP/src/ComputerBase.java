public class ComputerBase {
    private String cpu;
    private String ram;
    private String gpu;

    public ComputerBase(String cpu, String ram, String gpu) {
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
    }

    public void configure() {
        System.out.println("Booting ... ");
        System.out.println("Configure cpu: " + cpu);
        System.out.println("Configure ram: " + ram);
        System.out.println("Configure gpu: " + gpu);
    }
}