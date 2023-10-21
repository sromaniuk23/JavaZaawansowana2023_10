public class RestaurantConsumer implements Runnable {
    Restaurant restaurant;
    int id;

    public RestaurantConsumer(Restaurant restaurant, int id) {
        this.restaurant = restaurant;
        this.id = id;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
                restaurant.waitForDinner(id);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
