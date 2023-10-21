public class SynchronizationTestRunner {
    private static final int noOfThr = 2;

    public static void main(String[] args) {
        SynchronizationClass synchronizationClass = new SynchronizationClass();

        Runnable[] runnables = new Runnable[noOfThr];
        Thread[] threads = new Thread[noOfThr];

        runnables[0]= new MethodARunnable(synchronizationClass);
        runnables[1]= new MethodBRunnable(synchronizationClass);

        for(int i=0; i<noOfThr; i++){
            threads[i] = new Thread(runnables[i]);
        }

        for(int i=0; i<noOfThr; i++){
            threads[i].start(); //metoda start uruchamia nowy watek a w nim metode run()
        }
    }
}
