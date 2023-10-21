public class MyRun implements Runnable{
    private int id;

    public MyRun(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("Thread id: "+id);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        }
    }
}
