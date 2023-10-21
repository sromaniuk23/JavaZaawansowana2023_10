public class SynchronizationClass {

    public synchronized void methodA(int num){
        System.out.println("methodA start: " + num);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("methodA finish: " + num);
    }

    public synchronized void methodB(int num){
        System.out.println("methodB start: " + num);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("methodB finish: " + num);
    }
}
