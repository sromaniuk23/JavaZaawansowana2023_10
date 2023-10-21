public class LottoRunnable implements Runnable{
    static Lotto lotto = new Lotto();
    @Override
    public void run() {
        for(int i=3; i<4; i++) {
            System.out.println("Randoming: " + i + " numbers");
            lotto.start(i);
        }
    }
}
