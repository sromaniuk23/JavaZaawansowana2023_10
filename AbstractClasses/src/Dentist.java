public class Dentist extends Doctor{
    String drillName;

    public Dentist(String name, String surname, int licenseId, String drillName) {
        super(name, surname, licenseId);
        this.drillName = drillName;
    }

    @Override
    public void heal() {
        System.out.println("I can heal Your teeth");
    }
}
