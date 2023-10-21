import java.util.concurrent.Callable;

public class ClassCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int result =0;

        for(long i=300000001; i>0; i--)
            result+=i;

        return result;
    }
}
