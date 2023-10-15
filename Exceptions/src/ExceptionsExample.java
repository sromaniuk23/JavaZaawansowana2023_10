import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionsExample {
    public static void main(String[] args) throws IOException{
        List<String> values = new ArrayList<>();
        values.add("Jan");


        try {
            System.out.printf("Value at index 3: %s",values.get(3));
        }catch (IndexOutOfBoundsException e) {
            System.out.println("No value at index");
        }

        System.out.println("test");

        //wyjatkow unchecked nie trzeba obslugiwac, ale jesli tego nie zrobimy to nasza aplikacja sie po prostu zatrzyma
//        values.get(-1);

        System.out.println("test123");

        values.add("Jacek");
        values.add("Tomasz");
        values.add("Mirosław");

        try {
            System.out.printf("Value at index 3: %s\n",values.get(3));
        }catch (IndexOutOfBoundsException e) {
            System.out.println("No value at index");
        }finally {
            System.out.println("Cleanup operation");
        }

        IOOperations ioOperations = new IOOperations();

        try {
            ioOperations.readDataFromFile();
        } catch (IOException e){
            System.out.println("I've catched an IOException!");
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("I've catched an Exception");
        }

//        method3();


        //try with resources:
        //niezaleznie od tego czy zostanie rzucony wyjatek zasoby podane w nawiasach okraglych po klauzuli try
        //nie beda pozniej dostepne - zostana automatycznie usuniete
        try(IOOperations anotherName = new IOOperations();){
            anotherName.checkIfFileExists();
        } catch (RuntimeException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("123");
        }

        //anotherName

        System.out.println(divideDouble(5.0, 2.0));
        try {
            System.out.println(divideDouble(5.0, 0.0));
        } catch (DividingByZeroException e){
            e.printStackTrace();
        }
        System.out.println(divideDouble(5.0, 0.0));
        System.out.println("testEnd");

    }

    private static void method1() throws IOException{
        IOOperations ioOperations = new IOOperations();

        ioOperations.readDataFromFile();
    }

    private static void method2() throws IOException{
        method1();
    }

    private static void method3() throws IOException{
        method2();
    }

    private static double divideDouble(double a, double b){
        if(b==0.0){
            throw new DividingByZeroException();
        } else{
            return a/b;
        }
    }
}
