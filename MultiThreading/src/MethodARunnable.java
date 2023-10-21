public class MethodARunnable implements Runnable{
    SynchronizationClass synchronizationClass;

    public MethodARunnable(SynchronizationClass synchronizationClass) {
        this.synchronizationClass = synchronizationClass;
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            synchronizationClass.methodA(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
