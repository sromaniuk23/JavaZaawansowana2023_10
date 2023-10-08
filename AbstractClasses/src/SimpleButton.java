
//klase abstrakcyjna dziedziczymy tak samo jak kazda inna klase (tez mozemy dziedzic TYLKO po jednej klasie abstrakcyjnej)
public class SimpleButton extends Button{

    public SimpleButton() {
    }

    public SimpleButton(String name) {
        super(name);
    }

    //wszystkie metody abstrakcyjne MUSZA zostac zaimplementowane
    @Override
    public void onClick() {
        System.out.println("Simple Button was clicked");
    }
}
