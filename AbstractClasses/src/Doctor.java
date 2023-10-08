public abstract class Doctor {
    String name;
    String surname;
    int licenseId;

    public Doctor(String name, String surname, int licenseId) {
        this.name = name;
        this.surname = surname;
        this.licenseId = licenseId;
    }

    public void eat(){
        System.out.println("I'm eating");
    }

    public void writeReceipt(){
        System.out.println("Here is Your receipt");
    }

    public abstract void heal();
}

