public class RestaurantRunner {
    private static final int noOfThr = 5;

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Runnable[] runnables = new Runnable[noOfThr];
        Thread[] threads = new Thread[noOfThr];

        for(int i=0; i<noOfThr-1;i++) {
            runnables[i] = new RestaurantConsumer(restaurant, i);
        }
        runnables[noOfThr-1]= new RestaurantProducer(restaurant);

        for(int i=0; i<noOfThr; i++){
            threads[i] = new Thread(runnables[i]);
        }

        for(int i=0; i<noOfThr; i++){
            threads[i].start(); //metoda start uruchamia nowy watek a w nim metode run()
        }
    }
}
