public class ButtonComponent extends AbstractButton {
    @Override
    void click() { // implementacja wymagana -> metoda abstrakcyjna klasy abstrakcyjnej
        System.out.println("I just clicked a button! Amazing");
    }

    @Override
    public void onClick() { // implementacja wymagana -> metoda abstrakcyjna interfejsu ComponentClickListener
        System.out.println("I am an onClick handler");
    }

    @Override
    public void veryAbstractMethod() {
        System.out.println("Output form veryAbstractMethod");
    }
}
