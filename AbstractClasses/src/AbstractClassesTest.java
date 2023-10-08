public class AbstractClassesTest {
    public static void main(String[] args) {
        //jako, że klasa abstrakcyjna może posiadać metody abstrakcyjne, to nie możemy tworzyć instancji klas abstrakcyjnych
        //Button button = new Button();

        SimpleButton simpleButton = new SimpleButton();
        simpleButton.onClick();

        Button simpleButtonB = new SimpleButton();
        simpleButtonB.onClick();

        Doctor doctors[] = new Doctor[4];
        doctors[0]=new Dentist("John", "White",123, "BlackSnake");
        doctors[1]=new Dentist("Mark", "Anthony", 234, "GoldenTreasure");
        doctors[2]=new Surgeon("Charlie", "Sargeant", 876, "SharpTeeth");
        doctors[3]=new Surgeon("Sylvester", "Van-Damme", 999, "M4A1");

        for(Doctor d: doctors){
            d.heal();
        }

    }
}
