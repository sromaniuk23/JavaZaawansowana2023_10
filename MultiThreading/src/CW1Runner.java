import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CW1Runner {
    public static void main(String[] args) {
        CW1 rangeA = new CW1(1000, 2000);
        CW1 rangeB = new CW1(14300, 17800);

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(rangeA);
        executorService.submit(rangeB);
        executorService.shutdown();
    }
}
