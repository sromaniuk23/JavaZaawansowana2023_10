public class Runner {
    private static final int noOfThr = 5;
    public static void main(String[] args) {
        Runnable[] runnables = new Runnable[noOfThr];
        Thread[] threads = new Thread[noOfThr];

        for(int i=0; i<noOfThr; i++){
            runnables[i]= new MyRun(i);
            threads[i] = new Thread(runnables[i]);
        }

        for(int i=0; i<noOfThr; i++){
            threads[i].start(); //metoda start uruchamia nowy watek a w nim metode run()
        }
    }
}
