public class MethodBRunnable implements Runnable{
    SynchronizationClass synchronizationClass;

    public MethodBRunnable(SynchronizationClass synchronizationClass) {
        this.synchronizationClass = synchronizationClass;
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            synchronizationClass.methodB(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
