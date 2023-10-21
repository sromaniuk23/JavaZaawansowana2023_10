public class RestaurantProducer implements Runnable{
    Restaurant restaurant;

    public RestaurantProducer(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

            restaurant.prepareDinner();
        }
    }
}
