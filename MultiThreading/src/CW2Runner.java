import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CW2Runner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0; i<5; i++){
            //tutaj dodajemy sobie nowe samochody do wykonawcy
            executorService.submit(new Car("Car no. "+i, new Random().nextDouble()>0.5?"Sedan":"Hatchback"));
        }

        executorService.shutdown();
    }
}
