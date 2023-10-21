import java.util.Random;

public class Lotto {
    private static int number;

    public synchronized void start(int numberOfElements){
        Random random = new Random();

        for (int i=0;i<numberOfElements;i++){
            number = random.nextInt(49)+1;

            System.out.println(Thread.currentThread().getName()+" -> number " +
                    (i+1)+" is: " + number);
            String string = String.format("%s -> number %d is: %d", Thread.currentThread().getName(), i+1, number);
            System.out.println(string);
        }
    }
}

