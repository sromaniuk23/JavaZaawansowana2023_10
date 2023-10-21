import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsExample {
    public static void main(String[] args) {
        //tutaj tworzymy jednowatkowa pule/ jednowatkowego wykonawce
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        //interfejs callable sprawia ze mozemy z metody zwrocic wartosc generyczna
        //A Future represents the result of an asynchronous computation.
        // Methods are provided to check if the computation is complete, to wait for its completion,
        // and to retrieve the result of the computation. The result can only be retrieved using
        // method get when the computation has completed, blocking if necessary until it is ready.
        Future future = executorService.submit(new ClassCallable());
        Future future2 = executorService.submit(new ClassCallable());
        Future future3 = executorService.submit(new ClassCallable());
        try{
            Long currentMillis = System.currentTimeMillis();
            System.out.println(future.get());//metoda get poczeka az wynik zostanie obliczony jesli jeszcze nie zostal
            System.out.println(System.currentTimeMillis()-currentMillis);
            System.out.println(future2.get());//metoda get poczeka az wynik zostanie obliczony jesli jeszcze nie zostal
            System.out.println(System.currentTimeMillis()-currentMillis);
            System.out.println(future3.get());//metoda get poczeka az wynik zostanie obliczony jesli jeszcze nie zostal
            System.out.println(System.currentTimeMillis()-currentMillis);
        } catch (Exception e){
            e.printStackTrace();
        }

        //shutdown zamyka serwis wykonawcy, po shutdownie nie mozna juz uruchamiac nowych taskow w ramach danego serwisu wykonawcy
        executorService.shutdown();

        //ta metoda utworzy serwis z stricte okreslona liczba watkow
        ExecutorService fixedThreadPoolService = Executors.newFixedThreadPool(5);

        //metoda execute stosujemy gdy nie potrzebujemy nic zwracac
        for(int i=0; i<10; i++)
            fixedThreadPoolService.execute(new ClassRunnable((i/5)*10+i%5));

        fixedThreadPoolService.shutdown();
    }
}
