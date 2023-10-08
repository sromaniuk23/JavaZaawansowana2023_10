import javax.xml.crypto.NoSuchMechanismException;

public interface MediaPlayer {
    public static final double pi=3.14;
    String TAG = "MediaPlayer"; // domyślnie zawiera słowa kluczowe - public static final

    //metody ktore tworzymy w interfejsie domyslnie sa public abstract
    void stop(); //to jest metoda abstrakcyjna - czyli metoda bez implementacji (sama sygnatura metody)
    public abstract void play();

    default void next() { // metoda z domyślnym ciałem, można, ale nie trzeba, nadpisywać w implementacji interfejsu
        throw new NoSuchMechanismException("not supported by default");
    }

    static String getName() { // metoda statyczna, domyślnie posiada modyfikator public
        return "MediaPlayer Interface";
    }
}
