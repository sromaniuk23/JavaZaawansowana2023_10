public class AnotherPlayer implements MediaPlayer{
    @Override
    public void stop() {
        System.out.println("Stop on Another Player");
    }

    @Override
    public void play() {
        System.out.println("Start on Another Player");
    }
}
