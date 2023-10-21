public class Restaurant {
    static boolean isDinnerReady = false;

    public synchronized void waitForDinner(int id) throws InterruptedException {
        while (!isDinnerReady) {
            wait();
        }
        System.out.println("Consument "+id+"enjoys his meal");
    }

    public synchronized void prepareDinner() {
        System.out.println("Dinner preparing");
        isDinnerReady = true;
        notify();
    }

}
