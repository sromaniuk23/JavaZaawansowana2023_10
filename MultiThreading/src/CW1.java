public class CW1 implements Runnable{
    private int a, b;

    public CW1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        for(int i=a; i<=b; i++){
            if(i%2==0) {
                System.out.println("Even number: "+i);
            }
        }
    }
}
