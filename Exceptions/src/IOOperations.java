import java.io.IOException;

public class IOOperations implements AutoCloseable{
    //slowko throws oddelegowuje obowiazek obsluzenia wyjatku na kontekst wywolujacy dana metode
    public void readDataFromFile() throws IOException{
        //jesli chcemy rzucic wyjatek to uzywamy slowa throw
        throw new IOException("No file and 123"); //przyklad wyjatku checked - to oznacza ze musi byc on obsluzony
    }

    public void checkIfFileExists(){
        //przyklad, ze rzucajac wyjatek unchecked nie musimy go obslugiwac,
        //wiec tez nie ma potrzeby dopisywac throws do metody
        throw new RuntimeException();
    }

    @Override
    public void close() throws Exception {

    }
}
