public abstract class Button { // klasa zdefiniowana jako abstrakcyjna

    public Button() {
    }

    //konstruktor w klasie abstakcyjnej nie sluzy do tworznia obiektu klasy abstrakcyjne
    //a do inicjalizacji pol, ktore zostaly zadeklorawne w klasie abstrakcyjnej
    public Button(String name) {
        this.name = name;
    }

    public String name = "Red button";
    private String anotherName = "some button";

    public String getComponentName() { // zwykła, nieabstrakcyjna metoda
        return "Button";
    }

    public abstract void onClick(); // metoda abstrakcyjna, NIE posiada ciała
}
