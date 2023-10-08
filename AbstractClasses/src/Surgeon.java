public class Surgeon extends Doctor{
    String razorName;

    public Surgeon(String name, String surname, int licenseId, String razorName) {
        super(name, surname, licenseId);
        this.razorName = razorName;
    }

    @Override
    public void heal() {
        System.out.println("I can take foreign object out of Your body");
    }
}
